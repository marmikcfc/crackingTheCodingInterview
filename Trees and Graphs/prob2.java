import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
/*
	Given a directed graph, design an algorithm to find out whether there is a route
    between two nodes.
*/
class Node {
	String data;
	boolean visited;

	List<Node> neighbours = new ArrayList<Node>();

	public Node(String data) {
		this.data = data;
	}

	public void addNeighBour(Node node) {
		neighbours.add(node);
		node.neighbours.add(this);
	}
}




class Graph {
	
	 List nodes = new ArrayList();

	public void breadthFirstTraversal(Node rootNode) {
		System.out.println("BFS:");
		
		LinkedList unvisitedNodes = new LinkedList();
		unvisitedNodes.add(rootNode);
		rootNode.visited = true;
		while (!unvisitedNodes.isEmpty()) {
			Node n = (Node) unvisitedNodes.poll();
			System.out.print(n.data + " ");
			for (Node adj : n.neighbours) {
				if (!adj.visited) {
					adj.visited = true;
					unvisitedNodes.add(adj);
				}
			}
		}

	}
	
	
	
	public void depthFirstTraversal(Node rootNode) {
		System.out.println("DFS:");
		
		Stack unvisitedNodes = new Stack();
		unvisitedNodes.push(rootNode);
		rootNode.visited = true;
		while (!unvisitedNodes.isEmpty()) {
			Node n = (Node) unvisitedNodes.pop();
			System.out.print(n.data + " ");
			for (Node adj : n.neighbours) {
				if (!adj.visited) {
					adj.visited = true;
					unvisitedNodes.push(adj);
				}
			}
			
		}

	}

}





class prob2{
	
	public static void main(String[] args) {

		Node A = new Node("A");
		Node B = new Node("B");
		Node C = new Node("C");
		Node D = new Node("D");
		Node E = new Node("E");

		Graph g = new Graph();

		g.nodes.add(A);
		g.nodes.add(B);
		g.nodes.add(C);
		g.nodes.add(D);
		g.nodes.add(E);

		A.addNeighBour(B);
		A.addNeighBour(D);


		B.addNeighBour(C);
		B.addNeighBour(E);

		D.addNeighBour(C);
		D.addNeighBour(E);

		

		//g.breadthFirstTraversal(A);
				
		g.depthFirstTraversal(A);
		
	}
}