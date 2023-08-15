public class Stack
{
	static Node top;
	
	static void push (int data)
	{
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		
		if(top == null)
		{
		  top = temp;
		  return;
		}
		temp.next = top;
		top = temp;
		return;
	}
	
	static void pop()
	{
		if(top == null)
		{
			return ;
		}
			Node temp = top;
			top  = top.next;
           		temp.next = null; 
           		temp = null;	
		
	
		
	}
	static void display()
	{
		Node temp = top;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public static void main(String []args)
	{
		Stack.push(10);
		Stack.push(20);
		Stack.push(30);
		Stack.push(40);
		Stack.pop();
		Stack.pop();
		Stack.display();
		System.out.println("Ended");
	}
}

class Node
{
	int data;
	Node next;
}
