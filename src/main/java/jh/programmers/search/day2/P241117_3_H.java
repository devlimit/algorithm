package jh.programmers.search.day2;


/**
 * 문제:모의고사
 * url: https://school.programmers.co.kr/learn/courses/30/lessons/42840
 * 풀이자 : 신혜림
 * 풀이시간: 1 시간 30분 --- 진짜 모르겠음
 */
public class P241117_3_H {

    public int[] solution(int[] answers) {
        int[] answer = new int [3];
        int []  numberOne =  {1,2,3,4,5}; //5개
        int [] numberTwo = {2, 1, 2, 3, 2, 4, 2, 5, 2}; //8개
        int [] numberThree = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5};// 10개

        int numberOneCount = 0;
        int numberTwoCount = 0;
        int numberThreeCount = 0;
        //for문을 하나씩돌아서 맞은 개수를 찾아야하나?
        for(int i = 0; i<answers.length; i++) {//answer의 길이만큼
            //나머지사용해서 계산하면될것같은데
            int  num = numberOne.length %5;
            int  numTwo = numberTwo.length %9;
            int  numThree = numberThree.length %10;
            if(numberOne[num] == answers[i]){
                numberOneCount++;
            }
            if(numberTwo[numTwo] == answers[i]){
                numberTwoCount++;
            }
            if(numberThree[numThree] == answers[i]){
                numberThreeCount++;
            }
        }
        //최대값을 구해서 값 넣어주기
        if(numberOneCount> numberTwoCount) {
            if(numberOneCount > numberThreeCount){
               // answer.add(1);
            }
        }


        return answer;
    }
}
