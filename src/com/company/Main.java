package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        Random random = new Random();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Good day, my name is Eliza. Tell me what is on your mind.");
        System.out.println("Press q at anytime to exist session.");
        while (true) {
            String comment = input.readLine();
            if(comment.equalsIgnoreCase("q")){
                break;
            }

            String[] replacement = comment.split("\\s+");
            for (int i = 0; i < replacement.length; i++) {
                if (replacement[i].equalsIgnoreCase("I")) {
                    replacement[i] = "you";
                } else if (replacement[i].equalsIgnoreCase("my")) {
                    replacement[i] = "your";
                } else if (replacement[i].equalsIgnoreCase("me")) {
                    replacement[i] = "you";
                } else if (replacement[i].equalsIgnoreCase("am")) {
                    replacement[i] = "are";
                } else {
                    replacement[i] = replacement[i];
                }
            }
            String replcmnt = new String();
            for (int i = 0; i < replacement.length; i++) {
                replcmnt += replacement[i] + " ";
            }

            System.out.println("So if I heard you right. " + replcmnt);

            String respnse = new String();
            if (random.nextBoolean()) {
                respnse = replyHdg();
            } else {
                respnse = replyQualfr();
            }
            System.out.println(respnse);
        }

    }//close method main
        //ArrayList<String> comment = new ArrayList<String>();


        private static String replyQualfr() {
            Random random = new Random();
            ArrayList<String> qualifiers = new ArrayList<String>();
            qualifiers.add("Why do you say that");
            qualifiers.add("You seem to think that");
            qualifiers.add("So, you are concerned that");
            String replyQulfr = qualifiers.get(random.nextInt(qualifiers.size()));
            return replyQulfr;
        }

        private static String replyHdg() {
            Random random = new Random();
            ArrayList<String> hedges = new ArrayList<String>();
            hedges.add("Please tell me more");
            hedges.add("Many of my patients tell me the same thing");
            hedges.add("It is getting late, maybe we had better quit");
            String replyHdg = hedges.get(random.nextInt(hedges.size()));
            return replyHdg;
        }


    }

