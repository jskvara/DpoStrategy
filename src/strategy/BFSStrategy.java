package strategy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Breadth-first search strategy
 */
public class BFSStrategy extends AbstractStrategy {

	protected Queue<Integer> queue = new LinkedList<Integer>();

	public void execute() {
		graph.getVertex(0).setVisited(true);
		queue.add(0);
		int v2;

		while (!queue.isEmpty()) {
			int v1 = queue.remove();
			while ((v2 = getUnvisitedVertex(v1)) != -1) {
				graph.getVertex(v2).setVisited(true);
				displayVertex(graph.getVertex(v2));
				queue.add(v2);
			}
		}
		
		setAllNotVisited();
	}
}
