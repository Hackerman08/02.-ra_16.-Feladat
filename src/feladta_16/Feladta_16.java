
package feladta_16;
import java.util.Scanner;

public class Feladta_16 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
       int[] tomb = new int[5];
                for( int i = 0; i < tomb.length; i++ )
                {
                    int s=0;
                     System.out.println("Számót kérek!!");
                    s=input.nextInt();
                  tomb[i] = s;
                }
                for( int i = 0; i < tomb.length; i++ )
                {
                  System.out.print(tomb[i]+" ");
                }
                System.out.println();
                for (int i = tomb.length-1; i >=0; i--) {
                    System.out.print(tomb[i]+" ");
                }
                System.out.println();
                for (int i = 1; i < tomb.length; i = i+2) {
                    System.out.print(tomb[i]+" ");
                }
                int w=0;
                 System.out.println();
                System.out.println("Válsztók egy számót!!(1-5)");
                    w=input.nextInt();
                    w=w-1;
                System.out.println(tomb[w]);
        
    }
    
}
