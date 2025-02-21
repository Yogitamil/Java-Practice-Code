class Node{
	int data;
	Node next;
	
	Node(int data1,Node next1)
	{
		this.data = data1;
		this.next = next1;
	}
	Node(int data1)
	{
		this.data=data1;
		this.next=null;
	}
}
public class Main {
	public static void main(String[] args) {
		int [] arr ={1,2,3};
		Node x = new Node(arr[1]);
		System.out.println(x.data);
	}
}