package jh.programmers.hash;

import java.util.HashSet;
import java.util.Set;
/**
 * 풀이자: 신혜림
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/1845
 * 풀이시간 :20분
 *  숫자가 안겹치게 hash를 사용해 중복을 제거해줬고 최대값보다 set의 값이 클땐 최대값으로 변경하게 해주었다
 */
public class P241117_H {
        public int solution(int[] nums) {
            //숫자 안겹치게 넣기
            Set<Integer> set = new HashSet<>();
            for(int i=0; i<nums.length; i++){
                set.add(nums[i]);
            }
            //최대선택할수있는 포케몬갯수
            int max = nums.length/2;
            int answer = 0;
            answer= set.size();
            if(max<=answer) {
                answer = max;
            }
            return answer;
        }

    public static void main(String[] args) {
        P241117_H P241117 = new P241117_H();
        int [] ex_1 = {3,1,2,3};
        int [] ex_2 = {3,3,3,2,2,4};
        System.out.println(P241117.solution(ex_1));
        System.out.println(P241117.solution(ex_2));
    }
}
