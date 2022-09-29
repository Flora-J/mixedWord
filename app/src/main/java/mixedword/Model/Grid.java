package mixedword.Model;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Grid {


    private Integer length;
    private Integer width;

    public Grid(Integer length, Integer width) {
        JFrame jFrame = new JFrame();
        JPanel pan = new JPanel(new GridLayout(length, width));
        Border blacklines = BorderFactory.createLineBorder(Color.black, 1);
        for (int i = 0; i < length * width; i++) {
            JPanel cases = new JPanel();
            cases.setBorder(blacklines);
            pan.add(cases);
        }
        jFrame.setSize(1000, 500);
        pan.setBorder(blacklines);
        jFrame.add(pan);
        jFrame.setVisible(true);
    }
}
