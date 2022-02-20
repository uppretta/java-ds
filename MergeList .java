public class MergeList{
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
public static ListNode merge(ListNode a,ListNode b){
ListNode dummy=new ListNode(0);
ListNode tail=dummy;
while(a.data!=null&&b.data!=null){
if(a.data<b.data){
tail.next=a;
a=a.next;
}
else{
tail.next=b;
b=b.next;
}
tail=tail.next;
}
if(a==null){
tail.next=b;
}
else{
tail.next=a;
}
return dummy.next;
}
public static void main(String[] args){
MergeList sll1 =new MergeList ();
sll1.insertlast(value:2);
sll1.insertlast(value:1);
sll1.insertlast(value:5);
MergeList  sll2 =new MergeList ();
sll2.insertlast(value:3);
sll2.insertlast(value:7);
sll2.insertlast(value:0);
sll1.display();
sll2.display();
MergeList  result=new MergeList ();
result.head=merge(sll.head,sll2.head);
result.display();
	}
}