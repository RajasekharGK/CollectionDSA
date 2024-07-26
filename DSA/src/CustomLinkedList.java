import java.util.StringJoiner;

public class CustomLinkedList {
    Node head = null;
    Node last = null;
    class Node {
        Object data;
        Node next;
        Node(Object data) {
            this.data = data;
        }
    }

    public void addBeforeHead(Object obj){
        Node n= new Node(obj);
        n.next = head;
        head = n;
    }

    public void addOptimized(Object obj){
        Node n= new Node(obj);
        if(head==null){
            head=n;
            last=n;
        }else{
            last.next = n;
            last = n;
        }

    }
    public void add(Object obj){
      Node n=new Node(obj);
      if(head==null){
          head = n;
      }else{
          Node temp = head;
          while(temp.next!=null){
              temp = temp.next;
          }
          temp.next = n;
      }
    }

    public void addElementAtSpecificLocation(Object obj,int target){
        Node n=new Node(obj);
        if(head == null){
          System.out.println("Element cannot be added");
          return;
        }else {
            Node temp = head;
            while (temp.next != null) {
                Object obj1 = temp.data;
                int elementNode = ((Integer) (obj1)).intValue();
                if (elementNode == target) {
                    Node temp1 = temp.next;
                    temp.next = n;
                    n.next = temp1;
                    return;
                } else {
                    temp = temp.next;
                }
            }

            Object obj1 = temp.data;
            int elementNode = ((Integer) (obj1)).intValue();
            if (elementNode == target) {
                temp.next = n;
            }
        }
    }

    public void remove(Object obj){
        Node previous = null;
        int requiredData = ((Integer)(obj)).intValue();
        if(head==null){
            System.out.println("Linked List is Empty.");
            return;
        }

        Node temp=head;
        int nodedata1= ((Integer)(temp.data)).intValue();
        if(requiredData==nodedata1){
            Node temp2=temp.next;
            temp.next = null;
            head = temp2;
            return;
        }
        while (temp.next != null) {
            Object obj1=temp.data;
            int elementNode = ((Integer)(obj1)).intValue();
            if(requiredData==elementNode){
                Node temp1=temp.next;
                previous.next = temp1;
                temp.next = null;
                return;
            }else {
                previous = temp;
                temp = temp.next;
            }
        }
        int nodeData = ((Integer)(temp.data)).intValue();
        if(requiredData==nodeData){
            if(null!=previous) {
                previous.next = null;
                temp = null;
            }
        }
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return print();
    }

    public String print() {
        if(head==null) {
            return "[]";
        }else {
            StringJoiner sj= new StringJoiner(",", "[", "]");
            Node temp=head;
            while(temp.next!=null) {//head=10.next=null
                sj.add((String.valueOf(temp.data)));//40
                temp=temp.next;//head=10.next=20
            }
            sj.add((String.valueOf(temp.data)));
            return sj.toString();
        }
    }
}
