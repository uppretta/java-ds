public class Find{
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
		public ListNode deleteFirst(){
			if(head==null){
				return null;
			}
			ListNode temp=head;
			head=head.next;
			temp.next=null;
			return temp;
		}
		public ListNode deleteLast(){
			if(head!=null||head.next!=null){
				return head;
			}
			ListNode current=head;
			ListNode previous=null;
			while(current.next!=null){
				previous =current;
				current=current.next;
			}
				previous.next=null;
				return current;
		}
		public void delPos(int pos){
			if(pos==1){
			head=head.next;
		}
		else{
			ListNode previous =head;
			int count=1;
			while(count<pos-1){
				previous=previous.next;
				count++;
			}
			ListNode current=previous.next;
			previous.next=current.next;
				}
		}
				
	public boolean search(int searchkey){
		if(head==null){
			return false;
		}
		ListNode current=head;
		while(current!=null){
			if(current.data==searchkey){
				return true;
			}
			current=current.next;
		}
	return false;
	}
			
		
				
public static void main(String[] args){
Find sll =new Find();
sll.head =new ListNode(10);
ListNode second=new ListNode(2);
ListNode third =new ListNode(3);
ListNode fourth=new ListNode(6); 		
sll.head.next=second;
second.next=third;
third.next=fourth;
sll.display();

if(sll.search(23)){
	System.out.println("Element found");
}
	else{
		System.out.println("Element not found");
	}
	}
}