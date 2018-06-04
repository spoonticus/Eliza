package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Good day, my name is Eliza. Tell me what is on your mind.");
        System.out.println("Press q at anytime to exist session.");
        String comment = input.readLine();
        String [] replacement = comment.split("\\s+");
            for (int i=0; i<replacement.length; i++){
                if (replacement[i].equalsIgnoreCase("I")){
                    replacement[i] = "you";
                }
                if (replacement[i].equalsIgnoreCase("my")){
                    replacement[i] = "your";
                }
                if (replacement[i].equalsIgnoreCase("me")){
                    replacement[i] = "you";
                }
                if (replacement[i].equalsIgnoreCase("am")){
                    replacement[i] = "are";
                }



            }

        //ArrayList<String> comment = new ArrayList<String>();

        }



    }

