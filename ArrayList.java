public class ArrayList{
public void printArray(int[] arr){
int n=arr.length;
for(int i=0;i<n;i++){
System.out.println("The elements in the array are"+arr[i]);
}
System.out.println();
}
public void arrayDemo(){
int[] myArray =new int[5];
myArray[0]=2;
myArray[1]=24;
myArray[2]=8;
myArray[3]=9;
myArray[4]=5;
printArray(myArray);
}
public static void main(String[] args){
ArrayList arrayutil=new ArrayList();
arrayutil.arrayDemo();
}
}



