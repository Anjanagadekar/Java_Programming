import javax.swing.*;

class PPAFrameComponents
{
    public static void main(String A[])
    {
        JFrame fobj = new JFrame("PPA");

        JButton bobj=new JButton("OK");

        bobj. setBounds(100,100,150,50);        //to set positoin

        fobj.add(bobj);

        fobj. setSize(400, 300);

        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        fobj. setVisible(true);

        fobj.setLayout(null);

        
    }
}