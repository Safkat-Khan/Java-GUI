import javax.swing.*;

public class Dashboard1 extends JFrame {
    JComboBox combo;
    ImageIcon img;

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



        f.add(checkBox1);
        f.add(checkBox2);
        f.add(combo);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }
}