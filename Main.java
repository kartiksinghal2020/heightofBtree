package heightofBstree;

class Node {
	int data;
	Node left = null;
	Node right = null;
	
	Node(int data){
		this.data = data;
	}
}
public class Main {
	public static int heightOfBSTree(Node root) {
		
		if(root == null) {
			return 0;
		}
		int hl =  heightOfBSTree(root.left); 
	    int hr =  heightOfBSTree(root.right);
		return 1 + Math.max(hl, hr);
	}

	public static void main(String[] args) {
		Node root = null;
		
		root = new Node(10);
		root.left = new Node(4);
		root.right = new Node(6);
		root.left.left = new Node(2);
		root.left.right = new Node(5);
		root.right.left = new Node(8);
		root.right.right = new Node(9);
		System.out.println("Height of Btree:"+ heightOfBSTree(root));

	}

}
