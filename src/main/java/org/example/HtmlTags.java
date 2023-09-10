package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HtmlTags {
    public String htmlString(String html, String[] tag) {
        String t = "";
        String h1Content = "";
        for (int i = 0; i < tag.length; i++) {
            if (i == tag.length - 1) {
                t += tag[i];
            } else
                t += tag[i] + "|";
        }
        Pattern pattern = Pattern.compile("<(" + t + ")(.*?)>(.*?)</(" + t + ")>");
        Matcher matcher = pattern.matcher(html);

        while (matcher.find()) {
            h1Content += matcher.group(3)+" ";
        }
        return h1Content;
    }
}
