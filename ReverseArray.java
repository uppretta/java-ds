public class ReverseArray{
public static void printArray(int[] arr){
int n=arr.length;
for(int i=0;i<n;i++){
System.out.println(arr[i]+"");
}
System.out.println();
}
public static void reverse(int[] numbers,int start,int end){
while(start<end){
int temp=numbers[start];
numbers[start]=numbers[end];
numbers[end]=temp;
start++;
end--;
}
}
public static int minArray(int[] arr){
	int min=arr[0];
	for(int i=0;i<arr.length;i++){
	 if(arr[i]<min){
		 min=arr[i];
	}}
	return min;
}
		 
	
public static void main(String[] args){
int[] numbers={3,4,5,6,8,7};
printArray(numbers);
reverse(numbers,0,numbers.length-1);
printArray(numbers);
minArray(arr);
}
}
