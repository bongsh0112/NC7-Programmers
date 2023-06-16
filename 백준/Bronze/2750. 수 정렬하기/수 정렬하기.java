import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  public static void main(String[] args) throws IOException {

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer stringBuffer = new StringBuffer();

    // ArrayList로 풀이
    
    int N = Integer.parseInt(bufferedReader.readLine());
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(Integer.parseInt(bufferedReader.readLine()));
    }

    list.sort(Comparator.naturalOrder());

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

  }

}
