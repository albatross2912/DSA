package Graph;

public class Program6 {

    int[][]adjMatrix;
    int numVertex;


    Program6(int Vertex)
    {
        adjMatrix = new int[Vertex][Vertex];
        numVertex = Vertex;
    }

    void addEdge(int s, int d , int w)
    {
        adjMatrix[s][d] = w;
        adjMatrix[d][s] = w;
    }

    public static void main(String[] args) {
        Program6 P1 = new Program6(5);

        P1.addEdge(0, 1, 3);
        P1.addEdge(2, 1, 10);
        P1.addEdge(2, 3, 2);
        P1.addEdge(2, 4, 6);
        P1.addEdge(1, 3, 4);
        P1.addEdge(3, 4, 1);

        P1.kruskal();

    }

    private void prims(int startVertex) {

        int noEdges = 0;
        boolean[] selected = new boolean[numVertex];
        selected [startVertex] = true;

        while(noEdges < numVertex-1)
        {
           int min = Integer.MAX_VALUE;
           int x = 0 ;
           int y = 0 ;

           for(int i = 0; i < numVertex; i++)
           {
               if(selected[i])
               {

                  for(int j = 0; j < numVertex; j++)
                  {
                      if(!selected[j] && adjMatrix[i][j] !=0)
                      {
                         if(min > adjMatrix[i][j])
                         {
                             min = adjMatrix[i][j];
                             x = i;
                             y = j;
                         }
                      }
                  }
               }
           }
            System.out.println(x+"-->"+y+":"+adjMatrix[x][y]);
            selected[y] = true;
            noEdges++;
        }

    }



}
