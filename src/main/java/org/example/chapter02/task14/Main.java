package main.java.org.example.chapter02.task14;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader("students.csv");

        Iterable<CSVRecord> records =
                CSVFormat.DEFAULT
                        .builder()
                        .setHeader()
                        .setSkipHeaderRecord(true)
                        .build()
                        .parse(reader);

        for (CSVRecord record : records) {
            System.out.println(
                    record.get("name") + " " +
                            record.get("age") + " " +
                            record.get("city")
            );
        }

        reader.close();
    }
}
