import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JFrame;

class Main{

  public static void main (String [] args) {

    JFrame frame = new JFrame();
    JOptionPane.showMessageDialog(frame,"Type a sentence:");

    String response = JOptionPane.showInputDialog("");

    Sentence sent1 = new Sentence(response);
    sent1.getBlankPositions();
    sent1.countWords();
    sent1.getWords();

    String output1 = "" + sent1.getBlankPositions();
    String output2 = "" + sent1.countWords();
    String output3 = "";

    for (String word : sent1.getWords())
    output3 += word + " ";

    JOptionPane.showMessageDialog(frame, output3 + " This has " + output2 + " words and spaces located at " + output1);
  }
}
