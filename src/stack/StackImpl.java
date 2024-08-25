package stack;

public class StackImpl {
	
	int a[] = new int[10];
	int top;
	int n,x;
	
	StackImpl()
	{
		top = -1;
		n=5;
	}

	public void push(int x)
	{
		if(top == n-1) {
			System.out.println("Stack Overflow");
		}
		else
		{
			top++;
			a[top] = x;
			System.out.println(x);
		}
	}
	
	public void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			int x = a[top];
			top --;
			System.out.println("Deleted element : " +x);
		}
	}
	
	public void display()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			for(int i=0; i<=top; i++)
			{
				System.out.println(a[i]);
			}
		}
	}
	
	public static void main(String[] args) {

		StackImpl s = new StackImpl();
		s.pop();
		s.push(1);
		s.display();
		s.pop();
		s.display();

	}

}
