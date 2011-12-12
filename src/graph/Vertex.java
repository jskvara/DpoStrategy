package graph;

/**
 * Graph vertex
 */
public class Vertex {
	private String value;
	private boolean visited = false;

	public Vertex(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
}
