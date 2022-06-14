import java.util.Arrays;

class HeapSort {


    public static void main (String args[]){

        int arr[] = {8,7,6,4,3,6,9,1,5,8};

        //heapify the given array into max heap
        //hence we are moving max elements upwards

        for (int i=arr.length-1; i>=0; i--){
            //find the children element and compare them with the parent

            int left_child = (2*i)+1;
            int right_child = (2*i)+2;
            int moving_element_index = 0;
            boolean left_child_populated = false;
            // last element in the array
            if (left_child >= arr.length && right_child >= arr.length){
                continue;
            } else if (left_child < arr.length && right_child >= arr.length){
                moving_element_index = left_child;
                left_child_populated = true;
            }

            if (!left_child_populated && arr[left_child] > arr[right_child]){
                moving_element_index = left_child;
            } else if (!left_child_populated) {
                moving_element_index = right_child;
            }

            int temp = arr[i];
            arr[i] = arr[moving_element_index];
            arr[moving_element_index] = temp;

        }

        System.out.println(Arrays.toString(arr));

    }

}