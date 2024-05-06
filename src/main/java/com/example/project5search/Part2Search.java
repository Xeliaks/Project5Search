package com.example.project5search;
import java.util.ArrayList;

public class Part2Search {
    public int recLinearSearch(ArrayList<String> list, String key, int beginIdx, int endIdx) {

        if (beginIdx > endIdx) {
            return -1;
        }

        if (list.get(beginIdx).equals(key)) {
            return beginIdx;
        }

        return recLinearSearch(list, key, beginIdx + 1, endIdx);
    }

    public int binarySearch(int[] a, int search) {
        int left = 0;
        int right = a.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (a[mid] == search)
                return mid;

            if (mid < left || mid > right)
                return -1;


            if (a[mid] < search)
                left = mid + 1;


            else
                right = mid - 1;
        }

        return -1;
    }

    public int recursiveBinarySearch(int[] a, int search, int low, int high) {

        if (low > high)
            return -1;

        int mid = low + (high - low) / 2;


        if (a[mid] == search)
            return mid;

        if (mid < low || mid > high)
            return -1;

        if (a[mid] > search)
            return recursiveBinarySearch(a, search, low, mid - 1);


        return recursiveBinarySearch(a, search, mid + 1, high);
    }


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("orange");
        list.add("grape");

        Part2Search search = new Part2Search();
        int index = search.recLinearSearch(list, "orange", 0, list.size() - 1);
        System.out.println("Index of 'orange': " + index);


        Part2Search binarySearch = new Part2Search();
        int[] arr = { 2, 3, 5, 10, 16, 24, 32, 48, 96, 120 ,240, 360, 800, 1600 };
        int searchElement = 10;
        int result = binarySearch.binarySearch(arr, searchElement);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);

        Part2Search binarySearchRec = new Part2Search();
        int[] arrRec = { 2, 3, 5, 10, 16, 24, 32, 48, 96, 120 ,240, 360, 800, 1600 };
        int searchElementRec = 150;
        int resultRec = binarySearchRec.recursiveBinarySearch(arr, searchElementRec, 0, arrRec.length - 1);
        if (resultRec == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);



    }





}
