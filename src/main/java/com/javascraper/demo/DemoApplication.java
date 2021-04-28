package com.javascraper.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.intenthq.gander.utils.JSoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {
        /*
         * Document d=
         * Jsoup.connect("http://www.wikihow.com/wikiHowTo?search=Signal+Wifi").timeout(
         * 6000).get(); Elements ele=d.select("div#searchresults_list"); for (Element
         * element : ele.select("div.result")) { String
         * img_url=element.select("div.result_thumb img").attr("src");
         * System.out.println(img_url);
         * 
         * String title=element.select("div.result_data a").text();
         * System.out.println(title); }
         */

        final String url = "https://thehub.io/jobs?countryCode=DK";

        try {
            final Document document = Jsoup.connect(url).get();
            BufferedWriter writer = null;
            String ticker = null;

            for (Element row : document.select("div.my-10")) {

                if (row.select("div.my-10").text().equals("")) {
                    continue;
                } else {
                    writer = new BufferedWriter(new FileWriter("C:/Users/Abdul/Documents/test2.txt"));

                    ticker = row.select("div.my-10").text();

                    writer.write(document.toString());

                    System.out.println(ticker);

                }

                // try {
                // writer = new BufferedWriter(new
                // FileWriter("C:/Users/Abdul/Documents/test2.txt"));
                // writer.write(document.toString());

                // } catch (IOException e) {
                // e.printStackTrace();
                // }
            }

            // System.out.println(document.outerHtml());
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
