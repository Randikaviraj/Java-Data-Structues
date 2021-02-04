/**
 * MinHeap
 */
public class MinHeap {
    private int[] heap_array;
    private int index = 0;

    public MinHeap(int heapsize) {
        this.heap_array = new int[heapsize];
    }

    public void insert(int value) {
        this.heap_array[index] = value;
        int temp_index = index;
        this.index++;
        int parent;
        while (true) {
            if (temp_index == 0) {
                break;
            }
            if (temp_index % 2 == 0) {
                parent = (temp_index - 2) / 2;
            } else {
                parent = (temp_index - 1) / 2;
            }

            if (heap_array[parent] > heap_array[temp_index]) {
                heap_array[temp_index] = heap_array[parent];
                heap_array[parent] = value;
                temp_index = parent;
            } else {
                break;
            }
        }
    }

    public int poll(){
        int rootval=this.heap_array[0];
        this.heap_array[0]=this.heap_array[this.index-1];
        int temp_index=0;
        int temp_value;
        while (true) {
            if (this.heap_array[2*temp_index+1]<=this.heap_array[2*temp_index+2]) {
                if (this.heap_array[temp_index]>this.heap_array[2*temp_index+1]) {
                    temp_value=this.heap_array[temp_index];
                    this.heap_array[temp_index]=this.heap_array[2*temp_index+1];
                    this.heap_array[2*temp_index+1]=temp_value;
                    temp_index++;
                } else if (this.heap_array[temp_index]>this.heap_array[2*temp_index+2]){
                    temp_value=this.heap_array[temp_index];
                    this.heap_array[temp_index]=this.heap_array[2*temp_index+2];
                    this.heap_array[2*temp_index+2]=temp_value;
                    temp_index++;
                }else{
                    break;
                }
            } else {
                if (this.heap_array[temp_index]>this.heap_array[2*temp_index+2]) {
                    temp_value=this.heap_array[temp_index];
                    this.heap_array[temp_index]=this.heap_array[2*temp_index+2];
                    this.heap_array[2*temp_index+2]=temp_value;
                    temp_index++;
                } else if (this.heap_array[temp_index]>this.heap_array[2*temp_index+1]){
                    temp_value=this.heap_array[temp_index];
                    this.heap_array[temp_index]=this.heap_array[2*temp_index+1];
                    this.heap_array[2*temp_index+1]=temp_value;
                    temp_index++;
                }else{
                    break;
                }
            }
        }
        return rootval;
    }

    public void printHeap(){
        for (int i : heap_array) {
            System.out.println(i);
        }
    }

}