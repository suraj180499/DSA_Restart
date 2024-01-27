public class Selection implements Sorting {
     @Override
    public void sort(int[] arr, int n, boolean isReverse) {
        int min=0;

        while(min!=n)
        {
            int index=min;
             int minVal=arr[min];
            for(int i=min;i<n;i++){
                if(arr[i]<minVal){
                    minVal=arr[i];
                    index=i;
                }
            }
            swap(arr,index,min);
            min++;
        }
    }


    @Override
    public void swap(int[] arr, int i, int j) {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;    
    }
}
