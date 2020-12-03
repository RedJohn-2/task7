package denis.korchagin.GUIMain;

import javax.swing.*;
import java.awt.*;

public class FrameMain extends JFrame {
    private JButton buttonCalc;
    private JPanel mainPanel;
    private JTextField textFieldArray;
    private JTextField textFieldSum;
    private JLabel labelArray;
    private JLabel labelSum;

    public FrameMain() {
        super("Task 7");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setVisible(true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width / 2 - 210, dimension.height / 2 - 40, 420, 80);
        pack();

        this.buttonCalc.addActionListener(new ListenerButtonCalc(textFieldArray, textFieldSum));
    }
}
