package Lec32;

public class Queue_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DynamicQueue dq = new DynamicQueue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		dq.Display();
		Reverse(dq);
		dq.Display();
		

	}

	public static void Reverse(DynamicQueue dq) throws Exception {
		
		if(dq.isEmpty()) {
			return;
		}
		int ii = dq.Dequeue();
		
		Reverse(dq);
		dq.Enqueue(ii);

	}

}
