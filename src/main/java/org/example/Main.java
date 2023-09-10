package org.example;

public class Main {
    public void main(String[] args) {
        String s = "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"UTF-8\" />\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n" +
                "    <link rel=\"stylesheet\" href=\"owl_carousel/owl.carousel.css\" />\n" +
                "    <link rel=\"stylesheet\" href=\"owl_carousel/owl.theme.default.css\" />\n" +
                "    <link rel=\"stylesheet\" href=\"style/main.css\" />\n" +
                "    <link\n" +
                "      href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n" +
                "      rel=\"stylesheet\"\n" +
                "      integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n" +
                "      crossorigin=\"anonymous\"\n" +
                "    />\n" +
                "    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\" />\n" +
                "    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin />\n" +
                "    <link\n" +
                "      href=\"https://fonts.googleapis.com/css2?family=Merriweather:wght@300;400;700;900&display=swap\"\n" +
                "      rel=\"stylesheet\"\n" +
                "    />\n" +
                "    <script\n" +
                "      src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\"\n" +
                "      integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\"\n" +
                "      crossorigin=\"anonymous\"\n" +
                "    ></script>\n" +
                "    <title>Document</title>\n" +
                "  </head>\n" +
                "  <body>\n" +
                "    <!-- HEADER -->\n" +
                "    <header class=\"header\">\n" +
                "      <div class=\"container-lg\">\n" +
                "        <div\n" +
                "          class=\"d-flex d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3\"\n" +
                "        >\n" +
                "          <a href=\"/\" class=\"logo\">\n" +
                "            <img src=\"./assets/logo.svg\" alt=\"logo\" />\n" +
                "          </a>\n" +
                "          <div class=\"header__search\">\n" +
                "            <div class=\"dropdown search-select\">\n" +
                "              <a\n" +
                "                class=\"dropdown-toggle\"\n" +
                "                href=\"#\"\n" +
                "                id=\"navbarDarkDropdownMenuLink\"\n" +
                "                role=\"button\"\n" +
                "                data-bs-toggle=\"dropdown\"\n" +
                "                aria-expanded=\"false\"\n" +
                "              >\n" +
                "                Unilibrary\n" +
                "              </a>\n" +
                "              <ul\n" +
                "                class=\"dropdown-menu dropdown-menu mt-3\"\n" +
                "                aria-labelledby=\"navbarDarkDropdownMenuLink\"\n" +
                "              >\n" +
                "                <li><a class=\"dropdown-item\" href=\"#\"> Unilibrary</a></li>\n" +
                "                <li><a class=\"dropdown-item\" href=\"#\">Scopus</a></li>\n" +
                "              </ul>\n" +
                "            </div>\n" +
                "            <input\n" +
                "              class=\"form-control search-input\"\n" +
                "              type=\"search\"\n" +
                "              placeholder=\"Search\"\n" +
                "              aria-label=\"Search\"\n" +
                "            />\n" +
                "            <div class=\"header-search__search\">\n" +
                "              <img src=\"./assets/search-icon.svg\" alt=\"search-icon\" />\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-md-2 text-end\">\n" +
                "            <button type=\"button\" class=\"btn me-2 btn-login\">O'zbekcha</button>\n" +
                "            <button type=\"button\" class=\"btn btn-primary\">Kirish</button>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </header>\n" +
                "    <!-- END HEADER -->\n" +
                "    <!-- NAVBAR -->\n" +
                "    <nav class=\"navbar mb-4\">\n" +
                "      <div class=\"container-lg\">\n" +
                "        <ul class=\"d-flex justify-content-between flex-wrap w-100 fs-5 p-0\">\n" +
                "          <li>\n" +
                "            <a href=\"\">Adabiyotlar</a>\n" +
                "          </li>\n" +
                "          <li>\n" +
                "            <a href=\"\">Maqolalar</a>\n" +
                "          </li>\n" +
                "          <li>\n" +
                "            <a href=\"\">Dissertatsiyalar</a>\n" +
                "          </li>\n" +
                "          <li>\n" +
                "            <a href=\"\">Monografiyalar</a>\n" +
                "          </li>\n" +
                "          <li>\n" +
                "            <a href=\"\">Muassasalar</a>\n" +
                "          </li>\n" +
                "          <li>\n" +
                "            <a href=\"\">Mualliflar</a>\n" +
                "          </li>\n" +
                "          <li>\n" +
                "            <a href=\"\">Jurnallar</a>\n" +
                "          </li>\n" +
                "        </ul>\n" +
                "      </div>\n" +
                "    </nav>\n" +
                "    <!-- END NAVBAR -->\n" +
                "    <section class=\"authors\">\n" +
                "      <div class=\"container-lg\">\n" +
                "        <div\n" +
                "          class=\"mb-4 single-book__heading d-flex justify-content-start align-items-sart gap-4\"\n" +
                "        >\n" +
                "          <span>\n" +
                "            <svg class=\"sc-bczRLJ fFA-dUj\" height=\"32\" width=\"32\">\n" +
                "              <path\n" +
                "                d=\"M6.66669 16.0002H25.3334\"\n" +
                "                stroke=\"#74808C\"\n" +
                "                stroke-width=\"1.5\"\n" +
                "                stroke-linecap=\"round\"\n" +
                "                stroke-linejoin=\"round\"\n" +
                "              ></path>\n" +
                "              <path\n" +
                "                d=\"M13.3334 9.3335L6.66669 16.0002\"\n" +
                "                stroke=\"#74808C\"\n" +
                "                stroke-width=\"1.5\"\n" +
                "                stroke-linecap=\"round\"\n" +
                "                stroke-linejoin=\"round\"\n" +
                "              ></path>\n" +
                "              <path\n" +
                "                d=\"M13.3334 22.6667L6.66669 16\"\n" +
                "                stroke=\"#74808C\"\n" +
                "                stroke-width=\"1.5\"\n" +
                "                stroke-linecap=\"round\"\n" +
                "                stroke-linejoin=\"round\"\n" +
                "              ></path>\n" +
                "            </svg>\n" +
                "          </span>\n" +
                "          <h1 class=\"h2\">Mualliflar</h1>\n" +
                "        </div>\n" +
                "        <div class=\"authors-list row py-4 mb-5\">\n" +
                "          <div class=\"col-md-3 mb-5\">\n" +
                "            <div class=\"author\">\n" +
                "              <div class=\"author__img\">\n" +
                "                <img src=\"./assets/user.svg\" alt=\"\" />\n" +
                "              </div>\n" +
                "              <p class=\"author__name mt-3\">Utkir Xamdamov Raxmatillayevich</p>\n" +
                "              <div class=\"author_puclications\">\n" +
                "                <span>Nashrlar: </span>\n" +
                "                <span>3</span>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-md-3\">\n" +
                "            <div class=\"author\">\n" +
                "              <div class=\"author__img\">\n" +
                "                <img src=\"./assets/user.svg\" alt=\"\" />\n" +
                "              </div>\n" +
                "              <p class=\"author__name mt-3\">Utkir Xamdamov Raxmatillayevich</p>\n" +
                "              <div class=\"author_puclications\">\n" +
                "                <span>Nashrlar: </span>\n" +
                "                <span>3</span>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-md-3\">\n" +
                "            <div class=\"author\">\n" +
                "              <div class=\"author__img\">\n" +
                "                <img src=\"./assets/user.svg\" alt=\"\" />\n" +
                "              </div>\n" +
                "              <p class=\"author__name mt-3\">Utkir Xamdamov Raxmatillayevich</p>\n" +
                "              <div class=\"author_puclications\">\n" +
                "                <span>Nashrlar: </span>\n" +
                "                <span>3</span>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-md-3\">\n" +
                "            <div class=\"author\">\n" +
                "              <div class=\"author__img\">\n" +
                "                <img src=\"./assets/user.svg\" alt=\"\" />\n" +
                "              </div>\n" +
                "              <p class=\"author__name mt-3\">Utkir Xamdamov Raxmatillayevich</p>\n" +
                "              <div class=\"author_puclications\">\n" +
                "                <span>Nashrlar: </span>\n" +
                "                <span>3</span>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-md-3\">\n" +
                "            <div class=\"author\">\n" +
                "              <div class=\"author__img\">\n" +
                "                <img src=\"./assets/user.svg\" alt=\"\" />\n" +
                "              </div>\n" +
                "              <p class=\"author__name mt-3\">Utkir Xamdamov Raxmatillayevich</p>\n" +
                "              <div class=\"author_puclications\">\n" +
                "                <span>Nashrlar: </span>\n" +
                "                <span>3</span>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-md-3\">\n" +
                "            <div class=\"author\">\n" +
                "              <div class=\"author__img\">\n" +
                "                <img src=\"./assets/user.svg\" alt=\"\" />\n" +
                "              </div>\n" +
                "              <p class=\"author__name mt-3\">Utkir Xamdamov Raxmatillayevich</p>\n" +
                "              <div class=\"author_puclications\">\n" +
                "                <span>Nashrlar: </span>\n" +
                "                <span>3</span>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "          <div class=\"col-md-3\">\n" +
                "            <div class=\"author\">\n" +
                "              <div class=\"author__img\">\n" +
                "                <img src=\"./assets/user.svg\" alt=\"\" />\n" +
                "              </div>\n" +
                "              <p class=\"author__name mt-3\">Utkir Xamdamov Raxmatillayevich</p>\n" +
                "              <div class=\"author_puclications\">\n" +
                "                <span>Nashrlar: </span>\n" +
                "                <span>3</span>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </section>\n" +
                "    <!-- FOOTER -->\n" +
                "    <footer class=\"footer bg-dark\">\n" +
                "      <div class=\"container-lg\">\n" +
                "        <div class=\"row\">\n" +
                "          <div class=\"col-6\">\n" +
                "            <div class=\"row\">\n" +
                "              <div class=\"col-6\">\n" +
                "                <div class=\"footer__nav\">\n" +
                "                  <h3 class=\"mb-5\">Bo'limlar</h3>\n" +
                "                  <ul class=\"d-flex flex-column gap-3\">\n" +
                "                    <li>\n" +
                "                      <a href=\"/\">Muassasalar</a>\n" +
                "                    </li>\n" +
                "                    <li>\n" +
                "                      <a href=\"/\">Jurnallar</a>\n" +
                "                    </li>\n" +
                "                    <li>\n" +
                "                      <a href=\"/\">Mualliflar</a>\n" +
                "                    </li>\n" +
                "                  </ul>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "              <div class=\"col-6\">\n" +
                "                <div class=\"footer__nav\">\n" +
                "                  <h3 class=\"mb-5\">Resurslar</h3>\n" +
                "                  <ul class=\"d-flex flex-column gap-3\">\n" +
                "                    <li>\n" +
                "                      <a href=\"/\">Adabiyotlar</a>\n" +
                "                    </li>\n" +
                "                    <li>\n" +
                "                      <a href=\"/\">Maqolalar</a>\n" +
                "                    </li>\n" +
                "                    <li>\n" +
                "                      <a href=\"/\">Dissertatsiyalar</a>\n" +
                "                    </li>\n" +
                "                    <li>\n" +
                "                      <a href=\"/\">Monografiyalar</a>\n" +
                "                    </li>\n" +
                "                  </ul>\n" +
                "                </div>\n" +
                "              </div>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </footer>\n" +
                "    <!-- END FOOTER -->\n" +
                "    <!-- jquery -->\n" +
                "    <script\n" +
                "      src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js\"\n" +
                "      integrity=\"sha512-894YE6QWD5I59HgZOGReFYm4dnWc1Qt5NtvYSaNcOP+u1T9qYdvdihz0PPSiiqn/+/3e7Jo4EaG7TubfWGUrMQ==\"\n" +
                "      crossorigin=\"anonymous\"\n" +
                "      referrerpolicy=\"no-referrer\"\n" +
                "    ></script>\n" +
                "    <!-- owl carousel -->\n" +
                "    <script src=\"owl_carousel/owl.carousel.js\"></script>\n" +
                "    <script src=\"./js/carousel.js\"></script>\n" +
                "  </body>\n" +
                "</html>\n";
        HtmlTags htmlTags = new HtmlTags();
        String[] tag = {"h1", "a"};
        System.out.println(htmlTags.htmlString(s, tag));
    }
}