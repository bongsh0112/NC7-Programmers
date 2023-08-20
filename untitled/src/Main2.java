package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main2 {
  
  static int N;
  static List<Integer>[] tree = new ArrayList[N];
  static int count = 0;
  
  public static void main(String[] args) throws IOException {
    
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    StringBuilder stringBuilder = new StringBuilder();
    
    N = Integer.parseInt(bufferedReader.readLine());
    String[] str = bufferedReader.readLine().split(" ");
    tree = new ArrayList[N];
    
    for (int i = 0; i < N; i++) {
      tree[i] = new ArrayList<>();
    }
    
    int root = 0;
    
    for (int i = 0; i < N; i++) {
      int n = Integer.parseInt(str[i]);
      tree[i].add(n);
      if (n != -1) {
        tree[n].add(i); // root가 노드들은 부모 노드에 자신이 들어온 것을 표시함.
      } else {
        root = i; // root 설정
      }
    }
    
    int delNode = Integer.parseInt(bufferedReader.readLine());
    tree[delNode].clear();
    
    countLeafs(tree[root], root);
    System.out.println(count);
    
  }
  
  static void countLeafs(List<Integer> list, int idx) {
    if (list.size() == 1) {
      count++;
    }
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) > idx) {
        countLeafs(tree[list.get(i)], list.get(i));
      }
    }
  }
  
}