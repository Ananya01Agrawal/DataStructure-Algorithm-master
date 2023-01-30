import java.util.Arrays;

  class Main {
    public boolean swapElementAt90(int [][]matrix){
        if(matrix.length!=matrix[0].length){
            return false;
        }

        else{
            int n=matrix.length;
    for(int layer=0;layer<n/2;layer++){
     int first=layer;
     int last=n-1-layer;

     for(int i=first;i<last;i++){
        int offset=i-first;
        int temp;
        int top=matrix[first][i];
        temp=top;
        int left=matrix[last-offset][first];
        matrix[first][i]=left;

        int bottom=matrix[last][last-offset];
        matrix[last-offset][first]=bottom;

        int right=matrix[i][last];
        matrix[last][last-offset]=right;
        matrix[i][last]=temp;
     }

     }
     
    }

    return true;



        }

        public static void main(String []args){
            Main mn =new Main();
            int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
            System.out.println(Arrays.deepToString(matrix));
           boolean result= mn.swapElementAt90(matrix);
          System.out.println(result);
           System.out.println(Arrays.deepToString(matrix));
            
        }
}
 
