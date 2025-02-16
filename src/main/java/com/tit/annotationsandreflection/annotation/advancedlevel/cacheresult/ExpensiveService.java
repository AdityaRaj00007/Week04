package com.tit.annotationsandreflection.annotation.advancedlevel.cacheresult;

import java.util.HashMap;
import java.util.Map;

public class ExpensiveService {
    private final Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int computeSquare(int number) {
        if (cache.containsKey(number)) {
            System.out.println("Returning cached result for: " + number);
            return cache.get(number);
        }
        System.out.println("Computing result for: " + number);
        int result = number * number;
        cache.put(number, result);
        return result;
    }
}

