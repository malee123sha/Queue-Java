import java.util.LinkedList;
import java.util.Queue;
public class removeElementsFinal {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        q1.add("Mazda");
        q1.add("BMW");
        q1.add("Alto");
        q1.add("Hybrid");
        System.out.println("Before Removing Queue 1 :- "+q1);
        q1.remove("BMW");
        System.out.println("After Removing Queue 1  :- "+q1);
        q2.add(4500);
        q2.add(5);
        q2.add(90);
        q2.add(100);
        System.out.println("Before Removing Queue 2 :- "+q2);
        q2.remove(100);
        System.out.println("After Removing Queue 2  :- "+q2);
    }
}
