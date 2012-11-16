public class BST<T extends Comparable<T>>
{

	priavte BSTnode<T> root

	public BST()
	{
		root = new BSTnode<T>();
	}

	public void insert(Comparable<T> datum)
	{
		root.insert(datum);
	}

	public int depth()
	{
		root.depth();
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
		return root.toString();
	}
}
