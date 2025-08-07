public class linearSearch
{
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        int x = search(arr, 3);

        if (x != -1) System.out.println("i is = " + x);
    }

     private static int search(int[] arr, int t)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i] == t){
                    return i;
                }
            }

            return -1;
        }
}