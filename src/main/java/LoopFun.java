import java.util.ArrayList;

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int fact = 1;
          for (int i = 1; i <= number; i++) {fact = fact * i;}
          return fact;

         // return (number == 1 ) || (number == 0 ) ? 1: number*factorial(number-1);
            // if its true, it runs as number = 1. This can be dangerous
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
            
          String[] words = phrase.split("\\W+");
          String output = ""; // this is sloppy coding
          for (int i = 0; i <words.length; i++) {
              // System.out.println(words[i]); // tests if words are being split
              output += words[i].charAt(0);

          }

          return output.toUpperCase();
          /*
          char c = phrase.charAt(0);
          String output = phrase;
          String OutPut = null;
          for (int i = 1; i < phrase.length(); i++) {
              if (Character.isWhitespace(phrase.charAt(i))) {
                  output = output + phrase.charAt(i);
                  output += phrase.charAt(i+1);
              }
              OutPut = output.replaceAll("\\s+","").toUpperCase();
          }

        return OutPut;
        */
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          char[] pass = word.toCharArray();
          int shiftVal = 3;
          for (int i = 0; i < word.length(); i++) {
              if (pass[i] >= 120) {
                  pass[i] -= 23;

              } else {
                  pass[i] += shiftVal;
              }
          }
          String password = new String(pass);
          return password;
      }
}
