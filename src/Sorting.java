public class Sorting {
    public static void main(String[] args) {


        int[] arr = {1, 3, 5, 7, 9};
        int[] brr = {2, 9, 6};

        merge(arr, brr);

    }

    static void merge(int[]arr,int[]brr){
        int a = arr.length;
        int b = brr.length;
        int l = a+b;
        System.out.println(l);
        int []ans = new int[l];
        int i=0,j=0,k=0;
        while(i<a && j<b){
            if(arr[i]<brr[j]){
                ans[k] = arr[i];
                i++;
            }else{
                ans[k] = brr[j];
                j++;
            }
            k++;
        }
        while(i<a){
            ans[k]=arr[i];
            i++;
            k++;
        }
        while(i<b){
            ans[k]=brr[j];
            j++;
            k++;
        }
        for(int x=0;x<l;x++){
            System.out.print(ans[x]+" ");
        }
    }
}