public class merge_Sort
{
    public static void main(String[] args)
    {
        int[] arr = {5, 2, 4, 3, 1};
        mergeS(arr);
        int index = bsearch(arr, 5);
        int pos = lsearch(arr, 3);

        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

        if (index != -1) System.out.println("\nBinary Search Index = " + index);
        else System.out.println("\nBinary Search index not found");

        if (pos != -1) System.out.println("\nLinear Search Index = " + pos);
        else System.out.println("\nLinear Search index not found");
    }

    private static int bsearch(int[] arr, int target)
    {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r)
        {
            int mid = l + (r - l) / 2;
            int val = arr[mid];

            if(val < target) l = mid + 1;
            else if (val > target) r = mid - 1;
            else return mid;
        }

        return -1;
    }

    private static int lsearch(int[]arr, int target)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == target) return i;
        }

        return -1;
    }

    private static void mergeS(int[] arr)
    {
        int length = arr.length;
        int mid = length / 2;

        if (length <= 1) return;

        int[]left = new int[mid];
        int[]right = new int[length - mid];

        for(int i = 0; i < mid; i++)
        {
            left[i] = arr[i];
        }

        for(int i = mid; i < length; i++)
        {
            right[i - mid] = arr[i];
        }

        mergeS(left);
        mergeS(right);
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] arr)
    {
        int l = 0;
        int r = 0;
        int m = 0;

        while (l < left.length && r < right.length)
        {
            if(left[l] < right[r])
            {
                arr[m] = left[l];
                l++;
            }
            else
            {
                arr[m] = right[r];
                r++;
            }
            m++;
        }

        while(l < left.length)
        {
            arr[m] = left[l];
            l++;
            m++;
        }

        while ( r  < right.length)
        {
            arr[m] = right[r];
            r++;
            m++;
        }

    }
}