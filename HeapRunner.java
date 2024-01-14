public class HeapRunner {
    public static void main(String... args){
        Heap.MaxHeap heap=new Heap.MaxHeap(10);
        heap.insert(10);
        heap.insert(20);
        heap.insert(0);
        heap.insert(100);
        heap.insert(-10);
        heap.insert(20);
        heap.insert(0);
        heap.insert(100);
        heap.insert(-10);
        int c=0;
        for(int x:heap.arr){
            if(c==heap.size){
                break;
            }
            c++;
            System.out.print(x+" ");
        }
        c=0;
        System.out.println("Max of the heap is: "+heap.deleteKey(2));
        for(int x:heap.arr){
             if(c==heap.size){
                break;
            }
            c++;
            System.out.print(x+" ");
        }
        System.out.println();
        heap.deleteMax();
        for(int x:heap.arr){
             if(c==heap.size){
                break;
            }
            c++;
            System.out.print(x+" ");
        }
        System.out.println();
        heap.deleteMax();
        for(int x:heap.arr){
             if(c==heap.size){
                break;
            }
            c++;
            System.out.print(x+" ");
        }
        System.out.println();
        heap.deleteMax();
        for(int x:heap.arr){
             if(c==heap.size){
                break;
            }
            c++;
            System.out.print(x+" ");
        }
        System.out.println();
        heap.deleteMax();
        for(int x:heap.arr){
             if(c==heap.size){
                break;
            }
            c++;
            System.out.print(x+" ");
        }
        System.out.println();
        heap.deleteMax();
        for(int x:heap.arr){
             if(c==heap.size){
                break;
            }
            c++;
            System.out.print(x+" ");
        }
    }
}
