import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class isEmpty {
    private static Stack<Object> s;
    public static boolean isEmpty(Queue<String> s) {
            return s.isEmpty();
        }
        public static void main(String[] args) {
                Queue<String> s = new LinkedList<>();
            System.out.print("Before Pushing Elements:- ");
            if(isEmpty(s)) {
                System.out.println("Stack is Empty");
            }else{
                System.out.println("Stack is not Empty");
            }
            s.offer("Mazda");
            s.offer("BMW");
            s.offer("Hybrid");
            System.out.print("After Pushing Elements :- ");
            if(isEmpty(s)) {
                System.out.println("Stack is Empty");
            }else{
                System.out.println("Stack is not Empty");
            }
    }
}
