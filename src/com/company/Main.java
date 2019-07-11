package com.company;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in) );
        System.out.println("Для записи в файл вводите текст по одной строке.\nДля перехода на новую строку нажмине 'Enter'");
        System.out.println("Чтобы завершить запись в файл введите 'stop'");
        try(FileWriter writer = new FileWriter("text.txt"))
        {
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("stop") == 0) break;
                str = str + "\r\n";
                writer.write(str);
            }while (str.compareTo("stop") != 0);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
