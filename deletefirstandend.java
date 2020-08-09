import java.util.Scanner;
public class deletefirstandend 
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
	void deleteFirst()
	{
		head=head.next;
		head.pre=null;
	}
	void deleteEnd()
	{
		Node n3=head;
		Node n4=null;
		while(n3.next!=null)
		{
			n4=n3;
			n3=n3.next;
		}
		n4.next=null;
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		deletefirstandend l=new deletefirstandend();
		for(int i=0;i<n;i++)
		{
			l.push(s.nextInt());
		}
		l.deleteFirst();
		l.deleteEnd();
		l.printlist();
	}
}
