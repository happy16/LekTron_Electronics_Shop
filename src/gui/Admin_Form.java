package gui;

import database.Database_Connection;
import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin_Form extends Form_Components implements KeyListener {

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
    public JTable viewDatabaseTable = new JTable();
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
        addPhonePriceTextField.addKeyListener(this);
        addPhoneProductIDTextField.setBounds(100,225,150,30);
        addPhoneProductIDTextField.addKeyListener(this);
        addPhoneProductQuantityTextField.setBounds(100,275,150,30);
        addPhoneProductQuantityTextField.addKeyListener(this);

        viewDatabasePanel.setBounds(300,100,550,350);
        viewDatabasePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        viewDatabasePanel.setLayout(null);
        viewDatabaseTable.setBounds(0,0,550,500);
        viewDatabasePanel.add(viewDatabaseTable);
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
        viewDatabasePanel.add(viewDatabaseTable);
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
        addUserIDTextField.addKeyListener(this);

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
        addTelevisionPriceTextField.addKeyListener(this);
        addTelevisionProductIDTextField.setBounds(100,225,150,30);
        addTelevisionProductIDTextField.addKeyListener(this);
        addTelevisionProductQuantityTextField.setBounds(100,275,150,30);
        addTelevisionProductQuantityTextField.addKeyListener(this);

        viewDatabasePanel.setBounds(300,100,550,350);
        viewDatabasePanel.setBorder(BorderFactory.createLineBorder(Color.black));
        viewDatabasePanel.add(viewDatabaseTable);
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
            showAllPhones();
        }
        else if (e.getSource()==viewUsersButton){
            viewItemsPanel.removeAll();
            viewItemsPanel.revalidate();
            viewItemsPanel.repaint();
            designViewCustomers();
            showAllUsers();
        }
        else if (e.getSource()==viewTelevisionsButton){
            viewItemsPanel.removeAll();
            viewItemsPanel.revalidate();
            viewItemsPanel.repaint();
            designViewTelevisions();
            showAllTelevisions();
        }
        else if (e.getSource()==addPhonesButton) {
            if (addPhoneNameTextField.getText().length() > 0 && addPhonePriceTextField.getText().length() > 0 && addPhoneProductIDTextField.getText().length() > 0 && addPhoneProductQuantityTextField.getText().length() > 0) {
                database_connection.insertPhones(addPhoneNameTextField.getText(), Integer.parseInt(addPhonePriceTextField.getText()), Integer.parseInt(addPhoneProductIDTextField.getText()), Integer.parseInt(addPhoneProductQuantityTextField.getText()));
            }
            else if (addPhoneNameTextField.getText().length() <1){
                JOptionPane.showMessageDialog(null,"Please enter phone name", "No Phone name error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addPhonePriceTextField.getText().length() <1){
                JOptionPane.showMessageDialog(null,"Please enter phone price", "No Phone price error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addPhoneProductIDTextField.getText().length() <1){
                JOptionPane.showMessageDialog(null,"Please enter product i.d", "No Product I.D error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addPhoneProductQuantityTextField.getText().length() <1){
                JOptionPane.showMessageDialog(null,"Please enter phone quantity", "No Phone quantity error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource()==updatePhonesButton){
            if (addPhoneProductIDTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter a product ID", "No Product ID error", JOptionPane.ERROR_MESSAGE);
            }
            else if(addPhoneProductIDTextField.getText().length()>0){
                database_connection.updatePhones(addPhoneNameTextField.getText(), Integer.parseInt(addPhonePriceTextField.getText()),Integer.parseInt(addPhoneProductIDTextField.getText()), Integer.parseInt(addPhoneProductQuantityTextField.getText()));
            }
        }
        else if(e.getSource()==removePhonesButton){
            if (addPhoneProductIDTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter a product ID", "No Product ID error", JOptionPane.ERROR_MESSAGE);
            }
            else if(addPhoneProductIDTextField.getText().length()>0){
                database_connection.deletePhones(Integer.parseInt(addPhoneProductIDTextField.getText()));
            }
        }
        else if (e.getSource()==addTelevisionsButton) {
            if (addTelevisionNameTextField.getText().length() > 0 && addTelevisionPriceTextField.getText().length() > 0 && addTelevisionProductIDTextField.getText().length() > 0 && addTelevisionProductQuantityTextField.getText().length() > 0) {
                database_connection.insertTelevisions(addTelevisionNameTextField.getText(), Integer.parseInt(addTelevisionPriceTextField.getText()), Integer.parseInt(addTelevisionProductIDTextField.getText()) , Integer.parseInt(addTelevisionProductQuantityTextField.getText()));
            }
            else if (addTelevisionNameTextField.getText().length() <1){
                JOptionPane.showMessageDialog(null,"Please enter television name", "No Television name error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addTelevisionPriceTextField.getText().length() <1){
                JOptionPane.showMessageDialog(null,"Please enter television price", "No Television price error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addTelevisionProductIDTextField.getText().length() <1){
                JOptionPane.showMessageDialog(null,"Please enter product i.d", "No Product I.D error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addTelevisionProductQuantityTextField.getText().length() <1){
                JOptionPane.showMessageDialog(null,"Please enter television quantity", "No Television quantity error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else if (e.getSource()==removeTelevisionsButton){
            if (addTelevisionProductIDTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter a product ID", "No Product ID error", JOptionPane.ERROR_MESSAGE);
            }
            else if(addPhoneProductIDTextField.getText().length()>1){
                database_connection.deleteTelevisions(Integer.parseInt(addTelevisionProductIDTextField.getText()));
            }
        }
        else if (e.getSource()==updateTelevisionsButton){
            if (addTelevisionProductIDTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter a product ID", "No Product ID error", JOptionPane.ERROR_MESSAGE);
            }
            else if(addPhoneProductIDTextField.getText().length()>1){
                database_connection.updateTelevisions(addTelevisionNameTextField.getText(), Integer.parseInt(addTelevisionPriceTextField.getText()),Integer.parseInt(addTelevisionProductIDTextField.getText()) , Integer.parseInt(addTelevisionProductQuantityTextField.getText()));
            }
        }
        else if (e.getSource()==addUserButton){
            if  (addNameTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer name", "No Name error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addSurnameTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer surname", "No Surname error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addUsernameTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer username", "No Username error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addPasswordPasswordField.getPassword().length<1){
                JOptionPane.showMessageDialog(null,"Please enter customer password", "No Password error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addEmailTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer email", "No Email error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addGenderMaleRadioButton.isSelected()==false && addGenderFemaleRadioButton.isSelected()==false){
                JOptionPane.showMessageDialog(null,"Please select customer gender", "No Gender error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addUserIDTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer user I.D", "No User I.D error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addNameTextField.getText().length()>0 && addSurnameTextField.getText().length()>0 && addUsernameTextField.getText().length()>0 && addPasswordPasswordField.getPassword().length>0 && addEmailTextField.getText().length()>0 && addUserIDTextField.getText().length()>0 && (addGenderMaleRadioButton.isSelected()||addGenderFemaleRadioButton.isSelected()));{
                String gender = "";
                if (addGenderFemaleRadioButton.isSelected()){
                    gender = "Female";
                }
                else if (addGenderMaleRadioButton.isSelected()){
                    gender = "Male";
                }
                database_connection.insertUser(addNameTextField.getText(),addSurnameTextField.getText(),addUsernameTextField.getText(),addPasswordPasswordField.getPassword().toString(),addEmailTextField.getText(),gender,Integer.parseInt(addUserIDTextField.getText()));
            }
        }
        else if (e.getSource()==updateUserButton){
            if  (addNameTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer name", "No Name error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addSurnameTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer surname", "No Surname error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addUsernameTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer username", "No Username error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addPasswordPasswordField.getPassword().length<1){
                JOptionPane.showMessageDialog(null,"Please enter customer password", "No Password error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addEmailTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer email", "No Email error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addGenderMaleRadioButton.isSelected()==false && addGenderFemaleRadioButton.isSelected()==false){
                JOptionPane.showMessageDialog(null,"Please select customer gender", "No Gender error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addUserIDTextField.getText().length()<1){
                JOptionPane.showMessageDialog(null,"Please enter customer user I.D", "No User I.D error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addNameTextField.getText().length()>0 && addSurnameTextField.getText().length()>0 && addUsernameTextField.getText().length()>0 && addPasswordPasswordField.getPassword().length>0 && addEmailTextField.getText().length()>0 && addUserIDTextField.getText().length()>0 && (addGenderMaleRadioButton.isSelected()||addGenderFemaleRadioButton.isSelected()));{
                String gender = "";
                if (addGenderFemaleRadioButton.isSelected()){
                    gender = "Female";
                }
                else if (addGenderMaleRadioButton.isSelected()){
                    gender = "Male";
                }
                database_connection.updateUsers(addNameTextField.getText(),addSurnameTextField.getText(),addUsernameTextField.getText(),addPasswordPasswordField.getPassword().toString(),addEmailTextField.getText(),gender,Integer.parseInt(addUserIDTextField.getText()));
            }
        }
        else if (e.getSource()==removeUserButton){
            if (addUserIDTextField.getText().length()<0){
                JOptionPane.showMessageDialog(null,"Please enter user I.D", "No User I.D error", JOptionPane.ERROR_MESSAGE);
            }
            else if (addUserIDTextField.getText().length()>1){
                database_connection.deleteUser(Integer.parseInt(addUserIDTextField.getText()));
            }
        }

    }

    public void showAllPhones(){
        Connection connection=null;
        connection=Database_Connection.connect();
        try {
            String sql = "SELECT * FROM phones";
            PreparedStatement p = connection.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            viewDatabaseTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void showAllTelevisions(){
        Connection connection=null;
        connection=Database_Connection.connect();
        try {
            String sql = "SELECT * FROM televisions";
            PreparedStatement p = connection.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            viewDatabaseTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public void showAllUsers(){
        Connection connection=null;
        connection=Database_Connection.connect();
        try {
            String sql = "SELECT * FROM users";
            PreparedStatement p = connection.prepareStatement(sql);
            ResultSet rs = p.executeQuery();
            viewDatabaseTable.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        if (e.getSource()==addPhonePriceTextField){
            char c = e.getKeyChar();
            if (!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE){
                e.consume();
            }
        }
        else if (e.getSource()==addPhoneProductIDTextField){
            char c = e.getKeyChar();
            if (!(Character.isDigit(c))||c==KeyEvent.VK_BACK_SPACE||c==KeyEvent.VK_DELETE){
                e.consume();
            }
        }
        else if (e.getSource()==addPhoneProductQuantityTextField) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
                e.consume();
            }
        }
        else if (e.getSource()==addTelevisionPriceTextField) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
                e.consume();
            }
        }
        else if (e.getSource()==addTelevisionProductIDTextField) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
                e.consume();
            }
        }
        else if (e.getSource()==addTelevisionProductQuantityTextField) {
            char c = e.getKeyChar();
            if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
                e.consume();
            }
        }
        else if (e.getSource()==addUserIDTextField){
            char c = e.getKeyChar();
            if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
                e.consume();
            }
        }
        else if (e.getSource()==addUserIDTextField){
            char c = e.getKeyChar();
            if (!(Character.isDigit(c)) || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
                e.consume();
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
