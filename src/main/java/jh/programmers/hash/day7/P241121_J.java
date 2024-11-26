package jh.programmers.hash.day7;

/*
 * 문제: 전화번호 목록
 * 문제 url: https://school.programmers.co.kr/learn/courses/30/lessons/42577
 * 풀이자: 김지아
 * 소요시간: 10분 + (다시풀어야함)
 * */
public class P241121_J {

    // 이렇게 풀었는데 시간초과로 틀림
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        for(int i=0; i<phone_book.length; i++){
            String basePhoneNum = phone_book[i];

            for(int j=0; j<phone_book.length; j++){
                if(i!=j){
                    if(phone_book[j].startsWith(basePhoneNum)){
                        return false;
                    }
                }
            }
        }

        return answer;
    }
}
