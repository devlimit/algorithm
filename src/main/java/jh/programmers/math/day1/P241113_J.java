package jh.programmers.math.day1;

import java.util.Arrays;

/*
* 문제: 최댓값과 최솟값
* 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/12939
* 풀이자: 김지아
* 소요시간: 15분
* */
public class P241113_J {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split(" "); // 입력값 배열로 나누기
        int[] arrNum = new int[arr.length];

        for(int i=0; i<arr.length; i++){
            arrNum[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(arrNum); // 배열 오름차순 정렬

        String minNum = String.valueOf(arrNum[0]); // 최소값
        String maxNum = String.valueOf(arrNum[arrNum.length-1]); // 최대값

        answer = minNum+" "+maxNum;

        return answer;
    }

    public static void main(String[] args) {
        P241113_J P241117 = new P241113_J();
        System.out.println(P241117.solution("1 2 3 4"));
        System.out.println(P241117.solution("-1 -2 -3 -4"));
    }
}
