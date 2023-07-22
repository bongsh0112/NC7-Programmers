import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Main {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();
    int N = Integer.parseInt(bufferedReader.readLine());
    
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int temp = Integer.parseInt(bufferedReader.readLine());
      list.add(temp);
    }
    
    list.sort((a, b) -> a - b);
    for (int i = 0; i < N; i++) {
      stringBuilder.append(list.get(i) + "\n");
    }
    
    System.out.println(stringBuilder.toString());
    
  }
  
  
}