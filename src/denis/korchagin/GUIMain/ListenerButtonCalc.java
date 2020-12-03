package denis.korchagin.GUIMain;

import denis.korchagin.SumBetweenPrimeNumbers;
import denis.korchagin.utils.ArrayUtils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerButtonCalc implements ActionListener {
    JTextField textFieldArray;
    JTextField textFieldSum;

    public ListenerButtonCalc(JTextField textFieldArray, JTextField textFieldSum) {
        this.textFieldArray = textFieldArray;
        this.textFieldSum = textFieldSum;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String array = textFieldArray.getText();
        int[] arr = ArrayUtils.toIntArray(array);
        this.textFieldSum.setText(Integer.toString(SumBetweenPrimeNumbers.calcSumBetweenPrimeNumbers(arr)));
    }
}
