import java.util.LinkedList;
import java.util.Queue;

public class StackImpUsingQueue {

    static  Queue<Integer> q1=null;
    public static void main(String[] args) {
        q1 = new LinkedList<>();
        StackImpUsingQueue sq=new StackImpUsingQueue();

//      q.add(10);
//      q.add(20);
//      q.add(30);

      System.out.println(sq.push(10));
      System.out.println(sq.push(20));
      System.out.println(sq.push(30));
      System.out.println(sq.push(40));
        System.out.println(q1);
        System.out.println(sq.pop());
        System.out.println(sq.pop());
        System.out.println(q1);
    }

    private Integer push(Integer in) {
        Queue<Integer> q2= new LinkedList<>();
        
        while (!q1.isEmpty()){
            q2.add(q1.remove());
        }
        q1.add(in);

        while(!q2.isEmpty()){
            q1.add(q2.remove());
        }

//        for(int i=0;i<q.size();i++){
//          int rm = q.remove();
//          q.add(rm);
//        }
        return in;
    }

    private int pop(){
        if(q1.isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        return q1.remove();
    }
}
