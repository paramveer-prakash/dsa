package com.param.dsa.map;

import com.param.annotation.DSAProblem;

@DSAProblem(
        name = "Find Words That Can Be Formed by Characters",
        number=1160,
        description = "You are given an array of strings words and a string chars. A string is good if it can be formed by characters from chars (each character can only be used once).",
        platform = "LeetCode"
)
public class FindWordsThatCanBeFormedByCharacters {

    public int solve(String[] words, String chars){
        int[] freqChars = countFreq(chars);

        int total = 0;
        for(String word:words){
            int[] freqWC = countFreq(word);

            boolean isGood = true;
            for(int i=0;i<26;i++){
                if(freqWC[i]>freqChars[i]){
                    isGood=false;
                    break;
                }
            }

            if(isGood)
                total+=word.length();
        }

        return total;
    }

    public int[] countFreq(String ins){
        int[] freqChars = new int[26];
        for(char c: ins.toCharArray()){
            freqChars[c-'a']++;
        }
        return freqChars;
    }
}
