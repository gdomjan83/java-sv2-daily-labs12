package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {
    public Map<Character, Integer> countCharacters(String word) {
        Map<Character, Integer> result = new HashMap<>();
        for (char c : word.toCharArray()) {
            if (!result.containsKey(c)) {
                result.put(c, countOneCharacter(c, word));
            }
        }
        return result;
    }

    private int countOneCharacter(char letterSearched, String word) {
        int count = 0;
        for (Character actual : word.toCharArray()) {
            if (letterSearched == actual) {
                count++;
            }
        }
        return count;
    }
}
