package string_problems;

public class Longest_Common_Prefix {

    public static void main(String[] args){

        String [] strs = {"cat","cable","camera"};
        String prefix = findLOngestCommonPrefix(strs);
        System.out.println("The longest common prefix is : "+prefix);
    }

    public static String findLOngestCommonPrefix(String[] strs) {

        String lcp = strs[0];
        for(int i=1; i<=strs.length-1; i++){
            String currentWord = strs[i];
            int j=0;

            while(j < currentWord.length() && j < lcp.length() && currentWord.charAt(j) == lcp.charAt(j)){
                j++;
            }
            if(j == 0){
                return "";
            }
            lcp = currentWord.substring(0,j);
        }
        return lcp;
    }
}
