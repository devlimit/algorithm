package jh.programmers.dynamic.day6;

/*
 * 문제: 피보나치 수
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/12945
 * 풀이자: 김지아
 * 소요시간: 40분
 * */
public class P241120_J {
    public int solution(int n) {
        int[] answer = new int[n+1];

        answer[0] = 0;
        answer[1] = 1;

        for(int i=2; i<=n; i++){
            answer[i] = (answer[i-1] + answer[i-2])%1234567;
        }

        return answer[n]%1234567;
    }

    public static void main(String[] args) {
        P241120_J p = new P241120_J();
        System.out.println(p.solution(3));
        System.out.println(p.solution(5));
    }

    // 이렇게 풀었더니 시간초과로 틀림
    /*
    public int fibo(int n){
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);
    }

    public int solution2(int n) {
        int answer = fibo(n)%1234567;

        return answer;
    }
    */
}
