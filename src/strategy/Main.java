package strategy;

import graph.Graph;

/**
 * Main class
 */
public class Main {

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Use argument dfs or bfs.");
			System.exit(1);
		}

		Graph graph = Graph.create();
		
		Context context;
		if (args[0].equals("bfs")) {
			  context = new Context(new BFSStrategy(), graph);
		} else {
			  context = new Context(new DFSStrategy(), graph);
		}
		context.executeStrategy();
	}
}
