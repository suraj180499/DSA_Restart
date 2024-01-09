class solutionMAXnMin{
    public static int getMin(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int x:arr){
            if(x<min){
                min=x;
            }
        }
        return min;
    }

    public static int getMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
}
public class MAXnMIN {

    public static void main(String... args){
        int[] arr={2,3,5,6,7,10,2,4,-1};
        
        System.out.println("Maximum element in the array is:-: "+solutionMAXnMin.getMax(arr));
         System.out.println("Minimum element in the array is:-: "+solutionMAXnMin.getMin(arr));
    }
    
}
