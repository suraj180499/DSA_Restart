class Heap {
    
static class MaxHeap{
    int size;
    int maxSize;
    int[] arr;

    MaxHeap(int maxSize){
        this.maxSize=maxSize;
        arr=new int[maxSize];
        this.size=0;
    }

    int parent(int i){
        return ((i-1)/2);
    }

    int lChild(int i){
        return ((2*i+1));
    }

    int rChild(int i){
        return ((2*i+2));
    }

    void swap(int[] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    // top down manner
    void maxHeapify(int i){
        int largest=i;
        int l=lChild(i);
        int r=rChild(i);
        if(l<size && arr[l]>arr[i]){
            largest=l;
        }
        if(r<size && arr[r]>arr[largest]){
            largest=r;
        }
        if(largest!=i){
            swap(arr,largest,i);
            maxHeapify(largest);
        }

    }

    int getPeek(){
        if(size!=0){
            return arr[0]; 
        }
        return Integer.MIN_VALUE;
    }

    void insert(int k){
        if(size==maxSize){
            System.out.println("\n overflow could not insert key\n");
            return;
        }
        size++;
        int i=size-1;
        arr[i]=k;

        while(i!=0 && arr[parent(i)]<arr[i]){
            swap(arr,i,parent(i));
            i=parent(i);
        }

    }

    int deleteMax(){
        if(size==0){
            System.out.println("\n empty heap\n");
            return Integer.MIN_VALUE;
        }

        int root=arr[0];
        arr[0]=arr[size-1];
        size--;
        maxHeapify(0);
        return root;
        
    }

    int increaseKey(int pos,int new_val){
        int ind=pos;
        arr[pos]=new_val;
        while(ind!=0 && arr[parent(ind)]<arr[ind]){
            swap(arr,ind,parent(ind));
            ind=parent(ind);
        }
        return new_val;
    }

    int deleteKey(int i){
        int temp=arr[i];
        if(i==0){
            size=0;
        return temp;
    }
    increaseKey(i, Integer.MAX_VALUE);
    deleteMax();
    return temp;

    }
}




































}
