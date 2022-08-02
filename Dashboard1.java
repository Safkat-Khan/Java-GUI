
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Dashboard1 extends JFrame implements ActionListener{ 

    JFrame frame1;

    JComboBox combo;

    JRadioButton rb1, rb2, rb3, rb4;
    ButtonGroup bg1;

    ImageIcon img;
    JLabel imgLabel;

    JButton nxbtn,prvbtn,exbtn;

    Dashboard1() {
        //Creating Frame
        frame1 = new JFrame("Dashboard1");
        //StudentCheakBox
        JCheckBox checkBox1 = new JCheckBox("Student");
        checkBox1.setBounds(50, 150, 100, 30);
        //Teacher CheakBox
        JCheckBox checkBox2 = new JCheckBox("Teacher");
        checkBox2.setBounds(50, 180, 100, 30);
        //admin CheakBox
        JCheckBox checkBox3 = new JCheckBox("Admin");
        checkBox3.setBounds(50, 210, 100, 30);
        //ComboBOx
        String items[] = { "C++", "JAVA", "HTML", "CSS", "JAVASCRIPT" };
        combo = new JComboBox(items);
        combo.setBounds(235, 20, 100, 30);
        //Radio Button
        rb1 = new JRadioButton("A");
		rb1.setBounds(475, 25, 100, 20);
        rb2 = new JRadioButton("B");
		rb2.setBounds(475, 50, 100, 20);
        rb3 = new JRadioButton("C");
		rb3.setBounds(475, 75, 100, 20);
        rb4 = new JRadioButton("D");
        rb4.setBounds(475, 100, 100, 20);
        //Img Added
        img = new ImageIcon("background.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(170, 100, 250, 250);
        //NextButton
        nxbtn = new JButton("Next");
        nxbtn.setBounds(500, 150, 130, 60);
        nxbtn.setBackground(Color.orange);
        nxbtn.addActionListener(this);
        //Previous Button
        prvbtn=new JButton("Previous");
        prvbtn.setBounds(500, 250, 130, 60);
        prvbtn.setBackground(Color.orange);
        prvbtn.addActionListener(this);
        //Exit Button
        exbtn=new JButton("Exit");
        exbtn.setBounds(250, 380, 130, 60);
        exbtn.setBackground(Color.orange);
        exbtn.addActionListener(this);
        //Button Group
        bg1 = new ButtonGroup();
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
        bg1.add(rb4);
		//ALL Component Added
        frame1.add(checkBox1);
        frame1.add(checkBox2);
        frame1.add(checkBox3);
        frame1.add(combo);
        frame1.add(rb1);
        frame1.add(rb2);
        frame1.add(rb3);
        frame1.add(rb4);
        frame1.add(nxbtn);
        frame1.add(exbtn);
        frame1.add(prvbtn);
        frame1.add(imgLabel);
        frame1.setSize(500, 500);
        frame1.setLayout(null);
        frame1.setVisible(true);
        frame1.setBounds(400,  200, 700, 500);
    }
    //Button Action Perform
        public void actionPerformed(ActionEvent e) {
        if(e.getSource()==prvbtn)
		{  
			new Login_Page();
			frame1.setVisible(false);
        }  
            if(e.getSource()==nxbtn)
            {  
                new Dashboard2();
                frame1.setVisible(false);
                //System.exit(0);
            }  
                if(e.getSource()==exbtn)
                {
                    System.exit(0);
                }
                }
    }
