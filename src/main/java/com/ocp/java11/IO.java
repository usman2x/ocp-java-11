package com.ocp.java11;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * IOStreams, Serialization and DeSerialization
 * ByteStream, CharacterStream
 */
public class IO {

    private static final String INPUT_FILE_PATH = "src/main/resources/io/input.txt";
    private static final String OUTPUT_FILE_PATH = "src/main/resources/io/output.txt";
    private static final String STOCKS_FILE_PATH = "src/main/resources/io/stocks.txt";

    public static void main(String[] args) throws IOException {
        scannerStream();
    }

    //Scanner is the powerful tool to read file, read in token and then transfer token into respective
    //data type
    private static void scannerStream() {
        Map<String, Double> stocksMap = new LinkedHashMap<>();

        Scanner scannerStream = null;
        try {
            scannerStream = new Scanner(new FileReader(STOCKS_FILE_PATH));
            while (scannerStream.hasNextLine()) {
                String line = scannerStream.nextLine();
                String[] keyValues = line.split(" ");
                stocksMap.put(keyValues[0], Double.valueOf(keyValues[1]));
            }
            System.out.println(stocksMap);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scannerStream != null) {
                scannerStream.close();
            }
        }
    }

    private static void todo() {
        //TODO read large files
    }


    private static void characterStream() throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        long fileSize = getFileSizeInBytes(INPUT_FILE_PATH);
        char[] buffer = new char[(int) fileSize];
        try {
            fileReader = new FileReader(INPUT_FILE_PATH);
            fileWriter = new FileWriter(OUTPUT_FILE_PATH);

            int numberOfChars = fileReader.read(buffer);
            System.out.printf("Read %d characters \n", numberOfChars);
            fileWriter.write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
            if (fileWriter != null) {
                fileWriter.close();
            }
        }
    }


    // Programs use byte streams to perform input and output of 8-bit bytes.
    // All byte stream classes are descended from InputStream and OutputStream.
    private static void byteStream() throws IOException {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            inputStream = new FileInputStream("src/main/resources/io/input.txt");
            outputStream = new FileOutputStream("src/main/resources/io/output.txt");
            int read;
            while ((read = inputStream.read()) != -1) {
                outputStream.write(read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    private static long getFileSizeInBytes(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            return file.length();
        }
        return 0;
    }
}
