import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Time;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();
    String[] str = bufferedReader.readLine().split(" ");
    int N = Integer.parseInt(str[0]);
    int M = Integer.parseInt(str[1]);
    Map<Integer, String> numToPo = new HashMap<>();
    Map<String, Integer> poToNum = new HashMap<>();
    
    for (int i = 0; i < N; i++) {
      String s = bufferedReader.readLine();
      numToPo.put(i + 1, s);
      poToNum.put(s, i + 1);
    }
    
    for (int i = 0; i < M; i++) {
      String temp = bufferedReader.readLine();
      stringBuilder.append(
              poToNum.containsKey(temp) ? poToNum.get(temp) : numToPo.get(Integer.parseInt(temp))
      ).append("\n");
    }
    
    System.out.println(stringBuilder.toString());
    
  }
  
}