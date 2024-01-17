package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

import javax.swing.*;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ArticleReader {
    private static Map<String, Object> hTag = new HashMap<>();
    private static Map<String, Object> inlineElements = new HashMap<>();

    static {
        hTag.put("h1", new Object());
        hTag.put("h2", new Object());
        hTag.put("h3", new Object());
        hTag.put("h4", new Object());
        hTag.put("h5", new Object());
        hTag.put("h6", new Object());

        inlineElements.put("a", new Object());
        inlineElements.put("abbr", new Object());
        inlineElements.put("acronym", new Object());
        inlineElements.put("b", new Object());
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        Document doc = Jsoup.parse(readFromFile("input.txt"));
        String baseUrl = "https://climbing-day-b99.notion.site/";
        StringBuilder result = printAllText(doc, baseUrl);
        writeToHtml(result);
    }

    public static String readFromFile(String fName) {
        try {
            URL resource = ArticleReader.class.getClassLoader().getResource(fName);
            BufferedReader bufferedReader = null;
            bufferedReader = new BufferedReader(new FileReader(new File(resource.toURI())));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
            return stringBuilder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
        return "";
    }

    public static void writeToHtml(StringBuilder builder) throws IOException {
        String output = readFromFile("_article_temp.html");
        Document doc = Jsoup.parse(output);
        Elements elements = doc.getElementsByClass("container-fluid");
        elements.html(builder.toString());

        writeToFile(doc.toString());
    }

    public static void writeToFile(String string) {
//        URL resource = ArticleReader.class.getClassLoader().getResource("output.html");
        try {
            PrintWriter printWriter = new PrintWriter(new File("output.html"));
            printWriter.println(string);
            printWriter.flush();
            printWriter.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static StringBuilder printAllText(Document document, String baseUrl) {
//        Elements elements = document.body().select("*");
        StringBuilder builder = new StringBuilder();
        for (Node node : document.childNodes()) {
            scanRecursively(node, builder, baseUrl);
        }
        return builder;
    }


    public static void scanRecursively(Node parent, StringBuilder builder, String baseUrl) {
        boolean tagNeedToClose = false;
        boolean skipRecursion = false;
        String closeTag = null;
        for (Node node : parent.childNodes()) {
            if (node instanceof Element) {
                Element element = (Element) node;
                String tagName = element.tag().getName();
                if (hTag.containsKey(tagName)) {
                    builder.append("<br>");
                    builder.append("<").append(tagName).append(">");
                    closeTag = "</" + tagName + ">";
                } else if (tagName.equals("p")) {
                    builder.append("<").append(tagName).append(">");
                    closeTag = "</" + tagName + ">";
                } else if (tagName.equals("br")) {
                    builder.append("<br>");
                } else if (tagName.equals("img")) {
                    boolean wrapToDiv = true;
                    Element el = new Element("img");
                    for (Attribute attribute : element.attributes()) {
                        String atValue = attribute.getValue();
                        if (attribute.getKey().equals("src") && !atValue.startsWith("http") && !atValue.startsWith("data:image")) {
                            atValue = baseUrl + atValue;
                        } else if (attribute.getKey().equals("style") && !atValue.contains("background: url(")) {
                            atValue = atValue.replace("url(\"", "url(\"" + baseUrl);
                            wrapToDiv = false;
                        }
                        el.attr(attribute.getKey(), atValue);
                    }
                    if (wrapToDiv) {
                        Element divEl = new Element("div");
                        divEl.attr("class", "text-center");
                        divEl.appendChild(el);
                        builder.append(divEl).append("<br>");
                    } else {
                        builder.append(el);
                    }
                } else if (tagName.equals("span") && !element.ownText().isBlank()) {
                    builder.append("<span ").append("style=\"").append(element.attr("style")).append("\">");
                    closeTag = "</span>";
                } else if (tagName.equals("div") && !element.ownText().isBlank()) {
                    builder.append("<div>");
                    closeTag = "</div>";
                } else if (tagName.equals("blockquote")) { // blockquote
                    builder.append("<blockquote>");
                    closeTag = "</blockquote>";
                } else if (tagName.equals("pre")) {
                    Element preEl = new Element("pre");
                    preEl.attr("class", "code_pre");
                    if (element.children().size() > 0) {
                        Element firstChild = element.child(0);
                        if (!firstChild.tag().getName().equals("code")) {
                            Element codeEl = new Element("code");
                            codeEl.attr("class", "code_code java");
                            codeEl.attr("data-highlight", "true");
                            codeEl.text(element.text());
                            preEl.appendChild(codeEl);
                        } else if (firstChild.tag().getName().equals("code")) {
                            firstChild.attr("class", "code_code java");
                            firstChild.attr("data-highlight", "true");
                            firstChild.text(element.text());
                            preEl.appendChild(firstChild);
                        }
                    }
                    builder.append(preEl);
                    continue;
                } else if (tagName.equals("a")) {
                    builder.append("<a");
                    StringBuilder sb = new StringBuilder(" ");
                    String hrefValue = removeIfStartsWith(element.attr("href"), "/", 1);
                    if (!hrefValue.startsWith("http")) {
                        hrefValue = baseUrl + hrefValue;
                    }
                    builder.append(" href=\"").append(hrefValue).append("\"");
                    builder.append(" target=\"").append("_blank").append("\"");
                    builder.append(">");
                    closeTag = "</a>";
                }
                //https://medium.com//@soataliyevj/acid-tamoyillari-atomicity-atomlilik-5e364b9e353c
                //https://medium.com//@soataliyevj/acid-tamoyillari-atomicity-atomlilik-5e364b9e353c
                //https://medium.com/@soataliyevj/acid-tamoyillari-atomicity-atomlilik-5e364b9e353c
//                else if (tagName.equals("code") && element.parent().tag().getName().equals("pre")) {
//                    builder.append("<code ").append("class=\"").append("code_code java").append("\"")
//                            .append("data-highlight=\"").append("true").append("\">");
//                    closeTag = "</code>";
//                }
                else if (!element.ownText().isBlank() && element.children().size() == 0) {
                    // code ? quoto
                    // copy all attribute
                    StringBuilder sb = new StringBuilder(" ");
                    for (Attribute attribute : element.attributes()) {
                        String atValue = attribute.getValue();
                        String atKey = attribute.getKey();
                        if (!atKey.equals("class")) {
                            sb.append(atKey).append("=\"").append(atValue).append("\" ");
                        }
                    }
                    builder.append("<").append(tagName).append(sb).append(">");
                    closeTag = "</" + tagName + ">";
                }
//                else if (!element.ownText().isBlank() && element.children().size() == 0) {
//                    builder.append(element);
//                    skipRecursion = true;

//                }
                scanRecursively(node, builder, baseUrl);

                if (closeTag != null) {
                    builder.append(closeTag);
                    if (closeTag.contains("h") || closeTag.equals("blockquote")) {
                        builder.append("<br>");
                    }
                    closeTag = null;
                }
            } else if (node instanceof TextNode) {
                String text = ((TextNode) node).text();
//                if (text.isBlank()) {
//                    continue;
//                }
                builder.append(text);
//                Element parentElement = (Element) parent;
//                if (parentElement.tag().getName().equals("div") && parentElement.childNodes().size() > 1) {
//                    builder.append("<p>").append(text).append("</p>");
//                } else {
//                    builder.append(text);
//                }
            }

        }
    }

    public static String removeIfStartsWith(String content, String delima, int index) {
        if (content.startsWith(delima)) {
            return content.substring(index);
        }
        return content;
    }

    public static boolean wrap(Element element) {
//        if(element.ha){
//
//        }
        return false;
    }

//    public static boolean hasChild(Node root) {
//        for (Node node : root.childNodes()) {
//            if (node instanceof Element) {
//                Element element = (Element) node;
//                if (element.tag().equals()) {
//
//                }
//            }
//        }
//    }
}
