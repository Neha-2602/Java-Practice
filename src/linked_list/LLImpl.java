package linked_list;

public class LLImpl {
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	Node head = null;
	
	//add first
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	//add last
	public void addLast(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		Node currNode = head;
		
		while(currNode.next != null)
		{
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	public void printList()
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = head;
		
		while(currNode != null)
		{
			System.out.print(currNode.data + "->");
			currNode = currNode.next;
		}
		
		System.out.println("Null");
	}
	
	//add First
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		head = head.next;
	}
	
	//add Last
	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		
		if(head.next == null)
		{
			head = null;
			return;
		} 
		
		Node secondLast = head;
		Node lastNode = head.next;
		
		while(lastNode.next != null)
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
	}
	

	public static void main(String[] args) {

		LLImpl list = new LLImpl();
		list.addFirst(3);
		list.printList();
		list.addFirst(2);
		list.printList();
		list.addLast(4);
		list.addFirst(1);
		list.printList();
		list.deleteFirst();
		list.printList();
		list.deleteLast();
		list.printList();
	}
}
