package main.java.parsePkg;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class InitParse {

    public static void main(String [] args) throws IOException {

        Document  document = Jsoup.connect("http://www.tennisprediction.com/").timeout(6000).get();
        Elements elements= document.select("table#main_tur");
        for (Element e: elements)
        {
            System.out.println("e = " + e);
        }

    }
}
