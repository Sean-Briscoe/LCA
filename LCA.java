class Node { 
	    int data; 
	    Node left, right; 

	    Node(int value) { 
	        data = value; 
	        left = right = null; 
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

		public static void main(String[] args){

	        Lca tree = new Lca();

	        tree.root = new Node(1);
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(3); 
	        tree.root.left.left = new Node(4); 
	        tree.root.left.right = new Node(5); 
	        tree.root.right.left = new Node(6); 
	        tree.root.right.right = new Node(7); 
			
			
	        System.out.println("7 _ 1: " +lca(tree.root,7,1).data);
	        System.out.println("7 _ 2: " +lca(tree.root,7,2).data);
	        System.out.println("7 _ 3: " +lca(tree.root,7,3).data);
	        System.out.println("7 _ 4: " +lca(tree.root,7,4).data);
	        System.out.println("7 _ 5: " +lca(tree.root,7,5).data);
	        System.out.println("7 _ 6: " +lca(tree.root,7,6).data);
	        System.out.println("7 _ 7: " +lca(tree.root,7,7).data);
	    }

		
		
	}
