public class BSTnode<T extends Comparable<T>>
{
	//Fields
	private Comaparable<T> datum;
	private BSTnode<T> left;
	private BSTnode<T> right;

	//Constructors
	public BSTnode(Comparable<T> datum, BSTnode<T> left, BSTnode<T> right)
	{
		this.datum = datum;
		this.left = left;
		this.right = right;
	}

	public BSTnode(Comparable<T> datum)
	{
		this.datum = datum;
		left = null;
		right = null;
	}

	public BSTnode()
	{
		datum = null;
		left = null;
		right = null;
	}

	//Accessors

	public Comparable<T> getDatum()
	{
		return datum;
	}

	public BSTnode<T> getLeft()
	{
		return left;
	}

	public BSTnode<T> getRight()
	{
		return right;
	}

	public boolean isLeaf()
	{
		return (left == null && right == null);
	}

	public boolean depth()
	{
		if(isLeaf) return 1;

		return left.depth() > right.depth() ? left.depth() + 1 : right.depth() + 1;
	}

	//Modifiers
	public void setDatum(Comparable<T> datum)
	{
		this.datum = datum;
	}

	public void setLeft(BSTnode<T> node)
	{
		left = node;
	}

	public void setRight(BSTnode<T> node)
	{
		right = node;
	}

	public void insert(Comparable<T> datum)
	{
		if(this.datum == null)
		{
			this.datum = datum;
		}

		if(datum > this.datum)
		{
			right.insert(datum);
		} else {
			left.insert(datum):
		}
	}

	//Utility
	public void printTree()
	{
		System.out.println(toString());
	}

	public String toString()
	{
		return datum.toString() + "\n" + left.toString() + right.toString();
	}
}
