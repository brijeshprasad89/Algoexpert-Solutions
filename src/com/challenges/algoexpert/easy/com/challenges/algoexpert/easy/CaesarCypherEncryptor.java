package com.challenges.algoexpert.easy;

/**
 *
 */
public class CaesarCypherEncryptor {
    public static void main(String[] args) {
        System.out.print(caesarCypherEncryptor("xyz", 2));
    }

    public static String caesarCypherEncryptor(String str, int key) {
        key = key % 26;
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] + key > 122) {

                chars[i] = (char) (97 + chars[i] + key - 122 - 1);
            } else {
                chars[i] = (char) (chars[i] + key);
            }
        }
        return new String(chars);
    }
}
