import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class problems {
    //prime number problem
//    private static void PrintSubarrays(int []C){
//        int [] arr = new int[3];
//        int count = 0;
//        for(int i = 0; i<C.length-2; i++){
//            count= 0;
//            for (int j=i; j<=i+2;j++){
//                arr[count++] = C[j];
//            }
//            System.out.println(Arrays.toString(arr));
//        }
    //}


    // rectangle pattern problem
//    public static void main(String []args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i= 1; i <= n; i++){
//            for (int j=0; j<=n-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i= 1; i <= n; i++){
//            for (int j=1; j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//    }
//    public static void main(String[]args){
//
//
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        System.out.println("*");
//        for(int i=3; i<=N; i++){
//            for(int j=1; j<=i; j++){
//                if (j==1 || j==i){
//                    System.out.print("*");
//                }
//                else  {
//                    System.out.print("&");
//                }
//            }
//            System.out.println();
//        }
//        for (int k = 0; k<=N; k++){
//            System.out.print("*");
//        }
//        System.out.println();
//    }


//    Problem Statement
//    Ajay and Raj play a game in which they choose a number each time.
//    If the chosen number lies between 100 and 150 (both are inclusive) then Raj is the winner
//    else if our chosen number lies between 151 and 180 (both are inclusive) then Ajay is the winner.
//    Otherwise, they got the wrong verdict.
//            Input
//    First line contain a single number x.
//            Output
//    If either Ajay or Raj wins the game print parity of chosen number and their winner. Else print "Wrong".
//    Example
//    Sample Input 1:
//            120
//
//    Sample Output 1:
//    EvenRaj
//
//
//    Sample Input 2:
//            179
//
//    Sample Output 2:
//    OddAjay

//    static boolean isEven(int n)
//    {
//
//        // n^1 is n+1, then even, else odd
//        if (n%2==0)
//            return true;
//        else
//            return false;
//    }
//    public static void main (String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if (n >= 100 && n <= 150) {
//            System.out.print(isEven(n) == true ? "EvenRaj" : "OddRaj");
//        }
//        else if (n >= 151 && n <= 180) {
//            System.out.print(isEven(n) == true ? "EvenAjay" : "OddAjay" );
//        }else {
//            System.out.println("Wrong");
//        }
//
//    }


//static int countSetBits(int n)
//{
//    int count = 0;
//    while (n > 0) {
//        count += n & 1;
//        n >>= 1;
//    }
//    return count;
//}
//
//
//    // driver program
//
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        if(countSetBits(i)% 2 == 0){
//            System.out.println("yes");
//        }else {
//            System.out.println("No");
//        }
//
//    }
//
//static int countSetBits(int n)
//{
//    int count = 0;
//    while (n > 0) {
//        count += n & 1;
//        n >>= 1;
//    }
//    return count;
//}
//
//
//    // driver program
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        if(countSetBits(i)% 2 == 0){
//            System.out.println("Yes");
//        }else {
//            System.out.println("No");
//        }
//
//    }
//}


    /*Problem Statement
    Al is given task to build a skyscraper of N floors.
    He can build 2**i (2 to the power i, where i can be any non-negative integer) floors in one day.
    Report the minimum number of days required to build the skyscraper.
            Input
    First and only line of input contains a single integer N.

            Constraints :
            1 <= N <= 1000000000000
    Output
    Print a single integer, the minimum number of days required to build the skyscraper.
            Example
    Sample Input:
            5

    Sample Output:
            2

    Sample Input:
            1

    Sample Output:
            1*/

    //    public static void main (String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(Math.pow(a,2));
//    }





   /* Problem Statement
    Myra has x red colour balls and y blue colour balls. She wants to distribute these balls into identical groups
    without any balls left. What is the largest number of groups she can make?

    Identical groups mean there are equal number of same coloured balls in each group.
    Input
    A single line containing two integers x and y.

            Constraints:
            1<=x, y<=10000000
    Output
    Return the largest number of groups that can be made.
    Example
    Sample Input
3 9

    Sample Output
3

    Explanation:-
            1 red ball and 3 blue ball will be in each group.

    Sample Input:
            4 9

    Sample Output:
            1


        // Function to return the
        // value of ncr effectively
        static int ncr(int n, int r)
        {

            // Initialize the answer
            int ans = 1;

            for (int i = 1; i <= r; i += 1)
            {

                // Divide simultaneously by
                // i to avoid overflow
                ans *= (n - r + i);
                ans /= i;
            }
            return ans;
        }

        // Function to return the number of
        // ways to distribute N identical
        // objects in R distinct objects
        static int NoOfDistributions(int N, int R)
        {
            return ncr(N - 1, R - 1);
        }

        // Driver code
        public static void main (String[] args)
        {

            int N = 3;
            int R = 78;

            System.out.println(NoOfDistributions(N, R));
        }
    } */


//    Enter 3 numbers from the user & make a function to print their average.

//public static int NumAverage(int a, int b, int c){
//    int avg = (a+b+c)/3;
//    return avg;
//}
//public static void main(String[]args){
//    Scanner sc = new Scanner(System.in);
//
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc.nextInt();
//
//    int avg = NumAverage(a,b,c);
//    System.out.println(avg);
//
//}
//}


    //    Write a function to print the sum of all odd numbers from 1 to n.
//    public static void main (String []args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i =0; i<=n; i++){
//            if(n%2 != 0){
//                System.out.println(i++);
//            }
//        }
//
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for (int i = 1; i <= n; i++) {
//            System.out.print(SumOfOdd(n) = true ? );
//        }
//    }


    // Java program for the above approach


    // Function to check if right-angled
// triangle can be formed by the
// given coordinates
//        static void checkRightAngled(int X1, int Y1,
//                                     int X2, int Y2,
//                                     int X3, int Y3)
//        {
//
//            // Calculate the sides
//            int A = (int)Math.pow((X2 - X1), 2) +
//                    (int)Math.pow((Y2 - Y1), 2);
//
//            int B = (int)Math.pow((X3 - X2), 2) +
//                    (int)Math.pow((Y3 - Y2), 2);
//
//            int C = (int)Math.pow((X3 - X1), 2) +
//                    (int)Math.pow((Y3 - Y1), 2);
//
//            // Check Pythagoras Formula
//            if ((A > 0 && B > 0 && C > 0) &&
//                    (A == (B + C) || B == (A + C) ||
//                            C == (A + B)))
//                System.out.println("Yes");
//            else
//                System.out.println("No");
//        }
//
//        // Driver Code
//        public static void main(String s[])
//        {
//            Scanner sc = new Scanner(System.in);
//
//            int X1 = sc.nextInt();
//            int Y1 = sc.nextInt();
//            int X2 = sc.nextInt();
//            int Y2 = sc.nextInt();
//            int X3 = sc.nextInt();
//            int Y3 = sc.nextInt();
//
//            checkRightAngled(X1, Y1, X2, Y2, X3, Y3);
//        }


/* import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void CheckRightAngle(int Ax, int Ay,
									int Bx,int By,
									int Cx,int Cy)
	{
     //Calculate the size
	int A = (int)Math.pow((Bx - Ax), 2)+
	 		(int)Math.pow((By - Ay), 2);
	int B = (int)Math.pow((Cx - Bx), 2)+
	 		(int)Math.pow((Cy - By), 2);
	int C = (int)Math.pow((Cx - Ax), 2)+
	 		(int)Math.pow((Cy - Ay), 2);
	if(A<0 && B<0 && C<0 &&
		(A ==(B+C) || B == (A+C) || C == (A+B))){
			System.out.println("yes");
		}else
		System.out.println("No");
	}
	 public static void main(String args[])
        {
			Scanner scc = new Scanner(System.in);

            int Ax = scc.nextInt();
			int Ay = scc.nextInt();
            int Bx = scc.nextInt();
			int By = scc.nextInt();
            int Cx = scc.nextInt();
			int Cy = scc.nextInt();

            CheckRightAngle(Ax, Ay, Bx, By, Cx, Cy);
        }
} */

//public static void main(String args []) throws IOException{
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    int t = Integer.parseInt(br.readLine());
//    while (t-- >0){
//        int n = Integer.parseInt(br.readLine());
//        int max,max2,max3;
//        max3 = max2 = max = -1;
//        int x=0;
//        String [] str = br.readLine().trim().split( " ");
//        for (int i = 0; i < n; i++) {
//            x =Integer.parseInt(str[i]);
//            if (x > max) {
//                max3 = max2;
//                max2 = max;
//                max = x;
//            } else if (x > max2) {
//                max3 = max2;
//                max2 = x;
//            } else if (x > max3)
//                max3 = x;
//        }
//        System.out.println(max + " " + max2 + " " + max3);
//
//    }
////}
//public static void main(String [] args){
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int a[]  = new int[n];
//    for(int i=1; i<a.length; i++){
//        a[i]  = sc.nextInt();
//    }
//    int sum1 = 0;
//    for(int i= 1; i<a.length; i++){
//        sum1= sum1+a[i];
//    }
//    int sum2 = 0;
//    for(int i= 1; i<n; i++){
//        sum2= sum2+i;
//    }
//    System.out.println(sum2-sum1);
//
//
//
//}
//Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();
//    int b = sc.nextInt();
//    int c = sc.nextInt();
////	   int n = Math.max(a,b);
////       int m = Math.max(c,n);
////    System.out.println(m);// Your code here
//}
//    static boolean EqualOrNot(int h1, int h2, int v1,int v2){
//        int a = h1+v1;
//        int b = h2+v2;
//        if(a==b){
//            System.out.println("Yes");
//        }else
//            System.out.println("No");
//        return ();
//
////Enter your code here
//    }
public static void main (String[] args) {
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int target = sc.nextInt();
//    int []arr = new int[n];
//    for(int i =0; i<n;i++){
//        arr[i] = sc.nextInt();
//    }
//    int IndexValue = findSearch(arr,target);
//    System.out.println("Tha index value is " + IndexValue);
//}
//    public static int findSearch(int []arr , int target){
//        int start = 0;
//        int end  = arr.length-1;
//        int m = arr.length;
//        for(int i=0;i<m;i++){
//            int minIndex = i;
//            for(int j=i+1; j<m;j++){
//                if(arr[j]<arr[minIndex]){
//                    minIndex=j;
//                }
//            }
//            if(i != minIndex){
//                int temp = arr[i];
//                arr[i]=arr[minIndex];
//                arr[minIndex]= temp;
//            }
//        }
//        while(start<end){
//            int mid = start+ (end-start)/2;
//            if(arr[mid]==target){
//                return mid;
//            }
//            else if(arr[mid]<target)
//            {
//                start = mid +1;
//            }
//            else{
//                end = mid-1;
//            }
//        }
//        return -1;
//    }
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
//    int target = sc.nextInt();
//    int []arr = new int[n];
//    for(int i =0; i<n;i++){
//        arr[i] = sc.nextInt();
//    }
//    int answer =  findSearch(arr,target);
//    System.out.println("the output index is"+answer);
//}
//    static int findSearch(int []arr , int target){
//        int startP = 0;
//        int endP = arr.length - 1;
//
//        while (startP < endP) {
//
//            int mid = (startP + endP) / 2;
//
//            if (arr[mid] == target) {
//                return mid;
//            } else if (arr[mid] < target) {
//                startP = mid + 1;
//            } else {
//                endP = mid - 1;
//            }
//
//        }
//        return -1;
//        int start = 0;
//        int end  = ar.length-1;
////        int temp = -1;
//        while(start<end)
//        {
//            int mid = start+(end-start)/2;
//            if(ar[mid]==target){
//                return mid;
//            }
//
//        }
//        return -1;
//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//   for(int j=1;j<=t;j++) {
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//
//
//    int answer = CheckArray(nums,n,t);
//    System.out.println(answer);
//   }
//}
//
//    static int CheckArray(int nums[], int n, int t){
//        int a = nums.length;
//        int s = 0;
//        int e = a-1;
//        boolean mi = false;
//        while(s<=e){
//            int mid = s + (e-s)/2;
//            int previous = (mid-1 + n)%n;
//            int next = (mid+1)%n;
//            if(nums[mid]<nums[next] && nums[mid]< nums[previous]){
//                System.out.println("Yes");
//                break;
//            }else if(nums[mid]>=nums[s] && nums[mid]>= nums[e]){
//                s = mid +1;
//            }else{
//                e = mid - 1;
//            }
//        }
//        return -1;
//    }


    //Find the x in sorted array
//    Scanner sc = new Scanner(System.in);
//    int tc = sc.nextInt();
//
//    while(tc-->0) {
//        int n = sc.nextInt();
//        int x = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
////        boolean found = false;
//        for (int i = 0; i <= n; i++) {
//            if (arr[i] == x) {
//                System.out.print(i + " ");
//            }
//            else {
//                System.out.println("Not found");
//            }
//        }
//    }
//}}


//    // check if array is sorted or not
//    Scanner sc = new Scanner(System.in);
//    int t = sc.nextInt();
//    while(t-->0) {
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//
//
//        int a = nums.length;
//        int s = 0;
//        int e = a-1;
//        while(s<e){
//            int mid = s + (e-s)/2;
//            int previous = (mid-1 + n)%n;
//            int next = (mid+1)%n;
//            if(nums[mid]<nums[next] && nums[mid]< nums[previous]){
//                System.out.println("Yes");
//               break;
//            }
//            else
//                if(nums[mid]>=nums[s] && nums[mid]>= nums[e]){
//                s = mid +1;
//                 }
//                else{
//               e = mid - 1;
//
//                break;
//            }
//        }
//        System.out.println("No");
//    }
//} }



/*import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
   while(t-->0) {
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
    int answer = CheckArray(nums,n,t);
    System.out.println(answer);
    if(return == 1){
        Syetem.out.println("yes");
    }else {
        System.out.println("no");
    }
   }
}

    static int CheckArray(int nums[], int n, int t){
        int a = nums.length;
        int s = 0;
        int e = a-1;

        while(s<=e){
            int mid = s + (e-s)/2;
            int previous = (mid-1 + n)%n;
            int next = (mid+1)%n;
            if(nums[mid]<nums[next] && nums[mid]< nums[previous]){
               return 1;
            }else if(nums[mid]>=nums[s] && nums[mid]>= nums[e]){
                s = mid +1;
            }else{
                e = mid - 1;
            }
        }
        return -1;
    }
}*/

    Scanner sc = new Scanner(System.in);

    int []arrA = {1,2,8,7,5};
    int []arrB = {6,3,4,9,10};
    merge(arrA,arrB);
//    int n = sc.nextInt();
//
//    while (n--> 0) {
//        int m = sc.nextInt();
//       int [] arrA = new int[m];
//        for (int i = 0; i < arrA.length; i++) {
//            arrA[i] = sc.nextInt();
//        }
//       int [] arrB = new int[m];
//        for (int j = 0; j < arrB.length; j++) {
//            arrB[j] = sc.nextInt();
//        }
//        merge(arrA, arrB);
//    }

}

    static void merge(int [] arrA , int arrB []){
        int m = arrA.length;
        int n = arrB.length;
        int l = m + n;
        int []ans = new int[l];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<m && j<n){
            if(arrA[i] < arrB[j]){
                ans[k] = arrA[i];
                i++;
            }else {
                ans[k] = arrB[j];
                j++;
            }
            k++;
        }
        while(i<m){
            ans[k]=arrA[i];
            i++;
            k++;
        }
        while(j<n){
            ans[k]=arrB[j];
            j++;
            k++;
        }
        for(i=0;i<l;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
