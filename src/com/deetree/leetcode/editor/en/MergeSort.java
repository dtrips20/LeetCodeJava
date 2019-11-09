package com.deetree.leetcode.editor.en;



public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7,8,9};

        MergeSort m = new MergeSort();
        m.Divide(arr,0, arr.length-1);

        for( int i = 0 ; i <= arr.length - 1 ; i++)
        {
            System.out.println(arr[i]);
        }

    }

    private void Divide( int[] arr , int l, int r) {
        if (l < r) {

            int m = (l + r) / 2;

            Divide(arr, l, m);
            Divide( arr,m + 1, r);
            Merge(arr, l,m,r);

        }


    }

    private void Merge(int[] arr , int l , int m , int r)
    {
         int leftArraySize = m - l+1;
         int rightArraySize = r - m ;

         int[] leftArray = new  int[leftArraySize];
         int[] rightArray = new int[rightArraySize];

         for( int i = 0 ; i < leftArraySize ; ++i)
         {
             leftArray[i] = arr[l+i];

             //System.out.println("arr LF "+arr[i+l]);
         }

        for( int j = 0 ; j < rightArraySize ; ++j)
        {
            rightArray[j] = arr[m+1+j];
            //System.out.println("arr RH "+arr[m+j+1]);
        }

        int i = 0, j = 0;
        int k = l;
        while(i < leftArraySize && j < rightArraySize)
        {
            if(leftArray[i] <= rightArray[j] )
            {
                arr[k] = leftArray[i];
                i++;
                //j++;

            }
            else

            {
                arr[k] = rightArray[j];
                j++;
                //i++;
            }
            k++;
        }

        while( i < leftArraySize)
        {
            arr[k] = leftArray[i];
            k++;
            i++;

        }

        while(j < rightArraySize)

        {
            arr[k] = rightArray[j];
            k++;
            j++;
        }


    }


}


