package com.param.dsa.map;

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
