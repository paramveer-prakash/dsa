package com.param.dsa.map;

import java.util.HashMap;
import java.util.Map;

import com.param.annotation.DSAProblem;

@DSAProblem(
        name = "Ransom Note",
        number=383,
        description = "Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.",
        platform = "LeetCode"
)
public class RansomNote {
    public boolean solve(String ransomNote, String magazine) {

        final Map<Character,Integer> mmap = new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            final char c = magazine.charAt(i);
            final int freq = mmap.getOrDefault(c,0);
            mmap.put(c,freq+1);
        }

        for(int i=0;i<ransomNote.length();i++){
            final char c = ransomNote.charAt(i);
            final int freq = mmap.getOrDefault(c,0);
            if(freq==0){
                return false;
            }
            mmap.put(c,freq-1);
        }
        return true;


    }
}
