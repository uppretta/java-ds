public class SinglyLinkedListdisplay{
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void display(){
		ListNode current =head;
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("Null");
	}
			
	public static void main(String[] args){
SinglyLinkedListdisplay sll =new SinglyLinkedListdisplay();
sll.head =new ListNode(10);
ListNode second=new ListNode(2);
ListNode third =new ListNode(3);
ListNode fourth=new ListNode(6); 		
sll.head.next=second;
second.next=third;
third.next=fourth;
sll.display();
	}
}