package gui;

import database.Database_Connection;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Admin_Form extends Form_Components {

    private JButton viewPhonesButton = new JButton("View Phones");
    private JButton viewTelevisionsButton = new JButton("View Televisions");
    private JButton viewUsersButton = new JButton("View Customers");
    private JPanel viewItemsPanel = new JPanel();
    private JButton addPhonesButton = new JButton("Add Phone");
    private JButton removePhonesButton = new JButton("Remove Phone");
    private JButton updatePhonesButton = new JButton("Update Phone");
    private JButton addUserButton = new JButton("Add User");
    private JButton removeUserButton = new JButton("Remove User");
    private JButton updateUserButton = new JButton("Update User");
    private JButton addTelevisionsButton = new JButton("Add Television");
    private JButton removeTelevisionsButton = new JButton("Remove Television");
    private JButton updateTelevisionsButton = new JButton("Update Television");
    private JLabel addNameLabel = new JLabel("Name");
    public JTextField addNameTextField = new JTextField(10);
    private JLabel addSurnameLabel = new JLabel("Surname");
    public JTextField addSurnameTextField = new JTextField(10);
    private JLabel addUsernameLabel = new JLabel("Username");
    public JTextField addUsernameTextField = new JTextField(10);
    private JLabel addPasswordLabel = new JLabel("Password");
    public JPasswordField addPasswordPasswordField = new JPasswordField();
    private JLabel addEmailLabel = new JLabel("Email");
    public JTextField addEmailTextField = new JTextField(10);
    private JLabel addGenderLabel = new JLabel("Gender");
    public JRadioButton addGenderMaleRadioButton = new JRadioButton("Male");
    public JRadioButton addGenderFemaleRadioButton = new JRadioButton("Female");
    private JLabel addUserIDLabel = new JLabel("User ID");
    public JTextField addUserIDTextField = new JTextField(10);


    private JLabel addPhoneNameLabel = new JLabel("Name");
    public JTextField addPhoneNameTextField = new JTextField(10);
    private JLabel addPhonePriceLabel = new JLabel("Price");
    public JTextField addPhonePriceTextField = new JTextField();
    private JLabel addPhoneProductIDLabel = new JLabel("Product ID");
    public JTextField addPhoneProductIDTextField = new JTextField(10);
    private JLabel addPhoneProductQuantityLabel = new JLabel("Quantity");
    public JTextField addPhoneProductQuantityTextField = new JTextField(10);

    private JLabel addTelevisionNameLabel = new JLabel("Name");
    public JTextField addTelevisionNameTextField = new JTextField(10);
    private JLabel addTelevisionPriceLabel = new JLabel("Price");
    public JTextField addTelevisionPriceTextField = new JTextField(10);
    private JLabel addTelevisionProductIDLabel = new JLabel("Product ID");
    public JTextField addTelevisionProductIDTextField = new JTextField(10);
    private JLabel addTelevisionProductQuantityLabel = new JLabel("Quantity");
    public JTextField addTelevisionProductQuantityTextField = new JTextField(10);

    public JPanel viewDatabasePanel = new JPanel();

    Admin_Form(){
        setSize(1200,600);
        setLayout(null);
        setTitle("Select Category");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);


        //designHeader();
        designSideMenu();
        designMenuPanel();
        designMenuPanelContents();
        //designViewPhonesPanel();
        designViewCustomers();

        setVisible(true);
    }

    public void designMenuPanelContents(){
        viewItemsPanel.setBounds(300,0,1200,600);
        viewItemsPanel.setLayout(null);
        viewItemsPanel.setBackground(Color.white);
        viewPhonesButton.setBackground(Color.white);
        viewPhonesButton.setForeground(fontColor);
        viewPhonesButton.setBounds(15,200,200,50);
        viewPhonesButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        viewPhonesButton.setBorderPainted(false);
        viewUsersButton.setBackground(Color.white);
        viewUsersButton.setForeground(fontColor);
        viewUsersButton.setBounds(15,400,200,50);
        viewUsersButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        viewUsersButton.setBorderPainted(false);
        viewTelevisionsButton.setBackground(Color.white);
        viewTelevisionsButton.setForeground(fontColor);
        viewTelevisionsButton.setBounds(15,300,200,50);
        viewTelevisionsButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        viewTelevisionsButton.setBorderPainted(false);


        viewUsersButton.addMouseListener(this);
        viewPhonesButton.addMouseListener(this);
        viewUsersButton.addActionListener(this);
        viewPhonesButton.addActionListener(this);
        viewTelevisionsButton.addMouseListener(this);
        viewTelevisionsButton.addActionListener(this);

        menuPanel.add(viewUsersButton);
        menuPanel.add(viewPhonesButton);
        menuPanel.add(viewTelevisionsButton);
        add(viewItemsPanel);
    }

    public void designViewPhonesPanel(){

        viewItemsPanel.setBounds(300,0,1200,600);
        viewItemsPanel.setLayout(null);
        viewItemsPanel.setBackground(Color.white);
        addPhonesButton.setBounds(50,500,150,50);
        addPhonesButton.setBackground(menuColor);
        addPhonesButton.setForeground(Color.white);
        addPhonesButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        addPhonesButton.setBorderPainted(false);
        removePhonesButton.setBounds(250,500,150,50);
        removePhonesButton.setBackground(menuColor);
        removePhonesButton.setForeground(Color.white);
        removePhonesButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        removePhonesButton.setBorderPainted(false);
        updatePhonesButton.setBounds(450,500,150,50);
        updatePhonesButton.setBackground(menuColor);
        updatePhonesButton.setForeground(Color.white);
        updatePhonesButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        updatePhonesButton.setBorderPainted(false);

        addPhoneNameLabel.setBounds(10,125,70,30);
        addPhoneNameLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addPhonePriceLabel.setBounds(10,175,70,30);
        addPhonePriceLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addPhoneProductIDLabel.setBounds(10,225,70,30);
        addPhoneProductIDLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addPhoneProductQuantityLabel.setBounds(10,275,70,30);
        addPhoneProductQuantityLabel.setFont(new Font("Tahoma",Font.PLAIN,15));

        addPhoneNameTextField.setBounds(100,125,150,30);
        addPhonePriceTextField.setBounds(100,175,150,30);
        addPhoneProductIDTextField.setBounds(100,225,150,30);
        addPhoneProductQuantityTextField.setBounds(100,275,150,30);

        viewDatabasePanel.setBounds(300,100,550,350);
        viewDatabasePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        viewItemsPanel.add(viewDatabasePanel);

        viewItemsPanel.add(addPhoneNameTextField);
        viewItemsPanel.add(addPhonePriceTextField);
        viewItemsPanel.add(addPhoneProductIDTextField);
        viewItemsPanel.add(addPhoneProductQuantityTextField);
        viewItemsPanel.add(addPhoneNameLabel);
        viewItemsPanel.add(addPhonePriceLabel);
        viewItemsPanel.add(addPhoneProductIDLabel);
        viewItemsPanel.add(addPhoneProductQuantityLabel);

        addPhonesButton.addActionListener(this);
        removePhonesButton.addActionListener(this);
        updatePhonesButton.addActionListener(this);

        viewItemsPanel.add(addPhonesButton);
        viewItemsPanel.add(removePhonesButton);
        viewItemsPanel.add(updatePhonesButton);
        add(viewItemsPanel);
    }

    public void designViewCustomers(){

        addUserButton.setBounds(50,500,150,50);
        addUserButton.setBackground(menuColor);
        addUserButton.setForeground(Color.white);
        addUserButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        addUserButton.setBorderPainted(false);
        removeUserButton.setBounds(250,500,150,50);
        removeUserButton.setBackground(menuColor);
        removeUserButton.setForeground(Color.white);
        removeUserButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        removeUserButton.setBorderPainted(false);
        updateUserButton.setBounds(450,500,150,50);
        updateUserButton.setBackground(menuColor);
        updateUserButton.setForeground(Color.white);
        updateUserButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        updateUserButton.setBorderPainted(false);
        addNameLabel.setBounds(10,100,70,30);
        addNameLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addSurnameLabel.setBounds(10,150,70,30);
        addSurnameLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addUsernameLabel.setBounds(10,200,70,30);
        addUsernameLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addPasswordLabel.setBounds(10,250,70,30);
        addPasswordLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addEmailLabel.setBounds(10,300,70,30);
        addEmailLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addGenderLabel.setBounds(10,350,70,30);
        addGenderLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addUserIDLabel.setBounds(10,400,70,30);
        addUserIDLabel.setFont(new Font("Tahoma",Font.PLAIN,15));

        addNameTextField.setBounds(100,100,150,30);
        addSurnameTextField.setBounds(100,150,150,30);
        addUsernameTextField.setBounds(100,200,150,30);
        addPasswordPasswordField.setBounds(100,250,150,30);
        addEmailTextField.setBounds(100,300,150,30);
        addGenderFemaleRadioButton.setBounds(100,350,100,30);
        addGenderFemaleRadioButton.setFont(new Font("Tahoma",Font.PLAIN,13));
        addGenderFemaleRadioButton.setBackground(Color.white);
        addGenderMaleRadioButton.setBackground(Color.white);
        addGenderMaleRadioButton.setBounds(100,370,100,30);
        addGenderMaleRadioButton.setFont(new Font("Tahoma",Font.PLAIN,13));
        addUserIDTextField.setBounds(100,400,150,30);

        viewDatabasePanel.setBounds(300,100,550,350);
        viewDatabasePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        viewItemsPanel.add(viewDatabasePanel);

        viewItemsPanel.add(addNameLabel);
        viewItemsPanel.add(addSurnameLabel);
        viewItemsPanel.add(addUsernameLabel);
        viewItemsPanel.add(addPasswordLabel);
        viewItemsPanel.add(addEmailLabel);
        viewItemsPanel.add(addGenderLabel);
        viewItemsPanel.add(addUserIDLabel);
        viewItemsPanel.add(addNameTextField);
        viewItemsPanel.add(addSurnameTextField);
        viewItemsPanel.add(addUsernameTextField);
        viewItemsPanel.add(addPasswordPasswordField);
        viewItemsPanel.add(addEmailTextField);
        viewItemsPanel.add(addGenderFemaleRadioButton);
        viewItemsPanel.add(addGenderMaleRadioButton);
        viewItemsPanel.add(addUserIDTextField);
        addUserButton.addActionListener(this);
        removeUserButton.addActionListener(this);
        updateUserButton.addActionListener(this);

        viewItemsPanel.add(addUserButton);
        viewItemsPanel.add(removeUserButton);
        viewItemsPanel.add(updateUserButton);
    }

    public void designViewTelevisions(){

        viewItemsPanel.setBounds(300,0,1200,600);
        viewItemsPanel.setLayout(null);
        viewItemsPanel.setBackground(Color.white);
        addTelevisionsButton.setBounds(50,500,155,50);
        addTelevisionsButton.setBackground(menuColor);
        addTelevisionsButton.setForeground(Color.white);
        addTelevisionsButton.setFont(new Font("Tahoma",Font.PLAIN,15));
        addTelevisionsButton.setBorderPainted(false);
        removeTelevisionsButton.setBounds(250,500,160,50);
        removeTelevisionsButton.setBackground(menuColor);
        removeTelevisionsButton.setForeground(Color.white);
        removeTelevisionsButton.setFont(new Font("Tahoma",Font.PLAIN,15));
        removeTelevisionsButton.setBorderPainted(false);
        updateTelevisionsButton.setBounds(450,500,155,50);
        updateTelevisionsButton.setBackground(menuColor);
        updateTelevisionsButton.setForeground(Color.white);
        updateTelevisionsButton.setFont(new Font("Tahoma",Font.PLAIN,15));
        updateTelevisionsButton.setBorderPainted(false);

        addTelevisionNameLabel.setBounds(10,125,70,30);
        addTelevisionNameLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addTelevisionPriceLabel.setBounds(10,175,70,30);
        addTelevisionPriceLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addTelevisionProductIDLabel.setBounds(10,225,70,30);
        addTelevisionProductIDLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        addTelevisionProductQuantityLabel.setBounds(10,275,70,30);
        addTelevisionProductQuantityLabel.setFont(new Font("Tahoma",Font.PLAIN,15));

        addTelevisionNameTextField.setBounds(100,125,150,30);
        addTelevisionPriceTextField.setBounds(100,175,150,30);
        addTelevisionProductIDTextField.setBounds(100,225,150,30);
        addTelevisionProductQuantityTextField.setBounds(100,275,150,30);

        viewDatabasePanel.setBounds(300,100,550,350);
        viewDatabasePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        viewItemsPanel.add(viewDatabasePanel);

        viewItemsPanel.add(addTelevisionNameTextField);
        viewItemsPanel.add(addTelevisionPriceTextField);
        viewItemsPanel.add(addTelevisionProductIDTextField);
        viewItemsPanel.add(addTelevisionProductQuantityTextField);
        viewItemsPanel.add(addTelevisionNameLabel);
        viewItemsPanel.add(addTelevisionPriceLabel);
        viewItemsPanel.add(addTelevisionProductIDLabel);
        viewItemsPanel.add(addTelevisionProductQuantityLabel);

        addTelevisionsButton.addActionListener(this);
        removeTelevisionsButton.addActionListener(this);
        updateTelevisionsButton.addActionListener(this);

        viewItemsPanel.add(addTelevisionsButton);
        viewItemsPanel.add(removeTelevisionsButton);
        viewItemsPanel.add(updateTelevisionsButton);
        add(viewItemsPanel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== viewPhonesButton){
            viewItemsPanel.removeAll();
            viewItemsPanel.revalidate();
            viewItemsPanel.repaint();
            designViewPhonesPanel();
        }
        else if (e.getSource()==viewUsersButton){
            viewItemsPanel.removeAll();
            viewItemsPanel.revalidate();
            viewItemsPanel.repaint();
            designViewCustomers();
        }
        else if (e.getSource()==viewTelevisionsButton){
            viewItemsPanel.removeAll();
            viewItemsPanel.revalidate();
            viewItemsPanel.repaint();
            designViewTelevisions();
        }
        else if (e.getSource()==addPhonesButton){
            database_connection.insertPhones(addPhoneNameTextField.getText(),Integer.parseInt(addPhonePriceTextField.getText()),Integer.parseInt(addPhoneProductIDTextField.getText()),Integer.parseInt(addPhoneProductQuantityTextField.getText()));
        }
        else if (e.getSource()==removePhonesButton){
            if (addPhoneProductIDTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter a product ID", "No Product ID error", JOptionPane.ERROR_MESSAGE);
            }
            //else if(addPhoneProductIDTextField.getText())
        }
    }
}
