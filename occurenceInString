
/* Given two strings, one is a text string, txt and other is a pattern string, pat. 
The task is to print the indexes of all the occurences of pattern string in the text string. 
For printing, Starting Index of a string should be taken as 1.
Input:
txt = "batmanandrobinarebat", pat = "bat"
Output: 1 18
Explanation: The string "bat" occurs twice
in txt, one starts are index 1 and the other
at index 18.*/

public class Main
{
	public static void main(String[] args) {
	    String txt = "batmanandrobinarebat";
	    String pat = "bat";
	    int []arr = occurence(txt,pat);
	    for(int i:arr){
	        System.out.print(i+" ");
	    }
	}
	static int[] occurence(String txt,String pat){
	    int l1 = pat.length();
	    int l2 = txt.length();
	    int i=0,j=0;
	    for( i=0;i<=l2-l1;i++){
	        for(j=0;j<l1;j++){
	            if(txt.charAt(i+j)!=pat.charAt(j)){
	                break;
	            }
	        }
	        if(j==l1)
	        j=0;
	    }
	    return new int[] {j,i};
	}
}
