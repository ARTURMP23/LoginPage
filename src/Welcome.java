import javax.swing.*;
import java.awt.*;

public class Welcome {

    JFrame frame = new JFrame("Hello page");
    JLabel welcomeLabel = new JLabel("Hello!");

    Welcome(String userID){

        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font("Oswald", Font.BOLD,25));
        welcomeLabel.setText("Hello "+ userID);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
    }


}
