public class CircularDisplay{
	private ListNode last;
	private int length;
	private class ListNode{
		private int data;
         private ListNode next;
		 public ListNode(int data){
			 this.data=data;
		 }
	}
	public void CircularSingleLinkedList(){
		last=null;
		length=0;
	}
	public int length(){
		return length;
	}
	public boolean isEmpty(){
		return length==0;
	}
public void createCircularSingleLinkedList(){
	ListNode first=new ListNode(3);
	ListNode second=new ListNode(31);
	ListNode third=new ListNode(4);
	ListNode fourth=new ListNode(45);
	ListNode fifth=new ListNode(43);
	first.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=first;
	last=fourth;
}
public void display(){
	if(last==null){
		return;
	}
	ListNode first=last.next;
	while(last!=first){
		System.out.print(first.data+"");
		first=first.next;
	}
	System.out.print(first.data);
}
public static void main(String[] args){
	CircularDisplay csll=new CircularDisplay();
	csll.createCircularSingleLinkedList();
	csll.display();
}
}
	
			