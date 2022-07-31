import javax.swing.*;

public class Dashboard1 extends JFrame {
    JComboBox combo;
    ImageIcon img;
    JRadioButton rb1, rb2, rb3, rb4;
    ButtonGroup bg1;

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
		rb1.setBounds(250, 50, 100, 20);
		
        rb2 = new JRadioButton("B");
		rb2.setBounds(250, 75, 100, 20);
	

        rb3 = new JRadioButton("C");
		rb3.setBounds(250, 100, 100, 20);
		f.add(rb3);
        
        rb4 = new JRadioButton("D");
        rb4.setBounds(250, 125, 100, 20);
        f.add(rb4);

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
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
}