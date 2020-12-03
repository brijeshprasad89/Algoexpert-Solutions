package com.challenges.algoexpert.easy;


public class HackerRankRepeatedChars {

    public static void main(String[] args) {
        System.out.print(getRepeatedChars("babbaabbabaababaaabbbbbbbababbbabbbababaabbbbaaaaabbaababaaabaabbabababaabaabbbababaabbabbbababbaabb", 860622337747L));
    }

    private static long getRepeatedChars(String s, long n) {
        long remainderString = n % s.length();

        long count = s.chars().filter(ch -> ch == 'a').count();
        if (remainderString == 0) {
            return count * n / s.length();
        }

        String sub = s.substring(0, (int) remainderString);

        long initialCount = count * (n / s.length());

        return initialCount + sub.chars().filter(ch -> ch == 'a').count();
    }

}
