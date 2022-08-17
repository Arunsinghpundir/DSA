public class reversing {
    public static void main(String[] args) {
        String str = "hey_sir";
        var arr = str.toCharArray();
        int l = arr.length;
        int n = l/2;
        for(var i=0;i<n;i++){
            var temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(var rev : arr){
            System.out.print(rev);
        }
    }
}
