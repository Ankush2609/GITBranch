package Day10;

import java.util.PriorityQueue;

public class Queue1 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		pq.add(201);
		pq.add(101);
		pq.add(401);
		pq.offer(101);
		System.out.println(pq);
		System.out.println(pq.peek());
		
		pq.removeAll(pq);
		//	pq.poll();
			pq.remove();
			System.out.println(pq);
	}
}