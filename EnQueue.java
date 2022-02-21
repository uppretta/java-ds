public class DeQueue{
private ListNode front;
private ListNode rear;
private int length;
private class ListNode{
private int data;
private ListNode next;
}
public ListNode(int data){
this.data=data;
this.next=null;
}
}
public int length(){
return length;
}
public boolean isEmpty(){
return length==0;
}
public void enqueue(int data){
ListNode temp=new ListNode(data);
if(isEmpty()){
front=temp;
}
else{
rear.next=temp;
}
rear=temp;
length++;
}
public int dequeue(){
	int result=front.data;
	front=front.next;
	if(front=null){
		rear=null;
	}
	length--;
	return result;
}
public void print(){
if(isEmpty()){
return;
}
ListNode current=front;
while(current!=null){
System.out.println(current.data+"--->");
current=current.next;
}
System.out.println("null");
}


public static void main(String[] args){
DeQueue queue=new DeQueue();
queue.dequeue(43);
queue.dequeue(7);
queue.dequeue(8);
queue.dequeue(6);
queue.print();
}
}



