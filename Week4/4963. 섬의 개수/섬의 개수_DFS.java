import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main { // 4963 dfs
  
  static int h, w;
  static int[] dirX = {0, 1, 1, 1, 0, -1, -1, -1}; //x축
  static int[] dirY = {1, 1, 0, -1, -1, -1, 0, 1}; //y축
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
            dfs(i, j);
            count++;
          }
        }
      }
      
      stringBuffer.append(count + "\n");
    }
    
    System.out.println(stringBuffer.toString());
    
  }
  
  static void dfs(int y, int x) {
    check[y][x] = true;
    
    for (int i = 0; i < 8; i++) {
      int X = x + dirX[i];
      int Y = y + dirY[i];
      
      if (X >= 0 && X < w && Y >= 0 && Y < h) {
        if (!check[Y][X] && map[Y][X] == 1) {
          check[Y][X] = true;
          dfs(Y, X);
        }
      }
    }
  }
  
}