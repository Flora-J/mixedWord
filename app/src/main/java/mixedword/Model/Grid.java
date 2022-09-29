package mixedword.Model;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Grid {


    private Integer length;
    private Integer width;

    public Grid(Integer length, Integer width) {
        JFrame t = new JFrame();
        JPanel pan = new JPanel(new GridLayout(length, width));
        Border blackline = BorderFactory.createLineBorder(Color.black, 1);
        for (int i = 0; i < length * width; i++) {
            JPanel ptest = new JPanel();
            ptest.setBorder(blackline);
            pan.add(ptest);
        }
        pan.setBorder(blackline);
        t.add(pan);
        t.setVisible(true);
    }
}
