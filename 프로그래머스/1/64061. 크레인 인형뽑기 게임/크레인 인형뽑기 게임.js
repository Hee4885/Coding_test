        function solution(board, moves) {
            let answer = 0;
            let stack = [];

            for (let x of moves) {
                for (let i = 0; i < board.length; i++) {
                    if (board[i][x - 1] != 0) {
                        if (stack.length > 0 && stack[stack.length - 1] === board[i][x - 1]) {
                            stack.pop();
                            board[i][x - 1] = 0; //인형 뽑고 0으로 바꾸기
                            answer += 2;
                            break;
                        } else {
                            stack.push(board[i][x - 1]);
                            board[i][x - 1] = 0; //인형 뽑고 0으로 바꾸기
                            break; //첫번째 인형 뽑고 그만두기
                        }
                    }
                }
            }
            return answer;
        }