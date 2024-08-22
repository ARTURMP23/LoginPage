import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class Login implements ActionListener {

    JFrame frame = new JFrame("Login Frame");
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIDField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIDLabel = new JLabel("UserID: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel = new JLabel();
    Font myFont = new Font("New Amsterdam", Font.ITALIC,20);
    Border lineBorder = BorderFactory.createLineBorder(Color.BLACK, 2);




    HashMap<String, String> loginInfo = new HashMap<String, String>();

    Login(HashMap<String,String> loginInfoOriginal){

        loginInfo = loginInfoOriginal;

        userIDLabel.setBounds(50,100,75,25);
        userIDLabel.setForeground(Color.white);
        userPasswordLabel.setFont(new Font("New Amsterdam", Font.BOLD,12));


        userPasswordLabel.setBounds(50,150,75,25);
        userPasswordLabel.setForeground(Color.white);
        userPasswordLabel.setFont(new Font("New Amsterdam", Font.BOLD,12));

        messageLabel.setBounds(125,250,210,35);
        messageLabel.setFont(myFont);



        userIDField.setBounds(125,100,200,25);
        userIDField.setForeground(Color.BLACK);
        userIDField.setFont(new Font("New Amsterdam", Font.BOLD,12));

        userPasswordField.setBounds(125,150,200,25);
        userPasswordField.setForeground(Color.BLACK);
        userIDField.setFont(new Font("New Amsterdam", Font.BOLD,12));

        loginButton.setBounds(125,200,100,25);
        loginButton.setBackground(Color.lightGray);
        loginButton.addActionListener(this);
        loginButton.setFocusable(false);
        loginButton.setFont(new Font("Oswald", Font.BOLD,12));

        resetButton.setBounds(225,200,100,25);
        resetButton.setBackground(Color.lightGray);
        resetButton.addActionListener(this);
        resetButton.setFocusable(false);
        resetButton.setFont(new Font("Oswald", Font.BOLD,12));

        frame.add(userIDLabel);
        frame.add(userPasswordLabel);

        frame.add(messageLabel);

        frame.add(userPasswordField);
        frame.add(userIDField);

        frame.add(resetButton);
        frame.add(loginButton);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.darkGray);



    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton){
            userIDField.setText("");
            userPasswordField.setText("");
        }

        if (e.getSource() == loginButton){
            String userID = userIDField.getText();
            String password = String.valueOf(userPasswordField.getPassword());

            if (loginInfo.containsKey(userID)){
                if (loginInfo.get(userID).equals(password)){

                    messageLabel.setForeground(Color.green);
                    Border lineBorder = BorderFactory.createLineBorder(Color.green, 2);
                    messageLabel.setBorder(lineBorder);
                    messageLabel.setText("Login Successful");
                    frame.dispose();
                    Welcome welcome = new Welcome(userID);


                }
                else {
                    messageLabel.setForeground(Color.red);
                    Border lineBorder = BorderFactory.createLineBorder(Color.red, 2);
                    messageLabel.setText("Wrong Password");
                    messageLabel.setBorder(lineBorder);


                }
            }

            else{
                messageLabel.setForeground(Color.blue);
                Border lineBorder = BorderFactory.createLineBorder(Color.blue, 2);
                messageLabel.setText("Username not found");
                messageLabel.setBorder(lineBorder);

            }

        }
    }
}
