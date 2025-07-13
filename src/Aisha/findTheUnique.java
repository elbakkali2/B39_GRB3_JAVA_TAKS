package Aisha;

import javax.imageio.stream.ImageInputStream;

public class findTheUnique {

    /*
    Find the unique
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */


    public static String findUnique(String str) {

        String result="";

        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            int count=0;


            for(int j=0;j<str.length();j++){
                if(ch==str.charAt(j)){
                    count++;
                }

            }
            if(count==1){
                result+=ch;
            }
        }

        return result;


    }

    public static void main(String[] args) {
        String str="abc";
        System.out.println("findUnique(\"AAABBBCCCDEF\") = " + findUnique("AAABBBCCCDEF"));
        System.out.println("findUnique(\"45nsmmms\") = " + findUnique("45nsmmms"));


    }


}