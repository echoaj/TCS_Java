package com.company;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Pattern;

public class Block {
    String from;
    String destination;
    String timestamp;
    double amount;
    String prevHash = "";
    String hash;
    Block prev = null;

    public Block(String from, String dest, double amnt){
        this.from = from;
        destination = dest;
        timestamp = getTime();
        amount = amnt;
        hash = null;
        prevHash = null;
    }

    public String getTime(){
        Timestamp tsmp = new Timestamp(System.currentTimeMillis());
        return new SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(tsmp);
    }

    // TODO get block hash
    public String get_hash(){
        String everything = from + destination + amount + prevHash + "abcdefghijklmnopqrstuvwxyz0123456789";
        String available = "abcdefghijklmnopqrstuvwxyz";
        available += available.toUpperCase() + "0123456789" + "!@#$%&=-+";
        int len = available.length();
        int[] template = {7,15,2,-9,2,-34,384,0,99,4,8,37,-64,87,-32,1,45,893,43,-5,3};

        String encrypted = "";
        // Initialize template array
        for(char c: everything.toCharArray()){
            int askii = c;
            if(askii % 2 == 0)
                askii += c - Character.getNumericValue(c);
            if(askii % 3 == 0)
                askii += 27;
            if(askii % 5 == 0)
                askii -= 11;
            if(askii % 6 == 0)
                askii += 18;
            else
                askii -= 3;
            int index = askii % template.length;
            template[index] += askii * 31 - 111 + index;
        }

        // User array to pick random character from available
        // and append it to encrypted.
        int i = 0;
        for(int num: template) {
            i = Math.abs(num);
            encrypted += available.charAt(i % len);
        }
        System.out.println(this.from + " " + encrypted);
        return encrypted;
    }
}
