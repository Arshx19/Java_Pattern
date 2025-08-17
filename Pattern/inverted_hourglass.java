import java.util.Scanner;

public class inverted_hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int row=1;
        int star=1;
        int space=2*n-1;
        while(row<=2*n+1){
            int val=n;
            int i=1;
            while(i<=star){
                System.out.print(val+"\t");
                val--;
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("\t");
                j++;
            }
            int k=1;
            if(row==n+1)
            {
                k=2;
                val++;
            }
            
            while(k<=star){
                val++;
                System.out.print(val+"\t");
                k++;
            }
            if(row<=n){
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;

            }
            row++;
            System.out.println();
        }
    }
}
