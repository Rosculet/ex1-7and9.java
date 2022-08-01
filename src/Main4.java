import java.util.*;

public class Main4 {
    public static void main(String[] args) {

        String str = "ABB CAA";
        String anagram = "BA BCAA";

        checkAnagram(str,anagram);
    }
    public static void checkAnagram(String original , String anagram) {
        List<Character> originalList = new ArrayList<>();
        List<Character> analogList = new ArrayList<>();

        for (int i = 0; i < original.length(); i++) {
            originalList.add(original.charAt(i));
        }
        for (int i = 0; i < anagram.length(); i++) {
            analogList.add(original.charAt(i));
        }
        Collections.sort(originalList);
        Collections.sort(analogList);

        String s = analogList.equals(originalList) ? " It's anagram" : "It's not anagram";
        System.out.println(s);
    }

}
