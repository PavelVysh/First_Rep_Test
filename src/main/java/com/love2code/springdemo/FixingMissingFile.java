package com.love2code.springdemo;

import java.io.File;
import java.io.IOException;

public class FixingMissingFile {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\test.txt");
        file.createNewFile();
    }

}