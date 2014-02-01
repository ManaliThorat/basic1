package com.tw.manalit.news;
import java.util.ArrayList;
import java.util.List;

public class Report {

    public void printOnPaper(List<HeadLine> headLines, Heading heading) {
        System.out.println("REPORT");
        System.out.println(heading);

        int i = 1;
        for (HeadLine headLine : headLines) {
            System.out.println(i++ + " " + headLine);
        }
    }

    public void printInHTML(List<HeadLine> headLines, Heading heading) {
        System.out.println("<h1>REPORT</h1>");
        System.out.println("<h2>" + heading + "</h2>");
        System.out.println("<ul>");
        for (HeadLine headLine : headLines) {
            System.out.println("<li>" + headLine + "</li>");
        }
        System.out.println("</ul>");
    }

}
