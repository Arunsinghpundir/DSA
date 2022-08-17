import java.util.HashMap;
import java.util.Map;

public class removedublicates {
    /*
    public static int removeDuplicates(int a[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int j = 0;
        for (int i = 0; i < n-1; i++)
            if (a[i] != a[i+1])
                a[j++] = a[i];
                a[j++] = a[n-1];

        return j;
    }

     */
    public static int usingHash(int[]a){
        Map<Integer,Integer> map = new HashMap<>();
        for(var element : a){
            var count = map.containsKey(element) ? map.get(element):0;
             map.put(element,count+1);
        }
//        System.out.println(map);
        for(var e:map.entrySet()){
            System.out.println(e+" ");
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6};
//        int n = a.length;
//        n=removeDuplicates(a, n);
//        for (int i = 0; i < n; i++)
//            System.out.print(a[i] + " ");
//    }
//        removedublicates ans = new removedublicates();
        usingHash(a);
    }
}

