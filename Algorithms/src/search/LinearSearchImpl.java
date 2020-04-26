package search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LinearSearchImpl {

    public int iterativeLinearSearch(int[] arr,int target)
    {
        int pos = -1;

        for (int i = 0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                pos = i+1;
                break;
            }
        }
        return pos;
    }

    public int recusrsiveLinearSearch(int[] arr,int beg,int end,int target)
    {
        if( beg > end)
            return -1;
        else if(arr[beg] == target)
            return beg + 1;
        else if(arr[end] == target)
            return end + 1;
        else return recusrsiveLinearSearch(arr,beg+1,end-1,target);
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

            LinearSearchImpl linearSearch = new LinearSearchImpl();

            System.out.println("Element pos (iteratively) : " + linearSearch.iterativeLinearSearch(arr,target));
            System.out.println("Element pos (recursively) : " + linearSearch.recusrsiveLinearSearch(arr,0,size-1,target));
        }
    }

}
