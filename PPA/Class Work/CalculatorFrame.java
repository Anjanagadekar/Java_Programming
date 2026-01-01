import javax.swing.*;
import java.awt.event.*;

class MarvellousLogin implements ActionListener
{   
    // Characteristics
    JFrame fobj;
    JButton bobj1;
    JButton bobj2;
    JButton bobj3;
    JButton bobj4;
    JTextField tobj1;
    JTextField tobj2;
    JLabel num1label, num2label, Resultlabel;
    
    public MarvellousLogin(String title, int width, int height)
    {
        fobj = new JFrame(title);
        

        num1label = new JLabel("Number 1");
        num1label.setBounds(50, 50, 100, 30);

        tobj1 = new JTextField();
        tobj1.setBounds(150, 50, 150, 30);

        num2label = new JLabel("Number 2");
        num2label.setBounds(50, 100, 100, 30);

        tobj2 = new JTextField();
        tobj2.setBounds(150, 100, 150, 30);

        bobj1 = new JButton("+");
        bobj1.setBounds(50, 150, 50, 30);

        bobj2 = new JButton("-");
        bobj2.setBounds(150, 150, 50, 30);

        bobj3 = new JButton("*");
        bobj3.setBounds(250, 150, 50, 30);

        bobj4 = new JButton("/");
        bobj4.setBounds(350, 150, 50, 30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(200, 200, 250, 30);

        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(num1label);
        fobj.add(num2label);
        fobj.add(Resultlabel);

        bobj1.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width, height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        String str1 = tobj1.getText();
        String str2 = tobj2.getText();

        if((str1.equals("10") && (str2.equals("1"))))
        {
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);

            int sum = num1 + num2;
            Resultlabel.setText("Result:"+sum);
        }
        else
        {
            Resultlabel.setText("Invalid input");
        }
    }
}

class CalculatorFrame
{
    public static void main(String A[])
    {
        MarvellousLogin mobj = new MarvellousLogin("Calculator", 500, 300);
    }
}