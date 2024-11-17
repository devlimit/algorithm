package jh.programmers.search.day2;


import jh.programmers.math.day1.P241113_H;

import java.util.ArrayList;
import java.util.List;

/**
 * 문제:모의고사
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * 풀이자 : 신혜림
 * 풀이시간: 1 시간 40분
 */
public class P241117_3_H {

    public int[] solution(int[] answers) {
        int []  numberOne =  {1,2,3,4,5}; //5개
        int [] numberTwo = {2, 1, 2, 3, 2, 4, 2, 5, 2}; //8개
        int [] numberThree = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};// 10개
        int [] count = {0,0,0};
        //for문을 하나씩돌아서 맞은 개수를 찾아야하나?
        for(int i = 0; i<answers.length; i++) {//answer의 길이만큼
            int  num = i %5;
            int  numTwo = i %8;
            int  numThree = i %10;
            if(numberOne[num] == answers[i]){
                count[0]++;
            }
            if(numberTwo[numTwo] == answers[i]){
                count[1]++;
            }
            if(numberThree[numThree] == answers[i]){
                count[2]++;
            }
        }
        //최대값을 구해서 값 넣어주기
        int max = Math.max(count[0],Math.max(count[1],count[2]));
        //누가 최대값인지 찾기
        List<Integer> maxPerson = new ArrayList<>();
        for(int i = 0; i<count.length; i++){
            if(max == count[i]) maxPerson.add(i+1);
        }
        int[] answer =new int[maxPerson.size()];
        for(int i=0; i<maxPerson.size(); i++){
            answer[i] = maxPerson.get(i);
        }
        return answer;
    }
    public static void main(String[] args) {
        P241117_3_H p241117_3_h = new P241117_3_H();
        int [] arr = {1,2,3,4,5};
        int [] arr2 = {1,3,2,4,2};
        System.out.println(p241117_3_h.solution(arr));
        System.out.println(p241117_3_h.solution(arr2));
    }
}
