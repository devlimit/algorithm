package jh.programmers.search.day3;

import java.util.*;

/*
 * 문제: 모의고사
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * 풀이자: 김지아
 * 소요시간: 25분
 * */
public class P241115_J {
    public int[] solution(int[] answers) {
        int[] person1 = {1, 2, 3, 4, 5};
        int[] person2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] score = {0, 0, 0};

        for(int i=0; i<answers.length; i++){
            if(person1[i%5] == answers[i]){
                score[0] ++;
            }
            if(person2[i%8] == answers[i]){
                score[1] ++;
            }
            if(person3[i%10] == answers[i]){
                score[2] ++;
            }
        }

        int scoreMax = Math.max(score[0], Math.max(score[1], score[2]));

        List<Integer> studentList = new ArrayList<Integer>();

        for(int i=0; i<score.length; i++){
            if(scoreMax == score[i]){
                studentList.add(i+1);
            }
        }

        int[] answer = new int[studentList.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = studentList.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        P241115_J p = new P241115_J();

        int[] sample1 = {1,2,3,4,5};
        int[] sample2 = {1,3,2,4,2};

        System.out.println(p.solution(sample1));
        System.out.println(p.solution(sample2));
    }
}
