package com.test.io;

import java.io.*;

/**
 * @author: mjt
 * time:2021-12-16
 * desription:
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        File file = new File("aaa.txt");
        OutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);

            fileOutputStream.write("aaa".getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}