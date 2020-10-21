class Node
{

    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}


class Tree
{
	Node lca(Node root, int n1,int n2)
	{
	    
		if(root==null)
			return null;
		
		if(root.data==n1 || root.data==n2)
			return root;
		
		// Look for keys in left and right subtrees 	
		Node left = lca(root.left,n1,n2);
		Node right = lca(root.right,n1,n2);
		
		// If both of the above calls return Non-NULL, then one key 
        // is present in once subtree and other is present in other, 
        // So this node is the LCA
		if(left != null && right != null)
			return root;
			
		
		// Otherwise check if left subtree or right subtree is LCA
		return(left!=null)?left:right;
	}

	@Test Node Lca(){
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		one.left = two;
		one.right = three;
		two.left = four;

		assertEquals(one lca(one, 2, 3));
		assertEquals(one lca(one, 3, 4));
		asseertEquals(null lca(null, 1, 2));

	}
}
