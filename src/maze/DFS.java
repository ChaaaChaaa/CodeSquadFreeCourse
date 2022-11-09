package maze;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class DFS {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static HashMap<Integer,Node> hashMap;

    public static boolean[][] visited;
    public static List<Node> list;

    public DFS(int[][] map) {
        this.board = map;
        this.visited = new boolean[map.length][map.length];
        list = new ArrayList<>();
        hashMap = new HashMap<>();

    }

    public void doDFS(int x, int y,int depth) {
        if (x==8 && y==8) {
            return;
        } else {
            hashMap.put(depth,new Node(y,x));

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= 8 || ny < 0 || ny >= 8) {
                    continue;
                }

                if (nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7 && board[nx][ny] == 0 && !visited[nx][ny]) {
                    board[nx][ny] = 1;
                    visited[nx][ny] = true;

                    if (nx == 7 && ny == 7) {
                        hashMap.put(depth,new Node(ny,nx));
                    }
                    doDFS(nx, ny,depth+1);
                }
            }
        }
    }
}

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
