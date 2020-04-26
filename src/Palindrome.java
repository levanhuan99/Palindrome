import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {

    public Character characterAtStack(String string) {

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); i++) {
            char chars = string.charAt(i);
            stack.push(chars);
        }
       return stack.pop();
    }
    public Character characterAtQueue(String string){
        Queue<Character> queue=new LinkedList<Character>();
        for (int i=0;i<string.length();i++){
            char chars=string.charAt(i);
            queue.add(chars);
        }
       return queue.poll();
    }

    public static void main(String[] args) {
        String stringInput="huannauh";
        Palindrome palindrome=new Palindrome();
        for (int i=0;i<stringInput.length();i++){
            if (palindrome.characterAtQueue(stringInput).equals(palindrome.characterAtStack(stringInput))){
                System.out.println("ok");
            }
        }

    }
}
