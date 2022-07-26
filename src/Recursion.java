import java.util.*;
public class Recursion {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        fib(n);
//        int t = scn.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = scn.nextInt();
//        }
//
//
//       int ans[] = TwoPoin(arr,t);
//        for(int i=0;i<ans.length;i++){
//            System.out.print(ans[i]+" ");
//        }

//        int ansL = Linear(arr, t);
//        int ans = Binary(arr, 0, arr.length - 1, t);
//        System.out.println("Index value using Binary search at = " + ans);
//        System.out.println("Index value using Binary search at = "+ansL);
    }
/*
    static int Linear(int[] arr, int t) {
        int x = arr.length;
        for (int i = 0; i < x - 1; i++) {
            if (arr[i] == t) {
                return i;
            }
        }
        return -1;
    }

    static int Binary(int[] arr, int s, int e, int t) {


        while (s > e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == t) {
                return mid;
            }
            if (arr[mid] < t) {

                return Binary(arr, mid + 1, arr.length - 1, t);
            }
            if (arr[mid] > t) {
                return Binary(arr, 0, s - 1, t);
            } else {
                return Binary(arr, mid + 1, arr.length - 1, t);
            }
        }return-1;
    }

 */
    /*
    static int [] TwoPoin(int [] arr,int t,int start,int end) { // 1 2 4 5 6 // t = 10
        Arrays.sort(arr);
        int[] res = new int[2];
        int s = 0;
        int e = res.length-1;
        while (start<end) {


            if ((arr[start] + arr[end]) == t) {
                res[0] = s;
                res[1] = e;
            } else if ((arr[start] + arr[end]) < t) {
                return TwoPoin(arr, t, start+1, end);
            } else
            return TwoPoin(arr, t, start, end-1);
        }
        return res;
    }
}
*/

//     static int[] TwoPoin(int arr[],int t){
//
//            Arrays.sort(arr);
//            int n = arr.length;
//            for(int i = 0;i<n;) {
////             for(int j=0;j<n;j++) {
//                    if ((arr[i] + arr[n - 1]) == t) {
//                        return new int[]{i, n - 1};
//                    }
//                }
//
//         return new int[]{-1,-1};
//     }


    static int fib(int n){
        if(n==1 && n==2){
            return 1;
        }
        return fib(1)+fib(2);
    }
}



