import static org.junit.Assert.*;

import org.junit.Test;

public class LcaTest {

	@Test
	public void test() {
		
		 
		Lca tree = new Lca();

        tree.root = new Node(1);
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
        tree.root.right.left = new Node(6); 
        tree.root.right.right = new Node(7); 
	    
        //Testing all iterations
        assertEquals(1, tree.lca(tree.root,1,1).data);
        assertEquals(1, tree.lca(tree.root,1,2).data);
        assertEquals(1, tree.lca(tree.root,1,3).data);
	    assertEquals(1, tree.lca(tree.root,1,4).data);
	    assertEquals(1, tree.lca(tree.root,1,5).data);
	    assertEquals(1, tree.lca(tree.root,1,6).data);
	    assertEquals(1, tree.lca(tree.root,1,7).data);
	    
	    assertEquals(1, tree.lca(tree.root,2,1).data);
        assertEquals(2, tree.lca(tree.root,2,2).data);
        assertEquals(1, tree.lca(tree.root,2,3).data);
	    assertEquals(2, tree.lca(tree.root,2,4).data);
	    assertEquals(2, tree.lca(tree.root,2,5).data);
	    assertEquals(1, tree.lca(tree.root,2,6).data);
	    assertEquals(1, tree.lca(tree.root,2,7).data);
	    
	    assertEquals(1, tree.lca(tree.root,3,1).data);
        assertEquals(1, tree.lca(tree.root,3,2).data);
        assertEquals(3, tree.lca(tree.root,3,3).data);
	    assertEquals(1, tree.lca(tree.root,3,4).data);
	    assertEquals(1, tree.lca(tree.root,3,5).data);
	    assertEquals(3, tree.lca(tree.root,3,6).data);
	    assertEquals(3, tree.lca(tree.root,3,7).data);
	    
	    assertEquals(1, tree.lca(tree.root,4,1).data);
        assertEquals(2, tree.lca(tree.root,4,2).data);
        assertEquals(1, tree.lca(tree.root,4,3).data);
	    assertEquals(4, tree.lca(tree.root,4,4).data);
	    assertEquals(2, tree.lca(tree.root,4,5).data);
	    assertEquals(1, tree.lca(tree.root,4,6).data);
	    assertEquals(1, tree.lca(tree.root,4,7).data);
	    
	    assertEquals(1, tree.lca(tree.root,5,1).data);
        assertEquals(2, tree.lca(tree.root,5,2).data);
        assertEquals(1, tree.lca(tree.root,5,3).data);
	    assertEquals(2, tree.lca(tree.root,5,4).data);
	    assertEquals(5, tree.lca(tree.root,5,5).data);
	    assertEquals(1, tree.lca(tree.root,5,6).data);
	    assertEquals(1, tree.lca(tree.root,5,7).data);
	    
	    assertEquals(1, tree.lca(tree.root,6,1).data);
        assertEquals(1, tree.lca(tree.root,6,2).data);
        assertEquals(3, tree.lca(tree.root,6,3).data);
	    assertEquals(1, tree.lca(tree.root,6,4).data);
	    assertEquals(1, tree.lca(tree.root,6,5).data);
	    assertEquals(6, tree.lca(tree.root,6,6).data);
	    assertEquals(3, tree.lca(tree.root,6,7).data);
	    
	    assertEquals(1, tree.lca(tree.root,7,1).data);
        assertEquals(1, tree.lca(tree.root,7,2).data);
        assertEquals(3, tree.lca(tree.root,7,3).data);
	    assertEquals(1, tree.lca(tree.root,7,4).data);
	    assertEquals(1, tree.lca(tree.root,7,5).data);
	    assertEquals(3, tree.lca(tree.root,7,6).data);
	    assertEquals(7, tree.lca(tree.root,7,7).data);
	    
	    
	    
		}
		
		
	}


