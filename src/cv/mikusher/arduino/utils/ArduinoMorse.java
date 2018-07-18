/*
 * Copyright (C) 2018 Luis Tavares
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 */
package cv.mikusher.arduino.utils;

/**
 *
 * @author Luis Tavares
 */
public class ArduinoMorse {
    public static void main(String[] args) {
        
    char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                  'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
                  'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                  ',', '.', '?' };

    String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };
    

    //Scanner keyboard = new Scanner(System.in);

    System.out.println(" This is an English to Morse Code Translator.  ");
    System.out.println(" Please enter what you would like translate ");
    System.out.println("             into Morse Code. ");
    System.out.println(" ============================================ ");

    //String userInput = keyboard.nextLine().toLowerCase();
    String userInput = "LUIS".toLowerCase();

    char[] chars = userInput.toCharArray();

    String str = "";
    
    for (int i = 0; i < chars.length; i++){
        for (int j = 0; j < english.length; j++){

            if (english[j] == chars[i]){
                str = str + morse[j] + " ";  
            }
        }
    }
    System.out.println(str);
    String strConvert = str.replace(".", "l").replace("-", "d");
    System.out.println(strConvert);
    
    }
}
