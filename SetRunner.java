public class SetRunner{
    public static void main(String... args){
        

        int[] arr={2,2,3,4,5,5,5,5};
        int[] brr={2,3,4,5,6,6};
        SetOperations.Sets.getUnion(arr,brr,true).stream().forEach(e->System.out.print(e+" "));
        System.out.println();
        SetOperations.Sets.getInterSection(arr,brr,false).stream().forEach(e->System.out.print(e+" "));
        System.out.println();
        SetOperations.Sets.getSetDiff(arr,brr,true).stream().forEach(e->System.out.print(e+" "));
    }
}