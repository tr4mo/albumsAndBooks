package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homeview extends JPanel implements ActionListener {
    private JButton boxAlbums;
    private JButton boxBooks;
    private JLabel title;
    private JPanel navbar;

    public Homeview() {
        //construct components
        Icon albumsIcon = new ImageIcon("res/icons8-musical-notes-96.png");
        boxAlbums = new JButton (albumsIcon);
        boxAlbums.setBackground(new Color(254, 252, 251));
        boxAlbums.setContentAreaFilled(false);

        Icon booksIcon = new ImageIcon("res/icons8-open-book-100.png");
        boxBooks = new JButton (booksIcon);
        boxBooks.setBackground(new Color(254, 252, 251));
        boxBooks.setContentAreaFilled(false);

        String username = System.getProperty("user.name");
        title = new JLabel ("Benvenuto " + username + ".");
        title.setFont(new Font("Agency FB", Font.BOLD, 24));
        title.setForeground(new Color(254, 252, 251));

        navbar = new JPanel();
        navbar.setBounds(0,0,640,70);
        navbar.setBackground(new Color(0, 31, 84));
        navbar.add(title);

        //set components properties
        boxAlbums.setToolTipText ("Organizza i tuoi albums.");
        boxBooks.setToolTipText ("Organizza i tuoi libri.");

        //adjust size and set layout
        setPreferredSize (new Dimension(641, 384));
        setLayout (null);

        //add components
        add (boxAlbums);
        add (boxBooks);
        add (navbar);

        //set component bounds (only needed by Absolute Positioning)
        boxAlbums.setBounds (100, 125, 200, 200);
        boxAlbums.setBorder(new RoundedBorder(50));
        boxBooks.setBounds (340, 125, 200, 200);
        boxBooks.setBorder(new RoundedBorder(50));
        navbar.setBounds (0, 0, 640, 70);

        setBackground(new Color(254, 252, 251));



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == boxAlbums){

        }
        else if (e.getSource() == boxBooks){

        }
    }
}
