public class binary_Search {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 7, 9};
        int target = 5;

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                System.out.println("\n Found at index: " + mid);
                return;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Not found");
    }
}
