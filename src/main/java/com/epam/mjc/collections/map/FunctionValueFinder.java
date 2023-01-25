package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {

        if (sourceList.size() > 0) {
            Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);

            for (Integer number : functionMap.keySet()) {
                if (functionMap.get(number) == requiredValue) {
                    return true;
                }
            }

        }

        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {

        Map<Integer, Integer> result = new HashMap<>();

        for (int i = 0; i < sourceList.size(); i++) {
            if (!result.containsKey(sourceList.get(i))) {
                int calculation = 5 * sourceList.get(i) + 2;
                result.put(sourceList.get(i), calculation);
            }
        }

        return result;
    }
}
