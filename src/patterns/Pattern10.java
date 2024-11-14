package patterns;

/*

 *      *
 **    **
 ***  ***
 ********
 ********
 ***  ***
 **    **
 *      *

 */


public class Pattern10 {

    public static void main(String[] args){
        int n=4;

        for(int i=1; i<=n; i++){                // for Upper part
            for(int j=1; j<=i; j++){            // for first stars
                System.out.print("*");
            }

            int spaces = 2*(n-i);

            for(int j=1; j<=spaces; j++){      // for spaces
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){           // For last stars
                System.out.print("*");
            }

            System.out.println();

        }

        for(int i=n; i>=1; i--){                // For lower part

            for(int j=1; j<=i; j++){            // for first stars..... same logic as upper part
                System.out.print("*");
            }

            int spaces = 2*(n-i);

            for(int j=1; j<=spaces; j++){      // for spaces
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++){           // For last stars
                System.out.print("*");
            }

            System.out.println();

        }

    }

}
