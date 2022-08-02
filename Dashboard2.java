import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Dashboard2 extends JFrame implements ActionListener{ 

    JButton lgbtn,prvbtn,exbtn;

    Dashboard2(){
        //Creating Frame
        JFrame frm = new JFrame("Dashboard2"); 
        //NextButton
        lgbtn = new JButton("Logout");
        lgbtn.setBounds(400, 100, 130, 60);
        lgbtn.setBackground(Color.orange);
        lgbtn.addActionListener(this);
        //Previous Button
        prvbtn=new JButton("Previous");
        prvbtn.setBounds(150, 100, 130, 60);
        prvbtn.setBackground(Color.orange);
        prvbtn.addActionListener(this);
        //Exit Button
        exbtn=new JButton("Exit");
        exbtn.setBounds(270, 250, 130, 60);
        exbtn.setBackground(Color.orange);
        exbtn.addActionListener(this);
            //ALL Component Added
            frm.add(lgbtn);
            frm.add(exbtn);
            frm.add(prvbtn);
            frm.setSize(400, 400);
            frm.setLayout(null);
            frm.setVisible(true);
            frm.setBounds(400,  200, 700, 500);
    }
    public void actionPerformed(ActionEvent e) {
		if(e.getSource()==lgbtn)
        {  
            new Login_Page();
        }  
            if(e.getSource()==exbtn)
            {  
                System.exit(0);
            }  
            if(e.getSource()==prvbtn)
            {  
                new Dashboard1();
            } 
            }
    }