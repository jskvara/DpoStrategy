package strategy;

import graph.Graph;
import graph.Vertex;

/**
 * Abstract Strategy - common methods for all implementations
 */
public abstract class AbstractStrategy implements Strategy {

	protected Graph graph;

	public void setGraph(Graph graph) {
		this.graph = graph;
	}

	protected int getUnvisitedVertex(int v) {
		for (int j = 0; j < graph.getVertexCount(); j++) {
			if (graph.isEdge(v, j) && !graph.getVertex(j).isVisited()) {
				return j;
			}
		}

		return -1;
	}

	protected void setAllNotVisited() {
		for (int j = 0; j < graph.getVertexCount(); j++) {
			graph.getVertex(j).setVisited(false);
		}
	}

	protected void displayVertex(Vertex v) {
		System.out.println("Vertex: "+ v.getValue());
	}
}
