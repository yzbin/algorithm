package com.robin.basic;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: bin
 * Date: 2017-12-27
 */
import java.util.Arrays;
public class BinarySearch {
    public static int rank (int key, int[]a){
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]){
                hi = mid - 1;
            }else if(key > a[mid]){
                lo = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){

    }


}
