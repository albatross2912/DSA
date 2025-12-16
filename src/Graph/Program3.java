package Graph;

import java.util.Stack;

public class Program3 {

    int[][]adjMatrix;
    int numVertex;
    boolean[] visited;

    Program3(int Vertex)
    {
        adjMatrix = new int[Vertex][Vertex];
        visited = new boolean[Vertex];
        numVertex = Vertex;
    }

    void addEdge(int s, int d)
    {
        adjMatrix[s][d] = 1;
        adjMatrix[d][s] = 1;
    }

    public static void main(String[] args) {
        Program3 P1 = new Program3(5);
        P1.addEdge(0, 1);
        P1.addEdge(0, 2);
        P1.addEdge(2, 4);
        P1.addEdge(1, 3);
        P1.addEdge(1, 4);
        P1.dfs(0);

    }

    private void dfs(int startVertex) {
        Stack<Integer> stack = new Stack<>();
        stack.push(startVertex);

        while(!stack.isEmpty())
        {
            int vertex = stack.pop();
            if(!visited[vertex])
            {
                visited[vertex] = true;
                System.out.print(vertex+"\t");
            }
            for(int i = 0; i < numVertex; i++)
            {
                if(adjMatrix[vertex][i] == 1 && !visited[i])
                {
                    stack.push(i);
                }
            }

        }


    }



}
