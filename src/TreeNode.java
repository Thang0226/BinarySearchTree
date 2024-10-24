public class TreeNode<E> implements Comparable<TreeNode<E>> {
	protected E element;
	protected TreeNode<E> left;
	protected TreeNode<E> right;

	public TreeNode(E e) {
		element = e;
	}

	@Override
	public int compareTo(TreeNode<E> o) {
		return 0;
	}
}