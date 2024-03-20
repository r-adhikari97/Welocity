package Shopping_Cart;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class Browse_Page extends  Frame{
    JLabel label1,label2,label3,label4,label5,label6,label7,label8;
    Image img;
    int flag;
    Label L;
    Panel H_Panel, S_Panel,P;

    ///////////////////////////////////////////////  CONSTRUCTOR  ///////////////////////////////////////////

    Browse_Page(int flag){
        this.flag = flag;
        setSize(700, 500);
        setLayout(null);



        ///////////////////////////////////////////////  HEADER PANEL  ///////////////////////////////////////////
        H_Panel = new Panel(null);
        H_Panel.setBounds(0, 0, 700, 100);
        H_Panel.setBackground(new Color(34, 38, 62));
        add(H_Panel);

        S_Panel = new Panel(null);
        S_Panel.setBounds(0,100,700,400);
        S_Panel.setBackground(new Color(225,225,225));
        add(S_Panel);


        // Header Panel ----> Back Button
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


        // H Panel Components
        H_Panel.add(L);


        ///////////////////////////////////////////////  HEADER PANEL NAME  /////////////////////////////////////
        JLabel l_title = new JLabel("Discover");
        l_title.setBounds(300, 50, 250, 30);
        l_title.setForeground(new Color(217, 217, 217));
        Font Header_panel_font = new Font("Roboto", Font.BOLD, 23);            //Font Declaration
        l_title.setFont(Header_panel_font);
        H_Panel.add(l_title);


//====================================================================================================================//
//====================================================================================================================//


        //////////////////////////////////////////////  LABEL (IMAGES)  ////////////////////////////////////////

        ////////////// 1x1 label ////////////////
        label1 = new JLabel();
        label1.setBounds(60,25,125,160);
        ImageIcon icon1x1 = new ImageIcon("1.png");
        label1.setIcon(icon1x1);
        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println("HEllo");
                remove(S_Panel);
                setBackground(new Color(130,130,130));

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
                ImageIcon i = new ImageIcon("55.png");
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
                        remove(P);
                        add(S_Panel);
                    }
                });

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                add(P);

            }
        });

        ////////////// 1x2 label ////////////////
        label2 = new JLabel();
        label2.setBounds(210, 25, 125, 160);
        ImageIcon icon1x2 = new ImageIcon("2.png");
        label2.setIcon(icon1x2);
        label2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HEllo");
                remove(S_Panel);
                setBackground(new Color(130,130,130));

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
                        remove(P);
                        add(S_Panel);
                    }
                });

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                add(P);
            }
        });

        ////////////// 1x3 label ////////////////
        label3 = new JLabel();
        label3.setBounds(360,25,125,160);
        ImageIcon icon1x3 = new ImageIcon("3.png");
        label3.setIcon(icon1x3);
        label3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HEllo");
                remove(S_Panel);
                setBackground(new Color(130,130,130));

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
                ImageIcon i = new ImageIcon("88.png");
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
                        remove(P);
                        add(S_Panel);
                    }
                });

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                add(P);

            }
        });

        ////////////// 1x4 label ////////////////
        label4 = new JLabel();
        label4.setBounds(510, 25, 125, 160);
        ImageIcon icon1x4 = new ImageIcon("4.png");
        label4.setIcon(icon1x4);
        label4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HEllo");
                remove(S_Panel);
                setBackground(new Color(130,130,130));

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
                ImageIcon i = new ImageIcon("44.png");
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
                        remove(P);
                        add(S_Panel);
                    }
                });


                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                add(P);
            }
        });

        ////////////// 2x1 label ////////////////
        label5 = new JLabel();
        label5.setBounds(60,210,125,160);
        ImageIcon icon2x1 = new ImageIcon("5.png");
        label5.setIcon(icon2x1);
        label5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HEllo");
                remove(S_Panel);
                setBackground(new Color(130,130,130));

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
                ImageIcon i = new ImageIcon("22.png");
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
                        remove(P);
                        add(S_Panel);
                    }
                });

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                add(P);

            }
        });


        ////////////// 2x2 label ////////////////
        label6 = new JLabel();
        label6.setBounds(210,210,125,160);
        ImageIcon icon2x2 = new ImageIcon("6.png");
        label6.setIcon(icon2x2);
        label6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HEllo");
                remove(S_Panel);
                setBackground(new Color(130,130,130));

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
                        remove(P);
                        add(S_Panel);
                    }
                });

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                add(P);

            }
        });



        ////////////// 2x3 label ////////////////
        label7 = new JLabel();
        label7.setBounds(360,210,125,160);
        ImageIcon icon2x3 = new ImageIcon("7.png");
        label7.setIcon(icon2x3);
        label7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HEllo");
                remove(S_Panel);
                setBackground(new Color(130,130,130));

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
                        remove(P);
                        add(S_Panel);
                    }
                });


                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                add(P);
            }
        });

        ////////////// 2x4 label ////////////////
        label8 = new JLabel();
        label8.setBounds(510,210,125,160);
        ImageIcon icon2x4 = new ImageIcon("8.png");
        label8.setIcon(icon2x4);
        label8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("HEllo");
                remove(S_Panel);
                setBackground(new Color(130,130,130));

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
                        remove(P);
                        add(S_Panel);
                    }
                });

                P.add(L);
                P.add(x);
                P.add(A);
                P.add(I);
                P.add(Buy);

                add(P);
            }
        });

        //////////// ADDING LABELS /////////////
        S_Panel.add(label1);
        S_Panel.add(label2);
        S_Panel.add(label3);
        S_Panel.add(label4);
        S_Panel.add(label5);
        S_Panel.add(label6);
        S_Panel.add(label7);
        S_Panel.add(label8);


//====================================================================================================================//
//====================================================================================================================//


        ///////////////////////////////////////////////  WINDOW LISTENER  /////////////////////////////////////
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });


        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setBackground(new Color(225,225,225));

    }


}


public class B_Page {
}
