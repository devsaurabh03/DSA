import java.util.Arrays;

class HeapSort {


    public static void main (String args[]){

        int arr[] = {8,7,6,4,3,6,9,1,5,8};

        //heapify the given array into max heap
        //hence we are moving max elements upwards

        int param1 = arr.length;

        heapify(arr, param1);

        // delete the elements from heap and sort the array

        for (int i=arr.length-1; i>=1; i--){

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr,i-1);
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void heapify(int[] arr, int size) {
        for (int i = size -1; i>=0; i--){
            //find the children element and compare them with the parent

            int left_child = (2*i)+1;
            int right_child = (2*i)+2;
            int moving_element_index = 0;
            boolean left_child_populated = false;
            // last element in the array
            if (left_child >= size && right_child >= size){
                continue;
            } else if (left_child < size && right_child >= size){
                moving_element_index = left_child;
                left_child_populated = true;
            }

            if (!left_child_populated && arr[left_child] > arr[right_child]){
                moving_element_index = left_child;
            } else if (!left_child_populated) {
                moving_element_index = right_child;
            }

            if (arr[moving_element_index] > arr[i]){
                int temp = arr[i];
                arr[i] = arr[moving_element_index];
                arr[moving_element_index] = temp;
            }

        }
    }

}