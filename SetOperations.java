import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SetOperations{

    static class Sets{
        /**
         * @param arr
         * @param brr
         * @param sorted
         * @return
         */
        static List<Integer> getUnion(int[] arr,int[]brr,boolean sorted){
            if(sorted){
                List<Integer> uni=new ArrayList<>();
                int i=0,j=0;
                int l1=arr.length;
                int l2=brr.length;
                while(i<l1 && j<l2){
                    if(arr[i]<brr[j]){
                        uni.add(arr[i]);
                        int temp=arr[i];
                        while(i<l1 && arr[i]==temp){
                            i++;
                        }
                        // i++;
                    }
                    else if(arr[i]==brr[j]){
                        uni.add(arr[i]);
                        int temp=arr[i];
                        while(i<l1 && arr[i]==temp){
                            i++;
                        }
                        while(j<l2 && brr[j]==temp){
                            j++;
                        }
                        // i++;
                        // j++;
                    }
                    else{
                        uni.add(brr[j]);
                        int temp=arr[j];
                        while(j<l2 && brr[j]==temp){
                            j++;
                        }
                        // j++;
                        
                    }

                }
                while(i<l1){
                    uni.add(arr[i]);
                   int temp=arr[i];
                        while(i<l1 && arr[i]==temp){
                            i++;
                        }
                }
                while(j<l2){
                    uni.add(brr[j]);
                   int temp=brr[j];
                        while(j<l2 && brr[j]==temp){
                            j++;
                        }
                }
                return uni;
            }

            else{
                //if data is not sorted then use set or map
                Set<Integer> res=new HashSet<>();
                for(int i=0;i<arr.length;i++){
                    res.add(arr[i]);
                }
                for(int j=0;j<brr.length;j++){
                    res.add(brr[j]);
                }
                List<Integer> uni=new ArrayList<>(res);
                return uni;
            }
        }



        //intersection

       static List<Integer> getInterSection(int[] arr,int[] brr,boolean sorted){

            if(sorted){
                List<Integer> inter=new ArrayList<>();
                int i=0,j=0,l1=arr.length,l2=brr.length;
                while(i<l1 && j<l2){
                    if(arr[i]==brr[j]){
                        inter.add(arr[i]);
                        int temp=arr[i];
                        while(i<l1 && arr[i]==temp){
                            i++;
                        }
                        while(j<l2 && brr[j]==temp){
                            j++;
                        }
                    }
                    else if(arr[i]<brr[j]){
                        int temp=arr[i];
                        while(i<l1 && arr[i]==temp){
                            i++;
                        }
                    }
                    else{
                        int temp=brr[j];
                        while(j<l2 && brr[j]==temp){
                            j++;
                        }
                    }
                }


                return inter;
            }
            else{
                
        Map<Integer,Boolean> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            mp.put(arr[i],true);
        }
        int l2=brr.length;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<l2;i++){
            if(mp.containsKey(brr[i])){
            s.add(brr[i]);

            }
        }
        List<Integer> res=new ArrayList<>(s);
        return res;
    
            }

        }

        //difference

        static List<Integer> getSetDiff(int[] arr,int[] brr,boolean isRev){
            if(isRev){
                Map<Integer,Boolean> mp=new HashMap<>();
                List<Integer> diff=new ArrayList<>();
                for(int i=0;i<arr.length;i++){
                    mp.put(arr[i],true);
                }
                for(int i=0;i<brr.length;i++){
                    if(!mp.containsKey(brr[i])){
                        diff.add(brr[i]);
                    }
                }
                return diff;
            }
            else{
                Map<Integer,Boolean> mp=new HashMap<>();
                List<Integer> diff=new ArrayList<>();
                for(int i=0;i<brr.length;i++){
                    mp.put(brr[i],true);
                }
                for(int i=0;i<arr.length;i++){
                    if(!mp.containsKey(arr[i])){
                        diff.add(arr[i]);
                    }
                }
                return diff;
            }
        }

    }


}