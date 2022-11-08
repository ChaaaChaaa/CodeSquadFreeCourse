package maze;

public class DFS {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int ans = 0;

    public static boolean[][] visited;

    public void DFS(int x, int y,int depth) {
        if (x == 7 && y == 7) {
            ans++;
        } else {
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (board[nx][ny] == 0 && nx >= 1 && ny >= 1 && nx <= 7 && ny <= 7) {
                    board[nx][ny] = 1;
                    visited[nx][ny] = true;
                    DFS(nx, ny,depth +1);
                    board[nx][ny] = 0;
                    visited[nx][ny] = false;
                }
            }
        }
    }


}
