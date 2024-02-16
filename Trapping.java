class Trapping{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
        int[] l=new int[n];
        int[] r=new int[n];
        l[0]=arr[0];
        for(int i=1;i<n;i++){
            l[i]=Math.max(arr[i],l[i-1]);
        }
        r[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            r[i]=Math.max(r[i+1],arr[i]);
        }
        
        long s=0;
        for(int i=0;i<n;i++){
            s+=(Math.min(l[i],r[i])-arr[i])>0?Math.min(l[i],r[i])-arr[i]:0;
        }
        return s;
        
    } 
}
