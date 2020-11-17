import java.util.ArrayList;

class Node { 
	int data; 
	ArrayList<Node> parents;
	int colour;  //Colour will be used to colour tree, 0 is red, 1 is blue, 2 is purple (where blue x red)
	int counter; //will be used to decide lowest

	Node(int value) { 
		data = value; 
		parents = new ArrayList<Node>();
		colour = 0;
		counter = 0;
	} 
}

public class test {

	static Node root;
	

        static void colour(Node search) {
            
            search.parents.get(0).colour++;
            return;
            
           /* if (search.parents == null) {
                search.colour = 7;
                return;
            }
            else{
                for (int i = 0; i >= search.parents.size(); i++) {
                    colour(search.parents.get(i));
                    return;
                }
            }
            System.out.println("fail");
            return;*/
            
        }

        public static void main(String[] args) {

		test tree = new test();

		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);

		tree.root = one;
		two.parents.add(root); 
		three.parents.add(root); 
		four.parents.add(root);

        five.parents.add(three);
        five.parents.add(root);
        
        colour(five);
        System.out.println("root colour: "+ three.colour);
        }    
}
