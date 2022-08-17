import java.util.Scanner;
import java.util.*;
public class EasyQuestions{

//        int[] array = new int [5];
//        Scanner in = new Scanner (System.in);
//
//        System.out.println("Enter the elements of the array: ");
//        for(int i=0; i<5; i++)
//        {
//            array[i] = in.nextInt();
//        }
//        //Elements in the array are looped one by one using for loop.
//        for(int i=0; i<array.length; i++){
//            boolean isPrime = true;
//            for (int j=2; j<i; j++){
//                if(i%j==0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime)
//                System.out.println(array[i] + " are the prime numbers in the array ");
//        }

       /*
        int n = 2;
        boolean isPrime = true;
        int d = n/2;
        if(n>2) {
            if (n % d == 0) {
                isPrime = false;
            }
        }
            if(isPrime)
                System.out.println("yes");
            else
                System.out.println("No");

        */
/*
        int arr[]={15,41,7,8,6};
        int l = arr.length;
        int max1 = Integer.MIN_VALUE; //-2^31
        int max2 = Integer.MIN_VALUE; //-2^31
        int max3= Integer.MIN_VALUE;
        for(int ele : arr){ //comparing element with array
            if(max1<ele){
                max3=max2;
                max2=max1;
                max1=ele;
            }else if(max2<ele){
                max1=max2;
                max2=ele;
            }else if(max3<ele){
                max3=ele;
            }
        }
        System.out.println(max1);System.out.println(max3);

 */
       public static void main (String[] args) {
        int arr[] = {1, 7, 8, 8, 7, 5, 7, 7, 5, 6, 9, 9, 5, 6, 1, 4, 7, 4, 7, 8, 5, 4, 7, 8, 4, 5, 8, 7, 4, 5, 8, 11};
        int l = arr.length;
        int brr[] = new int[l];
        System.out.print("Given array by user is = \n");
        for(int elent : arr){
            System.out.print(elent+" ");
        }
        char []crr = {'A','r','u','n'};
           System.out.println();
           for(char elet : crr){
               System.out.print(elet);
           }
           int f = 8;// 0 1 1 2 3 5 8 13 21

           int ans = fib(f);
           System.out.println(ans);
        reverseName(crr);
           int [] ab = {2,5,4,7,8};
           int n = crr.length/2;

//           int name = revRec(ab,n,0);
//          for(int ell : ab){
//              System.out.println(ell+" ");
//          }
        Sorting(arr,l);
        removingDublicate(arr,l,brr);
        reverse(arr,l);
        removingDublicate(arr,l,brr);
    }
        static void Sorting(int []arr,int l) {
        int temp = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted array is = ");
        for (int i :arr) {
            System.out.print( i + " ");
        }
        System.out.println();
    }
        static void removingDublicate(int []arr,int l,int brr[]){
            for (int i = 0; i < l; i++) {
                brr[arr[i]]++;
            }
            System.out.println("After removing Dublicates = ");
            for (int i = 0; i < l; i++) {
                if (brr[arr[i]] != 0) {
                    System.out.print( arr[i] + " ");
                    brr[arr[i]] = 0;
                }
            }
        }
        static void reverse(int[]arr,int l){
        int a =l/2;
        for(int i=0;i<a;i++){
            int any = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = any;
        }
        System.out.println();
            System.out.println("Reversed array is =");
        for(int elemnt :arr){
            System.out.print(elemnt+" ");
        }
            System.out.println();
        }
        static void reverseName(char [] crr){
            int a = crr.length;
            int n = Math.floorDiv(a,2);
            for(int i=0;i<n;i++){
                char temp = crr[i];
                crr[i] = crr[a-i-1];
                crr[a-i-1] = temp;
            }
            System.out.println();
            for(char elemt : crr){
                System.out.print(elemt);
            }
        }
        static int fib(int f){
           if(f==0)
               return 0;
           else if(f==1)
               return 1;
           return fib(f-1)+fib(f-2);
        }
        static int revRec(int[] ab,int n,int temp) {
           int i=0;
            while (n >= 0) {
                if(ab[i]<ab[i+1]){
                    return revRec(ab,n,0);
                }else if(ab[i]>ab[i+1]) {
                    return revRec(ab, n, ab[i]);
                }
                return revRec(ab,n,ab[ab.length-i-1]);


            }
            return 0;
        }

    }
