import java.util.Scanner;

public class hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 2*n-1;
        int space =0;
        int rows=1;
        while(rows<=2*n-1){
            int i=1;
            while(i<=space){
                System.out.print("\t");
                i++;
            }
            int j=1;
            int val=n-1-space;
            while(j<=star){
                System.out.print(val+"\t");
                if(j<=star/2){
                    val--;
                }
                else{
                    val++;
                }
                j++;

            }
            if(rows<n){
                star-=2;
                space++;
            }
            else{
                star+=2;
                space--;
            }
            rows++;
            System.out.println();
        }
        }
}
