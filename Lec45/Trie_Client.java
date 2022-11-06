package Lec45;

public class Trie_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("apple");
		t.insert("app");
		t.insert("raj");
		t.insert("ram");
		t.insert("app");
		t.insert("go");
		System.out.println(t.search("app"));
		System.out.println(t.startsWith("ak"));
		System.out.println(t.startsWith("ap"));

	}

}
