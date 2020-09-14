import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringVowels {
    public String insertString(String string) {
        if (string.length() == 0){
            return "null";
        }
        Pattern patternOfVowelsInSuccession = Pattern.compile("[aeiouAEIOU]+");
        Matcher matcherOfVowelsInSuccession = patternOfVowelsInSuccession.matcher(string);
        if ( !string.matches(String.valueOf(patternOfVowelsInSuccession))){
            return string;
        }
        List<Integer> numberOfQualifyingStringsLength = null;
        if(string.matches(String.valueOf(patternOfVowelsInSuccession))) {
            int numberOfQualifyingStrings = matcherOfVowelsInSuccession.groupCount();
            for (int i = 0; i < numberOfQualifyingStrings; i++) {
                int tempNumberOfQualifyingStringsLength = matcherOfVowelsInSuccession.start(i)-matcherOfVowelsInSuccession.end(i);
                numberOfQualifyingStringsLength.add(tempNumberOfQualifyingStringsLength);
            }
        };

        return null;
    }
}
