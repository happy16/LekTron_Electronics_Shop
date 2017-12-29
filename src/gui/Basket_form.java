package gui;

import javax.swing.*;
import java.awt.*;

public class Basket_form extends Form_Components{

    JButton buyButton = new JButton("Buy");
    JButton removeProductButton = new JButton("Remove");
    JButton goBackButton = new JButton("Go Back");
    private JPanel basketItemsPanel = new JPanel();
    private JPanel selectedProductPanel = new JPanel();
    private JLabel selectedProductImage = new JLabel();
    private JLabel selectedProductNameLabel = new JLabel("Name");
    private JLabel selectedProductPriceLabel = new JLabel("Price");
    private JLabel selectedProductsTotalPriceLabel = new JLabel("Total Price");
    public JLabel selectedProducName = new JLabel("Name");
    public JLabel selectedProductPrice = new JLabel("Price");
    public JLabel selectedProductTotal = new JLabel("Total");
    public JCheckBox selectedProductCheckBox = new JCheckBox("Select");
    private JPanel grandTotalPanel = new JPanel();
    private JLabel grandTotalLabel = new JLabel("Total");
    public JLabel grandTotal = new JLabel("0.00");


    Basket_form(){
        setSize(1000,600);
        setLayout(null);
        setTitle("Select Category");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        designHeader();
        designMenuPanel();
        designSideMenu();
        designMenuPanelContents();

        basketItemsPanel.setBounds(300,50,550,550);
        basketItemsPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4,menuColor));
        basketItemsPanel.setLayout(new FlowLayout());
        basketItemsPanel.setBackground(Color.white);
        grandTotalPanel.setBounds(850,50,150,550);
        grandTotalPanel.setLayout(null);
        grandTotalPanel.setBackground(Color.white);
        grandTotalLabel.setBounds(25,200,100,50);
        grandTotalLabel.setFont(new Font("Tahoma",Font.PLAIN,20));
        grandTotalLabel.setHorizontalAlignment(SwingConstants.CENTER);
        grandTotal.setFont(new Font("Tahoma",Font.PLAIN,20));
        grandTotal.setBounds(25,275,100,50);
        grandTotal.setHorizontalAlignment(SwingConstants.CENTER);
        grandTotalPanel.add(grandTotalLabel);
        grandTotalPanel.add(grandTotal);
        add(grandTotalPanel);
        add(basketItemsPanel);
        designBasketItems();

        setVisible(true);
    }

    public void designMenuPanelContents(){

        buyButton.setForeground(fontColor);
        buyButton.setFont(new Font("Tahoma",Font.PLAIN,20));
        buyButton.setBounds(15,200,200,50);
        buyButton.setHorizontalAlignment(SwingConstants.CENTER);
        buyButton.setBorderPainted(false);
        buyButton.setFocusPainted(false);
        buyButton.setBackground(Color.white);
        buyButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.white));

        removeProductButton.setFocusPainted(false);
        removeProductButton.setForeground(fontColor);
        removeProductButton.setBounds(15,300,200,50);
        removeProductButton.setHorizontalAlignment(SwingConstants.CENTER);
        removeProductButton.setFont(new Font("Tahoma",Font.PLAIN,20));
        removeProductButton.setBorderPainted(false);
        removeProductButton.setFocusPainted(false);
        removeProductButton.setBackground(Color.white);
        removeProductButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.white));

        goBackButton.setFocusPainted(false);
        goBackButton.setForeground(fontColor);
        goBackButton.setBounds(15,400,200,50);
        goBackButton.setHorizontalAlignment(SwingConstants.CENTER);
        goBackButton.setFont(new Font("Tahoma",Font.PLAIN,20));
        goBackButton.setBorderPainted(false);
        goBackButton.setFocusPainted(false);
        goBackButton.setBackground(Color.white);
        goBackButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.white));

        menuPanel.add(buyButton);
        menuPanel.add(removeProductButton);
        menuPanel.add(goBackButton);

    }

    public void designBasketItems(){
        selectedProductPanel.setPreferredSize(new Dimension(500,150));
        selectedProductPanel.setBorder(BorderFactory.createMatteBorder(2, 2, 4, 2,menuColor));
        selectedProductPanel.setLayout(null);
        selectedProductPanel.setBackground(Color.white);
        selectedProductImage.setBounds(0,0,200,150);
        selectedProductImage.setBorder(BorderFactory.createLineBorder(Color.black));
        selectedProductNameLabel.setBounds(225,0,75,50);
        selectedProductNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        selectedProductPriceLabel.setBounds(325,0,50,50);
        selectedProductPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        selectedProductsTotalPriceLabel.setBounds(400,0,75,50);
        selectedProductsTotalPriceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        selectedProducName.setBounds(245,50,75,50);
        selectedProductPrice.setBounds(335,50,50,50);
        selectedProductTotal.setBounds(430,50,75,50);
        selectedProductCheckBox.setBounds(350,100,75,30);
        selectedProductCheckBox.setBackground(Color.white);

        selectedProductPanel.add(selectedProductCheckBox);
        selectedProductPanel.add(selectedProducName);
        selectedProductPanel.add(selectedProductPrice);
        selectedProductPanel.add(selectedProductTotal);
        selectedProductPanel.add(selectedProductsTotalPriceLabel);
        selectedProductPanel.add(selectedProductPriceLabel);
        selectedProductPanel.add(selectedProductNameLabel);
        selectedProductPanel.add(selectedProductImage);
        basketItemsPanel.add(selectedProductPanel);
    }
}
