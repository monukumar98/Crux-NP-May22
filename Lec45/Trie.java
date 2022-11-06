package Lec45;

import java.util.HashMap;

public class Trie {

	public class Node {
		char ch;
		HashMap<Character, Node> children = new HashMap<>();
		boolean istreminal = false;
	}

	private Node root;

	public Trie() {
		// TODO Auto-generated constructor stub
		Node nn = new Node();
		nn.ch = '*';
		root = nn;
	}

	public void insert(String word) {

		Node temp = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (temp.children.containsKey(ch)) {
				temp = temp.children.get(ch);
			} else {
				Node nn = new Node();
				nn.ch = ch;
				temp.children.put(ch, nn);
				temp = nn;
			}

		}
		temp.istreminal = true;

	}

	public boolean search(String word) {
		Node temp = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!temp.children.containsKey(ch)) {
				return false;
			}
			temp = temp.children.get(ch);
		}
		return temp.istreminal;

	}
	 public boolean startsWith(String prefix) {
		 Node temp = root;
			for (int i = 0; i < prefix.length(); i++) {
				char ch = prefix.charAt(i);
				if (!temp.children.containsKey(ch)) {
					return false;
				}
				temp = temp.children.get(ch);
			} 
			return true;
	    }
}
