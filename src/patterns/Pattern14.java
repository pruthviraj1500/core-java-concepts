package patterns;

/*

    *
   ***
  *****
 *******
 *******
  *****
   ***
    *

 */

public class Pattern14 {

    public static void main(String[] args){

        int n=4;

        for(int i=1; i<=n; i++){                // For Upper part
            for(int j=1; j<=n-i; j++){          // For spaces
                System.out.print(" ");
            }

            for(int k=i; k>=1; k--){            // for left stars
                System.out.print("*");
            }

            for(int l=2; l<i+1; l++){           // for right stars
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i=n; i>=1; i--){                // for lower part
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int k=i; k>=1; k--){
                System.out.print("*");
            }

            for(int l=2; l<i+1; l++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
