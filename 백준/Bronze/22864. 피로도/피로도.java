import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] str = bufferedReader.readLine().split(" ");
    int A = Integer.parseInt(str[0]); // 더해지는 피로도
    int B = Integer.parseInt(str[1]); // 일하는 양
    int C = Integer.parseInt(str[2]); // 깎이는 피로도
    int M = Integer.parseInt(str[3]); // 최대 피로도
    
    int tired = 0;
    int worked = 0;
    
    if (tired > M) {
      System.out.println(0);
      return;
    }
    
    for (int i = 0; i < 24; i++) {
      if (tired + A <= M) {
        tired += A;
        worked += B;
      } else {
        tired -= C;
        if (tired < 0) {
          tired = 0;
        }
      }
    }
    
    if (tired > M) {
      worked -= B;
    }
    
    System.out.println(worked);
    
  }
  
}