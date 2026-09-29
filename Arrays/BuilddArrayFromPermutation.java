import java.util.*;
public class BuilddArrayFromPermutation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        for(int j=0;j<n;j++){
            int k=nums[j];
            ans[j]=nums[k];
        }
System.out.println("The new array is: ");
for(int i=0;i<n;i++){
    System.out.print(ans[i]+" ");
}
sc.close();
    }
}
