public class SentinelSerarch{
    static int isContain(int[] arr,int key){
        int i=0;
        int last=arr[arr.length-1];
        arr[arr.length-1]=key;
        while(arr[i]!=key)
            i++;
        arr[arr.length-1]=last;
        if(i<(arr.length-1) || arr[arr.length-1]==key){
            return i;
        }
        return -1;
    }

    public static void main(String... args){
        int[] arr={1,2,3,4,5,6};
        System.out.println(isContain(arr,6));
    }
}