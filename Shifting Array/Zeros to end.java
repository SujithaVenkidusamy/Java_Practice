import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
            int temp=arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
            index++;   
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
