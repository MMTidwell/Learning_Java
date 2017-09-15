//package com.teamtreehouse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));        
        System.out.println("Make a story with the following variables name, noun and adjective! Write a fill in the blank story with an underscore on each side of the variable like __noun__ or __adjective__ or __etc__");
        Prompter prompter = new Prompter();
                String story = null;
                try {
                    story = prompter.promptForStory();
                } catch (IOException e) {
                    e.printStackTrace();
                }   
        Template tmpl = new Template(story);
        prompter.run(tmpl);
    }
}