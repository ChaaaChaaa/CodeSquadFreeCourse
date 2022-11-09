package maze;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BFS {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    public static int[][] board;
    public static ArrayList<Point> list;
    static boolean[][] visit;

    public BFS(int[][] map) {
        this.board = map;
        this.list = new ArrayList<>();
        this.visit = new boolean[map.length][map.length];
    }

    public void doBFS(int x, int y) {

        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(x,y));
        visit[x][y] = true;
        list.add(new Point(y,x));

        while (!queue.isEmpty()) {
            Point point = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nx = dx[i] + point.x;
                int ny = dy[i] + point.y;

                if (nx >= 0 && nx <= 7 && ny >= 0 && ny <= 7 && board[nx][ny] == 0 && !visit[nx][ny]) {
                    board[nx][ny] = 1;
                    visit[nx][ny] = true;
                    queue.offer(new Point(nx, ny));
                    list.add(new Point(ny,nx));
                    //doBFS(nx, ny);
                }
            }
        }
    }
}


class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
