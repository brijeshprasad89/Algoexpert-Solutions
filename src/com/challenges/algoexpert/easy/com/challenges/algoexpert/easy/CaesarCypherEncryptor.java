package com.challenges.algoexpert.easy;

/**
 * <p>
 * Given a non-empty string of lowercase letters and a non-negative integer
 * representing a key, write a function that returns a new string obtained by
 * shifting every letter in the input string by k positions in the alphabet,
 * where k is the key.
 * </p>
 * <p>
 * Note that letters should "wrap" around the alphabet; in other words, the
 * letter z shifted by one returns the letter a.
 * </p>
 * Input : String = xyz, key =2
 * Output = zab
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
