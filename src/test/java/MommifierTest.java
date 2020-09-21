import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {
    @Test
    void should_return_null_when_string_is_null(){
        //given
        StringVowels stringVowels = new StringVowels();
        String stringIsNull = "";
        //when
        String result = stringVowels.insertString(stringIsNull);
        //Then
        assertEquals("null",result);

    }

    @Test
    void should_return_itself_when_string_not_contains_vowels(){
        //given
        StringVowels stringVowels = new StringVowels();
        String stringIs = "qqst";
        //when
        String result = stringVowels.insertString(stringIs);
        //Then
        assertEquals("qqst",result);
    }

    @Test
    void should_return_itself_when_string_contains_vowels_not_continuously(){
        //given
        StringVowels stringVowels = new StringVowels();
        String stringIs = "testatest";
        //when
        String result = stringVowels.insertString(stringIs);
        //Then
        assertEquals("testatest",result);
    }


//    @Test
//    void should_return_itself_when_string_contains_vowels_continuously_lenght_more_percentage30(){
//        //given
//        StringVowels stringVowels = new StringVowels();
//        String stringIs = "keep";
//        //when
//        String result = stringVowels.insertString(stringIs);
//        //Then
//        assertEquals("kemommyep",result);
//    }
//
//    @Test
//    void should_return_itself_when_string_contains_vowels_continuously_lenght_less_percentage30(){
//        //given
//        StringVowels stringVowels = new StringVowels();
//        String stringIs = "keeptest";
//        //when
//        String result = stringVowels.insertString(stringIs);
//        //Then
//        assertEquals("keeptest",result);
//    }

}
