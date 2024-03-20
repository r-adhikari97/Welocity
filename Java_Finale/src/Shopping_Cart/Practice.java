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

public class Practice extends JFrame implements MouseListener {

    Label L;
    JLabel label;
    public Practice() {

        L = new Label("HELLO");
        L.setBounds(50,100,100,50);

        label = new JLabel("");
        ImageIcon icon = new ImageIcon("5.png");
        label.setIcon(icon);
        label.setBounds(50,200,100,50);

        add(label);
        add(L);

        setSize(700,500);
        setLayout(null);
        setVisible(true);

        L.addMouseListener(this);

        label.addMouseListener(this);

    }

    public static void main(String[] args) {
        new Practice();
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if(mouseEvent.getSource()== L){
            System.out.println(" Normal Label");
        }
        else if(mouseEvent.getSource() == label){
            System.out.println("JLabel");;
        }
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
