import java.util.*;
//using two pointer approach tc is nlogn becasue we use sort function, best tc is O(n) if array is already sorted;
class Main{
  
  public static void main (String[] args) {
    int []arr = {2,10,4,5,8,6,9}; 
    int x = 15;
    if(!check(arr,x)){
      System.out.println("not found");
    }
  }
  static boolean check(int[]arr,int x){
    Arrays.sort(arr);
    for(int e:arr){
      System.out.print(e+" ");
    }
    System.out.println();
    int s=0;
    int e = arr.length-1;
    
    while(s<=e){
      if(arr[s]+arr[e]==x){
        System.out.println(s+" "+e);
        return true;
      }else if(arr[s]+arr[e]<x){
        s++;
      }else{
        e--;
      }
    }
    return false;
    }
}
