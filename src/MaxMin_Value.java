import java.util.*;
public class MaxMin_Value {
    public static void main(String[] args) {
////        int max1 = 0;
////        int max2 = 0;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        int[] arr = {8, 4, 1, 5, 7, 8, 9, 6, 3};
//        for (int element : arr) {
//            if(element<min){
//                min=element;
//            }
//        }
//        for (int element : arr) {
//            if(element>max){
//                max=element;
//            }
//        }
//        System.out.println(min);
//        System.out.println(max);
//    }
//
//    }


/*
            int max1=0;
            int max2=0;
            int max3=0;
            int max4=0;

            int arr[] = { -1,-5,1,2,3,4,5,7};
            int n = arr.length;
            for(int i=0;i<n;i++){
                if(max1<arr[i]){
                    max4=max3;
                    max3=max2;
                    max2=max1;
                    max1=arr[i];
                }else if(max2<arr[i]){
                    max3=max2;
                    max2=max1;
                    max2=arr[i];
                }
                else if(max3<arr[i]){
                    max3=max2;
                    max3=arr[i];
                }else if(max4<arr[i]){
                    max4=arr[i];
                }
            }
            int ans = 0;
            int min1 = n-1;
            int min2 = n-1;
            for(int i =0;i<n;i++){
                if(arr[i]>0 && min1>arr[i]){
                    min2=min1;
                    min1=arr[i];
                }else if(min2>arr[i]){
                    min2 = arr[i];
                }
            }
            System.out.print(max1 + " " + max2 +" "  +max3 +" " + max4+" \nMin value is  "+ min2);
        }

    }
    */


                Scanner sc = new Scanner (System.in);

                int n = sc.nextInt();

                int []a = new int[n];

                for(int i =0;i<n;i++) { //-1 -3 -4 2 3 5 7

                    a[i] = sc.nextInt();

                }

                int j =0;

                int temp = 0;

                for(int i =0;i<a.length;i++){

                    if (a[i]<0){

                        if(i !=j){

                            temp = a[i];

                            a[i] = a[j];

                            a[j] = temp;

                        }

                        j++;

                    }
                    for(int x = 0;x<a.length;x++){
                        System.out.print(a[x] + " ");
                    }


                }

            }

        }

