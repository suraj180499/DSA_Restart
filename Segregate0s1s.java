public class Segregate0s1s{
   static class Solution {
        void swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        void segregate0and1(int[] arr, int n) {
            // code herea
            int i=0,j=n-1;
            while(i<j){
                if(arr[i]==1){
                    while(arr[j]!=0 && i<j){
                        j--;
                    }
                
                    swap(arr,i,j);
                    
                }
                
                i++;
            }
                // System.out.println(Arrays.toString(arr));
                
            }
        
    
    }
}