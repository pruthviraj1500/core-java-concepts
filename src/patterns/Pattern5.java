package patterns;

/*

    *
   **
  ***
 ****
*****

 */

public class Pattern5 {

    public static void main(String[] args){

        int n=5;

        for(int i=1; i<=n;i++){
            for(int j=1; j<=n-i; j++){        // for spaces
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){         // for stars
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
