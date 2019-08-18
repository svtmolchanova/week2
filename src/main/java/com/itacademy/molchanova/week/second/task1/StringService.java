package com.itacademy.molchanova.week.second.task1;

import java.util.Stack;

public class StringService {

    public boolean checkString(String str) {
        Stack<Character> stack = new Stack<>();
        Character c;
        boolean correct = true;
        if (str.length() == 0) {
            correct = true;
        } else {
            for (int i = 0; i < str.length(); i++) {
                c = str.charAt(i);
                if (stack.empty() && (c == '}' || c == ')' || c == ']')) {
                    correct = false;
                    break;
                }
                if (c == '{' || c == '(' || c == '[') {
                    stack.push(c);
                } else if ((stack.lastElement() == '{' && c == '}') || (stack.lastElement() == '[' && c == ']') ||
                        (stack.lastElement() == '(' && c == ')')) {
                    stack.pop();
                } else {
                    correct = false;
                }
            }
        }
        return correct;
    }
}
