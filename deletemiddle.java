import java.util.Scanner;
public class deletemiddle 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node pre;
		Node(int x)
		{
			data=x;
			next=null;
			pre=null;
		}
	}
	public void printlist()
	{
		Node n2=head;
		while(n2!=null)
		{
			System.out.println(n2.pre+" "+n2.data+" "+n2.next);
			n2=n2.next;
		}
	}
	public void push(int data)
	{
		Node n1=new Node(data);
		if(head==null)
		{
			head=n1;
		}
		else
		{
			n1.next=head;
			head=n1;
			n1.next.pre=n1.next;
		}
	}
	void Middle()
	{
		Node n4=head;
		int count=0;
		while(n4!=null)
		{
			count++;
			n4=n4.next;
		}
		int i=0;
		Node n5=head;
		Node n6=null;
		while(n5.next!=null)
		{
			if(i==count/2)
			{
				n6.next=n5.next;
			}
			i++;
			n6=n5;
			n5=n5.next;
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		deletemiddle l=new deletemiddle();
		for(int i=0;i<n;i++)
		{
			l.push(s.nextInt());
		}
		l.Middle();
		l.printlist();
	}
}
