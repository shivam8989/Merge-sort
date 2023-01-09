package sorting;
import java.util.*;
public class Mergesort{
        public static void conquer(int arr[], int start ,int mid, int end){
    int merger [] = new int[end-start+1];
    int idx1 = start;
    int idx2 = mid+1;
    int x = 0;
    while(idx1 <= mid && idx2 <= end ){
        if(arr[idx1]<= arr[idx2]){
            merger[x++] =arr[idx1++];
        }else{
            merger[x++]= arr[idx2++];
        }
    }
    while(idx1 <=mid){
        merger[x++] =arr[idx1++];
    }
    while(idx2 <= end){
        merger[x++] = arr[idx2++];
    }
    for(int i =0, j = start;  i<merger.length; i++,j++){
        arr[j] = merger[i];
    }
        }
        public static void divide(int arr[], int start , int end){
    if(start>=end){
        return;
    }
         int mid = start +(end -start)/2;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end);
        }
    public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the Size of array");
    int n = sc.nextInt();
    int arr [] = new int[n];
    System.out.println("Enter the elements in array");
    for(int i =0 ; i< arr.length; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("The array is :");
    for(int i =0; i< arr.length; i++){
        System.out.print(arr[i]+" ");
    }
        System.out.println();
    divide(arr,0,n-1);
    System.out.println("The sorted array is ");
    for(int i =0 ; i<n; i++){
        System.out.print(arr[i]+" ");
    }

    }
}
