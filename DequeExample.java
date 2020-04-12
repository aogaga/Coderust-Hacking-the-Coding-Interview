import java.util.*;

class DequeExample {
	public static void main(String [] args){
		secondMtd();
	}


	public static void firstMtd(){
		Deque<String> d = new LinkedList<String>();

		d.add("5");
		d.addFirst("1");
		d.addLast("9");
		d.push("7");
		d.offer("8");
		d.offerFirst("6");
		d.offerLast("2");
		System.out.println(d);


		Iterator i = d.iterator();

		while(i.hasNext()){
			System.out.println(i.next());
		}

		System.out.println(d.peek());
		System.out.println(d);
		System.out.println(d.contains(8));

		d.removeFirst();
		d.removeLast();

		System.out.println(d);
	}

	public static void secondMtd(){
		Deque<String> deque = new LinkedList<String>();
		deque.add("Element 1 (Tail)");

		deque.addFirst("Element 2 (Head)");
		deque.addLast("Element 3 (Tail)");

		deque.push("Element 4 (Head)");

		deque.offer("Element 5 (Tail)");
		deque.offerFirst("Element 6 (Head)");
		deque.offerLast("Element 7 (Tail)");

		System.out.println(deque);


		System.out.println("Standard Iterator");

		Iterator i = deque.iterator();

		while(i.hasNext()){
			System.out.println(i.next());
		}

		System.out.println("Peek " + deque.peek());
		System.out.println("After peek" + deque);

		System.out.println("pop");

		System.out.println("Pop" + deque.pop());
		System.out.println("After pop: " + deque);

		System.out.println("contains element 3" + deque.contains("Element 3 (Tail)"));


		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing " + "first and Last :" + deque);



	}


}
