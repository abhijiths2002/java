import java.awt.*;
import java.awt.event.*;
public class MaxThreeNumbersAWT
 {
    public static void main(String[] args) 
    {
        Frame frame = new Frame("Find Maximum");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        Label label1 = new Label("Number 1:");
        TextField num1 = new TextField(10);
        Label label2 = new Label("Number 2:");
        TextField num2 = new TextField(10);
        Label label3 = new Label("Number 3:");
        TextField num3 = new TextField(10);
        Button findMaxButton = new Button("Find Max");
        Label resultLabel = new Label("Maximum: ");
        findMaxButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    int n1 = Integer.parseInt(num1.getText());
                    int n2 = Integer.parseInt(num2.getText());
                    int n3 = Integer.parseInt(num3.getText());
                    int max = Math.max(n1, Math.max(n2, n3));
                    resultLabel.setText("Max=" + max);
                } catch (NumberFormatException ex) 
                {
                    resultLabel.setText("Please enter valid numbers!");
                }
            }
        });
        frame.add(label1);
        frame.add(num1);
        frame.add(label2);
        frame.add(num2);
        frame.add(label3);
        frame.add(num3);
        frame.add(findMaxButton);
        frame.add(resultLabel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we) 
            {
                frame.dispose();
            }
        });
    }
}

