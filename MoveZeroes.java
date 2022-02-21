public class MoveZeroes{
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
public void moveZeroes(int[] arr){
	int j=0;
	for(int i=0;i<arr.length;i++){
		if(arr[i]!=0&&arr[j]==0){
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	if(arr[j]!=0){
		j++;
	}
	}
}
			
		 
	
public static void main(String[] args){
int[] arr={3,0,5,0,8,7};
MoveZeroes man=new MoveZeroes();
System.out.print("The moved zeroes of the array");
man.moveZeroes(arr);
printArray(arr);
}
}
