package src;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class Programmers {
  
  public static void main(String[] args) throws IOException {
    System.out.println(solution(45));
  }
  
  public static int solution(int n) {
    StringBuilder stringBuilder = new StringBuilder();
    while (n > 0) {
      stringBuilder.append(n % 3);
      n = n / 3;
    }
    String[] num = stringBuilder.toString().split("");
    int answer = 0;
    for (int i = 0; i < num.length; i++) {
      System.out.println(num[i] + " " + Math.pow(3, num.length - i));
      answer += Integer.parseInt(num[i]) * Math.pow(3, num.length - i - 1);
    }
    return answer;
  }
  
}