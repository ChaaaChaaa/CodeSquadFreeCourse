package maze;

public class Map {
    public static void main(String[] args) {
        int [][] map = {
                {0, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 1, 1, 1, 1},
                {1, 1, 1, 0, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 0}

        };

//        BFS bfs = new BFS(map);
//        bfs.doBFS(0,1);
//        bfs.list.stream().forEach(point -> System.out.print("("+point.x+","+ point.y+") "));

        System.out.println();

        DFS dfs = new DFS(map);
        dfs.doDFS(0,1,0);
        for(Integer key : dfs.hashMap.keySet()){
            System.out.print("("+dfs.hashMap.get(key).x+","+dfs.hashMap.get(key).y+") ");
        }
    }
}
