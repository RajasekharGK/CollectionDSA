public class CustomArrayListtEST {
    static Object[] arr = null;
    public static void main(String[] args)throws Exception {

        CustomeArray customArray =  new CustomeArray(6);
        customArray.insert(10);
        customArray.insert(20);
        customArray.insert(30);
        customArray.insert(40);
        customArray.insert(50);
        customArray.insert(60);
        customArray.insert(70);
        System.out.println(customArray.get(3));
        System.out.println(customArray.get(6));
        customArray.remove(2);
        System.out.println(customArray);



    }
}
