import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringVowels {
    public String insertString(String string) {
        if (string.length() == 0){
            return "null";
        }

        StringBuffer stringBuffer = new StringBuffer(string);
        String stringBuffertemp = string;
        Boolean flag = true;

        while (flag){
            for (int i = 0; i < string.length(); i++) {
                if(isVowel(string.charAt(i)) && string.charAt(i) == string.charAt(i+1) &&isLengthMoreThan30Percentage(string)){
                    stringBuffer.insert(i+1,"mommy");
                    stringBuffertemp = stringBuffertemp.substring(0, i) + stringBuffertemp.substring(i + 1);
                }

            }
            for (int i = 1; i < stringBuffertemp.length()-1; i++) {
                if (isVowel(stringBuffertemp.charAt(i)) && stringBuffertemp.charAt(i) == stringBuffertemp.charAt(i+1) &&isLengthMoreThan30Percentage(stringBuffertemp)){
                    flag = true;
                }

                flag = false;
            }

        }
//        for (int i = 0; i < string.length(); i++) {
//            if(isVowel(string.charAt(i)) && string.charAt(i) == string.charAt(i+1) &&isLengthMoreThan30Percentage(string)){
//                stringBuffer.insert(i+1,"mommy");
//            }
//
//        }




        return stringBuffer.toString();
    }

    private boolean isLengthMoreThan30Percentage(String string) {
        int countTheSameVowelOfSuccessful = 1;
        for (int i = 0; i < string.length(); i++) {
            if(isVowel(string.charAt(i)) && string.charAt(i) == string.charAt(i+1)){
                countTheSameVowelOfSuccessful++;
            }
        }
        return countTheSameVowelOfSuccessful > string.length()*0.3? true:false;
    }

    private boolean isVowel(char c) {
        if(c == 'a' || c == 'e'||c == 'i' || c == 'o'|| c == 'u'){
            return true;
        }
        return false;
    }
}
