package laba2;

import org.example.StringProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringProcessorTest {
    @Test
    public void multiplyOfString() {
        Assertions.assertEquals("я не знаю про анализя не знаю про анализя не знаю про анализ", StringProcessor.multiplyOfString("я не знаю про анализ", 3));
        Assertions.assertEquals("123123123", StringProcessor.multiplyOfString("123", 3));
        Assertions.assertEquals("", StringProcessor.multiplyOfString("", 3));
        Assertions.assertEquals("", StringProcessor.multiplyOfString("", 0));
    }
    @Test
    public void multiplyOfError() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProcessor.multiplyOfString("", -1));
    }


    @Test
    public void searchForSubstring(){
        Assertions.assertEquals(3,StringProcessor.searchForSubstring("123123123","123"));
        Assertions.assertEquals(2,StringProcessor.searchForSubstring("aaa","aa"));
        //Assertions.assertEquals(3,StringProcessor.searchForSubstring("123","124"));

    }

    @Test
    public void replaceNums(){
        Assertions.assertEquals("Мне нужен один кофе, два пончика и три салфетки", StringProcessor.replaceNums("Мне нужен 1 кофе, 2 пончика и 3 салфетки"));
        Assertions.assertEquals("одинодинодинодин4", StringProcessor.replaceNums("11114"));
    }

    @Test
    public void delStr(){
        Assertions.assertEquals(new StringBuilder("1111").toString(),StringProcessor.delStr(new StringBuilder("12121212")).toString());
    }

    @Test
    public void searchForSubstringErrors() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringProcessor.searchForSubstring("132", ""));
    }



}