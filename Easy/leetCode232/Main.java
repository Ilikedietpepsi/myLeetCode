import java.util.*;
import java.io.*;
class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public CQueue() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }
    
    public void appendTail(int value) {
        while (!s1.empty()) {
            s2.push(s1.pop());
        }
        s1.push(value);
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
    }
    
    public int deleteHead() {
        if (s1.empty()) {
            return -1;
        }
        return s1.pop();
    }
}
