public class TestBST {
	public static void main(String[] args) {
		String[] names = {"George", "Michael", "Tom"};
		BinarySearchTree<String> tree = new BinarySearchTree<>(names);
		tree.insert("Adam");
		tree.insert("Jones");
		tree.insert("Peter");
		tree.insert("Daniel");

		System.out.println("Inorder traverse (sorted nodes): ");
		tree.inorder();
		System.out.println("\nThe number of nodes is: " + tree.getSize());
	}
}
