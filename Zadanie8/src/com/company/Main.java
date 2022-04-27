package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        szukaj("text","text2","egzamin");

    }

    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws IOException {

        var text = readFromInputStream(nazwaPlikWe,slowo);
        WriteToFile(text,nazwaPlikWy);
    }

    public static String readFromInputStream(String plik,String wordToFind) throws IOException {


        BufferedReader br = new BufferedReader(new FileReader(plik));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();
        int i = 1;
        while (line != null) {


            if(line.contains(wordToFind)){
                sb.append(i+":" + line);
                sb.append(System.lineSeparator());

            }
            line = br.readLine();
            i++;


        }
        String everything = sb.toString();
        br.close();
        return everything;




    }

    public static void WriteToFile(String text, String filename) throws IOException {

        File f= new File(filename);
        f.delete();

        String fileName = filename;
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);
        writer.close();




    }

}
