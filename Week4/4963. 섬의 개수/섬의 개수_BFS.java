import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main { // 4963 bfs
  
  static int w, h;
  static int[] dirX = {0, 1, 1, 1, 0, -1, -1, -1};
  static int[] dirY = {1, 1, 0, -1, -1, -1, 0, 1};
  static int[][] map;
  static boolean[][] check;
  static int count;
  static Queue<int[]> queue = new LinkedList<>();
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer stringBuffer = new StringBuffer();
    
    String str = "";
    while (!(str = bufferedReader.readLine()).equals("0 0")) {
      String[] wh = str.split(" ");
      w = Integer.parseInt(wh[0]);
      h = Integer.parseInt(wh[1]);
      count = 0;
      
      map = new int[h][w];
      check = new boolean[h][w];
      
      for (int i = 0; i < h; i++) {
        String[] temp = bufferedReader.readLine().split(" ");
        for (int j = 0; j < w; j++) {
          map[i][j] = Integer.parseInt(temp[j]);
        }
      }
      
      for (int i = 0; i < h; i++) {
        for (int j = 0; j < w; j++) {
          if(!check[i][j] && map[i][j] == 1) {
            bfs(i, j);
            count++;
          }
        }
      }
      
      stringBuffer.append(count + "\n");
    }
    
    System.out.println(stringBuffer.toString());
    
  }
  
  static void bfs(int y, int x) {
    queue.offer(new int[]{y, x});
    check[y][x] = true;
    
    while (!queue.isEmpty()) {
      int curY = queue.peek()[0];
      int curX = queue.peek()[1];
      queue.poll();
      
      for (int i = 0; i < 8; i++) {
        int X = curX + dirX[i];
        int Y = curY + dirY[i];
        
        if (X >= 0 && Y >= 0 && X < w && Y < h) {
          if (map[Y][X] == 1 && !check[Y][X]) {
            queue.offer(new int[]{Y, X});
            check[Y][X] = true;
          }
        }
      }
    }
  }
  
}