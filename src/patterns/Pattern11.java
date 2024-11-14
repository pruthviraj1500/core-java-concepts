package patterns;
/*

     *****
    *****
   *****
  *****
 *****

 */
public class Pattern11 {

    public static void main(String[] args){

        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){         // For spaces
                System.out.print(" ");
            }

            for(int k=1; k<=n; k++){          // For star
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
