import java.util.Scanner;

public class Searching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the Array : ");
        int size = input.nextInt();

        int []arr = new int[size];
        System.out.println("Enter the array elements : ");
        for(int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }


        System.out.println("Enter the target value");
        int target = input.nextInt();


        System.out.println("Index of an array is = ");
        for(var i=0;i<size;i++){
           if(arr[i]<arr[i+1]){
              int ans = BinarySearch(arr,target,size);
               System.out.println(ans);
               break;
           }else if(arr[i]>arr[i+1]){
               int res = search(arr,target,size);
               System.out.println(res);
           }
        }
    }
    static int search(int []arr, int target,int size) {  // O(n)
        for (int i = 0; i < size; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    static int BinarySearch(int []arr,int target, int size){
        //1, 2, 4, 5, 7, 8, 8  // 7-1
        int start = 0;
        int end = size-1;
        while(start<=end){
             int mid = (start+end)/2;
             if(arr[mid]==target) {
                 return mid;
             }
             else if(arr[mid]>target) {
                 end = mid - 1;
             }
             else {
                 start = mid + 1;
             }
        }
        return -1;
    }
}

