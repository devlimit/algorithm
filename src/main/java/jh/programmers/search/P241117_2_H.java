package jh.programmers.search;
/**
 * 문제: 최소직사각형
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/86491
 * 풀이자 : 신혜림
 * 풀이시간: 30분
 */
public class P241117_2_H {
    public int solution(int[][] sizes) {
        int answer = 0;
        int height = 0;
        int width = 0;
        //이차원배열에서 큰값을 앞으로 배치
        for(int i=0; i<sizes.length; i++) {
            if(sizes[i][0] < sizes[i][1]){
                int tmp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = tmp;
            }
        }
        // 행과 열에서 최대값 찾기
        for(int i =0; i< sizes.length; i++){
            if(height < sizes[i][0] ){
                height  = sizes[i][0];
            }
            if(width < sizes[i][1] ){
                width  = sizes[i][1];
            }
        }
        answer = height * width;
        return answer;
    }
}
