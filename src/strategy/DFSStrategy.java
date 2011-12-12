package strategy;

import java.util.Stack;

/**
 * Depth first search strategy
 */
public class DFSStrategy extends AbstractStrategy {

	protected Stack<Integer> stack = new Stack<Integer>();

	public void execute() {
		graph.getVertex(0).setVisited(true);
		stack.push(0);

		while (!stack.isEmpty()) {
			int v = getUnvisitedVertex(stack.peek());
			if (v == -1) {
				stack.pop();
			} else {
				graph.getVertex(v).setVisited(true);
				displayVertex(graph.getVertex(v));
				stack.push(v);
			}
		}

		setAllNotVisited();
	}
}
