package gui;
import AppPackage.AnimationClass;
import database.Database_Connection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Form_Components extends JFrame implements ActionListener, MouseListener {

    public Database_Connection database_connection= new Database_Connection();

    public JPanel headerPanel = new JPanel();
    public JLabel cartIcon = new JLabel(new ImageIcon("Resources/Icon Images/cart_icon.png"));
    public JButton cartIconButton = new JButton("Basket");
    public JPanel userPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    public JLabel adminIcon = new JLabel(new ImageIcon("Resources/Images/admin.png"));
    public JLabel customerIcon = new JLabel(new ImageIcon("Resources/Icon Images/customer.png"));
    public JButton customerIconButton = new JButton("Customer");
    public JPanel sideMenuPanel = new JPanel();
    public JLabel menuIcon = new JLabel(new ImageIcon("Resources/Icon Images/menu_icon.png"));
    public JButton homeIcon = new JButton(new ImageIcon("Resources/Icon Images/home_icon.png"));
    public JButton productIcon = new JButton(new ImageIcon("Resources/Icon Images/product_icon.png"));
    public JButton cartIconButton2 = new JButton(new ImageIcon("Resources/Icon Images/cart_icon.png"));
    public JPanel menuPanel = new JPanel();
    public JLabel lektronNameLabel = new JLabel("lekTron Electronics Inc.");
    public JLabel lektronNameLabelUnderline = new JLabel("");

    public Color menuColor = new Color(117, 70, 117);
    public Color buttonColor = new Color(117,90,178);
    public Color fontColor = new Color(91, 91, 91);
    public Color sideMenuPanelColor = new Color(54, 38, 87);
    public Color panelColor = new Color(240, 240, 240);
    public Font fontStyle = new Font("Tahoma",Font.PLAIN,20);

    public void designHeader (){
        headerPanel.setLayout(null);
        headerPanel.setBounds(300,0,700,50);
        headerPanel.setBackground(new Color(255, 255, 255));
        cartIcon.setBounds(0,0,50,50);
        cartIconButton.setFocusPainted(false);
        cartIconButton.setBounds(50,0,50,50);
        cartIconButton.setForeground(fontColor);
        cartIconButton.setFont(new Font("Tahoma",Font.PLAIN,12));
        cartIconButton.setBorderPainted(false);
        cartIconButton.setContentAreaFilled(false);
        cartIconButton.setBackground(Color.white);
        cartIconButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.black));
        cartIconButton.setMargin(new Insets(1,0,1,1));
        headerPanel.add(cartIconButton);
        userPanel.setBounds(200,0,500,50);
        userPanel.setBackground(Color.white);
        userPanel.add(customerIcon);
        customerIconButton.setForeground(fontColor);
        customerIconButton.setFocusPainted(false);
        customerIconButton.setContentAreaFilled(false);
        customerIconButton.setFont(new Font("Tahoma",Font.PLAIN,12));
        customerIconButton.setBorderPainted(false);
        customerIconButton.setBackground(Color.white);
        cartIconButton.addActionListener(this);
        customerIconButton.addActionListener(this);
        userPanel.add(customerIconButton);
        headerPanel.add(userPanel);
        headerPanel.add(cartIcon);
        add(headerPanel);
    }

    public void designSideMenu() {
        sideMenuPanel.setLayout(null);
        sideMenuPanel.setBounds(0,0,70,600);
        sideMenuPanel.setBackground(Color.white);
        menuIcon.setBounds(10,10,50,50);
        homeIcon.setBounds(-60,100,50,50);
        cartIconButton2.setBounds(-60,160,50,50);
        productIcon.setBounds(-60,220,50,50);
        homeIcon.setBorderPainted(false);
        homeIcon.setFocusPainted(false);
        homeIcon.setContentAreaFilled(false);
        cartIconButton2.setBorderPainted(false);
        cartIconButton2.setFocusPainted(false);
        cartIconButton2.setContentAreaFilled(false);
        productIcon.setBorderPainted(false);
        productIcon.setFocusPainted(false);
        productIcon.setContentAreaFilled(false);

        homeIcon.addActionListener(this);
        cartIconButton2.addActionListener(this);
        productIcon.addActionListener(this);
        menuIcon.addMouseListener( this);

        sideMenuPanel.add(menuIcon);
        sideMenuPanel.add(homeIcon);
        sideMenuPanel.add(cartIconButton2);
        sideMenuPanel.add(productIcon);
        add(sideMenuPanel);
    }

    public void designMenuPanel() {
        menuPanel.setBounds(70,0,230,600);
        menuPanel.setBackground(menuColor);
        menuPanel.setLayout(null);
        lektronNameLabel.setBounds(10,50,210,30);
        lektronNameLabel.setForeground(Color.white);
        lektronNameLabel.setFont(new Font("Tahoma",Font.PLAIN,20));
        menuPanel.add(lektronNameLabel);
        lektronNameLabelUnderline.setBounds(10,70,210,20);
        lektronNameLabelUnderline.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
        menuPanel.add(lektronNameLabelUnderline);
        add(menuPanel);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource()==menuIcon){
            AnimationClass Animation1 = new AnimationClass();
            Animation1.jButtonXRight(-60,10,10,5,homeIcon);
            Animation1.jButtonXLeft(10,-60,10,5,homeIcon);
            AnimationClass Animation2 = new AnimationClass();
            Animation2.jButtonXRight(-60,10,10,5,cartIconButton2);
            Animation2.jButtonXLeft(10,-60,10,5,cartIconButton2);
            AnimationClass Animation3 = new AnimationClass();
            Animation3.jButtonXRight(-60,10,10,5,productIcon);
            Animation3.jButtonXLeft(10,-60,10,5,productIcon);

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
