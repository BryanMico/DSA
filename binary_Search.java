public class binary_Search {                          // We’re making a program called binary_Search

    public static void main(String[] args) {          // This is where the program starts
        
        int[] array = {1, 2, 3, 5, 7, 9};             // Here’s a sorted list of numbers
        
        int target = 5;                               // This is the number we want to find (5)
        
        int low = 0;                                  // Start looking from the first spot (index 0)
        int high = array.length - 1;                  // Look until the last spot (index 5)
        
        while (low <= high) {                          // While there are still spots to check
            
            int mid = low + (high - low) / 2;         // Find the middle spot between low and high
            
            if (array[mid] == target) {               // Did we find the number at middle?
                
                System.out.println("\n Found at index: " + mid);  // Yes! Tell us where
                
                return;                               // Stop searching because we found it
                
            } else if (array[mid] < target) {         // Is the number at middle smaller than what we want?
                
                low = mid + 1;                        // Then look only in the right half
                
            } else {                                  // Otherwise
                
                high = mid - 1;                       // Look only in the left half
            }
        }
        
        System.out.println("Not found");              // If we checked everything and didn’t find it
    }
}
