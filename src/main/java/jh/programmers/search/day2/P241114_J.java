package jh.programmers.search.day2;

/*
 * 문제: 최소직사각형
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 풀이자: 김지아
 * 소요시간: 20분
 * */
public class P241114_J {
    public int solution(int[][] sizes) {
        int answer = 0;

        int temp = 0;
        int maxA = 0;
        int maxB = 0;

        for(int i=0; i<sizes.length; i++){
            int a = sizes[i][0]; //가로(길다)
            int b = sizes[i][1]; //세로(짧다)

            if(b>a){
                temp = a;
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        maxA = sizes[0][0];
        maxB = sizes[0][1];

        for(int i=1; i<sizes.length; i++){
            maxA = Math.max(maxA, sizes[i][0]);
            maxB = Math.max(maxB, sizes[i][1]);
        }

        answer = maxA * maxB;

        return answer;
    }

    public static void main(String[] args) {
        P241114_J p = new P241114_J();

        int[][] sample1 = new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sample2 = new int[][]{{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sample3 = new int[][]{{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(p.solution(sample1));
        System.out.println(p.solution(sample2));
        System.out.println(p.solution(sample3));
    }
}
