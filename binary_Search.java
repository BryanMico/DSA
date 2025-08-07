public class binary_Search {
    public static void main(String[] args) {
        int[] arr = {2 ,3, 4 , 5};
        int x = search(arr, 3);

        if (x != -1) System.out.println("pos = " + x);
        else System.out.println("Not found"); 
    }

    private static int search(int[]arr, int t)
    {
        int l = 0;
        int r = arr.length - 1;

        while (l < r)
        {
            int mid = l + (r - l) / 2;
            
            if(arr[mid] < t) l = mid + l;
            else if (arr[mid] > t) r = mid - l;
            else return mid;

        }

        return -1;
    }
}