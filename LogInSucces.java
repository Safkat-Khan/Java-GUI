import javax.swing.*;

public class LogInSucces {
    JLabel l1;

    LogInSucces() {
        JFrame f = new JFrame("Log in Succesfull");
        l1 = new JLabel("You Have Succesfully Login");
        l1.setBounds(80, 50, 300, 200);

        f.add(l1);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);

    }

}
