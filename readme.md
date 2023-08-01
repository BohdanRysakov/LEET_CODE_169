# Task 169 LeetCode - Solution for task 169 Leet Code
https://leetcode.com/problems/majority-element/

----------------
Slow but it's LeetCode test's problem - they are too small.

```Java
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

```