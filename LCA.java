import java.util.ArrayList;

class Node { 
	int data; 
	ArrayList<Node> children; 

	Node(int value) { 
		data = value; 
		children = null; 
	} 
}

public class Lca {

	static Node root;
	
		static Node lca(Node root, int n1,int n2)
		{

			if(root==null)
				return null;

		if(root.data==n1 || root.data==n2)
			if(root.data==n1 || root.data==n2)
            return root;
            


        }
    }
