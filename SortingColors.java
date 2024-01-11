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

