package Shopping_Cart;

import java.awt.*;
import java.awt.Panel;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon.*;



import javax.imageio.ImageIO;
import javax.swing.*;


class Home_Page implements ActionListener, MouseListener {

    Frame F;
    boolean Flag;
    String val;
    int flag = 0;
    // Header and Menu Panel
    Panel H_Panel,M_Panel,M_Panel1;
    // Border Panels
    Panel B_Panel, B_Panel1,B_Panel2,B_Panel3;

    // Side Panels
    Panel S_panel1,S_Panel;
    // Product Panel
    Panel P,P1,P2;
    JButton B_Menu;
    Button B_Menu_E;

    // Header Panel Labels
    Label l1,l_title;
    // Menu Labels
    Label L1,L2,L3,L4;

    // Side Panel
    JLabel S1,S2,S3,S4,S5,S6;

    Home_Page(String val, int flag) {
        this.flag = flag;

        //////////////////////  Frame   ///////////////////////////////////

        F = new Frame("Data");
        F.setResizable(false);
        F.setBackground(new Color(225,225,225));
        F.setSize(700,500);
        F.setLocationRelativeTo(F);
        F.setLayout(null);

        ////////////////////////// Panel ///////////////////////////////////////////////////////////////////////////

        //////////////////// Header Panel ////////////////////////////////////////////////
        H_Panel = new Panel(null);
        H_Panel.setBackground(new Color(34,38,62));
        H_Panel.setBounds(0,0,700,100);

        // Components //
        ///// Header Border Panel
        B_Panel = new Panel(null);
        B_Panel.setBackground(new Color(255,255,255));
        B_Panel.setBounds(0,99,700,400);

        //// Menu Button ---> H_Panel
        Font Feed = new Font("roboto", Font.TRUETYPE_FONT, 16);
        B_Menu = new JButton();
        B_Menu.setFont(Feed);
        ImageIcon i1 = new ImageIcon("bar.png");
        B_Menu.setIcon(i1);
        B_Menu.setBounds(20,40,50,50);

        //// Label ---> H_Panel : User
        l1 = new Label(val);
        l1.setFont(Feed);
        l1.setForeground(new Color(255,255,255));
        l1.setBounds(600,40,100,50);

        //// Label ---> Velocity
        l_title = new Label("Welocity");
        l_title.setBounds(310, 50, 250, 30);
        l_title.setForeground(new Color(217, 217, 217));
        Font Header_panel_font = new Font("Roboto", Font.BOLD, 20);            //Font Declaration
        l_title.setFont(Header_panel_font);
        H_Panel.add(l_title);

        //// H_Panel : ADD ////////////////////////
        H_Panel.add(B_Menu);
        H_Panel.add(B_Panel);
        H_Panel.add(l1);


/*
        //////  M_Panel1 : Menu panel --> Side //////////////////
        M_Panel1 = new Panel(null);
        M_Panel1.setBackground(new Color(225,225,225));
        M_Panel1.setBounds(0,100,170,400);
*/

        ///////////////////////////////  Side Panel --> Home Panel  //////////////////

        S_Panel = new Panel(null);
        S_Panel.setBackground(new Color(225,225,225));
        S_Panel.setBounds(0,100,700,400);

        // Side Panel --- > Components ///
        // Images --- > Banner
        S1 = new JLabel();
        ImageIcon icon = new ImageIcon("Banner.png");
        S1.setIcon(icon);
        S1.setForeground(new Color(255,255,255));
        S1.setBounds(30,10,800,130);

        // Image Borders;
        Panel B1 = new Panel(null);
        B1.setBackground(new Color(34,38,62));
        B1.setBounds(30,7,640,2);

        Panel B2 = new Panel(null);
        B2.setBackground(new Color(34,38,62));
        B2.setBounds(30,141,640,2);


        // Discover : Label
        Font F1 = new Font("roboto", Font.TRUETYPE_FONT, 18);
        S2 = new JLabel("  Summer Deals  ");
        S2.setFont(F1);
        S2.setBounds(270,150,150,30);

        Panel DP = new Panel(null);
        DP.setBackground(new Color(34,38,62));
        DP.setBounds(50,165,590,2);

        Panel DP1 = new Panel(null);
        DP1.setBackground(new Color(34,38,62));
        DP1.setBounds(20,375,660,2);

        //////// Product Page ///////////////////////

        S3 = new JLabel();
        ImageIcon i3 = new ImageIcon("6.png");
        S3.setIcon(i3);
        S3.setBounds(40,195,125,160);
        S3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HEllo");
                F.remove(S_Panel);
                F.setBackground(new Color(130,130,130));

                // Panel -- > Bg
                P = new Panel(null);
                P.setBackground(new Color(225,225,225));
                P.setBounds(130,150,410,300);

                /////// Components :

                // Label : Close
                Label L = new Label("  X ");
                L.setForeground(new Color (255,255,255));
                L.setBackground(new Color(225,0,50));
                L.setBounds(372,5,23,23);

                // Panel : Border
                Panel x = new Panel(null);
                x.setBackground(new Color(32,38,62));
                x.setBounds(170,15,1,270);

                // TextArea : Decription
                String Val ="\n<--- Description --->\n\n\n > Unique Idea\n\n\n > Light weight, Built for running\n\n\n > Bright colors"+
                        "\n\n\n > Comfortable and Robust!";
                TextArea A = new TextArea(Val);
                A.setFont(new Font("roboto", Font.BOLD, 12));
                A.setBackground(new Color(225,225,225));
                A.setBounds(190,42,200,220);
                A.setEditable(false);

                // Label : Image
                JLabel I = new JLabel();
                ImageIcon i = new ImageIcon("11.png");
                I.setIcon(i);
                I.setBounds(15,5,150,230);

                // Label : Buy Now
                Label Buy = new Label("             Buy ");
                Buy.setBackground(new Color(32,38,64));
                Buy.setForeground(new Color(255,255,255));
                Buy.setBounds(30,250,100,30);

                L.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        F.remove(P);
                        F.add(S_Panel);
                    }
                });
                Flag = true;

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                F.add(P);




            }
        });


        S4 = new JLabel();
        ImageIcon i4 = new ImageIcon("2.png");
        S4.setIcon(i4);
        S4.setBounds(200,195,125,160);
        S4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hello 1");
                F.remove(S_Panel);
                F.setBackground(new Color(130,130,130));

                // Panel -- > Bg
                P = new Panel(null);
                P.setBackground(new Color(225,225,225));
                P.setBounds(130,150,410,300);

                /////// Components :

                // Label : Close
                Label L = new Label("  X ");
                L.setForeground(new Color (255,255,255));
                L.setBackground(new Color(225,0,50));
                L.setBounds(372,5,23,23);

                // Panel : Border
                Panel x = new Panel(null);
                x.setBackground(new Color(32,38,62));
                x.setBounds(170,15,1,270);

                // TextArea : Decription
                String Val ="\n<--- Description --->\n\n\n > Unique Idea\n\n\n > Light weight, Built for running\n\n\n > Bright colors"+
                        "\n\n\n > Comfortable and Robust!";
                TextArea A = new TextArea(Val);
                A.setFont(new Font("roboto", Font.BOLD, 12));
                A.setBackground(new Color(225,225,225));
                A.setBounds(190,42,200,220);
                A.setEditable(false);

                // Label : Image
                JLabel I = new JLabel();
                ImageIcon i = new ImageIcon("33.png");
                I.setIcon(i);
                I.setBounds(15,5,150,230);

                // Label : Buy Now
                Label Buy = new Label("             Buy ");
                Buy.setBackground(new Color(32,38,64));
                Buy.setForeground(new Color(255,255,255));
                Buy.setBounds(30,250,100,30);

                L.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        F.remove(P);
                        F.add(S_Panel);
                    }
                });
                Flag = true;

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                F.add(P);

            }
        });


        S5 = new JLabel();
        ImageIcon i5 = new ImageIcon("7.png");
        S5.setIcon(i5);
        S5.setBounds(360,195,125,160);
        S5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hello 2");
                F.remove(S_Panel);
                F.setBackground(new Color(130,130,130));

                // Panel -- > Bg
                P = new Panel(null);
                P.setBackground(new Color(225,225,225));
                P.setBounds(130,150,410,300);

                /////// Components :

                // Label : Close
                Label L = new Label("  X ");
                L.setForeground(new Color (255,255,255));
                L.setBackground(new Color(225,0,50));
                L.setBounds(372,5,23,23);

                // Panel : Border
                Panel x = new Panel(null);
                x.setBackground(new Color(32,38,62));
                x.setBounds(170,15,1,270);

                // TextArea : Decription
                String Val ="\n<--- Description --->\n\n\n > Unique Idea\n\n\n > Light weight, Built for running\n\n\n > Bright colors"+
                        "\n\n\n > Comfortable and Robust!";
                TextArea A = new TextArea(Val);
                A.setFont(new Font("roboto", Font.BOLD, 12));
                A.setBackground(new Color(225,225,225));
                A.setBounds(190,42,200,220);
                A.setEditable(false);

                // Label : Image
                JLabel I = new JLabel();
                ImageIcon i = new ImageIcon("66.png");
                I.setIcon(i);
                I.setBounds(15,5,150,230);

                // Label : Buy Now
                Label Buy = new Label("             Buy ");
                Buy.setBackground(new Color(32,38,64));
                Buy.setForeground(new Color(255,255,255));
                Buy.setBounds(30,250,100,30);

                L.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        F.remove(P);
                        F.add(S_Panel);
                    }
                });
                Flag = true;

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                F.add(P);
            }
        });



        S6 = new JLabel();
        ImageIcon i6 = new ImageIcon("8.png");
        S6.setIcon(i6);
        S6.setBounds(520,195,125,160);
        S6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(" HEllo 3");
                F.remove(S_Panel);
                F.setBackground(new Color(130,130,130));

                // Panel -- > Bg
                P = new Panel(null);
                P.setBackground(new Color(225,225,225));
                P.setBounds(130,150,410,300);

                /////// Components :

                // Label : Close
                Label L = new Label("  X ");
                L.setForeground(new Color (255,255,255));
                L.setBackground(new Color(225,0,50));
                L.setBounds(372,5,23,23);

                // Panel : Border
                Panel x = new Panel(null);
                x.setBackground(new Color(32,38,62));
                x.setBounds(170,15,1,270);

                // TextArea : Decription
                String Val ="\n<--- Description --->\n\n\n > Unique Idea\n\n\n > Light weight, Built for running\n\n\n > Bright colors"+
                        "\n\n\n > Comfortable and Robust!";
                TextArea A = new TextArea(Val);
                A.setFont(new Font("roboto", Font.BOLD, 12));
                A.setBackground(new Color(225,225,225));
                A.setBounds(190,42,200,220);
                A.setEditable(false);

                // Label : Image
                JLabel I = new JLabel();
                ImageIcon i = new ImageIcon("77.png");
                I.setIcon(i);
                I.setBounds(15,5,150,230);

                // Label : Buy Now
                Label Buy = new Label("             Buy ");
                Buy.setBackground(new Color(32,38,64));
                Buy.setForeground(new Color(255,255,255));
                Buy.setBounds(30,250,100,30);

                L.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        F.remove(P);
                        F.add(S_Panel);
                    }
                });
                Flag = true;

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                F.add(P);

            }
        });


        // S_Panel : Components
        S_Panel.add(S1);
        S_Panel.add(S2);
        S_Panel.add(S3);
        S_Panel.add(S4);
        S_Panel.add(S5);
        S_Panel.add(S6);
        S_Panel.add(DP);
        S_Panel.add(DP1);
        S_Panel.add(B1);
        S_Panel.add(B2);


        /// Frame : Components ////////////////////////////////
        F.add(H_Panel);
        //F.add(M_Panel1);
        F.add(S_Panel);


        // Frame : Funcstions
        F.setVisible(true);
        F.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                F.dispose();
            }
        });

        ///////////////// Action Listeners //////////////////////////////////////

        //// Buttons ///////
        B_Menu.addActionListener(this);

    }

    ///////// Constuctor Overloading //////////////////////////////////////////////////////////////////////////////////
    Home_Page() {

        //////////////////////  Frame   ///////////////////////////////////

        F = new Frame("Data");
        F.setResizable(false);
        F.setBackground(new Color(225,225,225));
        F.setSize(700,500);
        F.setLocationRelativeTo(F);
        F.setLayout(null);

        ////////////////////////// Panel ///////////////////////////////////////////////////////////////////////////

        //////////////////// Header Panel ////////////////////////////////////////////////
        H_Panel = new Panel(null);
        H_Panel.setBackground(new Color(34,38,62));
        H_Panel.setBounds(0,0,700,100);

        // Components //
        ///// Header Border Panel
        B_Panel = new Panel(null);
        B_Panel.setBackground(new Color(255,255,255));
        B_Panel.setBounds(0,99,700,400);

        //// Menu Button ---> H_Panel
        Font Feed = new Font("roboto", Font.TRUETYPE_FONT, 16);
        B_Menu = new JButton();
        B_Menu.setFont(Feed);
        ImageIcon i1 = new ImageIcon("bar.png");
        B_Menu.setIcon(i1);
        B_Menu.setBounds(20,40,50,50);

        //// Label ---> H_Panel : User
        l1 = new Label(" Hi  User! ");
        l1.setFont(Feed);
        l1.setForeground(new Color(255,255,255));
        l1.setBounds(600,40,100,50);

        //// Label ---> Velocity
        l_title = new Label("Welocity");
        l_title.setBounds(310, 50, 250, 30);
        l_title.setForeground(new Color(217, 217, 217));
        Font Header_panel_font = new Font("Roboto", Font.BOLD, 20);            //Font Declaration
        l_title.setFont(Header_panel_font);
        H_Panel.add(l_title);

        //// H_Panel : ADD ////////////////////////
        H_Panel.add(B_Menu);
        H_Panel.add(B_Panel);
        H_Panel.add(l1);


/*
        //////  M_Panel1 : Menu panel --> Side //////////////////
        M_Panel1 = new Panel(null);
        M_Panel1.setBackground(new Color(225,225,225));
        M_Panel1.setBounds(0,100,170,400);
*/

        ///////////////////////////////  Side Panel --> Home Panel  //////////////////

        S_Panel = new Panel(null);
        S_Panel.setBackground(new Color(225,225,225));
        S_Panel.setBounds(0,100,700,400);

        // Side Panel --- > Components ///
        // Images --- > Banner
        S1 = new JLabel();
        ImageIcon icon = new ImageIcon("Banner.png");
        S1.setIcon(icon);
        S1.setForeground(new Color(255,255,255));
        S1.setBounds(30,10,800,130);

        // Image Borders;
        Panel B1 = new Panel(null);
        B1.setBackground(new Color(34,38,62));
        B1.setBounds(30,7,640,2);

        Panel B2 = new Panel(null);
        B2.setBackground(new Color(34,38,62));
        B2.setBounds(30,141,640,2);


        // Discover : Label
        Font F1 = new Font("roboto", Font.TRUETYPE_FONT, 18);
        S2 = new JLabel("  Summer Deals  ");
        S2.setFont(F1);
        S2.setBounds(270,150,150,30);

        Panel DP = new Panel(null);
        DP.setBackground(new Color(34,38,62));
        DP.setBounds(50,165,590,2);

        Panel DP1 = new Panel(null);
        DP1.setBackground(new Color(34,38,62));
        DP1.setBounds(20,375,660,2);

        //////// Product Page ///////////////////////

        S3 = new JLabel();
        ImageIcon i3 = new ImageIcon("6.png");
        S3.setIcon(i3);
        S3.setBounds(40,195,125,160);
        S3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HEllo");
                F.remove(S_Panel);
                F.setBackground(new Color(130,130,130));

                // Panel -- > Bg
                P = new Panel(null);
                P.setBackground(new Color(225,225,225));
                P.setBounds(130,150,410,300);

                /////// Components :

                // Label : Close
                Label L = new Label("  X ");
                L.setForeground(new Color (255,255,255));
                L.setBackground(new Color(225,0,50));
                L.setBounds(372,5,23,23);

                // Panel : Border
                Panel x = new Panel(null);
                x.setBackground(new Color(32,38,62));
                x.setBounds(170,15,1,270);

                // TextArea : Decription
                String Val ="\n<--- Description --->\n\n\n > Unique Idea\n\n\n > Light weight, Built for running\n\n\n > Bright colors"+
                        "\n\n\n > Comfortable and Robust!";
                TextArea A = new TextArea(Val);
                A.setFont(new Font("roboto", Font.BOLD, 12));
                A.setBackground(new Color(225,225,225));
                A.setBounds(190,42,200,220);
                A.setEditable(false);

                // Label : Image
                JLabel I = new JLabel();
                ImageIcon i = new ImageIcon("11.png");
                I.setIcon(i);
                I.setBounds(15,5,150,230);

                // Label : Buy Now
                Label Buy = new Label("             Buy ");
                Buy.setBackground(new Color(32,38,64));
                Buy.setForeground(new Color(255,255,255));
                Buy.setBounds(30,250,100,30);

                L.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        F.remove(P);
                        F.add(S_Panel);
                    }
                });
                Flag = true;

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                F.add(P);




            }
        });


        S4 = new JLabel();
        ImageIcon i4 = new ImageIcon("2.png");
        S4.setIcon(i4);
        S4.setBounds(200,195,125,160);
        S4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hello 1");
                F.remove(S_Panel);
                F.setBackground(new Color(130,130,130));

                // Panel -- > Bg
                P = new Panel(null);
                P.setBackground(new Color(225,225,225));
                P.setBounds(130,150,410,300);

                /////// Components :

                // Label : Close
                Label L = new Label("  X ");
                L.setForeground(new Color (255,255,255));
                L.setBackground(new Color(225,0,50));
                L.setBounds(372,5,23,23);

                // Panel : Border
                Panel x = new Panel(null);
                x.setBackground(new Color(32,38,62));
                x.setBounds(170,15,1,270);

                // TextArea : Decription
                String Val ="\n<--- Description --->\n\n\n > Unique Idea\n\n\n > Light weight, Built for running\n\n\n > Bright colors"+
                        "\n\n\n > Comfortable and Robust!";
                TextArea A = new TextArea(Val);
                A.setFont(new Font("roboto", Font.BOLD, 12));
                A.setBackground(new Color(225,225,225));
                A.setBounds(190,42,200,220);
                A.setEditable(false);

                // Label : Image
                JLabel I = new JLabel();
                ImageIcon i = new ImageIcon("33.png");
                I.setIcon(i);
                I.setBounds(15,5,150,230);

                // Label : Buy Now
                Label Buy = new Label("             Buy ");
                Buy.setBackground(new Color(32,38,64));
                Buy.setForeground(new Color(255,255,255));
                Buy.setBounds(30,250,100,30);

                L.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        F.remove(P);
                        F.add(S_Panel);
                    }
                });
                Flag = true;

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                F.add(P);

            }
        });


        S5 = new JLabel();
        ImageIcon i5 = new ImageIcon("7.png");
        S5.setIcon(i5);
        S5.setBounds(360,195,125,160);
        S5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Hello 2");
                F.remove(S_Panel);
                F.setBackground(new Color(130,130,130));

                // Panel -- > Bg
                P = new Panel(null);
                P.setBackground(new Color(225,225,225));
                P.setBounds(130,150,410,300);

                /////// Components :

                // Label : Close
                Label L = new Label("  X ");
                L.setForeground(new Color (255,255,255));
                L.setBackground(new Color(225,0,50));
                L.setBounds(372,5,23,23);

                // Panel : Border
                Panel x = new Panel(null);
                x.setBackground(new Color(32,38,62));
                x.setBounds(170,15,1,270);

                // TextArea : Decription
                String Val ="\n<--- Description --->\n\n\n > Unique Idea\n\n\n > Light weight, Built for running\n\n\n > Bright colors"+
                        "\n\n\n > Comfortable and Robust!";
                TextArea A = new TextArea(Val);
                A.setFont(new Font("roboto", Font.BOLD, 12));
                A.setBackground(new Color(225,225,225));
                A.setBounds(190,42,200,220);
                A.setEditable(false);

                // Label : Image
                JLabel I = new JLabel();
                ImageIcon i = new ImageIcon("66.png");
                I.setIcon(i);
                I.setBounds(15,5,150,230);

                // Label : Buy Now
                Label Buy = new Label("             Buy ");
                Buy.setBackground(new Color(32,38,64));
                Buy.setForeground(new Color(255,255,255));
                Buy.setBounds(30,250,100,30);

                L.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        F.remove(P);
                        F.add(S_Panel);
                    }
                });
                Flag = true;

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                F.add(P);
            }
        });



        S6 = new JLabel();
        ImageIcon i6 = new ImageIcon("8.png");
        S6.setIcon(i6);
        S6.setBounds(520,195,125,160);
        S6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println(" HEllo 3");
                F.remove(S_Panel);
                F.setBackground(new Color(130,130,130));

                // Panel -- > Bg
                P = new Panel(null);
                P.setBackground(new Color(225,225,225));
                P.setBounds(130,150,410,300);

                /////// Components :

                // Label : Close
                Label L = new Label("  X ");
                L.setForeground(new Color (255,255,255));
                L.setBackground(new Color(225,0,50));
                L.setBounds(372,5,23,23);

                // Panel : Border
                Panel x = new Panel(null);
                x.setBackground(new Color(32,38,62));
                x.setBounds(170,15,1,270);

                // TextArea : Decription
                String Val ="\n<--- Description --->\n\n\n > Unique Idea\n\n\n > Light weight, Built for running\n\n\n > Bright colors"+
                        "\n\n\n > Comfortable and Robust!";
                TextArea A = new TextArea(Val);
                A.setFont(new Font("roboto", Font.BOLD, 12));
                A.setBackground(new Color(225,225,225));
                A.setBounds(190,42,200,220);
                A.setEditable(false);

                // Label : Image
                JLabel I = new JLabel();
                ImageIcon i = new ImageIcon("77.png");
                I.setIcon(i);
                I.setBounds(15,5,150,230);

                // Label : Buy Now
                Label Buy = new Label("             Buy ");
                Buy.setBackground(new Color(32,38,64));
                Buy.setForeground(new Color(255,255,255));
                Buy.setBounds(30,250,100,30);

                L.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        F.remove(P);
                        F.add(S_Panel);
                    }
                });
                Flag = true;

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                F.add(P);

            }
        });


        // S_Panel : Components
        S_Panel.add(S1);
        S_Panel.add(S2);
        S_Panel.add(S3);
        S_Panel.add(S4);
        S_Panel.add(S5);
        S_Panel.add(S6);
        S_Panel.add(DP);
        S_Panel.add(DP1);
        S_Panel.add(B1);
        S_Panel.add(B2);


        /// Frame : Components ////////////////////////////////
        F.add(H_Panel);
        //F.add(M_Panel1);
        F.add(S_Panel);


        // Frame : Funcstions
        F.setVisible(true);
        F.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                F.dispose();
            }
        });

        ///////////////// Action Listeners //////////////////////////////////////

        //// Buttons ///////
        B_Menu.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent E) {



        ////  Conditional Statements ////
        if(E.getSource() == B_Menu) {
            if(Flag == true){
                F.remove(P);
            }
            F.remove(S_Panel);


            ////////// Menu bar Panel /////////////////////////////////
            M_Panel = new Panel(null);
            M_Panel.setBackground(new Color(34,38,62));
            M_Panel.setBounds(0, 100, 170, 400);

            B_Panel1 = new Panel(null);
            B_Panel1.setBackground(new Color(255,255,255));
            B_Panel1.setBounds(15,330,145,1);


            ///////// Side Panel /////////////////////////////////////
            S_panel1 = new Panel(null);
            S_panel1.setBackground(new Color(170,170,170,170));
            S_panel1.setBounds(170,100,525,400);


            //////// Labels : Menu /////////////////////////////////////////
            L1 = new Label("             Login     ");
            L1.setBackground(new Color(250,250,250));
            L1.setBounds(25,25,125,30);
            L1.addMouseListener(this);

            L2 = new Label("             Browse     ");
            L2.setBackground(new Color(250,250,250));
            L2.setBounds(25,75,125,30);
            L2.addMouseListener(this);

            L3 = new Label("             Reviews     ");
            L3.setBackground(new Color(250,250,250));
            L3.setBounds(25,125,125,30);
            L3.addMouseListener(this);

            L4 = new Label("                FAQ     ");
            L4.setBackground(new Color(250,250,250));
            L4.setBounds(25,275,125,30);
            L4.addMouseListener(this);

            /// Buttons -->  Panel /////////////////////////////////
            B_Menu_E = new Button("Back");
            B_Menu_E.setBackground(new Color(255,150,0));
            B_Menu_E.setForeground(new Color(255,255,255));
            B_Menu_E.setBounds(35, 350, 100, 30);

            /// Menu Panel Components /////////////////////////////////////////
            M_Panel.add(B_Menu_E);
            M_Panel.add(B_Panel1);
            M_Panel.add(L1);
            M_Panel.add(L2);
            M_Panel.add(L3);
            M_Panel.add(L4);


            /// Action Listners
            B_Menu_E.addActionListener(this);

            /// Panel ---> Frame
            F.add(M_Panel);
            F.add(S_panel1);

        } else if (E.getSource() == B_Menu_E){
            F.remove(M_Panel);
            F.remove(S_panel1);
            //F.add(M_Panel1);
            F.add(S_Panel);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == L1){
            System.out.println("Login");
            Login_Page L = new Login_Page(1);
            F.dispose();
        }
        else if(e.getSource() == L2){
            System.out.println("Browse");
            Browse_Page B = new Browse_Page(flag);
            F.dispose();
        }
        else if(e.getSource() == L3){
            System.out.println("Reviews");
            if(flag == 1) {
                Reviews R = new Reviews(flag);
                F.dispose();
            } else if (flag == 0) {
                Reviews R = new Reviews(flag);
                F.dispose();
            }
        }
        else if(e.getSource() == L4){
            FAQPage A = new FAQPage(flag);
            F.dispose();

        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}



public class H_Page {
    public static void main(String[] args) {
        new Home_Page();
    }
}