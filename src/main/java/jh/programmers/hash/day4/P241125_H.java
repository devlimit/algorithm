package jh.programmers.hash.day4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * 문제: 완주하지 못한 선수
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/42576
 * 풀이자: 신혜림
 * 소요시간: 50분
 * */
public class P241125_H {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> hashMap = new HashMap<>();
        //참가자 더하기 없으면 0으로
        for(int i =0; i<participant.length; i++){
            hashMap.put(participant[i], hashMap.getOrDefault(participant[i],0)+1);
        }
        //완주자 빼기
        for(int i=0; i<completion.length; i++){
            hashMap.put(completion[i],hashMap.get(completion[i])-1);
        }
        Iterator<Map.Entry<String, Integer>> iter = hashMap.entrySet().iterator();
        while(iter.hasNext()){
            Map.Entry<String, Integer> entry = iter.next();
            if (entry.getValue() != 0){
                answer = entry.getKey();
                break;
            }
        }
        return answer;
    }
}
