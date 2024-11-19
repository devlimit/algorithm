package jh.programmers.sort.day4;

import java.util.Arrays;

/*
 * 문제: K번째수
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/42748
 * 풀이자: 김지아
 * 소요시간: 30분
 * */
public class P241118_J {
    public int[] solution(int[] array, int[][] commands) {
        int commandsArrayLength = commands.length; //3번 반복

        int[] answer = new int[commandsArrayLength];

        for(int s=0; s<commandsArrayLength; s++){
            int command[] = commands[s];
            int i = command[0];
            int j = command[1];
            int k = command[2];

            int[] tempArr = new int[j-i+1];

            for(int m=0; m<tempArr.length; m++){
                tempArr[m] = array[i-1+m];
            }

            Arrays.sort(tempArr);

            int result = tempArr[k-1];

            answer[s] = result;
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
