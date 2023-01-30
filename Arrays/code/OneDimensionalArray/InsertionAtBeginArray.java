 
import java.util.Arrays;
public class InsertionAtBeginArray {
    int []arr=null;
    public void singleDimensionArray(int size){
       arr=new int[size];
       for(int i=0;i<arr.length;i++){
          arr[i]=Integer.MIN_VALUE;
       }
    }

    public void insert (int location, int value)
    {
     if(location<arr.length && location>=0)
     {if(arr[location]==Integer.MIN_VALUE)
     {arr[location]=value;
     System.out.println("Successfully inserted "+value+" at location "+location);
     }
     else
     System.out.println("This cell is already occupied by another value");
    }
}

public void insertBegin(int value){
    int till;
    if(arr[0]==Integer.MIN_VALUE)
    {
        arr[0]=value;
        System.out.println("Successfully inserted "+value+" at location 0");
    }
    else if((till=checkArrayHasSpace())!=-1){
for(int i=0;i<=till;i++){
    int temp=arr[i];
    arr[i]=value;
    value=temp;
}
System.out.println("Successfully inserted " +"at location 0"+" and shifted other elements to right"); 
    }
    
else{
    System.out.println("Array is full");
}
}

public int checkArrayHasSpace(){
int flag=-1;
for(int i=0;i<arr.length;i++){
    if(arr[i]==Integer.MIN_VALUE){
        flag=i;
        return i;
    }
}
return flag;
}
    
public static void main(String []args){
    InsertionAtBeginArray ie=new InsertionAtBeginArray();
    ie.singleDimensionArray(10);
    
    ie.insert(1,20);
    ie.insert(2,30);
    ie.insert(3,40);
    ie.insert(5,50);
    ie.insert(6,60);
    ie.insert(10,70);
    ie.insertBegin(100);
    ie.insertBegin(200);
    ie.insertBegin(300);
    ie.insertBegin(400);
    ie.insertBegin(500);
    ie.insertBegin(600);
    System.out.println(Arrays.toString(ie.arr));


}
}

 