import java.util.Scanner;

public class deleteBefore 
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
	void before(int x)
	{
		Node n4=head;
		Node n5=null;
		int i=1;
		while(n4.next!=null)
		{
			if(x==i)
			{
				n5.next=n4.next;
			}
			i++;
			n5=n4;
			n4=n4.next;
		}
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		deleteBefore l=new deleteBefore();
		for(int i=0;i<n;i++)
		{
			l.push(s.nextInt());
		}
		l.before(s.nextInt());
		l.printlist();
}
}
