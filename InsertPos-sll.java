public class InsertPos{
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
		public void insertlast(int value){
			ListNode newNode=new ListNode(value);
			if(head==null){
				head=newNode;
				return;
			}
			ListNode current=head;
			while(current.next!=null){
				current=current.next;
			}
			current.next=newNode;
		}
		public void insertPos(int value,int pos){
			ListNode newNode=new ListNode(value);
			if(pos==1){
				newNode.next=head;
				head=newNode;
			}
			else{
				ListNode previous=head;
				int count=1;
				while(count< pos-1){
					previous=previous.next;
					count++;
				}
				ListNode current=previous.next;
				previous.next=newNode;
			}
		}	
				
				
public static void main(String[] args){
InsertPos sll =new InsertPos();
sll.head =new ListNode(10);
ListNode second=new ListNode(2);
ListNode third =new ListNode(3);
ListNode fourth=new ListNode(6); 		
sll.head.next=second;
second.next=third;
third.next=fourth;

sll.insertPos(2,5);
sll.display();
	}
}