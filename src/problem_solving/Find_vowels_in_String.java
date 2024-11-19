package problem_solving;

public class Find_vowels_in_String {

    public static void main(String[] args){

        String str = "pruthviraj";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch);
                    break;
            }
        }
    }
}
