package com.javascraper.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import com.intenthq.gander.utils.JSoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(DemoApplication.class, args);

        final String url = "https://thehub.io/jobs?countryCode=DK";

        try {
            final Document document = Jsoup.connect(url).get();
            BufferedWriter writer = null;
            // String ticker = null;

            for (Element row : document.select("content")) {

                if (row.select("content").text().equals("")) {
                    continue;
                } else {
                    writer = new BufferedWriter(new FileWriter("C:/Users/Abdul/Documents/test2.txt"));

                    final String ticker = row.select("content").text();

                    writer.write(ticker);

                    // writer.write(document.body().text());

                    // System.out.println(ticker);

                    writer.close();

                }

                // try {
                // writer = new BufferedWriter(new
                // FileWriter("C:/Users/Abdul/Documents/test2.txt"));

                // writer.write(ticker);

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
