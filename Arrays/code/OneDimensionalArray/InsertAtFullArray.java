import java.util.Arrays;
public class InsertAtFullArray{
    int []arr=null;
    public void singleDimensionArray(int size){
       arr=new int[size];
       for(int i=0;i<arr.length;i++){
          arr[i]=Integer.MIN_VALUE;
       }
    }

    public void insert(int location, int value)
    {
     int till;
     if(location<arr.length && location>=0 && arr[location]==Integer.MIN_VALUE)
     {arr[location]=value;
     System.out.println("Successfully inserted "+value+" at location "+location);
     }
     else if(  (till=checkArrayHasSpace())!=-1&&location<arr.length && location>=0 ){
        if(till>location)
        {
            for(int i=location;i<=till;i++){
                int temp=arr[i];
                arr[i]=value;
                value=temp;
            }
        }

        else{
            for(int i=till;i<location;i++){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
            arr[location]=value;
        }
     }
     else if( till==-1 && location<(3*arr.length/2)&& location>=0){
        int arr1[];
        arr1=arr;
        System.out.println("Size of array will now become 1.5 times of original size");
        arr=new int[arr.length+arr.length/2];
        for(int i=0;i<=location;i++){
            if(i==location){
                arr[i]=value;
            }
            else{
                arr[i]=arr1[i];
            }
        }
        for(int i=location+1;i<=arr1.length;i++){
            arr[i]=arr1[i-1];
        }

        for(int i=arr1.length+1;i<arr.length;i++){
            arr[i]=Integer.MIN_VALUE;
        } 
    }

    else 
    {
     System.out.println("location is greater than the capacity of new array ");
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

public void access(int row){
    try{
        System.out.println("array element at: "+row+ " is "+arr[row]);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println("Array index out of bound exception");
    }
}

public void traverse(){
    System.out.print("[");
 for(int x: arr){
     
    System.out.print(x+" ");
    
 }  
 System.out.println("]");
}

public void deleteAt(int location){
    try{
        System.out.println("Deleted Successfully");
        arr[location]=Integer.MIN_VALUE;
    }

    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Array index out of bound exception");
    }

}

public void search(int value){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==value){
            System.out.println("Value found 🥳 at location: "+i);
            return;
        }
      
    }

    System.out.println("Value not found 😢");
}
public static void main(String []args){
    InsertAtFullArray ie=new InsertAtFullArray();
    ie.singleDimensionArray(10); 
    
    ie.insert(1,20);
    ie.insert(2,30);
    // ie.insert(3,40);
    ie.insert(5,50);
    ie.insert(6,60);
    ie.insert(10,70);
    System.out.println(Arrays.toString(ie.arr));
    ie.insertBegin(100);
    ie.insertBegin(200);
    ie.insertBegin(300);
    ie.insertBegin(400);
    ie.insertBegin(500);
    ie.insertBegin(600);
    System.out.println(Arrays.toString(ie.arr));
    ie.insert(4,800);
    System.out.println(Arrays.toString(ie.arr));
    ie.insert(4,900);
    System.out.println(Arrays.toString(ie.arr));
    ie.insert(4,1000);
    System.out.println(Arrays.toString(ie.arr));
    ie.insert(4,1100);
    System.out.println(Arrays.toString(ie.arr));
    ie.insert(4,1200);
    System.out.println(Arrays.toString(ie.arr));
    ie.insert(4,1300);
    System.out.println(Arrays.toString(ie.arr));
    ie.insert(4,1400);
    System.out.println(Arrays.toString(ie.arr));
   
    ie.access(4);
    ie.traverse();
    ie.search(400);
    ie.deleteAt(4);
    ie.traverse();
    


}
}

 