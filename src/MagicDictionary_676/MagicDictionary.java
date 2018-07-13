package MagicDictionary_676;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class MagicDictionary {

    Set<String> diction = new HashSet<>();

    /** Initialize your data structure here. */
    public MagicDictionary() {

    }

    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        diction.addAll(Arrays.asList(dict));
    }

    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        for (int i = 0; i < word.length(); i++) {
            String regex = word.substring(0,i) + "\\w" + word.substring(i+1);

            for (String dictionWord : diction) {
                if (!dictionWord.equals(word) && dictionWord.matches(regex)) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        String[] dict = {"hello", "leetcode"};

        MagicDictionary obj = new MagicDictionary();
        obj.buildDict(dict);
        boolean param_2 = obj.search("hello");

        System.out.println(param_2);
    }
}
