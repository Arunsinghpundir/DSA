//Dutch Flag algo, which can be used to sort an array of 0s, 1s and 2s in O(n) TC. In this algo we use 2 or more pointer to sort an array.
// here i'am using three pointer approach to solve this problem (here iam shifting negative integer at left side and positive integer at right side).
public class Main
{
	public static void main(String[] args) {
		int [] arr = {-2,5,-4,2,7,5,3,8,-4,-7};
		int n = arr.length;
		int i = 0;
		int j = 0;
		int k = n-1;
		while(j<=k){
		  if(arr[j]==0){
		    j++;
		  }
		  else if(arr[j]<0){
		    int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j] = temp;
		    i++;
		    j++;
		  }else if(arr[j]>0){
		    int  temp = arr[k];
		    arr[k] = arr[j];
		    arr[j]= temp;
		    k--;
		  }
		}
		for(int a:arr){
		  System.out.print(a+" ");
		}
	}
	
	//sort the color ....output = W B R
	char[] arr= { 'W' ,'R','B','B','R','W','B','R','R','W','W','R'};  
        var i = 0;
        var j = 0;
        var k = arr.length-1;
        while(j<=k){
            if(arr[j]=='B'){
                j++;
            }
            else if(arr[j]=='W'){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
                i++;
            }else {
                char  temp = arr[k];
                arr[k] = arr[j];
                arr[j]= temp;
                k--;
            }
        }
        for(int a=0;a<arr.length;a++){
            System.out.print(arr[a]+" ");
        }

}
