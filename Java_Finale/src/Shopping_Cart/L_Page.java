package Shopping_Cart;

import java.awt.*;
import java.awt.event.*;

class Login_Page extends  Frame implements ActionListener {

    Label l_username, l_password, l_feed,L;
    TextField t_username, t_password;

    Button but_verify;

    Login_Page(int x) {

        // Frame setup
        super("Login");
        setSize(700, 500);
        setLayout(null);
        setVisible(true);



        // Header panel
        Panel H_Panel = new Panel(null);
        H_Panel.setBounds(0, 0, 700, 100);
        H_Panel.setBackground(new Color(34, 38, 62));
        add(H_Panel);

        // Header Panel : Quick Access Label
        L = new Label(" Back");
        L.setForeground(new Color(255,255,255));
        L.setBounds(20,40,50,50);
        L.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Home_Page H = new Home_Page();
                dispose();
            }
        });

        // Header Panel ----> Label Back
        H_Panel.add(L);


        // Header Panel Name
        Label l_title = new Label("Login to Continue...");
        l_title.setBounds(250, 50, 250, 30);
        l_title.setForeground(new Color(217, 217, 217));
        Font Header_panel_font = new Font("Roboto", Font.BOLD, 23);            //Font Declaration
        l_title.setFont(Header_panel_font);
        H_Panel.add(l_title);



        /////////////////////////////////// Username label and text field ////////////////////////////////////
        l_username = new Label("Username:");
        l_username.setBounds(200, 185, 100, 20);
        l_username.setBackground(new Color(217,217,217));
        Font l_username_password_font = new Font("Roboto", Font.BOLD, 15);       //Font declaration
        l_username.setFont(l_username_password_font);
        add(l_username);


        //textfield username

        t_username = new TextField();
        t_username.setBounds(300, 185, 200, 25);
        t_username.setBackground(new Color(235,235,235));
        Font l_username_font_entry = new Font("Roboto", Font.BOLD, 13);   //Font declaration
        t_username.setFont(l_username_font_entry);
        add(t_username);



        ////////////////////////////// Password label and text field  ////////////////////////////////////////
        l_password = new Label("Password:");
        l_password.setBounds(200, 235, 100, 20);
        l_password.setBackground(new Color(217,217,217));
        l_password.setFont(l_username_password_font);
        add(l_password);


        //password textfield

        t_password = new TextField();
        t_password.setBounds(300, 235, 200, 25);
        t_password.setBackground(new Color(235,235,235));
        Font pass_font = new Font("roboto", Font.BOLD, 20);
        t_password.setFont(pass_font);
        t_password.setEchoChar('*');
        add(t_password);



        //////////////////////////////////////// Verify button /////////////////////////////////////
        but_verify = new Button("V E R I F Y");
        but_verify.setBounds(205, 295, 295, 30);
        Font verify_font = new Font("roboto",Font.BOLD, 13);           //Font Declaration
        but_verify.setFont(verify_font);
        but_verify.setBackground(new Color(255,150,0));
        but_verify.setForeground(new Color(0,0,0));
        add(but_verify);
        but_verify.addActionListener(this);


        ///////////////////////////////////////  HINT LABEL ////////////////////////////
        Label l_Hint = new Label("Username: admin / Password: qwerty");
        l_Hint.setBackground(new Color(217,217,217));
        l_Hint.setForeground(new Color(34, 38, 62));
        Font hint = new Font("roboto", Font.TRUETYPE_FONT, 11);             //Font declaration
        l_Hint.setFont(hint);
        l_Hint.setBounds(20,470,250,20);
        add(l_Hint);


        /////////////////////////////////// CRED_FEEDBACK ///////////////////////////////
        l_feed = new Label();
        l_feed.setBackground(new Color(217,217,217));
        Font feed = new Font("roboto", Font.TRUETYPE_FONT, 12);            //Font Declaration
        l_feed.setFont(feed);
        l_feed.setBounds(275,350,500,20);
        add(l_feed);

        // Window listener
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(217, 217, 217));
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String input_username = new String(t_username.getText());
        String input_password = new String(t_password.getText());

        if (input_username.equals("admin") && input_password.equals("qwerty")){
            l_feed.setText("Successful");
            l_feed.setForeground(new Color(0,180,0));
             Home_Page A = new Home_Page("Hi Admin!",1);
             dispose();

        } else {
            l_feed.setText("Invalid Username / Password");
            l_feed.setForeground(new Color(200,0,0));
        }
    }
}


    /////////////////////////////////////// VERIFY Btn DOES WHAT? ////////////////////////////////////////////////////


public class L_Page {
}
