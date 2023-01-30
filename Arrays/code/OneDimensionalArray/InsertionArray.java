public class InsertionArray{
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

   else
   {
    System.out.println("Invalid index to access array");
   }
   }
   public static void main(String []args){
    InsertionArray ia=new InsertionArray();
    ia.singleDimensionArray(10);
    ia.insert(0,10);
    ia.insert(0,20);
    ia.insert(1,20);
    ia.insert(2,30);
    ia.insert(3,40);
    ia.insert(4,50);
    ia.insert(5,60);
    ia.insert(10,70);
   
   }
}

 