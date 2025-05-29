package Aisha;

public class Find_Frequency_Characters {


    public static String findFrequencyOfCharacters(String str){
      String result="";

      while(!str.isEmpty()){
          char ch=str.charAt(0);
          int count=0;
          for (int i = 0; i < str.length(); i++) {
              if(ch==str.charAt(i)){
                  count++;
              }


          }
          result+=ch+String.valueOf(count);

          str=str.replaceAll(String.valueOf(ch), "");
      }
      return result;

    }

    public static void main(String[] args) {

        System.out.println(findFrequencyOfCharacters("AAACCCCDDDD"));

    }



    }

/*
JAVA TASK OF THE WEEK,
1.    String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */