public class palindrome {
    public static void main(String[] args) {
        String str = "123456";
        var s = 0;
        var e = str.length() - 1;
        if(check(str,s,e)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        rev(str);
    }
    static void rev(String str){
        var ch = str.toCharArray();
        int l = ch.length;
        int n = l/2;
        for(var i =0;i<n;i++){
            var temp = ch[i];
            ch[i] = ch[l-i-1];
            ch[l-i-1] = temp;
        }
        for(var e : ch){
            System.out.print(e+" ");
        }
    }
    static boolean check(String str,int s,int e){
        if(s==e){
            return true;
        } else if(str.charAt(s)!=str.charAt(e)){
            return false;
        }
        if(s<e)
            return check(str,s+1,e-1);
            return true;
    }
}
