import java.util.stream.Collectors;
import java.util.*;

class Solution {
    public String solution(String myString) {
        return Arrays.stream(myString.split(""))
            .distinct()
            .collect(Collectors.joining());
    }
}