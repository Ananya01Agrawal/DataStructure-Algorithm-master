 
 
public class FindNumberArray {
        public int searchInArray(int[] intArray, int valueToSearch) {
            for(int i=0;i<intArray.length;i++){
                if(intArray[i]==valueToSearch)
                {
                    return i;
                }
            }
            
            return Integer.MIN_VALUE;
        }

public static void main(String []args){
    FindNumberArray ex = new FindNumberArray();
    int result=ex.searchInArray(new int[]{4,3,5,6,9,0},2);
    System.out.println(result);
}
}