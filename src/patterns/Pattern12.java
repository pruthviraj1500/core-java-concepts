package patterns;

/*

    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5

 */

public class Pattern12 {

    public static void main(String[] args){
        int n=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){        //For spaces
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){         //For number print
                System.out.print(i+" ");
            }
            System.out.println();
        }

    }

}
