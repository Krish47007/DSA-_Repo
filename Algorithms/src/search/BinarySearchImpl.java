package search;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearchImpl {

    static void display(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"\t");
        System.out.println();
    }

    public int iterativeBinarySearch(int[] arr, int key)
    {
        int beg = 0, end = arr.length - 1;
        int mid = beg + ( end - beg)/2;

        while(beg <= end)
        {
            mid = beg + ( end - beg)/2;

            if(arr[mid] == key)
                return mid;
            else if (arr[mid] > key)
                end = mid - 1;
            else
                beg = mid + 1;
        }

        return -1;
    }



    public int recursiveBinarySearch(int[] arr,int beg,int end,int key)
    {
        if( beg > end)
            return -1;
        else
        {
            int mid = beg + ( end - beg )/2;

            if(arr[mid] == key)
                return mid;
            else if( arr[mid] > key)
                return recursiveBinarySearch(arr,beg,mid-1,key);
            else
                return recursiveBinarySearch(arr,mid + 1,end,key);
        }

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            System.out.println("Enter size of array: ");
            int size = Integer.parseInt(br.readLine());
            int[] arr = new int[size];

            System.out.println("Enter "+size+" elements:");
            for(int i=0;i<size;i++)
                arr[i] = Integer.parseInt(br.readLine());

            System.out.println("Enter the element to be searched: ");
            int target  = Integer.parseInt(br.readLine());

            BinarySearchImpl binarySearch = new BinarySearchImpl();
            Arrays.sort(arr);

            display(arr);

            System.out.println("Element pos (iteratively) : " + binarySearch.iterativeBinarySearch(arr,target));
            System.out.println("Element pos (recursively) : " + binarySearch.recursiveBinarySearch(arr,0,size-1,target));

    }

    }
}
