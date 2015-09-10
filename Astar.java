/**
 * @author Dominic Salas
 *
 * Our Main class that creates our initial frame.
 */

import javax.swing.*;

public class Astar {

    public static void main(String[] args) {
        JFrame frame = new JFrame(String.valueOf("Cost: "));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new Astar_GUI(frame));
        //frame.pack();
        frame.setVisible(true);
        frame.setSize(640, 691);
    }
}
