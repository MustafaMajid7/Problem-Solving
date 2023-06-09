package trie;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private static String temp;
    private Character value;
    private Boolean endOfWord = false;

    private Map<Character,Trie> children =new HashMap<>();

    public Trie() {
    }

    public Trie(Character value) {
        this.value = value;
    }

    public Boolean getEndOfWord() {
        return endOfWord;
    }

    public void setEndOfWord(Boolean endOfWord) {
        this.endOfWord = endOfWord;
    }

    public Character getValue() {
        return value;
    }

    public void setValue(Character value) {
        this.value = value;
    }

    public void insertWord (String value){
        temp = value;
        setWord(value);
    }

    private void setWord(String value) {
        if (value.length() == 1){
            if (this.value == value.charAt(0)){
                if (this.getEndOfWord() == true)
                    System.out.println(temp + " is already inserted before");
                else {
                    this.setEndOfWord(true);
                    System.out.println(temp + " is successfully inserted ");
                }
            }
            else if (this.children.containsKey(value.charAt(0))){
                if (this.children.get(value.charAt(0)).getEndOfWord())
                    System.out.println(temp + " is already inserted before");
                else {
                    this.children.get(value.charAt(0)).setEndOfWord(true);
                    System.out.println(temp + " is successfully inserted ");
                }
            }
            else {
                Trie node = new Trie(value.charAt(0));
                node.setEndOfWord(true);
                children.put(value.charAt(0),node);
                System.out.println(temp + " is successfully inserted ");
            }
            return;
        }
        else {
            if (this.children.containsKey(value.charAt(0)))
                this.children.get(value.charAt(0)).setWord(value.substring(1));
            else {
                Trie node = new Trie(value.charAt(0));
                this.children.put(node.getValue(),node);
                node.setWord(value.substring(1));
            }
        }
    }

    public void removeWord (String value){
        temp = value;
        deleteWord(value);
    }

    private void deleteWord(String value){
        if (this.children.containsKey(value.charAt(0))){
            if (value.length() == 1){
                if(this.children.get(value.charAt(0)).getEndOfWord())
                {
                    this.children.get(value.charAt(0)).setEndOfWord(false);
                    System.out.println(temp + " is successfully deleted");
                }
                else
                    System.out.println(temp + " isn't inserted before");
            }
            else
                this.children.get(value.charAt(0)).deleteWord(value.substring(1));
        }
        else
            System.out.println(temp + " isn't inserted before");

    }
}
