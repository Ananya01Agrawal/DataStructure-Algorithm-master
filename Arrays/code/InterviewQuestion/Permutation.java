public class Permutation {
    public boolean isPermutation(int []arr1,int []arr2 ){
        int sum1=0;
        int sum2=0;
        int prd1=1;
        int prd2=1;
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
            sum2+=arr2[i];
            prd1*=arr1[i];
            prd2*=arr2[i];

        }

        if(sum1==sum2&&prd1==prd2){
            return true;
        }
        return false;
    }

    public static void main(String []args){
        Permutation ex=new Permutation();
        boolean result=ex.isPermutation(new int[]{1,2,3,4,5},new int[]{5,4,3,2,1});
        System.out.println(result);
    }
}
