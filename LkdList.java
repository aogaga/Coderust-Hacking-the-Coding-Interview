import java.util.*;
public class LkdList {
   public static void main(String [] args){
    List<Integer> arr = Arrays.asList(1, 10, 20, 0, 59, 86, 32, 11, 9, 40);
    LinkedList<Integer> linkedList = new LinkedList<Integer>();

    for(int x : arr){
        linkedList.add(x);
    }


    if()

    for(int i = 1; i < 2; i++){
        int last = linkedList.removeLast();
        linkedList.addFirst(last);
    }

    // convert linkedlist to array
        Integer [] a = linkedList.toArray(new Integer[linkedList.size()]);

        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }

   }

}