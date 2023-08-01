package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public int majorityElement(int[] nums) {

        Map<Integer,Long> frequencyMap = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        Optional<Map.Entry<Integer, Long>> result = frequencyMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        if(result.isEmpty()){
            return -1;
        }
        int numbersWithMaxFrequency  = (int) frequencyMap
                .entrySet()
                .stream()
                .filter(entry ->
                        !entry.getKey().equals(result.get().getKey()) && entry.getValue().equals(result.get().getValue())).count();
        if(numbersWithMaxFrequency >0){
            return -1;
        }

        return result.get().getKey();
    }

}
