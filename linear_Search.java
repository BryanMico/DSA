public class linear_Search {
    public static void main(String[] args) {
        int[] array = {3, 8, 1, 5, 7};
        int target = 5;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("\n Found at index: " + i);
                return;
            }
        }

        System.out.println("Not found");
    }
}
