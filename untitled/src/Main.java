package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Queue;

public class Main {
  
  static int N, M; // 도착지점이자 행렬의 행, 열
  static int dirX[] = {0, 0, -1, 1}; // 좌우
  static int dirY[] = {-1, 1, 0, 0}; // 상하
  static int[][] maze;
  static Queue<int[]> queue;
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuffer stringBuffer = new StringBuffer();
    
    String[] str = bufferedReader.readLine().split(" ");
    N = Integer.parseInt(str[0]);
    M = Integer.parseInt(str[1]);
    maze = new int[N][M];
    for (int i = 0; i < N; i++) {
      str = bufferedReader.readLine().split("");
      for (int j = 0; j < M; j++) {
        int temp = Integer.parseInt(str[j]);
        maze[i][j] = temp;
      }
    }
    
    
    
  }
}