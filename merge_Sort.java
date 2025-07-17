public class merge_Sort {                       // We’re making a recipe called merge_Sort

    public static void main(String[] args) {    // This is where our story begins
        
        int[] array = {5, 3, 1, 4, 2};          // Here’s our messy pile of numbers
        
        mergeSort(array, 0, array.length - 1);  // Let’s ask the computer to clean it up
        
        System.out.println("\n Sorted array:"); // Tell the computer to say “Sorted array:”
        
        for (int num : array)                    // For each number in the cleaned-up list
            System.out.print(num + " ");         // Print that number one by one
    }

    static void mergeSort(int[] arr, int left, int right) {  // Function to clean up part of the list
        if (left < right) {                                 // If there’s more than one number here
            
            int mid = (left + right) / 2;                   // Find the middle to split the list
            
            mergeSort(arr, left, mid);                       // Clean the left half first
            
            mergeSort(arr, mid + 1, right);                  // Clean the right half next
            
            merge(arr, left, mid, right);                     // Now put both halves back together in order
        }
    }

    static void merge(int[] arr, int left, int mid, int right) {  // Putting two halves back together in order
        int n1 = mid - left + 1;                                  // Size of left half
        int n2 = right - mid;                                     // Size of right half
        
        int[] L = new int[n1];                                    // Make a new small box for left half
        int[] R = new int[n2];                                    // Make a new small box for right half
        
        for (int i = 0; i < n1; i++)                             // Put left half numbers in the box
            L[i] = arr[left + i];
        
        for (int j = 0; j < n2; j++)                             // Put right half numbers in the box
            R[j] = arr[mid + 1 + j];
        
        int i = 0, j = 0, k = left;                              // Start looking at both boxes and the big list
        
        while (i < n1 && j < n2) {                               // While both boxes still have numbers
            
            if (L[i] <= R[j]) {                                  // If left box’s number is smaller or equal
                arr[k] = L[i];                                   // Put that number into the big list
                i++;                                             // Look at the next number in left box
            } else {
                arr[k] = R[j];                                   // Otherwise, pick number from right box
                j++;                                             // Look at the next number in right box
            }
            k++;                                                 // Move to the next spot in big list
        }
        
        while (i < n1)                                           // If left box still has numbers left
            arr[k++] = L[i++];                                   // Copy them all to big list
        
        while (j < n2)                                           // If right box still has numbers left
            arr[k++] = R[j++];                                   // Copy them all to big list
    }
}
