package jh.programmers.sort.day5;

import java.util.Arrays;

/*
 * 문제: 가장 큰 수
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/42746
 * 풀이자: 김지아
 * 소요시간: 25분
 * */
public class P241119_J {
    public String solution(int[] numbers) {
        String[] arr = new String[numbers.length];

        for(int i=0; i<arr.length; i++){
            arr[i] = String.valueOf(numbers[i]);
        }

        // 큰 순서대로 정렬
        Arrays.sort(arr, (o1, o2)->(o2+o1).compareTo(o1+o2));

        if(arr[0].equals("0")){
            return "0";
        }

        StringBuilder answer = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            answer.append(arr[i]);
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        P241119_J p = new P241119_J();

        System.out.println(p.solution(new int[]{6, 10, 2}));
        System.out.println(p.solution(new int[]{3, 30, 34, 5, 9}));
    }
}
