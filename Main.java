public class Main
{

	public static void main(String args[])
	{
		BST<Integer> myTree = new BST<Integer>();

		myTree.insert(new Integer(2));
		myTree.insert(new Integer(1));
		myTree.insert(new Integer(9));
		myTree.insert(new Integer(0));
		myTree.insert(new Integer(2));
		myTree.insert(new Integer(9));
		myTree.insert(new Integer(7));
		myTree.insert(new Integer(10));
		
		myTree.printTree();

		myTree.delete(new Integer(10));
		myTree.delete(new Integer(1));

		myTree.printTree();

		myTree.insert(new Integer(10));
		myTree.insert(new Integer(2000));

		myTree.printTree();
	}
}
