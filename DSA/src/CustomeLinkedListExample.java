public class CustomeLinkedListExample {
    public static void main(String[] args) {
      CustomLinkedList cl=new CustomLinkedList();
      cl.addOptimized(10);
      cl.addOptimized(20);
      cl.addOptimized(30);
      cl.addOptimized(40);
      cl.addOptimized(50);
      //cl.addBeforeHead(40);
      //cl. addElementAtSpecificLocation(60,30);
      //cl. addElementAtSpecificLocation(70,20);
      System.out.println(cl);
      //cl.remove(30);
      //System.out.println(cl);
    }
}
