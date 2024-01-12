class SortColors{
    static void sortByCount(int[] nums){
        int z=0,o=0,t=0;
        for(int x:nums){
            switch(x){
                case 0:
                z++;
                break;
                case 1:
                o++;
                break;
                case 2:
                t++;
                break;
            }
        }
       // System.out.println(z+" "+o+" "+t);
        for(int i=0;i<z;i++){
            nums[i]=0;
        }
        for(int i=z;i<z+o;i++){
            nums[i]=1;
        }
        for(int i=z+o;i<z+o+t;i++){
            nums[i]=2;
        }
        
    
    }
}


class Solution {
    public void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void sortColors(int[] nums) {
            int l=0,i=0,h=nums.length-1;
            while(i<=h){
                if(nums[i]==0){
                    swap(nums,i,l);
                    l++;i++;
                }
                else if(nums[i]==1){
                    i++;
                }
                else {
                    swap(nums,i,h);
                    h--;
                }

            }



        }


        
    
}