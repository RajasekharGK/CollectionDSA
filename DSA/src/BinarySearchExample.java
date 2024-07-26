import java.util.Base64;

public class BinarySearchExample {
    public static void main(String[] args) {
        BinarySearchExample bl = new BinarySearchExample();
//        bl.add(10);
//        bl.add(5);
//        bl.add(20);
//        bl.add(4);
//        bl.add(7);

        bl.add(10);
        bl.add(5);
        bl.add(15);
        bl.add(3);
        bl.add(9);
        bl.add(13);
        bl.add(18);

        bl.inOrder(bl.root);


    }
    Node root = null;
    class Node{
        Object data;
        Node left;
        Node right;
        Node(Object data){
            this.data = data;
        }
    }

    public void add(Object obj){
        Node n=new Node(obj);
        int actualData = ((Integer) n.data).intValue();
        if(root == null){
            root = n;
        }else {
            Node temp = root;
            while (true) {
                int rootData = ((Integer) temp.data).intValue();
                if (actualData < rootData) {
                    if (temp.left != null) {
                        temp = temp.left;
                    } else {
                        temp.left = n;
                        return;
                    }
                } else {
                    if (actualData > rootData) {
                        if (temp.right != null) {
                            temp = temp.right;
                        } else {
                            temp.right = n;
                            return;
                        }
                    }
                }
            }
        }
    }

    public void inOrder(Node temp){
        if(temp != null){
            inOrder(temp.left);
            System.out.println(temp.data);
            inOrder(temp.right);
        }
    }

    public void preOrder(Node temp){
        if(temp != null){
            System.out.println(temp.data);
            preOrder(temp.left);
            preOrder(temp.right);
        }

    }

    public void postOrder(Node temp){
        if(temp != null){
            postOrder(temp.left);
            postOrder(temp.right);
            System.out.println(temp.data);
        }
    }
}
