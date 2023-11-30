import java.util.*;
public class Solution {
    public static List<Integer> quickSort(arr[]){
        // Write your code here.
        int arr[5]={2,5,3,1,4}
        int n=5;
        quickSort(arr,0,n-1);
        for(int i=1;<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return 0;

}
    void quickSort(int arr[], int s, int e){
        if(s>=e){
            return;
        }
        int p=partition(arr,s,e);
        quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
    }
    int partition(int arr[],int s,int e){
        int pivot = arr[s];
        int cnt++;
        for(int i=s+1,i<=e;i++){
            if(arr[i] < pivot){
                cnt++;
            }
        }
        int pivotIndex = s+cnt;
    swap(arr[pivot], arr[s]);
    int i=s,j=e;
    while(arr[i] <= pivot){
        i++;
    }
    while(arr[i] > pivot){
        j--;
    }
    if(i<pivotIndex && j>pivotIndex){
        swap(arr[i++],arr[j--]);
    }
    return pivotIndex;
}
}