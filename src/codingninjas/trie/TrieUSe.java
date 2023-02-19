package codingninjas.trie;

public class TrieUSe {
    public static void main(String[] args) {
        Trie t = new Trie();
        t.add("this");
        t.add("news");
        System.out.println(t.search("news"));
        t.remove("news");
        System.out.println(t.search("news"));
    }
}
