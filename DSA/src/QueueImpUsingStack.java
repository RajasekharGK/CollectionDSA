import java.util.Stack;

public class  QueueImpUsingStack {
    static Stack<Integer> s1=null;
    static Stack<Integer> s2 = null;
    public static void main(String[] args) {
        QueueImpUsingStack  qs = new QueueImpUsingStack();
        s1=new Stack<>();
        s2=new Stack<>();

        qs.push(10);
        qs.push(20);
        qs.push(30);
        qs.push(40);
        //System.out.println(qs);
        System.out.println(qs.poll());
        System.out.println(qs.poll());
        //System.out.println(qs);

    }

    public void push(int x){
        s1.push(x);
    }

//    public int poll(){
//       //Stack<Integer> s2=new Stack<>();
//       if(s2.isEmpty()){
//           if(s1.isEmpty()){
//               throw new RuntimeException("Queue is Empty");
//           }
//           while (!s1.isEmpty()) {
//               s2.push(s1.pop());
//           }
//       }
//        return s2.pop();
//    }

    public int poll(){
            if(s1.isEmpty()){
                throw new RuntimeException("Queue is Empty");
            }
            int top = s1.pop();
            if(s1.isEmpty()){
                return top;
            }else{
                int res= poll();
                s1.push(top);
                return  res;
            }

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
