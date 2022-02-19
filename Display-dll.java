public class InsertFirst{
private ListNode head;
private ListNode tail;
private int length;
private class ListNode{
private int data;
ListNode previous;
ListNode next;

public ListNode(int data){
this.data=data;
}
}
public void DoublyLinkedList(){
	this.head=null;
	this.tail=null;
	this.length=0;
}

public boolean isEmpty(){
	return length==0;
}
public int length(){
	return length;
}
public void insertLast(int value){
	ListNode newNode =new ListNode(value);
	if(isEmpty()){
		return;
	}
	else{
		tail.next=newNode;
		}
		newNode.previous=tail;
		tail=newNode;
		length++;
}
public void forwardDisplay(){
	if(head==null){
		return;
	}
	ListNode temp=head;
	while(temp!=null){
		System.out.println(temp.data+"-->");
		temp=temp.next;
	}
	System.out.println("null");
}
public void backwardDisplay(){
if(tail==null){
return;
}
ListNode temp=tail;
while(temp!=null){
	System.out.println(temp.data+"-->");
	temp=temp.previous;
}
System.out.println("null");
}
public void insertBeginning(int value){
	ListNode newNode=new ListNode(3);
	if(isEmpty()){
		tail=newNode;
	}
	else{
		head.previous=newNode;
	}
	newNode.next=head;
	head=newNode;
}
		
public static void main(String[] args){
	InsertFirst dll=new InsertFirst();
	dll.insertLast(45);
	dll.insertLast(3);
	dll.insertLast(3);
	dll.insertLast(2);
	dll.insertBeginning(4);
	dll.forwardDisplay();
}
}
	

	
	
