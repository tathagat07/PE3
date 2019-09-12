package com.stackroute;

import java.io.*;

public class FolderHandling {

    public static void main(String[] args) throws IOException {
        File folder = new File("/home/cgi/Desktop/test/test1");
        File[] listOfFiles = folder.listFiles();

        for (File file : listOfFiles) {
            if (file.isFile()) {
                System.out.println(file.getName());
                if(file.getName().contains(".txt")){
                    String path = "/home/cgi/Desktop/test/test1/" + file.getName();
                    BufferedReader br = new BufferedReader(new FileReader(path));
                    String st;
                    while ((st = br.readLine()) != null)
                        System.out.println(st);
                }

            }
        }
    }

    public String readFile() {
        return null;
    }
}
