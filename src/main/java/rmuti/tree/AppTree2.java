package rmuti.tree;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class AppTree2 {
	public static void main(String[] args) {
		Node h = new Node("h", null, null);
		Node i = new Node("i", null, null);
		Node F4 = new Node("f", null, null);
		Node g = new Node("g", null, null);
		Node f = new Node("f", null, null);
		Node e = new Node("e", h, i);
		Node c = new Node("c", g, F4);
		Node b = new Node("b", e, f);
		Node root = new Node("a", b, c);
		TreeDraw drawTree = new TreeDraw(root);
		drawTree.binaryTreeDraw();
	}
}