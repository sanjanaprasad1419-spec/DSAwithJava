import java.util.Scanner;
public class ShuffleTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[2*n];
        int ans[]=new int[2*n];

        for(int i=0;i<2*n;i++){
            nums[i]=sc.nextInt();
        }
        
        int x=0;
        int y=n;

        for(int i=0;i<2*n;i+=2){
            ans[i]=nums[x];
            ans[i+1]=nums[y];
            x++;
            y++;
        }
        System.out.println("Shuffled Array is: ");
        for(int i=0;i<2*n;i++){
            System.out.print(ans[i]+ " ");
        }
        sc.close();
    }
}
