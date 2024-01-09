class Solution{
    public static void swap(int[] arr,int f,int l){
        // int temp=arr[f];
        // arr[f]=arr[l];
        // arr[l]=temp;
        arr[f]=arr[f]+arr[l];
        arr[l]=arr[f]-arr[l];
        arr[f]=arr[f]-arr[l];
    }

    public static void solution(int[] arr,int size){
        int size_of_arr=size;
        int i=0;
        while(i!=size_of_arr/2){
            swap(arr,i,size_of_arr-1-i);
            i++;
        }
    }
}



class ReverseArray{

    public static void main(String... args){
        int[] arr={1,2,3,4,5,6};
        int size=6;

        System.out.println("array before reverse operation");

        for(int x:arr){
            
        System.out.print(x+" ");}

        System.out.println();
        //calling soution function to reverse the array
        Solution.solution(arr, size);

        System.out.println("array after reverse operation");
        for(int x:arr){
        System.out.print(x+" ");}

    }
}

