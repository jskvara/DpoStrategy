package strategy;

import graph.Graph;

/**
 * Strategy context
 */
public class Context {

	private Strategy strategy;

	public Context(Strategy strategy, Graph graph) {
		this.strategy = strategy;
		this.strategy.setGraph(graph);
	}

	public void executeStrategy() {
		this.strategy.execute();
	}
}
