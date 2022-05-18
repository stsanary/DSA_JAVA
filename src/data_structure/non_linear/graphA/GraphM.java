package data_structure.non_linear.graphA;

public class GraphM{
    private int[][] adjacencyMatrix;
    private int numVerticies;

    public GraphM(int numVerticies){
        this.numVerticies=numVerticies;
        adjacencyMatrix= new int[numVerticies][numVerticies];
    }

    public void addEdge(int from, int to){
        adjacencyMatrix[from][to]=1;
        adjacencyMatrix[to][from]=1;
    }

    public void removeEdge(int from, int to){
        adjacencyMatrix[from][to]=0;
        adjacencyMatrix[to][from]=0;
    }

    //print
    public String toString(){
        StringBuilder s= new StringBuilder();
        for(int i=0; i<numVerticies; i++){
            s.append(i + ": ");
            for (int j=0; j<numVerticies; j++)
            {
                s.append(adjacencyMatrix[i][j] + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}


