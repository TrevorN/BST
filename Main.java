public class Main
{

	public static void main(String args[])
	{
		BST<String> myTree = new BST<String>();

		myTree.insert("Adam");
		myTree.insert("Eve");
		myTree.insert("Romeo");
		myTree.insert("Juliet");
		myTree.insert("Tom");
		myTree.insert("Dick");
		myTree.insert("Harry");
		myTree.printTree();
	}
}
