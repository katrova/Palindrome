/*
 * Classname Main
 *
 * Version info 1
 *
 * Copyright Vasylkivska Kateryna KNTEU
 *  */

//------------------------------------------
//2. Check a string as a palindrome
package com.company;

public class Main {

    public static void main(String[] args) {
//        String word = "Муза! Ранясь шилом опыта, ты помолишься на разум.";
        String word = " А лис, он умён — крыса сыр к нему носила.";
        word = word.toLowerCase();
        word = word.replaceAll(" ", "");
        word = word.replaceAll("!", "");
        word = word.replaceAll(",", "");
        word = word.replaceAll("\\.", "");
        word = word.replaceAll("\\?", "");
        word = word.replaceAll("–", "");
        word = word.replaceAll("—", "");
        word = word.replaceAll("-", "");
        word = word.replaceAll("—", "");
        word = word.replaceAll(";", "");


        String template = "";
        for (int i = 0; i < word.length() ; i++) {
            int index = word.length() - i - 1;
            template += word.charAt(index);

        }
        System.out.println(template);
        if (word.equals(template)) {
            System.out.println("This word is polindrom - TRUE");
        } else {
            System.out.println("This word is not polindrom - FALSE");
        }
    }
}
//----------------------------------------------------------------------
// Similarly I checked other palindromes.
//        Мак и воду – ртам, ума – трудовикам!
//        А муза - род учения и не чудо разума?.
//        Лена набила рожу мужу - муж орал и банан ел.
//        А лис, он умен — крыса сыр к нему носила.
