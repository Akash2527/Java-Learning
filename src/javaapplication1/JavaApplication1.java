
package javaapplication1;

public class JavaApplication1 {

    public static void main(String[] args) {
        int[] x_move = {-1,1,0,0};
        int[] y_move = {0,0,-1,1};
        int[][] graph = {{0, 1, 1, 0, 0},
            {1, 0, 1, 0, 0},
            {1, 1, 0, 1, 0},
            {0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0}};
        
        System.out.println(graph[x_move[0]][y_move[0]]);
    }
    
}
