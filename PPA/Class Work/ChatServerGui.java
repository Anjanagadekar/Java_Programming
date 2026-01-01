import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.event.*;

class ChatMessanger implements ActionListener
{
    JFrame fobj;
    JButton bobj;
    JTextField tobj;
    JLabel msg, Resultlabel;
    static ServerSocket ssobj;
    static Socket sobj;
    static PrintStream pobj;
    static BufferedReader bobj1, bobj2;


     public ChatMessanger(String title, int width, int height)
    {
        fobj = new JFrame(title);

        msg = new JLabel("Message");
        msg.setBounds(50, 50, 100, 30);

        tobj = new JTextField();
        tobj.setBounds(150, 50, 150, 30);

        bobj = new JButton("SEND");
        bobj.setBounds(150, 150, 100, 30);

        Resultlabel = new JLabel("");
        Resultlabel.setBounds(200, 200, 150, 30);

        fobj.add(bobj);
        fobj.add(tobj);
        fobj.add(msg);
        fobj.add(Resultlabel);

        bobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width, height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
       public void actionPerformed(ActionEvent aobj)
    {
        String str1;
        str1 = tobj.getText();
        pobj.println(str1);

        Resultlabel.setText("");
       
        
    }

    
}
class ChatServerGui
{
    public static void main(String A[]) throws Exception
    {
        ServerSocket ssobj = new ServerSocket(5100);
        System.out.println("Server is waiting at port 5100");

        Socket sobj = ssobj.accept();
        System.out.println("client request gets accepted successfully");

        PrintStream pobj = new PrintStream(sobj.getOutputStream());
        BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader bobj2 = new BufferedReader(new InputStreamReader(System.in));
        ChatMessanger cobj = new ChatMessanger("Server", 400,300);






        String str = bobj1.readLine();
        System.out.println("Client says "+ str);
        System.out.println("enter message for client");
        str = bobj2. readLine();
        
    }
}