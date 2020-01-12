package com.bojanlukic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //Writes binary data to the files
        try (FileOutputStream binFile = new FileOutputStream("binData.dat");
             FileChannel binChannel = binFile.getChannel()) {

            byte[] testArray = "Hello World!".getBytes();
            ByteBuffer buffer = ByteBuffer.wrap(testArray);
            int bytesNum = binChannel.write(buffer);
            System.out.println("bytesNum written was: " + bytesNum);

            //Writing integer numbers using bytes
            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(245);
            intBuffer.flip();
            bytesNum = binChannel.write(intBuffer);
            System.out.println("bytesNum written was: " + bytesNum);

            //Writing negative integer number
            intBuffer.flip();
            intBuffer.putInt(-8231);
            intBuffer.flip();
            bytesNum = binChannel.write(intBuffer);
            System.out.println("bytesNum written was: " + bytesNum);


//            FileInputStream file = new FileInputStream("data.txt");
//            FileChannel channel = file.getChannel();

//            Path dataPath = FileSystems.getDefault().getPath("data.txt");
//
//            //Writes data to the "Data.txt" file using UTF-8 byte system
//            Files.write(dataPath, "\nThe End OF The File".getBytes("UTF-8"), StandardOpenOption.APPEND);
//
//            //Prints the lines from the "Data.txt" file
//            List<String> lines = Files.readAllLines(dataPath);
//            for (String line : lines) {
//                System.out.println(line);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
