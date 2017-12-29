package gui;

import database.Database_Connection;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Home_Form extends Form_Components implements ActionListener {

    public String productImageAddress;

    //Database_Connection database_connection = new Database_Connection();
    Login_Form login_form = new Login_Form();

    private JLabel selectCategoryLabel = new JLabel("Please category below");
    private JPanel phonesPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JButton phonesPanelIconButton = new JButton("Phones and Accessories",new ImageIcon("Resources/Icon Images/smartphones.png"));
    private JPanel tvPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
    private JButton tvPanelIconButton = new JButton("Televisions",new ImageIcon("Resources/Icon Images/tv.png"));
    private JPanel allProductPanel = new JPanel(new GridLayout(0,1,50,50));
    //private JPanel allProductPanel = new JPanel();
    private JPanel productPanel = new JPanel(new GridLayout(0,1,50,50));
    private JScrollPane productScrollPane = new JScrollPane(productPanel);
    //private JScrollPane productScrollPane = new JScrollPane(allProductPanel);
    //private JScrollPane productScrollPane = new JScrollPane(productPanel);
    private JPanel productOverviewPanel = new JPanel();
    private JLabel productImage = new JLabel(productImageAddress);
    public JLabel productName = new JLabel("Product Name");
    private JPanel productSelectPanel = new JPanel();
    private JPanel quantityInStockPanel = new JPanel();
    private JLabel quantityInStockLabel = new JLabel("Quantity in stock");
    public JLabel productQuantity = new JLabel("25");
    private JPanel pricePanel = new JPanel();
    private JLabel priceLabel = new JLabel("Price");
    public JLabel productPrice = new JLabel("20");
    private JPanel quantityToBuyPanel = new JPanel();
    private JLabel quantityToBuyLabel = new JLabel("Quantity");
    public JTextField quantityToBuyTextField = new JTextField();
    private JButton addToBasketButton = new JButton("Add");

    public Home_Form(){
        setSize(1000,600);
        setLayout(null);
        setTitle("Select Category");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        designHeader();
        designSideMenu();
        designMenuPanel();
        designMenuPanelContent();
        designViewItems();

        setVisible(true);
    }

    public void designMenuPanelContent(){
        selectCategoryLabel.setBounds(15,150,200,50);
        selectCategoryLabel.setForeground(Color.white);;
        selectCategoryLabel.setFont(new Font("Tahoma",Font.PLAIN,20));

        phonesPanel.setBounds(15,230,200,50);
        phonesPanel.setLayout(null);
        phonesPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
        phonesPanel.setBackground(Color.white);
        phonesPanelIconButton.setForeground(fontColor);
        phonesPanelIconButton.setFont(new Font("Tahoma",Font.BOLD,13));
        phonesPanelIconButton.setBounds(0,0,200,50);
        phonesPanelIconButton.setHorizontalAlignment(SwingConstants.LEFT);
        phonesPanelIconButton.setBorderPainted(false);
        phonesPanelIconButton.setFocusPainted(false);
        phonesPanelIconButton.setBackground(Color.white);
        phonesPanelIconButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.white));
        phonesPanel.add(phonesPanelIconButton);

        tvPanel.setBounds(15,300,200,50);
        tvPanel.setLayout(null);
        tvPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.white));
        tvPanel.setBackground(Color.white);
        tvPanelIconButton.setFocusPainted(false);
        tvPanelIconButton.setForeground(fontColor);
        tvPanelIconButton.setBounds(0,0,200,50);
        tvPanelIconButton.setHorizontalAlignment(SwingConstants.LEFT);
        tvPanelIconButton.setFont(new Font("Tahoma",Font.BOLD,13));
        tvPanelIconButton.setBorderPainted(false);
        tvPanelIconButton.setFocusPainted(false);
        tvPanelIconButton.setBackground(Color.white);
        tvPanelIconButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, Color.white));
        tvPanel.add(tvPanelIconButton);

        phonesPanelIconButton.addActionListener(this);
        tvPanelIconButton.addActionListener(this);

        menuPanel.add(tvPanel);
        menuPanel.add(phonesPanel);
        menuPanel.add(selectCategoryLabel);
    }

    public void designViewItems(){
        //productPanel.setLayout(new BoxLayout(productPanel, BoxLayout.PAGE_AXIS));
        productScrollPane.setBounds(300,50,700,550);
        productScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        productScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        designProductViewPanel();
        //allProductPanel.add(productPanel);
        add(productScrollPane);
    }

    public void designMenuItems(){
        productPanel.setLayout(null);
        productScrollPane.setBounds(300,50,700,550);
        productScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        productScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        //designProductViewPanel();
        add(productScrollPane);
    }

    public void designProductViewPanel(){
        productOverviewPanel.setLayout(null);
        productOverviewPanel.setPreferredSize(new Dimension(680,250));
        productOverviewPanel.setBackground(Color.white);
        productImage.setBounds(15,25,200,150);
        productImage.setBorder(BorderFactory.createMatteBorder(4, 1, 1, 1,menuColor));
        productName.setBounds(15,185,200,50);
        productName.setBorder(BorderFactory.createMatteBorder(4, 1, 1, 1,menuColor));
        productName.setHorizontalAlignment(SwingConstants.CENTER);
        productName.setFont(new Font("Tahoma",Font.PLAIN,20));

        productSelectPanel.setLayout(null);
        productSelectPanel.setBounds(225,25,475,200);
        productSelectPanel.setBackground(Color.white);
        productSelectPanel.setBorder(BorderFactory.createMatteBorder(4, 1, 0, 0,menuColor));
        quantityInStockPanel.setBounds(10,25,125,150);
        quantityInStockPanel.setLayout(null);
        quantityInStockLabel.setBounds(0,0,125,50);
        quantityInStockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        quantityInStockPanel.add(quantityInStockLabel);
        productQuantity.setBounds(0,75,125,75);
        productQuantity.setHorizontalAlignment(SwingConstants.CENTER);
        quantityInStockPanel.add(productQuantity);
        quantityInStockPanel.setBackground(Color.white);
        pricePanel.setLayout(null);
        pricePanel.setBounds(140,25,100,150);
        pricePanel.setBackground(Color.white);
        priceLabel.setBounds(0,0,100,50);
        priceLabel.setHorizontalAlignment(SwingConstants.CENTER);
        pricePanel.add(priceLabel);
        productPrice.setBounds(0,75,100,75);
        productPrice.setHorizontalAlignment(SwingConstants.CENTER);
        pricePanel.add(productPrice);
        quantityToBuyPanel.setLayout(null);
        quantityToBuyPanel.setBounds(250,25,100,150);
        quantityToBuyLabel.setBounds(0,0,100,50);
        quantityToBuyPanel.setBackground(Color.white);
        quantityToBuyLabel.setHorizontalAlignment(SwingConstants.CENTER);
        quantityToBuyPanel.add(quantityToBuyLabel);
        quantityToBuyTextField.setBounds(30,90,50,30);
        quantityToBuyTextField.setHorizontalAlignment(SwingConstants.CENTER);
        quantityToBuyPanel.add(quantityToBuyTextField);
        addToBasketButton.setBounds(360,50,75,50);
        addToBasketButton.addActionListener(this);
        productSelectPanel.add(addToBasketButton);

        productSelectPanel.add(quantityToBuyPanel);
        productSelectPanel.add(pricePanel);
        productSelectPanel.add(quantityInStockPanel);

        productOverviewPanel.add(productName);
        productOverviewPanel.add(productImage);
        productOverviewPanel.add(productSelectPanel);
        productPanel.add(productOverviewPanel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==phonesPanelIconButton){
        //designViewItems();
        database_connection.selectAllPhones();
        }

        if (e.getSource()==customerIconButton){
            login_form.setVisible(true);
        }
    }
}
