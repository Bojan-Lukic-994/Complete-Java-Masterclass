package com.bojanlukic;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {
//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();

            Path dataPath = FileSystems.getDefault().getPath("data.txt");

            //Writes data to the "Data.txt" file using UTF-8 byte system
            Files.write(dataPath, "\nThe End OF The File".getBytes("UTF-8"), StandardOpenOption.APPEND);

            //Prints the lines from the "Data.txt" file
            List<String> lines = Files.readAllLines(dataPath);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
