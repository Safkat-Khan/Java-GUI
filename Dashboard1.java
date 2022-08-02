
import javax.swing.*;
import java.awt.*;

public class Dashboard1 extends JFrame {
    JComboBox combo;
    JRadioButton rb1, rb2, rb3, rb4;
    ButtonGroup bg1;

    ImageIcon img;
    JLabel imgLabel;

    JButton nxbtn;
    JButton prvbtn;
    JButton exbtn;

    Dashboard1() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame f = new JFrame("Dashboard1");
        JCheckBox checkBox1 = new JCheckBox("Student");
        checkBox1.setBounds(50, 150, 100, 30);
        
        JCheckBox checkBox2 = new JCheckBox("Teacher");
        checkBox2.setBounds(50, 180, 100, 30);

        
        JCheckBox checkBox3 = new JCheckBox("Admin");
        checkBox3.setBounds(50, 210, 100, 30);

        String items[] = { "C++", "JAVA", "HTML", "CSS", "JAVASCRIPT" };
        combo = new JComboBox(items);
        combo.setBounds(235, 20, 100, 30);

        rb1 = new JRadioButton("A");
		rb1.setBounds(475, 25, 100, 20);
		
        rb2 = new JRadioButton("B");
		rb2.setBounds(475, 50, 100, 20);
	

        rb3 = new JRadioButton("C");
		rb3.setBounds(475, 75, 100, 20);
    
        rb4 = new JRadioButton("D");
        rb4.setBounds(475, 100, 100, 20);
        
        img = new ImageIcon("background.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(170, 100, 250, 250);

        nxbtn = new JButton("Next");
        nxbtn.setBounds(500, 150, 130, 60);
        nxbtn.setBackground(Color.orange);

        prvbtn=new JButton("Previous");
        prvbtn.setBounds(500, 250, 130, 60);
        prvbtn.setBackground(Color.orange);

        exbtn=new JButton("Exit");
        exbtn.setBounds(250, 380, 130, 60);
        exbtn.setBackground(Color.orange);



        bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
        bg1.add(rb4);
		

        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox3);
        f.add(combo);
        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(rb4);
        f.add(nxbtn);
        f.add(exbtn);
        f.add(prvbtn);
        f.add(imgLabel);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setBounds(400,  200, 700, 500);

    }
}