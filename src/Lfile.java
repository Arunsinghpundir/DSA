
import java.sql.SQLOutput;
import java.util.*;
class Lfile {


    //problem 1
    //find the sum of an array.
    /* public static void main (String[] args) {
         Scanner sc=new Scanner(System.in);
         int n = sc.nextInt();
         float []marks = new float[n];
         for(int i=0;i<n;i++){
             marks[i] = sc.nextFloat();
             System.out.print(marks[i]);
         }
         System.out.print(" = is Marks of the Student and"+"\n");

         float sum = 0;
         for(float total:marks){
             sum = sum + total;
         }
         System.out.println("Total sum of marks is = "+ sum);
     }
 }
 */

    /*
    //problem number 2
    // Find the element in an array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] marks = new float[n];
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextFloat();
        }
        float num = sc.nextFloat();
        boolean isAnArray = false;

        for(float element:marks){
            if(num==element){
                isAnArray = true;
            }
        }
        if(isAnArray){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }

    }
}
*/
   /*
    //problem 3
    //find the average of an array
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        float []marks = new float[n];
        for(int i=0;i<n;i++){
            marks[i] = sc.nextFloat();
            System.out.print(marks[i]+", ");
        }
        System.out.print(" = is Marks of the Student and"+"\n");

        float sum = 0;
        for(float total:marks){
            sum += total;
        }
        System.out.println("Average marks"+ sum/n);
    }

}
*/

    /*
     //problem 4
     //Sum of 2-d array
     public static void main(String[] args) {
         int[][] mat1 = {{1, 2, 3},
                         {3, 2, 1}};
         int[][] mat2 = {{4, 5, 6},
                         {7, 8, 9}};
         int [][]result = {{0,0,0},{0,0,0}};
         for (int i = 0; i < mat1.length;i++){
             for(int j=0;j<mat1[i].length;j++){
                 System.out.format("Storing value i=%d and j=%d \n" ,i,j);
                 result[i][j]= mat1[i][j]-mat2[i][j];
             }
         }
         for (int i = 0; i < mat1.length;i++){
             for(int j=0;j<mat1[i].length;j++){
                 System.out.print(result[i][j]+" ");
             }
         }
     }
 }

     */
/*
    //problem 5
    //Reversing the array
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int l = arr.length;
        int a = (l/2);
        for(int i =0;i<a;i++){
            //swaping method
            int temp = arr[i];
            arr[i]= arr[l-i-1];
            arr[l-i-1]= temp;
        }
        for(int element:arr){
            System.out.print(element+" ");
        }
    }
}
*/
//1,2,3,4,5,6,7,8,9,10
// 1+10/2   ;;; 5.5
    //problem 5.1
    //reversing the array
    public static void main(String[] args) {
//        String str = "newtonschool";
//        var arr = str.toCharArray();
//        int a = arr.length;
//        int n = a/2;
//        for(int i=0;i<n;i++){
//            char temp = arr[i];
//            arr[i] = arr[a-i-1];
//            arr[a-i-1] = temp;
//        }
//        for(char elemt : arr){
//            System.out.print(elemt);
//        }
        String str = "hey_sir";
        var arr = str.toCharArray();
        int l = arr.length;
        int n = l/2;
        for(var i=0;i<n;i++){
            var temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(var rev : arr){
            System.out.print(rev);
        }
    }
}



   /*
    //problem 6
    // Finf the maximum and minimum number of an array
    public static void main(String[] args) {
        int arr[] = {5,4,5,7,8,9,6,5,4,7,8,9,1,5,0,-15,-558,58};
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int element:arr){
            if(element<min){
                min=element;
            }
        }
        for(int element:arr){
            if(element>max){
                max = element;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}

    */

    /*
    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 8, 9, 10, 15};

        int l = arr.length;
        int target = 8;
        int ans = LinearFun(arr, target);
        System.out.println(ans);
    }

    static int LinearFun(int[] arr, int target) {
//            int s = 0;
//            int e = arr.length - 1;
//            while (s <= e) {
//                int mid = s + (e - s) / 2;
//                if (arr[mid] == target) {
//                    return mid;
//                } else if (arr[mid] < target) {
//                    s = mid + 1;
//
//                } else {
//                    e = mid - 1;
//                }
//            }
//            return -1;
//
//        }
    for(int e = 0;e<arr.length;e++){
        if(arr[e]==target){
            return e;
        }
    }
    return -1;
    }

}

     */
//    public static void main(String[] args) {
//
//    }
//}
    /*
    //problem 7
    //Is array is soreted or not?ascending order
    public static void main(String[] args) {
    int arr[] = {1,2,4,5,6,11,8,9};
    int l = arr.length;
    boolean IsArray= true;
    for(int i=0;i<l-1;i++){
        if(arr[i]>arr[i+1]){
            IsArray = false;

        }

    }
        if(IsArray){
            System.out.println("Sorted");
        }else{
            System.out.println("Not sorted");
        }
    }
}

     */


    //Bubble Sort

//    static void Printarr(int[]arr){
//        for(int i =0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {11,8,7,9,5,2,1,4,5};
//        int l = arr.length;
//        for(int pre :arr){
//            System.out.print(pre+" ");
//        }
//        System.out.println();
//        for(int i = 0;i<l-1;i++){
//            int small = i;
//            for(int j = i+1;j<l;j++){
//                if(arr[small]> arr[j]){
//                    small = j;
//                }
//            }
//            //swap
//            int temp = arr[small];
//            arr[small] = arr[i];
//            arr[i] = temp;
//        }
////        for(int i=0;i<l-1;i++){
////            for(int j =0;j<l-i-1;j++){
////                if(arr[j]>arr[j+1]){
////                    //swap
////                    int temp = arr[j];
////                    arr[j] = arr[j+1];
////                    arr[j+1] = temp;
////                }
////            }
////        }
//        Printarr(arr);
//}
//}



/*
    public static void main(String[] args) {
        int arr[] = {11, 8, 7, 9, 5, 2, 1, 4, 5};
        int l = arr.length;
//        boolean isArray = true;
        int max = Integer.MIN_VALUE;
        for (int element :arr) {
             if(element>max)
                max = element;
            }
        System.out.println(max);
        }

 */
//        if(isArray){
//            System.out.println("sorted");
//        }else{
//            System.out.println("no");
//        }


/*
        //insertion sort
        for(int i=0;i<l;i++){
        int c = arr[i];
        int j = i-1;
        while(j>=0 && c<arr[j]{
        arr[j+1] = arr[j]
        j--;}
        arr[j+1] = c

               for(int i=0;i<l;i++){
            int c = arr[i];
            int j = i-1;
            while(j>=0 && c<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //placement
            arr[j+1] = c;
        }

 */
        /* // selection
        for(int i = 0;i<l-1;i++){
            int small = i;
            for(int j = i+1;j<l;j++){
                if(arr[small]> arr[j]){
                    small = j;
                }
            }
            //swap
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }

    Printarr(arr);
    }
}

         */
//import java.io.*; // for handling input/output
//        import java.util.*; // contains Collections framework
//class Main {

    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        countFreq(a,n);
    }
    static void countFreq(int a[],int n){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey((a[i]))){
                hm.put(a[i],hm.get(a[i]+1));
            }else {
                hm.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer>val:hm.entrySet()){
            System.out.println(val.getKey()+" "+val.getValue());
        }
//        HashMap<Integer,Integer>map =new HashMap<>();
//        for(int i =0;i<n;i++){
//            if(map.containsKey(a[i])){
//                map.put(a[i],map.get(a[i])+1);
//            }else{
//                map.put(a[i],1);
//            }
//        }
//        for(Map.Entry<Integer,Integer>val: map.entrySet()){
//            System.out.println(val.getKey() + " " + val.getValue());
//
//        }
    }
}

     */