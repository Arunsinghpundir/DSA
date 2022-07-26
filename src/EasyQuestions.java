import java.util.Scanner;
import java.util.*;
public class EasyQuestions{
    public static void main (String[] args){
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

        int arr[]={1,7,8,8,7,5,7,7,5,6,9,9,5,6,1,2,3,4,5,6,10,4,7,4,7,8,5,4,7,8,4,5,8,7,4,5,8,11};
        int l = arr.length;
        int temp =0;
        int brr[] = new int[l];

        for(int i=0;i<l;i++){
            for(int j=0;j<l-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(int i = 0;i<l;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();

        for(int i=0;i<l;i++){
            brr[arr[i]]++;
        }
        for(int i =0;i<l;i++){
            if(brr[arr[i]]!=0){
                System.out.print(arr[i]+" ");
                brr[arr[i]]=0;
            }
        }
        }
    }
