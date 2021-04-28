package com.javascraper.demo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {
        /* Document d= Jsoup.connect("http://www.wikihow.com/wikiHowTo?search=Signal+Wifi").timeout(6000).get();
        Elements ele=d.select("div#searchresults_list");
        for (Element element : ele.select("div.result")) {
            String img_url=element.select("div.result_thumb img").attr("src");
            System.out.println(img_url);

            String title=element.select("div.result_data a").text();
            System.out.println(title);
        } */


        final String url = "https://thehub.io/jobs?countryCode=DK";

        try {
            final Document document = Jsoup.connect(url).get();

            for (Element row : document.select("div.my-10")) {

                if (row.select("div.my-10").text().equals("")) {
                    continue;
                } else {
                    final String ticker = row.select("div.my-10").text();
                    System.out.println(ticker);
                }
            }

            // System.out.println(document.outerHtml());
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
