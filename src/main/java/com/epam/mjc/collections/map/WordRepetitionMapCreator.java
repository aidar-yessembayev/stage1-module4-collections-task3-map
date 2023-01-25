package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> result = new HashMap<>();

        if (sentence.length() > 0) {
            String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");

            if (words.length > 0) {
                for (int i = 0; i < words.length; i++) {
                    if (!result.containsKey(words[i])) {
                        int count = 0;

                        for (int j = i; j < words.length; j++) {
                            if (words[j].equals(words[i])) {
                                count++;
                            }
                        }

                        result.put(words[i], count);
                    }
                }
            }
        }

        return result;

    }
}
