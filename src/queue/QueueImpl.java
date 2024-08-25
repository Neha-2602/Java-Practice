package queue;

public class QueueImpl {
	
	int arr[] = new int[10];
	int front, rear, x, n;
	
	QueueImpl()
	{
		front = -1;
		rear = -1;
		n = 5;
	}
	
	public void enqueue(int x)
	{
		if(rear == n-1)
		{
			System.out.println("Queue is full");
		}
		if(front == -1 && rear == -1)
		{
			front++;
			rear++;
			arr[front]= x;
			System.out.println("Inserted Element : " +x);
		}
		else
		{			
			rear++;
			arr[rear] = x;
			System.out.println("Inserted Element : " +x);
		}
	}
	
	public void dequeue()
	{
		if(front == -1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			x = arr[front];
			front++;
			System.out.println("Deleted element : " +x);
		}
	}
	
	public void display()
	{
		if(front == -1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			for(int i=front; i<=rear; i++)
			{
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		QueueImpl q = new QueueImpl();
		q.dequeue();
		q.display();
		q.enqueue(1);
		q.enqueue(2);
		q.display();
		q.dequeue();
		q.display();

	}

}
