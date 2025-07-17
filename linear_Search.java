public class linear_Search {                      // We’re making a program called linear_Search

    public static void main(String[] args) {      // This is where the program starts
        
        int[] array = {3, 8, 1, 5, 7};            // Here’s a list of numbers we want to search in
        
        int target = 5;                           // This is the number we are looking for (5)
        
        for (int i = 0; i < array.length; i++) { // Look at each number one by one, from start to end
            
            if (array[i] == target) {             // Is this number the one we want (5)?
                
                System.out.println("\n Found at index: " + i); // Yes! Tell us where it is
                
                return;                            // Stop searching because we found it
            }
        }
        
        System.out.println("Not found");          // If we checked all numbers and didn’t find 5, say “Not found”
    }
}
