//package maze;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Stack;
//
//public class BFS {
//    static int[] dx = {-1,0,1,0};
//    static int[] dy = {0,-1,0,1};
//    public static int[][] board, dis;
//    public static boolean[][] visited;
//
//    public BFS(int[][] map) {
//        this.board = map;
//        this.dis = new int[map.length][map.length];
//        this.visited = new boolean[map.length][map.length];
//    }
//
//    public void doBFS(int x, int y, String currentPath, int distance){
//        int currentDistance = 1;
//        String curtPath = "";
//
//        Queue<Point> queue = new LinkedList<>();
//        queue.offer(new Point(x,y,1));
//        visited[x][y] = true;
//
//        while (!queue.isEmpty()){
//            Point point = queue.poll();
//
//            for(int i=0; i<4; i++){
//                int nx = dx[i]+point.x;
//                int ny = dy[i]+point.y;
//
//                if(nx>=0 && nx <= 7 && ny >=0 && ny<=7 ) {
//                   if(board[nx][ny] == 1 && !visited[nx][ny]){
//                       board[nx][ny] = 1;
//                       visited[nx][ny] = true;
//                       doBFS(nx, ny,currentPath);
//                       System.out.println("("+nx+","+ny+")");
//                       dis[nx][ny] = dis[point.x][point.y] + 1;
//                   }
//                }
//            }
//        }
//    }
//}
//
//class Point{
//    int x;
//    int y;
//    int depth;
//
//    Point(int x, int y,int depth){
//        this.x = x;
//        this.y = y;
//        this.depth = depth;
////
////        if("".equals(oldPath)){
////            this.path = "("+x+","+y+")";
////        }else{
////            this.path = oldPath+"->"+"("+x+","+y+")";
////        }
//    }
//}
