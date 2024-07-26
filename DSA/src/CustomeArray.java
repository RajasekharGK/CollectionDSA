import java.util.Arrays;
import java.util.StringJoiner;

public class CustomeArray {
    Object[] arr = null;
    int index = 0;
    CustomeArray(int size){
        arr = new Object[size];
    }

    public void insert(Object obj){
        if(index>=arr.length){
           int newSize = arr.length+(arr.length/2);
            arr = Arrays.copyOf(arr, newSize);
            /*Object[] ob = new Object[newSize];
           for(int i=0;i< arr.length;i++){
             ob[i] = arr[i];
           }
           arr = ob;*/
        }

        arr[index] = obj;
        index++;
    }

    @Override
    public String toString() {
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            sj.add(String.valueOf(arr[i]));
        }
        return sj.toString();
//        StringBuffer sb=new StringBuffer();
//        sb.append('[');
//
//        if(arr==null){
//            return "[]";
//        }
//
//        for(int i=0;i<arr.length;i++){
//           sb.append(arr[i]+", ");
//        }
//        sb.append(']');
//        return sb.toString();
    }

   public Object get(int indexToBeRetrived) throws Exception {
        if(indexToBeRetrived > index){
            throw new Exception("OutOf Range");
        }
        return arr[indexToBeRetrived];
   }

   Object remove(int indexToBeDeleted) throws Exception {
        Object obj = get(indexToBeDeleted);
        int numberOfShiftOperations = arr.length - indexToBeDeleted -1;
        if(numberOfShiftOperations>0){
            System.arraycopy(arr,indexToBeDeleted+1, arr, indexToBeDeleted, numberOfShiftOperations);
        }

//       Object[] obj = new Object[arr.length];
//        for(int i=0;i< arr.length;i++){
//            if(i<indexToBeDeleted){
//                obj[i] = arr[i];
//            }else{
//                obj[i] = arr[i+1];
//            }
//        }
       arr[--index] = null;
       return obj;
   }
}
