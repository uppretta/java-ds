public class Binary{
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
String[] generateBinaryNumbers(int n){
	String result[]=new String[n];
	Queue<string> q=new LinkedList<>();
	q.offer("1");
	for(int i=0;i<n;i++){
		result[i]=q.poll();
		String n1=result[i]+1;
		String n2=result[i]+0;
		q.offer(n1);
		q.offer(n2);
	}
	return result;
	}
	

public static void main(String[] args){
Binary queue=new Binary();
queue.dequeue(43);
queue.dequeue(7);
queue.dequeue(8);
queue.dequeue(6);
queue.generateBinaryNumbers(7);
queue.print();
}
}



