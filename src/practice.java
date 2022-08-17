import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class practice {

    public static void main(String[] args) {
        int arr[] = {5,4,7,4,1,2,3,5,4,9};
        int n = arr.length;
        InsertionSort(arr);
        System.out.println();
        n =removeDuplicate(arr);
        for(var i=0;i<n;i++){
            System.out.print(i+" ");
        }
//        var res = countfreq(arr);
//        System.out.print(res);

    }
    static void printarr(int arr[]){
        for(var e:arr){
            System.out.print(e+" ");
        }
    }
    static int countfreq(int []arr) {
        Map<Integer, Integer> map = new HashMap<>();
        var s = arr;
        for (var e : s) {
            var count = map.containsKey(e) ? map.get(e) : 0;
            map.put(e, count + 1);
        }

        for (var e : s)
            if (map.get(e) == 1)
                return e;

        return Integer.MIN_VALUE;
    }
    public static int removeDuplicate(int arr[]) {
        int n = arr.length;
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        arr[j++] = arr[n-1];

        return j;
    }


    public static void InsertionSort(int[]arr){
        for(var i=0;i<arr.length;i++){
            int a = arr[i];
            int j = i-1;
            while(j>=0 && a<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = a;
        }
        printarr(arr);
    }
}

