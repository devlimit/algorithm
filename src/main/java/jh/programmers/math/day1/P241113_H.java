package jh.programmers.math.day1;

/**
 * 문제: 최댓값과 최솟값
 * 소요시간 : 20분
 * 풀이자 :신혜림
 */
public class P241113_H {

        public String solution(String s) {
            String answer = "";
            String [] ss = s.split(" "); //문제에서 1234 사이의 빈공백이있었음 그래서 split을 사용해 잘라줌
            int max = Integer.parseInt(ss[0]);
            int min = Integer.parseInt(ss[0]);
            for(int i =0; i<ss.length; i++){
                int j = Integer.parseInt(ss[i]);
                if(max < j){
                    max = j;
                }
                if(min > j){
                    min = j;
                }
            }
            answer = min+" "+max;
            return answer;
        }

    public static void main(String[] args) {
        P241113_H P241113 = new P241113_H();
        System.out.println(P241113.solution("1 2 3 4"));
        System.out.println(P241113.solution("-1 -2 -3 -4"));
    }

}
