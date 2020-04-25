import java.util.*;

public class NRotation {

    public static void main(String [] args){
        int [] a = new int [] {1, 10, 20, 0, 59, 86, 32, 11, 9, 40};
        rotateArray(a, -3);
    }


    public static void rotateArray(int [] a, int num){
       LinkedList<Integer> linkedList = new LinkedList<Integer>();

       for(int i = 0 ; i < a.length; i++){
           linkedList.add(a[i]);
       }

      if(num > 0){
        for(int i = 1; i <= num; i++){
            int tempval = linkedList.removeLast();
            System.out.println(tempval);
            linkedList.addFirst(tempval);
        }
      }else{
        num = Math.abs(num);
        for(int i = 1; i <= num; i++){
            int tempval = linkedList.removeFirst();
            System.out.println(tempval);
            linkedList.addLast(tempval);
        }
      }

        ListIterator<Integer> listIterator = linkedList.listIterator();

        while(listIterator.hasNext()){
            System.out.print(listIterator.next());
            System.out.print( ", ");
        }
    }

}