package Shopping_Cart;

import java.awt.*;
import java.awt.event.*;
import java.util.function.*;



class Reviews extends Frame implements ActionListener{
    TextArea t_area;
    TextField t_Field;
    Button Add_but, clr_but;
    Label L;
    int flag = 0;
    Reviews(int x){
        this.flag = x;

        setSize(700, 500);
        setLayout(null);
        setVisible(true);


        ///////////////////////////////////////// Header panel ///////////////////////////////
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
                if(e.getSource() == L){
                    if(flag == 1){
                        Home_Page H = new Home_Page("Hi Admin!",1);
                        dispose();
                    } else if (flag == 0) {
                        Home_Page H = new Home_Page("Hi User!",0);
                        dispose();
                    }

                }
            }
        });



        // Header Panel Components :
        H_Panel.add(L);

        // Header Panel Name
        Label l_title = new Label("Reviews");
        l_title.setBounds(305, 50, 250, 30);
        l_title.setForeground(new Color(217, 217, 217));
        Font Header_panel_font = new Font("Roboto", Font.BOLD, 23);            //Font Declaration
        l_title.setFont(Header_panel_font);
        H_Panel.add(l_title);


        //////////////////////////////////////////text area //////////////////////////////////////

        t_area = new TextArea("\n\t\t\t\t\tREVIEWS & COMMENTS\n\n\n > Unique experiences\n\n\n > Reliable Tool\n\n\n > This gave me what i was searching for" +
                "\n\n\n > Thanks peps. U'r best\n\n\n > It doesn't work.\n\t --> It works get good internet first\n\n\n > Great Experience It is.\n");

        t_area.setBounds(25, 120, 650, 220);
        Font T_field_font = null;
        t_area.setBackground(new Color(235, 235, 235));
        Font T_A_font = new Font("Roboto", Font.BOLD, 13);                      //Font Declaration
        t_area.setFont(T_A_font);
        add(t_area);
        t_area.setEditable(false);


        ///////////////////////////////////// create textfield /////////////////////////////////

        t_Field = new TextField();
        t_Field.setBounds(25, 370, 650, 40);
        t_Field.setBackground(new Color(235, 235, 235));
        T_field_font = new Font("Roboto", Font.BOLD, 13);                      //Font Declaration
        t_Field.setFont(T_field_font);
        add(t_Field);

        ////////////////////////////////////// create button ///////////////////////////////////

        Font but_font = new Font("roboto",Font.BOLD, 13);           //Font Declaration

        Add_but = new Button("S U B M I T");
        Add_but.setBounds(125, 440, 125, 30);
        add(Add_but);
        Add_but.setBackground(new Color(255,150,0));
        Add_but.setForeground(new Color(34, 38, 62));
        Add_but.setFont(but_font);
        Add_but.addActionListener(this);


        clr_but = new Button("C L E A R");
        clr_but.setBounds(450, 440, 125, 30);
        add(clr_but);
        clr_but.setBackground(new Color(255,150,0));
        clr_but.setFont(but_font);
        clr_but.setForeground(new Color(34, 38, 62));
        clr_but.addActionListener(this);





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
    public void actionPerformed(ActionEvent e) {
        Home_Page A = new Home_Page();
        if (e.getSource()==Add_but){
            t_area.append("\n\n > " + t_Field.getText() + "\n");
            t_Field.setText(" ");
        } else if (e.getSource()==clr_but) {
            t_Field.setText(" ");
        }
    }

}

/////////////////////////////////////// Diver Code ////////////////////////////////////////////////////

public class R_Page {
}
