import java.util.Arrays;

class MinimizeHieght{
    int getMinDiff(int[] arr, int n, int k) {
        // code here
    Arrays.sort(arr);
    int mn=arr[0];
    int mx=arr[n-1];
    int mindiff=mx-mn;
    for(int i=1;i<n;i++){
        if(arr[i]-k<0){
            continue;
            
        }
         mn=Math.min(arr[0]+k,arr[i]-k);
         mx=Math.max(arr[n-1]-k,arr[i-1]+k);
        mindiff=Math.min(mindiff,mx-mn);
    }
    return mindiff;
    
    }
}