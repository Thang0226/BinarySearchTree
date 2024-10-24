public class BinarySearchTree<E extends Comparable<E>> extends AbstractTree<E> {
	protected TreeNode<E> root;
	protected int size = 0;

	public BinarySearchTree() {
	}

	public BinarySearchTree(E[] objects) {
		for (int i = 0; i < objects.length; i++)
			insert(objects[i]);
	}

	@Override
	public void inorder() {
		inorder(root);
	}

	protected void inorder(TreeNode<E> node) {
		if (node == null) return;
		inorder(node.left);
		System.out.print(" " + node.element);
		inorder(node.right);
	}

	@Override
	public void postorder() {
		postorder(root);
	}

	protected void postorder(TreeNode<E> node) {
		if (node == null) return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(" " + node.element);
	}

	@Override
	public boolean insert(E e) {
		if (root == null)
			root = createNewNode(e);
		else {
			/*locate the parent node*/
			TreeNode<E> parent = null;
			TreeNode<E> current = root;
			while (current != null) {
				if (e.compareTo(current.element) < 0) {
					parent = current;
					current = current.left;
				} else if (e.compareTo(current.element) > 0) {
					parent = current;
					current = current.right;
				} else
					return false; /*Duplicate node not allowed to be inserted*/
			}
			if (e.compareTo(parent.element) < 0)
				parent.left = createNewNode(e);
			else
				parent.right = createNewNode(e);
		}
		size++;
		return true; /*element inserted successfully*/
	}

	protected TreeNode<E> createNewNode(E e) {
		return new TreeNode<>(e);
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
