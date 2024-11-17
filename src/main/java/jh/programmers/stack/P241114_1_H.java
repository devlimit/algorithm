package jh.programmers.stack;
import java.util.Stack;

/**
 * 문제 : 올바른 괄호
 * 풀이시간: 25분
 * 풀이자: 신혜림
 */
public class P241114_1_H {
        boolean solution(String s) {
            boolean answer = true;
            char[] ch = s.toCharArray(); // s.chartAt(i)로 하면됨
            Stack<String> stack = new Stack<>();
            for(int i =0; i<s.length(); i++) {
                if('('==ch[i]) {
                    stack.push("1");
                } else if(')'==ch[i]) {
                    if(stack.isEmpty()) {
                        return false;
                    }
                    stack.pop();
                }
            }
            if(stack.isEmpty()){ //여기서 return stack.isEmpty()하면됨 boolean 값을 반환하기때문에
                return true;
            }return false;
    }
}
