import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int k=sc.nextInt();
        if(k<=0||k>arr.length){
            System.out.print("Invalid K value");
        }
        int result[]=new int[n];
        System.arraycopy(arr,k,result,0,arr.length-k);
        System.arraycopy(arr,0,result,arr.length-k,k);
        System.out.println(Arrays.toString(result));
        
    }
}
