public class BSTnode<T extends Comparable<T>>
{
	//Fields
	private T datum;
	private BSTnode<T> left;
	private BSTnode<T> right;
	private int depth = 1;
	
	//Constructors
	public BSTnode(T datum, BSTnode<T> left, BSTnode<T> right)
	{
		this.datum = datum;
		this.left = left;
		this.right = right;
	}

	public BSTnode(T datum)
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

	public T getDatum()
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
		return (left == null && right == null && datum != null);
	}

	public int depth()
	{
//		if(isLeaf()) return 1;
//
//		if(left == null)
//		{
//			return right.depth() + 1;
//		}
//
//		if(right == null)
//		{
//			return left.depth() + 1;
//		}
//
//		return left.depth() > right.depth() ? left.depth() + 1 : right.depth() + 1;
		return depth;

	}

	//Modifiers
	public void setDatum(T datum)
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

	public int insert(T datum)
	{
		
		if(this.datum == null)
		{
			this.datum = datum;
		}
		else if(this.datum.compareTo(datum) == 0)
		{

		}
		else if(this.datum.compareTo(datum) < 0)
		{
			if(right != null)
			{
				int i = 1 + right.insert(datum);
				if(i > depth){
					depth = i;
				}
			}else{
				right = new BSTnode<T>(datum);
			}

		}
		else
		{
			if(left != null)
			{
				int i = 1 + left.insert(datum);
				if(i > depth){
					depth = i;
				}
			}else{
				left = new BSTnode<T>(datum);
			}
		}

		return depth;
	}

	public void delete(T toDelete)
	{
		if(datum.compareTo(toDelete) == 0)
		{
			if(isLeaf())
			{
				datum = null;
			}
			else if(left != null && left.isLeaf())
			{
				datum = left.getDatum();
				left = null;
			}else if(right != null && right.isLeaf()){
				datum = right.getDatum();
				right = null;
			}else if(left != null){
				datum = left.getDatum();
				left.delete(left.getDatum());
			}else if(right != null){
				datum = right.getDatum();
				right.delete(right.getDatum());
			}
		}else if(right != null && datum.compareTo(toDelete) > 0){
			left.delete(toDelete);
		}else if(left != null && datum.compareTo(toDelete) < 0){
			right.delete(toDelete);
		}
	}

	//Utility
	public void printTree()
	{
		System.out.println(toString());
	}

	public String toString()
	{
		String d, r, l;

		if(datum != null)
		{
			d = datum.toString();
		}
		else
		{
			return "";
		}

		if(isLeaf())
		{
			return d;
		}

		if(left != null)
		{
			l = left.toString();
		}
		else
		{
			l = "∆";
		}

		if(right != null)
		{
			r = right.toString();
		}
		else
		{
			r = "∆";
		}

		return "(" + l + ")" + d + "(" + r + ")";
	}
}
