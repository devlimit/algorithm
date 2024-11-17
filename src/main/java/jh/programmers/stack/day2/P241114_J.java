package jh.programmers.stack.day2;

import java.util.*;

/*
 * 문제: 올바른 괄호
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/12909
 * 풀이자: 김지아
 * 소요시간: 15분
 * */
public class P241114_J {
    boolean solution(String s) {
        boolean answer = true;
        char[] bracket = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<bracket.length; i++){
            if('(' == bracket[i] ){
                stack.push('1');
            } else if(')' == bracket[i]){
                if(stack.isEmpty()){
                    answer = false;
                    return answer;
                } else {
                    stack.pop();
                }
            }
        }

        if(stack.isEmpty()){
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {
        P241114_J p = new P241114_J();

        System.out.println(p.solution("()()"));
        System.out.println(p.solution("(())()"));
        System.out.println(p.solution(")()("));
        System.out.println(p.solution("(()("));
    }
}
