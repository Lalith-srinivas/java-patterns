import java.util.Scanner;

public class lefttriangle {
     public static void main(String[] args){
    Scanner num = new Scanner(System.in);
        int i=0,j=0;
        System.out.print("Enter a number:");
        int number=num.nextInt();
        int star=0;
        for(i=0;i<number;i++){
            for(j=0;j<=star;j++){
            System.out.print("* ");
            }
            star++;
            System.out.print("\n");
        }
    }
}
