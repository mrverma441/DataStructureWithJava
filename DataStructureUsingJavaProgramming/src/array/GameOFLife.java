package array;

public class GameOFLife {
	public void gameOfLife(int[][] board) {
        int[][] duplicate = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                duplicate[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int neighbors = 0;
                try {
                    if (duplicate[i - 1][j - 1] == 1) neighbors++;
                } catch (Exception e) {}         
                try {
                    if (duplicate[i - 1][j] == 1) neighbors++;
                } catch (Exception e) {}
                try {
                    if (duplicate[i - 1][j + 1] == 1) neighbors++;
                } catch (Exception e) {}
                try {
                    if (duplicate[i][j - 1] == 1) neighbors++;
                } catch (Exception e) {}
                try {
                    if (duplicate[i][j + 1] == 1) neighbors++;
                } catch (Exception e) {}
                try {
                    if (duplicate[i + 1][j - 1] == 1) neighbors++;
                } catch (Exception e) {}
                try {
                    if (duplicate[i + 1][j] == 1) neighbors++;
                } catch (Exception e) {}
                try {
                    if (duplicate[i + 1][j + 1] == 1) neighbors++;
                } catch (Exception e) {}
            
                if (duplicate[i][j] == 0) {
                    if (neighbors == 3) board[i][j] = 1;
                } else { 
                    if (neighbors > 3) board[i][j] = 0;
                    else if (neighbors < 2) board[i][j] = 0;
                }
            }
        }
    }
	public static void main(String[] args) {

	}

}
