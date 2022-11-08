package maze;

public class Map {
    public static void main(String[] args) {
        int [][] map = {
                {0,1,1,1,0,1,1,1},
                {0,0,0,1,0,0,0,0},
                {1,1,0,0,0,1,0,1},
                {1,1,0,1,1,1,0,1},
                {1,0,0,1,0,0,0,0},
                {0,1,1,1,0,1,1,1},
                {1,0,1,1,0,0,0,0},
                {0,1,1,0,1,1,1,0}
        };

        BFS bfs = new BFS(map);
        bfs.doBFS(1,1,"",0);
        System.out.println(bfs.dis[7][7]);

//        for(int i=0; i<bfs.dis.length; i++){
//            for(int j=0; j<map.length; j++){
//                if(bfs.dis[i][j] == 1){
//
//                }
//            }
//        }
    }
}
