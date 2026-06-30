import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;



public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> que=new LinkedList<>();
		
		que.offer("Apple");
		que.offer("Banana");
		que.offer("Cherry");
		
		System.out.println(que.peek()+"😊");//Fetch value but does not remove 
		
		while(!que.isEmpty())
			System.out.println(que.poll());//Fetch value and remove elements
		
		//Write code to implement dequeue in this example
		Deque<String>dq=new LinkedList<>();
		
		dq.add("Alpha");
		dq.add("Beta");
		dq.add("Gamma");
		
		while(!dq.isEmpty())
			System.out.println(dq.pollFirst());
		
	}
}
