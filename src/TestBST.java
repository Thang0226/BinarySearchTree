public class TestBST {
	public static void main(String[] args) {
		String[] names = {"George", "Michael", "Tom"};
		BinarySearchTree<String> tree = new BinarySearchTree<>(names);
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");

		System.out.println("Post-order traverse: ");
		tree.postorder();
		System.out.println("\nIn-order traverse: ");
		tree.inorder();
	}
}
