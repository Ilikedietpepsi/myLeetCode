import java.util.EmptyStackException;
import java.util.Stack;

public class Main {

    public static boolean isValid(String s) {
        if (s.length()%2==1) {
            return false;
        }
        else {
            Stack stack = new Stack();
            for(int i=0;i<s.length();i++) {
                char c = s.charAt(i);

                if (c==')') {
                    try{
                        stack.peek();
                    }
                    catch (EmptyStackException e) {
                        return false;
                    }
                    if (stack.peek().equals('(')){
                        stack.pop();
                    }
                    else {
                        return false;
                    }

                }

                else if (c==']') {
                    try{
                        stack.peek();
                    }
                    catch (EmptyStackException e) {
                        return false;
                    }
                    if (stack.peek().equals('[')){
                        stack.pop();
                    }
                    else {
                        return false;
                    }
                }

                else if (c=='}') {
                    try{
                        stack.peek();
                    }
                    catch (EmptyStackException e) {
                        return false;
                    }
                    if (stack.peek().equals('{')){
                        stack.pop();
                    }

                    else {
                        return false;
                    }
                }
                else {
                    stack.push(c);
                }



            }

            if (stack.isEmpty()) {
                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {
	// write your code here
        System.out.println(isValid("([}}])"));
    }
}
