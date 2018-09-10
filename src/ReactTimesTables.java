import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.*;
import javax.swing.JScrollPane;


public class ReactTimesTables extends JFrame {

    JTable jt;
    public ReactTimesTables(){


        int size=10;
        String[]  colData = new String[size+1];
        String[][] rowData = new String[size ][size+1];

        for(int a=0;a<colData.length;a++){
            colData[a]=""+a;
        }

        for(int cellRow = 0;cellRow<rowData.length;cellRow++){

            for (int cellCol = 0; cellCol < rowData[0].length; cellCol++) {
                if(cellCol==0){
                    rowData[cellRow][cellCol]=""+(cellRow+1);
                }else{
                    rowData[cellRow][cellCol] = ""+(cellRow + 1) * cellCol;}
            }
        }


        jt =new JTable(rowData,colData);



        jt.setPreferredScrollableViewportSize(new Dimension(500,500));
        // to all data without scrolling.
        jt.setFillsViewportHeight(true);
        JScrollPane scrollPane=new JScrollPane(jt);

        add(scrollPane);
    }

    public static void main(String args[]){
        JFrame jt=new JFrame("React Times Table");
        ReactTimesTables t=new ReactTimesTables();
        jt.setSize(600,600);
        jt.setVisible(true);
        jt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jt.add(t);
    }

}
