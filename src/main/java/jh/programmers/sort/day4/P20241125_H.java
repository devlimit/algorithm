package jh.programmers.sort.day4;
import java.util.*;

/*
 * 문제: K번째수
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * 풀이자: 신혜림
 * 소요시간: 40분
 * */
public class P20241125_H {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int [commands.length];
        for(int i = 0; i<commands.length; i++){
            int start = commands[i][0];
            int end =  commands[i][1];
            int sortNum =  commands[i][2];

            int[] tmp =new int [end-start+1];
            for(int j =0; j<tmp.length; j++){
                tmp[j] = array[start-1+j];
            }
            Arrays.sort(tmp);
            answer[i] = tmp[sortNum-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        P241118_J p = new P241118_J();

        int[] result = p.solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});

        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
