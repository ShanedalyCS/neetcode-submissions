class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<Character>();

        for(int i = 0; i < 9; i++){
            System.out.println(set);
            set.clear();
            for(int j = 0; j < 9; j++)
            {
                char curr = board[i][j];
                if(curr == '.') continue;
                if(set.contains(curr)) return false;
                set.add(curr);
            }
            System.out.println("asdad");
           
        }


        for(int i = 0; i < 9; i++){
            set.clear();
            for(int j = 0; j < 9; j++){
                char curr = board[j][i];
                if(curr == '.') continue;
                if(set.contains(curr)) return false;
                set.add(curr);
            }
        }
        System.err.println("asdasdasdsad");



        // 3x3 boxes
for (int boxRow = 0; boxRow < 3; boxRow++) {
    for (int boxCol = 0; boxCol < 3; boxCol++) {
        set.clear(); // fresh set for this box

        // cells inside one 3x3 box
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int r = boxRow * 3 + i;   // row index in board
                int c = boxCol * 3 + j;   // col index in board
                char curr = board[r][c];
                if (curr == '.') continue;
                if (set.contains(curr)) return false;
                set.add(curr);
            }
        }
    }
}

        return true;
    }
}
