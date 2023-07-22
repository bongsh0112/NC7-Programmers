import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(bufferedReader.readLine());
    Set<String> wordSet = new HashSet<>();
    
    for (int i = 0; i < N; i++) {
      wordSet.add(bufferedReader.readLine());
    }
    
    List<String> wordList = new ArrayList<>(wordSet);
    Collections.sort(wordList);
    wordList.sort((a, b) -> a.length()- b.length());
    
    for (String s : wordList) {
      System.out.println(s);
    }
    
  }
  
  
}