package jh.programmers.stack.day1;

import java.util.List;
import java.util.ArrayList;

/*
 * 문제: 같은 숫자는 싫어
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * 풀이자: 김지아
 * 소요시간: 15분
 * */
public class P241113_J {
    public int[] solution(int []arr) {
        List<Integer> arrList = new ArrayList<Integer>();

        for(int i=0; i< arr.length; i++){
            if(arrList.size() == 0){
                arrList.add(arr[i]);
            } else {
                // 연속된 같은 숫자가 들어가는지 확인
                if(arrList.get(arrList.size()-1) != arr[i]){
                    arrList.add(arr[i]);
                }
            }
        }

        int[] answer = new int[arrList.size()];

        // ArrayList to array
        for(int i=0; i<arrList.size(); i++){
            answer[i] = arrList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        P241113_J P241117 = new P241113_J();
        int[] sample1 = P241117.solution(new int[]{1,1,3,3,0,1,1});
        int[] sample2 = P241117.solution(new int[]{4,4,4,3,3});
        for(int i=0; i<sample1.length; i++){
            System.out.print(sample1[i]+" ");
        }
        System.out.println();
        for(int i=0; i<sample2.length; i++){
            System.out.print(sample2[i]+" ");
        }
    }
}
