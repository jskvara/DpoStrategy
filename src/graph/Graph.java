package graph;

/**
 * Graph
 */
public class Graph {

	private final int MAX_VERTEX = 20;
	private Vertex vertices[] = new Vertex[MAX_VERTEX];
	private int adjacencyMatrix[][] = new int[MAX_VERTEX][MAX_VERTEX];
	private int vertexCount = 0;

	public Graph() {
		for (int y = 0; y < MAX_VERTEX; y++) {
			for (int x = 0; x < MAX_VERTEX; x++) {
				adjacencyMatrix[x][y] = 0;
			}
		}
	}

	public void addVertex(String value) {
		vertices[vertexCount++] = new Vertex(value);
	}

	public void addEdge(int start, int end) {
		adjacencyMatrix[start][end] = 1;
		adjacencyMatrix[end][start] = 1;
	}


	public Vertex getVertex(int i) throws IndexOutOfBoundsException {
		if (i > MAX_VERTEX) {
			throw new IndexOutOfBoundsException("Vertex ["+ i +"] does not exist");
		}

		return vertices[i];
	}

	public int getVertexCount() {
		return vertexCount;
	}

	public boolean isEdge(int i, int j) {
		return (adjacencyMatrix[i][j] == 1) ? true : false;
	}

	public static Graph create() {
		Graph g = new Graph();
		g.addVertex("A"); // 0
		g.addVertex("B"); // 1
		g.addVertex("C"); // 2
		g.addVertex("D"); // 3
		g.addVertex("E"); // 4

		g.addEdge(0, 1); // A -> B
		g.addEdge(1, 2); // B -> C
		g.addEdge(0, 3); // A -> D
		g.addEdge(3, 4); // D -> E

		return g;
	}
}
