class MoveAllNeg {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int neg_s=-1,neg_e=-1,i=0;
        for(;i<n;i++){
            // System.out.println(Arrays.toString(arr)+" "+arr[i]);
            if(arr[i]>=0){
                if(neg_s!=-1){
                    int temp=arr[i];
                    for(int j=neg_e;j>=neg_s;j--){
                        arr[j+1]=arr[j];
                    }
                    arr[neg_s]=temp;
                    neg_s++;
                    neg_e++;
                }
            }
            
            else{
                if(neg_s==-1){
                    neg_s=i;
                    neg_e=i;
                }
                else{
                neg_e++;}
            }
            // System.out.println(neg_s+" "+neg_e);
            }
        }
        
    }
