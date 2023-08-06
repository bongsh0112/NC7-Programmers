import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String[] str = bufferedReader.readLine().split(" ");
    
    int N = Integer.parseInt(str[0]);
    int S = Integer.parseInt(str[1]);
    
    str = bufferedReader.readLine().split(" ");
    int[] arr = new int[N + 1];
    
    for (int i = 0; i < N; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }
    
    int start = 0; // 투포인터의 시작
    int end = 0; // 투포인터의 끝
    int len = Integer.MAX_VALUE; // 최소 길이를 비교할 변수
    int sum = 0; // S와 비교할 sum
    
    // 투포인터는 start, end라는 두 포인터로 배열 안에서의 범위를 정하여 탐색한다
    
    while (start <= end && end <= N) {
      if (sum < S) { // S보다 sum이 작으면 end를 하나씩 늘려 sum이 S 이상이 되도록 한다
        sum += arr[end++];
      } else { // sum >= S가 되었다면 원래의 len과 새로운 len 후보(end - start)를 비교하여 더 작은 값을 찾는다
        len = Math.min(end - start, len);
        sum -= arr[start]; // 다음 투포인터 진행을 위해 맨 처음 숫자를 빼주고
        start++; // start를 한칸 옮겨 새로운 시작을 한다
      }
    }
    
    System.out.println(len == Integer.MAX_VALUE ? 0 : len); // 만약 sum이 S 이상이 되는 순간이 없다면 len이 그대로 MAX_VALUE 일 것.
    
  }
  
}