import java.lang.StringBuilder;

public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {

        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String baseVal = baseValue;
        String output = baseVal.concat(valueToBeAdded);
        return output;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        // needed to add stringbuilder, no reason to use a costly for loop
        StringBuilder str = new StringBuilder();
        String input = valueToBeReversed;
        str.append(input);
        str.reverse();
        String output = String.valueOf(str);
        return output;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        char output = word.charAt((word.length())/2);
        return output;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        StringBuilder str = new StringBuilder();
        String input = value;
        int count = 0;
        str.append(input);
        for (int i =0 ; i < value.length(); i++) {
            if ( value.charAt(i) == charToRemove) {
                // output = value.replace(charToRemove.toString(), "");}
                str.deleteCharAt(i-count);
                // str.replace(i,i,"");
                count += 1;
            }
        }
        String output = String.valueOf(str);
        return output;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        //StringBuilder str = new StringBuilder();
        // str.append(sentence);
        return sentence.substring(sentence.lastIndexOf(" ")+1);
        // String output = String.valueOf(str);
    }
}
