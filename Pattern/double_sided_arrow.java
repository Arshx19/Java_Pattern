import java.util.Scanner;

public class double_sided_arrow {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int rows=1;
    int space=n-1;
    int space1=-1;
    int star=1;
    while(rows<=n){
        int val=star;
        int i=1;
        while(i<=space){
            System.out.print("  ");
            i++;
        }
        int j=1;
        while (j<=star) {
            System.out.print(val+" ");
            val--;
            j++;
        }
        int k=1;
        while(k<=space1){
            System.out.print("  ");
            k++;
        }
        
        int l=1;
        int val1=1;
        if(rows==1){
            l=2;
        }
        if(rows==n){
            l=2;
        }
        while(l<=star){
            System.out.print(val1+ " ");
            val1++;
            l++;
        }
        if(rows<n/2+1){
            star++;
            space-=2;
            space1+=2;
        }else{
            star--;
            space+=2;
            space1-=2;
        }
        rows++;
        System.out.println();  
    }
    }    
}
