public class Bubble implements Sorting {
     @Override
    public void swap(int[] arr, int i, int j) {
        
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    } 
    
    
    @Override
    public void sort(int[] arr,int n,boolean isReverse){
        boolean flag=true;
        if(isReverse==false){
            for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++){
                    if( arr[j]>arr[j+1]){
                        swap(arr,j,j+1);
                        flag=false;
                    }
                }
                if(flag){
                    System.out.println("not swap");
                    return;
                }
            }
        }
        else{
            for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++){
                    if(arr[j]<arr[j+1])
                        swap(arr,j,j+1);
                }
                if(flag){
                    System.out.println("not swap");
                    return;
                }
            }
        }
       
    }
}


