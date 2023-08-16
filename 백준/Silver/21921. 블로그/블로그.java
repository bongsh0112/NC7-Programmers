import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();
    
    String[] str = bufferedReader.readLine().split(" ");
    int N = Integer.parseInt(str[0]);
    int X = Integer.parseInt(str[1]);
    
    str = bufferedReader.readLine().split(" ");
    int[] arr = new int[N];
    
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }
    
    int count = 1;
    int max = 0;
    int sum = 0;
    
    for (int i = 0; i < X; i++) {
      sum += arr[i];
    }
    max = sum;
    
    for (int i = X; i < N; i++) {
      sum += arr[i] - arr[i - X]; //
      if (max == sum) count++;
      else if (max < sum) {
        max = sum;
        count = 1;
      }
    }
    
    if (max == 0) {
      System.out.println("SAD");
    } else {
      System.out.println(max);
      System.out.println(count);
    }
    
  }
  
}