
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login_Page extends JFrame implements ActionListener {

    JFrame frame;

    ImageIcon img;
    JLabel imgLabel1,imgLabel2;

    JLabel label1,label2;

    JTextField tf1;
    JPasswordField pf1;

    JButton lgbtn,ftbtn,sgbtn,exbtn;

     Login_Page() {
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame = new JFrame("LoginPage");
        label1 = new JLabel("Username :");
        label1.setBounds(190, 50, 150, 20);

        label2 = new JLabel("Password :");
        label2.setBounds(190, 80, 150, 20);

        tf1 = new JTextField();
        tf1.setBounds(280, 50, 150, 20);
        tf1.setBackground(Color.lightGray);

        pf1 = new JPasswordField();
        pf1.setBounds(280, 80, 150, 20);
        pf1.setBackground(Color.lightGray);

        lgbtn = new JButton("Login");
        lgbtn.setBounds(170, 140, 130, 60);
        lgbtn.setBackground(Color.orange);
        lgbtn.addActionListener(this);

        ftbtn = new JButton("Forget Pass");
        ftbtn.setBounds(400, 140, 130, 60);
        ftbtn.setBackground(Color.orange);
        ftbtn.addActionListener(this);

        sgbtn = new JButton("SignUp");
        sgbtn.setBounds(170, 240, 130, 60);
        sgbtn.setBackground(Color.orange);
        sgbtn.addActionListener(this);

        exbtn = new JButton("Exit");
        exbtn.setBounds(400, 240, 130, 60);
        exbtn.setBackground(Color.orange);
        exbtn.addActionListener(this);

        img = new ImageIcon("user.png");
		imgLabel1 = new JLabel(img);
		imgLabel1.setBounds(110, 11, 100, 100);

        img = new ImageIcon("lock.png");
		imgLabel2 = new JLabel(img);
		imgLabel2.setBounds(110, 40, 100, 100);


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
        frame.setBackground(Color.orange);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBounds(400,  200, 700, 500);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == lgbtn) {
            String user = tf1.getText();
            String pass = pf1.getText();

            if (user.equals(" ") && pass.equals(" ")) {
                frame.setVisible(false);
                new Dashboard1();
            } 
            else {
                showMessageDialog(null, "Invalid Username and password!");
            } 
        }
            if(e.getSource()==exbtn)
            {
                System.exit(0);
            }
            }

                
        }
    