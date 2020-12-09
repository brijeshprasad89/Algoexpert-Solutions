package com.challenges.algoexpert.easy;

import java.util.HashMap;

/**
 * <p>
 * Write a function that takes in a non-empty string and returns its run-length
 * encoding.
 * </p>
 * <p>
 * From Wikipedia, "run-length encoding is a form of lossless data compression in
 * which runs of data are stored as a single data value and count, rather than as
 * the original run." For this problem, a run of data is any sequence of
 * consecutive, identical characters. So the run <span>"AAA"</span> would be
 * run-length-encoded as <span>"3A"</span>.
 * </p>
 * <p>
 * To make things more complicated, however, the input string can contain all
 * sorts of special characters, including numbers. And since encoded data must be
 * decodable, this means that we can't naively run-length-encode long runs. For
 * example, the run <span>"AAAAAAAAAAAA"</span> (12 <span>A</span>s), can't
 * naively be encoded as <span>"12A"</span>, since this string can be decoded as
 * either <span>"AAAAAAAAAAAA"</span> or <span>"1AA</span>. Thus, long runs (runs
 * of 10 or more characters) should be encoded in a split fashion; the
 * aforementioned run should be encoded as <span>"9A3A"</span>.
 * </p>
 */
public class RunLengthEncoding {
    public static void main(String[] args) {
        System.out.println(runLengthEncoding("122333"));
        System.out.println(runLengthEncoding("[(aaaaaaa,bbbbbbb,ccccc,dddddd)]"));
        System.out.print(runLengthEncoding("[(aaaaaaa,bbbbbbb,ccccc,dddddd)]").equalsIgnoreCase("1[1(7a1,7b1,5c1,6d1)1]"
        ));
    }

    public static String runLengthEncoding(String string) {
        String encodedValue = "";
        int tempCount = 1;
        for (int i = 0; i < string.length() - 1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                tempCount++;
            }
            if (string.charAt(i) != string.charAt(i + 1)) {
                encodedValue = encodeChars(tempCount, encodedValue, String.valueOf(string.charAt(i)));
                tempCount = 1;
            }
        }
        encodedValue = encodeChars(tempCount, encodedValue, string.substring(string.length() - 1));
        return encodedValue;
    }

    private static String encodeChars(int tempCount, String encodedValue, String ch) {
        if (tempCount == 1) {
            encodedValue = encodedValue.concat("1" + ch);
        } else if (tempCount <= 9) {
            encodedValue = encodedValue.concat(String.valueOf(tempCount)).concat(ch);
        } else if (tempCount > 9) {
            int timesRepeated = tempCount / 9;
            for (int j = 0; j < timesRepeated; j++) {
                encodedValue = encodedValue.concat("9").concat(ch);
            }
            encodedValue = encodedValue.concat(String.valueOf(tempCount % 9)).concat(ch);
        }
        return encodedValue;
    }
}
