public class BST<T extends Comparable<T>>
{

	private BSTnode<T> root;

	public BST()
	{
		root = new BSTnode<T>();
	}

	public void insert(T datum)
	{
		root.insert(datum);
	}

	public int depth()
	{
		return root.depth();
	}


	public BSTnode getTree()
	{
		return root;
	}

	public boolean isLeaf()
	{
		return root.isLeaf();
	}

	public void printTree()
	{
		System.out.println(toString());
	}

	public String toString()
	{
		return getTree().toString();
	}

	public void delete(T toDelete)
	{
		root.delete(toDelete);
	}
}
