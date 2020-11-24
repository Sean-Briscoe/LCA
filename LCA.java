import java.util.ArrayList;

class Node { 
	int data; 
	ArrayList<Node> parents;
	String colour;  //Colour will be used to colour tree, 0 is red, 1 is blue, 2 is purple (where blue x red)
	int counter; //will be used to decide lowest

	Node(int value) { 
		data = value; 
		parents = new ArrayList<Node>();
		colour = null;
		counter = 0;
	} 
}

public class test {

	static Node root;
	

        static void colourB(Node input){
            
            if(input.parents == null){
                
                return;

            }
            else{
                for(int i = 0; i <= input.parents.size(); i++){
                    input.parents.get(i).colour = "Blue";
                    colourB(input.parents.get(i));

                }
                
            }

        }

        static void colourR(Node input){

            if(input.parents == null){
                
                return;

            }
            else{
                for(int i = 0; i <= input.parents.size(); i++){
                   if (input.parents.get(i).colour == "Blue") input.parents.get(i).colour = "Red";
                    colourR(input.parents.get(i));

                }
                


            }


        }

        static void incCount(Node input){
            if(input.parents == null){
                
                return;

            }
            else{
            for(int i = 0; i <= input.parents.size(); i++){
                if (input.parents.get(i).colour == "Red") input.parents.get(i).counter++;
                 incCount(input.parents.get(i));

             }

                return;
            }
        }

        static ArrayList<Node> listOfSolutions(Node input){

            ArrayList<Node> listOfSolutions = new ArrayList<Node>();
            for(int i = 0; i <= input.parents.size(); i++){
                int j = 0;
                if (input.parents.get(i).counter == 0) listOfSolutions.add(input.parents.get(i));

             }
             return listOfSolutions;
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
        
        colourB(five);
        colourR(four);
        incCount(five);
        
        ArrayList<Node> solutions = listOfSolutions(five);
        for(int i = 0; i>= solutions.size(); i++){

            System.out.println("Solution "+ solutions.get(i));

        }
        System.out.println("Finished");
        }    
}
