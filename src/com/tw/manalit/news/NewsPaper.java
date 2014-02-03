package com.tw.manalit.news;

import java.util.ArrayList;
import java.util.List;

public class NewsPaper {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("News1");
        list.add("News2");
        NewsPrinter report = new NewsPrinter("The Times Of TW",list);
        report.printInHtml(new HTMLFormatter());
        report.printInHtml(new TextFormatter());
    }

}
