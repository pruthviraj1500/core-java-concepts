package string_problems;

public class Valid_Anagram {

    public static void main(String[] args){

        String str1= "car";
        String str2= "rac";

        boolean isAnagram = checkAnagram(str1, str2);

        if(isAnagram){
            System.out.println("Valid Anagram");
        }else{
            System.out.println("Not a valid Anagram");
        }

    }

    public static boolean checkAnagram(String str1, String str2){

        if(str1.length() != str2.length()){
            return false;
        }

        int[] counrArr = new int[26];

        for(int i=0; i<str1.length(); i++){

            // Increamenting character count of str1
            counrArr[str1.charAt(i) - 'a']++;

            // Decreamenting character count of str2
            counrArr[str2.charAt(i) - 'a']--;

        }
        for(int i=0; i<counrArr.length; i++){
            if(counrArr[i] != 0){
                return false;
            }
        }
        return true;
    }
}
