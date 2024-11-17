package jh.programmers.hash.day3;

import java.util.Set;
import java.util.HashSet;

/*
 * 문제: 폰켓몬
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/1845
 * 풀이자: 김지아
 * 소요시간: 30분
 * */
public class P241115_J {
    public int solution(int[] nums) {
        int answer = 0;

        int len = nums.length/2;
        Set<Integer> set = new HashSet<Integer>(); // 중복 제거

        for(int num: nums){
            set.add(num);
        }

        int setSize = set.size();

        if(setSize>=len){
            answer = len;
        } else {
            answer = setSize;
        }

        return answer;
    }

    public static void main(String[] args) {
        P241115_J p = new P241115_J();

        System.out.println(p.solution(new int[]{3,1,2,3}));
        System.out.println(p.solution(new int[]{3,3,3,2,2,4}));
        System.out.println(p.solution(new int[]{3,3,3,2,2,2}));
    }
}
