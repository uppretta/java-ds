public class AddList{
	private ListNode head;
	private static class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data=data;
			this.next=null;
		}
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
		public void display(){
		ListNode current =head;
		while(current!=null){
			System.out.print(current.data+"-->");
			current=current.next;
		}
		System.out.print("Null");
	}
public class ListNode add(ListNode a,ListNode b){
	ListNode dummy=new ListNode(0);
	ListNode tail=dummy;
	int carry=0;
	while(a!=null||b!=null){
		int x=(a!=null)?a.value:0;
		int y=(b!=null)?b.value:0;
		int sum=carry+x+y;
		carry=sum/10;
		tail.next=new ListNode(sum%10);
		tail=tail.next;
		if(a!=null){
			a=a.next;
		}
		if(b!=null){
			b=b.next;
		}
		if(carry>0){
			tail.next=new ListNode(carry)
		}
		return dummy.next;
	}
	
public static void main(String[] args){
AddList sll1 =new AddList();
sll1.insertlast(2);
sll1.insertlast(1);
sll1.insertlast(5);
AddList sll2 =new AddList();
sll2.insertlast(3);
sll2.insertlast(7);
sll2.insertlast(0);
sll1.display();
sll2.display();
AddList result=new AddList();
result.head=add(sll.head,sll2.head);
result.display();
	}
}