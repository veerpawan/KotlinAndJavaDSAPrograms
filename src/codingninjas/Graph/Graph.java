package codingninjas.Graph;

import java.util.Scanner;

public class Graph {
    public static void main(String[] args) {
        int n;
        int e;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        e = s.nextInt();
        int edges[][] = new int[n][n];
        for(int i = 0; i<e; i++){
            int fv = s.nextInt();
            int lv = s.nextInt();
            edges[fv][lv] = 1;
            edges[lv][fv] = 1;
        }

    }
}
