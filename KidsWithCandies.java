import java.util.*;
public class KidsWithCandies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] candies=new int[n];
        List<Boolean> result= new ArrayList<>();
        int extraCandies=sc.nextInt();
        int max=0;

        for(int i=0;i<n;i++){
            candies[i]=sc.nextInt();
            if(candies[i]>max){
                max=candies[i];
            }
        }
        
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        
        System.out.println("The answer array is: "+result);
        sc.close();
    }
}
