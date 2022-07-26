import java.util.*;

public class Loops {
   // public static void main (String[]args){
////        Scanner sc=new Scanner(System.in);
////        int n= sc.nextInt();
//        int sum=2;
//        for (int i=1; i<=11; i++){
//           sum= sum * 2;
//        }
//        System.out.println(sum);
//    }
//}
//        Scanner scan = new Scanner(System.in);{
//        int i = scan.nextInt();
//        Double d = scan.nextDouble();
//        String  s = scan.nextLine();
//
//
//
//
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);}
//    }
//}


            // function which checks whether a number is Prime or Not
            // If the number is prime, it returns true. Else, it returns false.









//            public static boolean isPrime(int n) {
//
//                if (n == 0 || n == 1) {
//                    return false;
//                }
//
//                if (n == 2) {
//                    return true;
//                }
//                for (int i = 2; i * i <= n; i++) {
//                    if (n % i == 0) {
//                        return false;
//                    }
//                }
//                return true;
//
//            }
//            public static void main(String[] args) {
//                Scanner sc = new Scanner(System.in);
//
//                int N = sc.nextInt();
//
//                int M = sc.nextInt();
//                System.out.printf("\nPrime numbers between %d and %d are: ", N, M);
//
//
//                for (int i = N; i <= M; i++) {
//                    if (isPrime(i)) {
//                        System.out.printf(i +" ");
//                    }
//                }
//                sc.close();
//            }
//        }
public static boolean check_prime(int n) {

    if (n == 0 || n == 1) {
        return false;
    }

    if (n == 2) {
        return true;
    }
    for (int i = 2; i * i <= n; i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;

}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int M = sc.nextInt();
        System.out.printf("\nPrime numbers between %d and %d are: ", N, M);

        int temp= 0;
        for (int i = N; i <= M; i++) {
            if (check_prime(i)) {
                temp= temp +1 ;

                System.out.print(temp-i);
            }
        }
        sc.close();
    }
}

