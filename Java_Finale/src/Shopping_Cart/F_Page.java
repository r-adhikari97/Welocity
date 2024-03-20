package Shopping_Cart;

import java.awt.*;
import java.awt.event.*;

class FAQPage extends  Frame{

    TextArea t_area;
    Label L;
    int flag;
    FAQPage (int flag){
        this.flag = flag;

        setSize(700, 500);
        setLayout(null);
        setVisible(true);


        ///////////////////////////////////////// Header panel ///////////////////////////////
        Panel H_Panel = new Panel(null);
        H_Panel.setBounds(0, 0, 700, 100);
        H_Panel.setBackground(new Color(34, 38, 62));
        add(H_Panel);

        // Header Panel Name
        Label l_title = new Label("FAQ's");
        l_title.setBounds(320, 50, 250, 30);
        l_title.setForeground(new Color(217, 217, 217));
        Font Header_panel_font = new Font("Roboto", Font.BOLD, 23);            //Font Declaration
        l_title.setFont(Header_panel_font);
        H_Panel.add(l_title);

        // Header Pamel Label
        L = new Label(" Back");
        L.setForeground(new Color(255,255,255));
        L.setBounds(20,40,50,50);
        H_Panel.add(L);
        L.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(flag == 0){
                    Home_Page H = new Home_Page();
                    dispose();
                } else if (flag == 1) {
                    Home_Page H = new Home_Page("Hi Admin!",1);
                    dispose();
                }
            }
        });


        ////////////////////////////////////////// text area //////////////////////////////////////

        t_area = new TextArea("\n 1. How do I know what size shoe to order?\n\n\t> We have a size chart available to help you determine the best fit for you." +
                "\n\n\n\n 2. Can I customize my shoes?\n\n\t> We offer customization options, which can be found on desired product pages." +
                "\n\n\n\n 3. What payment methods do you accept?\n\n\t> We accept credit/debit cards, PayPal, Apple Pay, and Google Pay." +
                "\n\n\n\n 4. What is your price range for shoes?\n\n\t> Our prices range from Rs. 799. Price increases depending on the Customization." +
                "\n\n\n\n 5. Do you offer any discounts or promotions?\n\n\t> Occasional discounts and promotions, which can be found on our website or \n\t    social media pages." +
                "\n\n\n\n 6. Do you offer any vegan or cruelty-free options?\n\n\t> Yes, we offer a variety of line-up specialize in vegan and cruelty-free shoes." +
                "\n\n\n\n 7. Can I cancel my order?\n\n\t> Within 24 hours fo placing an order." +
                "\n\n\n\n 8. How do I know if a shoe is in stock?\n\n\t> If a shoe is out of stock, it will be listed as \"Currently Unavailable\" \n\t    on the product page." +
                "\n\n\n\n 9. Do you have a loyalty program?\n\n\t> Yes, we have a rewards program that allows you to earn points on\n\t    your purchases and redeem them for discounts." +
                "\n\n\n\n 10. How long will it take for my order to arrive?\n\n\t> Shipping times vary based on your location, but most orders\n\t    arrive within 3-7 business days.");
        t_area.setBounds(25, 120, 650, 350);
        Font T_field_font = null;
        t_area.setBackground(new Color(235, 235, 235));
        Font T_A_font = new Font("Roboto", Font.BOLD, 14);                      //Font Declaration
        t_area.setFont(T_A_font);
        add(t_area);
        t_area.setEditable(false);




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
}

public class F_Page {
}
