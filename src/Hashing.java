import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashing {
    /*
    public static void main(String[] args) {


        int[] arr = {1, 5, 7, 8, 9, 4, 5, 8};
        int target = 15;
        Hashing(arr,target);
//        printarr(arr);
    }
        static int[] Hashing(int []arr,int target){
        HashMap<Integer,Integer>Map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            Map.put(arr[i],i);

        }
//        for(int j = 0;j<arr.length;j++){
//            int arun = target-arr[j];
            if(Map.containsKey(target)){
                return new int[] {Map.get()};
//            }
        }

        return new int[] {-1,-1};

        */


    /*
    //key:Employee number
    // Value : Employee name
    Map<Integer,String> map = new HashMap<>();
    map.put(1,"Arun");
    map.put(2,"Shashank");
    map.put(3,"parakh");
    var she = map.containsKey(3); // O(1)
    var he = map.containsValue("Arun");  // O(n)
    map.remove(2);
    map.put(4,null);
    map.remove(4);
    System.out.println(he);
    System.out.println(she);
    System.out.println(map);

    System.out.println();
    for(var i: map.entrySet()){
        System.out.println(i);
    }




// find the first non-repeated integer from the given array

public static void main(String[] args) {
    int[] arr = {4, 7, 7, 2, 3, 4, 3};
    Hashing finder = new Hashing();
    var ans = finder.findNonRepeated(arr);
    System.out.println(ans);
}

public int findNonRepeated(int[] arr) {
    Map<Integer, Integer> map = new HashMap<>();
    var myArr = arr;
    for (var find : myArr) {
        var count = map.containsKey(find) ? map.get(find) : 0;
        map.put(find, count + 1);
    }
    for (var find : myArr) {
        if (map.get(find) == 1)
            return find;
    }
    return Integer.MIN_VALUE;
}

}

*/
    public int Findchar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int res = -1;
//        var ch = str.toCharArray();
//        for (var val : ch) {
//            var count = map.containsKey(val) ? map.get(val) : 0;
//            map.put(val, count + 1);
//        }
        for(int i =0;i<str.length();i++){
             if(map.containsKey(str.charAt(i))){
                 map.put(str.charAt(i),map.get(str.charAt(i))+1);
             }
             else map.put(str.charAt(i),1);
         }
        for(int i=0;i<str.length();i++){
            if(map.get(str.charAt(i))==1)
                res = i;
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        Hashing find = new Hashing();
        var res = find.Findchar("bblovt");
        System.out.println(res);
    }
}





