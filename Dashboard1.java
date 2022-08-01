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
        checkBox1.setBounds(50, 50, 100, 20);
        JCheckBox checkBox2 = new JCheckBox("Teacher", true);
        checkBox2.setBounds(50, 70, 100, 30);

        String items[] = { "C++", "JAVA", "HTML", "CSS", "JAVASCRIPT" };
        combo = new JComboBox(items);
        combo.setBounds(135, 20, 100, 30);

        rb1 = new JRadioButton("A");
		rb1.setBounds(275, 25, 100, 20);
		
        rb2 = new JRadioButton("B");
		rb2.setBounds(275, 50, 100, 20);
	

        rb3 = new JRadioButton("C");
		rb3.setBounds(275, 75, 100, 20);
    
        rb4 = new JRadioButton("D");
        rb4.setBounds(275, 100, 100, 20);
        
        img = new ImageIcon("background.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(10, 100, 250, 250);

        nxbtn = new JButton("Next");
        nxbtn.setBounds(300, 150, 130, 60);
        nxbtn.setBackground(Color.orange);

        prvbtn=new JButton("Previous");
        prvbtn.setBounds(300, 250, 130, 60);
        prvbtn.setBackground(Color.orange);

        exbtn=new JButton("Exit");
        exbtn.setBounds(125, 380, 130, 60);
        exbtn.setBackground(Color.orange);



        bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
        bg1.add(rb4);
		

        f.add(checkBox1);
        f.add(checkBox2);
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

    }
}