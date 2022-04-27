package com.company;

import java.io.*;
import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj tekt, który chcesz zapisać do pliku");
        String text = reader.readLine();
        WriteToFile(text);
        System.out.println(readFromInputStream());
        liczZnakiSlowa();
    }


    public static void WriteToFile(String text) throws IOException {

        File f= new File("C:\\text.txt");
        f.delete();

        String fileName = "text";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.write(text);
        writer.close();




    }



    public static int[] liczZnakiSlowa() throws IOException {
        String text = readFromInputStream();
        System.out.println(text);
        int whitespacesCount = 0;
        int charCount = 0;
        int wordCount = 0;
        boolean isNextCharLetter = true;


        for(int i = 0; i < text.length(); i++) {
            if(Character.isWhitespace(text.charAt(i))) whitespacesCount++;
            else{
                charCount++;
            }
            if(Character.isLetter(text.charAt(i)) == true && i+1< text.length() == true) {
                if(Character.isLetter(text.charAt(i+1)) == false){
                    wordCount++;
                }
            }
        }

        System.out.println("Liczba białych znaków (algorytm liczy również \\r\\n" + whitespacesCount);
        System.out.println("Liczba znaków" + charCount);
        System.out.println("Liczba słów" + wordCount);
        int[] tab = new int[3];
        tab[0] = whitespacesCount;
        tab[1] = charCount;
        tab[2] = wordCount;
        return tab;
    }


    public static String readFromInputStream() throws IOException {


        BufferedReader br = new BufferedReader(new FileReader("text"));
        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        String everything = sb.toString();
        br.close();
        return everything;




    }
}
