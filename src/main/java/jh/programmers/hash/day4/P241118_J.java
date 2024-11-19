package jh.programmers.hash.day4;

import java.util.HashMap;

/*
 * 문제: 완주하지 못한 선수
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/42576
 * 풀이자: 김지아
 * 소요시간: 45분
 * */
public class P241118_J {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> participantMap = new HashMap<String, Integer>();

        // 참여자 명단을 map으로 표현 (참가자, 중복인원)
        for(String player: participant){
            if(participantMap.containsKey(player)){
                int val = participantMap.get(player);

                participantMap.put(player, val+1);
            } else {
                participantMap.put(player, 1);
            }
        }

        // 빼기
        for(String comletPlayer: completion){
            if(participantMap.containsKey(comletPlayer)){
                int val = participantMap.get(comletPlayer);

                participantMap.put(comletPlayer, val-1);
            }
        }

        // 0이 아닌 선수 찾기 -> keySet 함수..!
        for(String player: participantMap.keySet()){
            if(participantMap.get(player) == 1) {
                answer = player;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        P241118_J p = new P241118_J();

        System.out.println(p.solution(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}));
        System.out.println(p.solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}));
        System.out.println(p.solution(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}));
    }
}

/* 처음에 이와 같이 풀었는데, 효율성 테스트에서 실패함
    *
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        List<String> participantList = new ArrayList<String>(Arrays.asList(participant));

        for(int i=0; i<completion.length; i++){
            int idx = participantList.indexOf(completion[i]);

            participantList.remove(idx);
        }

        answer = participantList.get(0);

        return answer;
    }
}
    * */