package edu.touro.cs.mcon364;

import javax.print.attribute.HashDocAttributeSet;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void Test1() {
        assertEquals (TextStatistics.wordCount("Hello"), 1);
    }
    @org.junit.jupiter.api.Test
    void Test2() {
        assertEquals(TextStatistics.uniqueWordCount("Hello my name is steve. Hello"), 5);
    }
    @org.junit.jupiter.api.Test
    void Test3() {
        HashMap<String, Integer> charlie = new HashMap<>();
        charlie.put("Hello,", 3);
        charlie.put("I", 1);
        charlie.put("am", 1);
        charlie.put("a", 1);
        charlie.put("robot", 1);
        assertEquals(TextStatistics.wordStats("Hello, Hello, Hello, I am a robot"), charlie);
    }

    @org.junit.jupiter.api.Test
    void Test4() {
assertEquals(TextStatistics.letterCount("Hello my name is kevin"), 12);
    }
    @org.junit.jupiter.api.Test
    void Test5() {
        HashMap<Character, Integer> charlie = new HashMap<>();
        charlie.put('h', 1);
        charlie.put('e', 4);
        charlie.put('l', 2);
        charlie.put('o', 1);
        charlie.put('m', 2);
        charlie.put('y', 1);
        charlie.put('n', 2);
        charlie.put('a', 1);
        charlie.put('i', 1);
        charlie.put('s', 2);
        charlie.put('t', 1);
        charlie.put('v', 1);
        assertEquals(TextStatistics.letterStats("hello my name is steven"), charlie);
    }

}
