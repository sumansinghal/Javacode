package ArrayList;

public class MyLinkedList {
	
	Node head;//creation of head
		
	class Node{
		
		int data;
		Node next;
		Node(int data){   // constructor
			this.data= data;
			next=null;
		}
	}
	
		public void printMyLinkedList() {// printing values
			Node n= head;
			while(n!=null) {
				System.out.println(n.data);
				n=n.next;
			}
		}
		
	

	public static void main(String[] args) {
		MyLinkedList ll= new MyLinkedList();//object
		Node first = ll.new Node(10);
		ll.head = first;
		
		Node second = ll.new Node(20);
		first.next=second;
		
		ll.printMyLinkedList();
		
		
		
		

	}

}
