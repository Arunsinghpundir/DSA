import java.util.HashMap;

public class Hashing {
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
        for(int j = 0;j<arr.length;j++){
            int arun = target-arr[j];
            if(Map.containsKey(arun)){
                return new int[] {j,Map.get(arun)};
            }
        }

        return new int[] {-1,-1};
    }

}
