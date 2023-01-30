public class RotateMatrix90 {
    public void rotateMatrix90(int [][]arr){
        for(int j=0;j<arr.length;j++){
            for(int i=arr.length-1;i>=0;i--){
                System.out.print(arr[i][j]+" "); 
            }
            System.out.println();
        }
    }
    public static void main(String []args){

        RotateMatrix90 ex=new RotateMatrix90();
        ex.matrix(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        System.out.println();
            ex.translate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        System.out.println("After 90 degree rotation");
        ex.rotateMatrix90(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

    }

    public void matrix(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void translate(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=arr.length-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
