import javax.swing.*;
import java.awt.*;


public class Dashboard2 extends JFrame{
    JButton nxbtn;
    JButton prvbtn;
    JButton exbtn;

Dashboard2(){

    JFrame f = new JFrame("Dashboard2"); 
    nxbtn = new JButton("Next");
    nxbtn.setBounds(150, 50, 130, 60);
    nxbtn.setBackground(Color.orange);

    prvbtn=new JButton("Previous");
    prvbtn.setBounds(150, 150, 130, 60);
    prvbtn.setBackground(Color.orange);

    exbtn=new JButton("Exit");
    exbtn.setBounds(150, 250, 130, 60);
    exbtn.setBackground(Color.orange);

    
        f.add(nxbtn);
        f.add(exbtn);
        f.add(prvbtn);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.setBounds(400,  200, 700, 500);
}

}
