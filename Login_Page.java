import javax.swing.*;
import java.awt.event.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login_Page extends JFrame implements ActionListener {

    JFrame frame;

    ImageIcon img;
    JLabel imgLabel1,imgLabel2;

    JLabel label1;
    JLabel label2;

    JTextField tf1;
    JPasswordField pf1;

    JButton lgbtn;
    JButton ftbtn;
    JButton sgbtn;
    JButton exbtn;

    public Login_Page() {
        frame = new JFrame("LoginPage");
        label1 = new JLabel("Username :");
        label1.setBounds(70, 50, 150, 20);

        label2 = new JLabel("Password :");
        label2.setBounds(70, 80, 150, 20);

        tf1 = new JTextField();
        tf1.setBounds(150, 50, 150, 20);

        pf1 = new JPasswordField();
        pf1.setBounds(150, 80, 150, 20);

        lgbtn = new JButton("Login");
        lgbtn.setBounds(45, 140, 130, 60);
        lgbtn.addActionListener(this);

        ftbtn = new JButton("Forget Pass");
        ftbtn.setBounds(200, 140, 130, 60);
        ftbtn.addActionListener(this);

        sgbtn = new JButton("SignUp");
        sgbtn.setBounds(45, 240, 130, 60);
        sgbtn.addActionListener(this);

        exbtn = new JButton("Exit");
        exbtn.setBounds(200, 240, 130, 60);
        exbtn.addActionListener(this);

        img = new ImageIcon("user.png");
		imgLabel1 = new JLabel(img);
		imgLabel1.setBounds(3, 11, 100, 100);

        img = new ImageIcon("lock.png");
		imgLabel2 = new JLabel(img);
		imgLabel2.setBounds(3, 40, 100, 100);


        frame.add(imgLabel1);
        frame.add(imgLabel2); 
        frame.add(label1);
        frame.add(label2);
        frame.add(tf1);
        frame.add(pf1);
        frame.add(lgbtn);
        frame.add(ftbtn);
        frame.add(sgbtn);
        frame.add(exbtn);
        frame.setSize(400, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == lgbtn) {
            String user = tf1.getText();
            String pass = pf1.getText();

            if (user.equals("safkat") && pass.equals("123")) {
                frame.setVisible(false);
                new LogInSucces();
            } else {
                showMessageDialog(null, "Invalid Username and password!");
            }

        }
    }
}