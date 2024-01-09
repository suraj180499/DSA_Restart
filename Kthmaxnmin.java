import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

class SolutionForKthBySorting{

    static int kthMax(int[] arr,int kth){
        Arrays.sort(arr);
        return arr[arr.length-kth];
    }
    static int kthMin(int[] arr,int kth){
        Arrays.sort(arr);
        return arr[kth-1];
    }
}

class SolutionByPriorityQueue{
    static int kthSmallest(int[] arr,int kth){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arr){
            pq.add(i);
        }
        for(int i=0;i<kth-1;i++){
            pq.poll();
        }
        return pq.peek();
    }
    static int kthLargest(int[] arr,int kth){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:arr){
            pq.add(i);
        }
        for(int i=0;i<kth-1;i++){
            pq.poll();
        }
        return pq.peek();

    }
}

public class Kthmaxnmin {
    public static void main(String... args){
    int[] arr={2,5,30,1,3,90};
    int kth=4;
    System.out.println(kth+"th largest element is : "+SolutionByPriorityQueue.kthLargest(arr,kth));
    System.out.println(kth+"th smallest element is : "+SolutionByPriorityQueue.kthSmallest(arr,kth));
    }
    
}
