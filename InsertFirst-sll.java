public class InsertFirst{
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
		ListNode current=head;
		while(current!=null){
			System.out.println(current.data+"--->");
			current=current.next;
		}
		System.out.println("Null");
	}
	public int length(){
		if (head==null){
			return 0;
		}
		int count=0;
		ListNode current = head;
		while(current!=null){
			count++;
			current=current.next;
		}
		return count;
	}
		public void insertFirst(int value){
               ListNode newNode=new ListNode(value);
                newNode.next=head;
				head=newNode;
		}
	public static void main(String[] args){
InsertFirst sll =new InsertFirst();
sll.head =new ListNode(10);
ListNode second=new ListNode(2);
ListNode third =new ListNode(3);
ListNode fourth=new ListNode(6); 		
sll.head.next=second;
second.next=third;
third.next=fourth;

sll.insertFirst(7);
sll.insertFirst(45);
sll.insertFirst(35);
sll.display();
	}
}