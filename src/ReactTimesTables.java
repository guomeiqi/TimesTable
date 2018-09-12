import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.*;
import java.util.Arrays;
import javax.swing.JScrollPane;


public class ReactTimesTables extends JFrame {

    JTable jt;
    public ReactTimesTables(){


        int size=10;

        String[][] rowData = new String[size+1 ][size+1];

        for(int cellRow = 0;cellRow<size + 1;cellRow++) {

            for (int cellCol = 0; cellCol < size + 1; cellCol++) {
                if (cellRow == 0 && cellCol == 0)
                    rowData[cellRow][cellCol] = "x";
                else if (cellCol == 0) {
                    rowData[cellRow][cellCol] = "" + cellRow;
                } else if (cellRow == 0) {
                    rowData[cellRow][cellCol] = "" + cellCol;
                } else {
                    rowData[cellRow][cellCol] = "" + (cellRow) * cellCol;
                }
            }
        }

        jt =new JTable(rowData, rowData[0])
        {       //disable user edit in JTable by overriding issCellEditable and return false
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };



        jt.setPreferredScrollableViewportSize(new Dimension(600,600));
        // to all data without scrolling.
        jt.setFillsViewportHeight(true);
        jt.setRowSelectionAllowed(false);
        add(jt);
    }

    public static void main(String args[]){
        ReactTimesTables t=new ReactTimesTables();
        t.setSize(600,600);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
