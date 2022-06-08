package STUDY;

import java.io.FileInputStream;

public class Java_0608_5 {
    public static void main(String[] args)  throws Exception {
        FileInputStream fis = new FileInputStream("/test/data1.txt"); //c드라이브 쓰지말자!

        int ch;

        while ((ch = fis.read()) != -1)
            System.out.print((char) ch);
        fis.close();
    }
    }
