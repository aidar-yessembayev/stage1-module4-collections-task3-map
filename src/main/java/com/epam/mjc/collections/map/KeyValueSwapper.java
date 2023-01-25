package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();

        if (sourceMap.size() > 0) {
            for (Integer number : sourceMap.keySet()) {
                String word = sourceMap.get(number);

                if ((result.containsKey(word)) && (number > result.get(word))) {
                    continue;
                }

                result.put(word, number);
            }
        }

        return result;
    }
}
