public class MaxProductTwo {
    public String maxTwo(int []arr){
        int max=0;
        String pairs="";
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(max<arr[i]*arr[i+1])
                {
                    max=arr[i]*arr[i+1];
                    pairs=Integer.toString(arr[i])+","+Integer.toString(arr[i+1]);

                }
            }
        }
        return pairs;
    }

    public static void main(String []args){
        MaxProductTwo ex=new MaxProductTwo();
        String result=ex.maxTwo(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(result);
    }
}


// two sum problem of leetcod solution in java
//
 

