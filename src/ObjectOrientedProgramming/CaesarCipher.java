package ObjectOrientedProgramming;

import java.util.Scanner;

public class CaesarCipher {

    private int shift;

    //no-arg constructor
    public CaesarCipher(){
        this(3); //default shift value
    }

    //constructor taking a parameter
    public CaesarCipher(int shift){
        this.shift = shift;
    }


    //here is example of encrypt method.
    public String encrypt(String message) {
        String encrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                char shifted = (char) ('A' + (c - 'A' + shift) % 26);
                encrypted += shifted;
            } else if (c >= 'a' && c <= 'z') {
                char shifted = (char) ('a' + (c - 'a' + shift) % 26);
                encrypted += shifted;
            } else {
                encrypted += c;
            }
        }
        return encrypted;
    }


    //can you complete decrypt() method
    public String decrypt(String message){
        String decrypted = "";
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                char shifted = (char) ('A' + (c - 'A' - shift) % 26);
                decrypted += shifted;
            } else if (c >= 'a' && c <= 'z') {
                char shifted = (char) ('a' + (c - 'a' - shift) % 26);
                decrypted += shifted;
            } else {
                decrypted += c;
            }
        }
        return decrypted;
    }
    }




