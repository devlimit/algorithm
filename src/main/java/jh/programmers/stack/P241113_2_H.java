package jh.programmers.stack;

import java.util.Stack;

/**
 * 프로그래머스- 같은숫자는 싫어
 * 소요시간 : 30분
 */
public class P241113_2_H {

    public int[] solution(int []arr) {
        int[] answer ; // int[] answer = new int[arr.length]; 이렇게 선언해줘서 결과값이 계속 뒤에 0 ,0,0으로 찍혔었다
        Stack<Integer> stack = new Stack<>();

        for(int i =0; i< arr.length; i++) {
            if(stack.isEmpty()){  //첫번째일땐 넣어주기
                stack.push(arr[i]);
            }
            if(stack.peek()!= arr[i]){ //맨위의 것과 같지않다면 넣어주기
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];   //여기에서 answer의 사이즈 정해주기
        for(int i=stack.size()-1; i >= 0;i--){   //역순으로 넣어줌
            answer[i] = stack.pop();
        }

        return answer;
    }


    public static void main(String[] args) {
        P241113_2_H P241113 = new P241113_2_H();
        int [] arr = new int[]{1, 1, 3, 3, 0, 1};
        int [] arr2 = new int[]{-1 -2 -3 -4};

        System.out.println(P241113.solution(arr));
        System.out.println(P241113.solution(arr2));
    }

}
