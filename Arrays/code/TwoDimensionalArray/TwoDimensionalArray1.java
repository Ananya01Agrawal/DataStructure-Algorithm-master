class  TwoDimensionalArray1  extends Parent{
    private int arr[][];
    public void CreateTwoDimensionalArray(int row, int col){
        arr=new int[row][col];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=Integer.MIN_VALUE;
            }
        }
        
    }
    public void insert(int row , int col, int value){
        try{
            if(arr[row][col]==Integer.MIN_VALUE)
            {
              arr[row][col]=value;
              System.out.println("Inserted succesfully");
            }
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid row or column");
        }
    }

    public void access(int row, int col){
        try{
            System.out.println("Array element at: "+row+" "+col+" is "+arr[row][col]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid row or column");
        }
    }

    public void traverse(){
System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print("[");
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("]");
        }
System.out.println("]");
    }

    public void search(int value){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==value){
                    System.out.println("Value found at location: "+i+" "+j);
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }

    public void deleteAt(int row, int col){
        try{
            arr[row][col]=Integer.MIN_VALUE;
            System.out.println("Deleted successfully");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid row or column");
        }
    }

    
}

class B{

}

class C{

}