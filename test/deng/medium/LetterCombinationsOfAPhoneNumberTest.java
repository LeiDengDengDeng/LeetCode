package deng.medium;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

/**
 * @author deng
 * @date 2019/04/15
 */
public class LetterCombinationsOfAPhoneNumberTest {

    @Test
    public void letterCombinations() {
        List<String> result = new LetterCombinationsOfAPhoneNumber().letterCombinations("23");
        Set<String> expectedResSet = new HashSet<>(Arrays.asList("ae", "ad", "bd", "af", "be", "bf", "cd", "ce", "cf"));
        assertTrue(judge(result, expectedResSet));
    }

    private boolean judge(List<String> result, Set<String> expectedResSet) {
        if ((result == null && expectedResSet != null) || (result != null && expectedResSet == null)) return false;
        for (String res : result) {
            if (!expectedResSet.contains(res)) return false;
        }
        return result.size() == expectedResSet.size();
    }
}