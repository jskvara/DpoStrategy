package strategy;

import graph.Graph;

/**
 * Strategy interface
 */
public interface Strategy {

    public void execute();

	public void setGraph(Graph graph);
}
