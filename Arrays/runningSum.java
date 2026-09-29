import java.util.*;
public class runningSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;

        //creating new array
        int[] nums=new int[n];

        //taking user input in the array
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        for(int j=0;j<n;j++){
            sum+=nums[j];
            nums[j]=sum;
        }

        System.out.println("The running Sum of the given array is: ");
        for(int i=0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}