package com.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

/**
 * Created by echavez on 5/18/16.
 */
public class UsefullMethods {


    public static String generateRandomWord() throws IOException{

        URL page = new URL("http://randomword.setgetgo.com/get.php");
        URLConnection gc = page.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(gc.getInputStream()));
        String inputLine = in.readLine();
        in.close();

        return inputLine;

    }

    public static double generateRandomPrice(int min, int max){

        double randomNum = min + (int)(Math.random() * max);

        return randomNum;

    }



}
