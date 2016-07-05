import java.util.Iterator;

public class LinkedList<AnyType> {
	
	/* Node Class */
	
	private static class Node<AnyType>{
		private AnyType data;
		private Node<AnyType> next;
		
		public Node(AnyType data, Node<AnyType> next){
			this.data = data;
			this.next = next;
		}
	}
	
	private Node<AnyType> head;
	
//	Constructs an empty linked list
	
	public LinkedList(){
		head = null;
	}
	
//	to check if the list is empty
	
	public boolean isEmpty(){
		return head == null;
	}
	
//	Inserts a new node at the beginning of this list
	
	public void addFirst(AnyType item){
		head = new Node<AnyType>(item,head);
	}
	
	
// Iterator for linked list
	
//	public Iterator<AnyType> iterator(){
//		return new LinkedListIterator();
//	}
	
// private iterator class to hide data
	
//	private class LinkedListIterator implements Iterator<AnyType>{
//		private Node<AnyType> nextNode;
//		
//		public LinkedListIterator(){
//			nextNode = head;
//		}
//		
//		public AnyType next(){
//			if(!hasNext()){
//				System.out.println("No such element!");;
//			}
//			AnyType res = nextNode.data;
//			nextNode = nextNode.next;
//			return res;
//		}
//
//		@Override
//		public boolean hasNext() {
//			// TODO Auto-generated method stub
//			return false;
//		}
//	}
	
	public void printList(Node<AnyType> item){
		while(item.next!=null){
			System.out.println(item.data + "->");
		}
		
		System.out.println("null");
	}
		
	public static void main(String[] args){
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("Sanath");
		
		// printList(list);
		
	}

}
