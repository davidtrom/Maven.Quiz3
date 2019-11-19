package rocks.zipcode.io.quiz3.arrays;


/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String [][] board;

    public TicTacToe(String[][] board) {
        this.board=board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String [] row = new String [3];
        for (int i = 0; i <= 2; i++) {
           row[i] = board[value][i];
        }
        return row;
    }

    public String[] getColumn(Integer value) {
        String [] column = new String [3];
        for (int i = 0; i <= 2; i++) {
            column[i] = board[i][value];
        }
        return column;
    }


    public Boolean isRowHomogenous(Integer rowIndex) {
        //for(int i = 0; i <= 2; i++){
//            if (board[rowIndex][0].equals("X") && board[rowIndex][1] = "O"]);
//            return true;
//        }
//
//
//        if (getRow(rowIndex).equals("X") || getRow(rowIndex.equals("O")))
            return true;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return null;
    }

    public String getWinner() {
        return null;
    }

    public String[][] getBoard() {
        return this.board;
    }


//    public Boolean checkHorizontal(Character xO) {
//        for (int i = 0; i <= 2; i++) {
//            if ((board[i][0] == xO) && (board[i][1] == xO) && (board[i][2] == xO)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public Boolean checkVertical(Character xO)
//    {
//        for (int i = 0; i<=2; i++)
//        {
//            if ((board [0][i] == xO) && (board[1][i] == xO) && (board[2][i] == xO))
//            {
//                return true;
//            }
//        }
//        return false;
//    }
}
