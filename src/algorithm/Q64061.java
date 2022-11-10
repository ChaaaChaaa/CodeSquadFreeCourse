package algorithm;

import java.util.Stack;
class Q64061 {
    static Stack<Integer> stack = new Stack<>();
    static int answer = 0;

    public int solution(int[][] board, int[] moves) {
        for(int idx : moves) {
            board = pick(board, idx - 1);
        }
        return answer;
    }
    static int[][] pick(int[][] board, int idx) {
        for(int i = 0 ; i < board.length ; i++) {
            if(board[i][idx] == 0) continue;

            if(!stack.isEmpty() && stack.peek() == board[i][idx]) {
                answer += 2;
                stack.pop();
                board[i][idx] = 0;
                break;
            }
            stack.push(board[i][idx]);
            board[i][idx] = 0;
            break;
        }
        return board;
    }
}

/*
def solution(board, moves):
    box = []
    answer = 0
    for x in moves:
        for y in range(len(board)):
            if board[y][x-1]:
                if box and board[y][x-1] == box[-1]:
                    answer += 2
                    box.pop()
                    board[y][x - 1] = 0
                    break
                else:
                    box.append(board[y][x-1])
                    board[y][x - 1] = 0
                    break

    return answer
 */
