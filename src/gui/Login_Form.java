package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Login_Form extends Form_Components {


    private JButton login = new JButton("Login");
    private JButton newUserButton = new JButton("New Customer");
    private JPanel componentPanel = new JPanel();
    private JPanel loginPanel = new JPanel();
    private JLabel welcomeLabel = new JLabel("Welcome");
    private JLabel enterDetails = new JLabel("Enter username and password below");
    private JPanel usernamePanel = new JPanel();
    private JLabel enterUserName = new JLabel("Username");
    private JTextField usernameTextField = new JTextField(10);
    private JPanel passwordPanel = new JPanel();
    private JLabel enterPassword = new JLabel("Password");
    private JPasswordField passwordField = new JPasswordField(10);
    private JButton loginButton = new JButton("Login");
    private JPanel newUserLoginPanel = new JPanel();
    private JLabel registerLabel = new JLabel("Register");
    private JLabel nameLabel = new JLabel("Name");
    private JTextField nameTextField = new JTextField();
    private JLabel surnameLabel = new JLabel("Surname");
    private JTextField surnameTextField = new JTextField();
    private JLabel emailLabel = new JLabel("Email");
    private JTextField emailTextField = new JTextField();
    private JLabel userNameLabel = new JLabel("Username");
    private JTextField userNameTextField = new JTextField();
    private JRadioButton maleRadioButton = new JRadioButton("Male");
    private JRadioButton femaleRadioButton = new JRadioButton("Female");
    private JLabel genderLabel = new JLabel("Gender");
    private JButton registerButton = new JButton("Register");
    public JTextField passwordTextField = new JTextField(10);
    private JLabel enterPasswordLabel = new JLabel("Enter your password");
    private JTextField newUsernameTextfield = new JTextField();

    private String nameval;
    private String surnameval;


    Login_Form(){
        setSize(1000,600);
        setLayout(null);
        setTitle("Select Category");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        //designHeader();
        designSideMenu();
        designMenuPanel();
        designMenuPanelContent();
        designLoginPanel();

        componentPanel.setBounds(300,0,700,600);
        componentPanel.setLayout(null);
        add(componentPanel);

        setVisible(false);
    }

    private void designMenuPanelContent (){
        login.setBackground(Color.white);
        login.setForeground(fontColor);
        login.setBounds(15,250,200,50);
        login.setFont(new Font("Tahoma",Font.PLAIN,17));
        login.setBorderPainted(false);
        newUserButton.setBackground(Color.white);
        newUserButton.setForeground(fontColor);
        newUserButton.setBounds(15,350,200,50);
        newUserButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        newUserButton.setBorderPainted(false);

        newUserButton.addMouseListener(this);
        login.addMouseListener(this);
        newUserButton.addActionListener(this);
        login.addActionListener(this);

        menuPanel.add(newUserButton);
        menuPanel.add(login);
    }

    private void designLoginPanel(){

        loginPanel.setBounds(0,0,700,600);
        loginPanel.setLayout(null);
        loginPanel.setBackground(Color.white);
        welcomeLabel.setBounds(50,50,150,75);
        welcomeLabel.setFont(new Font("Tahoma",Font.PLAIN,20));
        welcomeLabel.setForeground(menuColor);
        welcomeLabel.setBorder(BorderFactory.createMatteBorder(0,0,2,0,Color.white));
        enterDetails.setBounds(50,150,250,25);
        enterDetails.setFont(new Font("Tahoma",Font.PLAIN,15));
        usernamePanel.setBounds(50,225,250,200);
        usernamePanel.setLayout(null);
        usernamePanel.setBackground(Color.white);
        enterUserName.setBounds(15,40,220,30);
        enterUserName.setFont(new Font("Tahoma",Font.PLAIN,15));
        enterUserName.setHorizontalAlignment(SwingConstants.CENTER);
        usernameTextField.setBounds(15,110,220,50);
        passwordPanel.setBounds(350,225,250,200);
        passwordPanel.setLayout(null);
        passwordPanel.setBackground(Color.white);
        enterPassword.setBounds(15,40,220,30);
        enterPassword.setFont(new Font("Tahoma",Font.PLAIN,15));
        enterPassword.setHorizontalAlignment(SwingConstants.CENTER);
        passwordField.setBounds(15,110,220,50);
        loginButton.setBackground(menuColor);
        loginButton.setForeground(Color.white);
        loginButton.setBounds(250,475,100,50);
        loginButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        loginButton.setBorderPainted(false);

        passwordPanel.addMouseListener(this);
        usernamePanel.addMouseListener(this);
        passwordField.addMouseListener(this);
        usernameTextField.addMouseListener(this);
        loginButton.addActionListener(this);

        passwordPanel.add(enterPassword);
        passwordPanel.add(passwordField);
        usernamePanel.add(usernameTextField);
        usernamePanel.add(enterUserName);
        loginPanel.add(passwordPanel);
        loginPanel.add(usernamePanel);
        loginPanel.add(enterDetails);
        loginPanel.add(welcomeLabel);
        loginPanel.add(loginButton);

        componentPanel.add(loginPanel);
        componentPanel.revalidate();
        componentPanel.repaint();
    }

    public void designNewUserLoginPanel() {
        newUserLoginPanel.setLayout(null);
        newUserLoginPanel.setBackground(Color.white);
        newUserLoginPanel.setBounds(0,0,700,600);
        registerLabel.setBounds(50,50,150,75);
        registerLabel.setFont(new Font("Tahoma",Font.PLAIN,35));
        registerLabel.setForeground(menuColor);
        registerLabel.setBorder(BorderFactory.createMatteBorder(0,0,2,0,menuColor));
        nameLabel.setBounds(50,175,250,30);
        nameLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        nameTextField.setBounds(50,200,250,50);
        surnameLabel.setBounds(350,175,250,30);
        surnameLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        surnameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        surnameTextField.setBounds(350,200,250,50);
        emailLabel.setBounds(50,275,250,30);
        emailLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        emailLabel.setHorizontalAlignment(SwingConstants.CENTER);
        emailTextField.setBounds(50,300,250,50);
        userNameLabel.setBounds(350,275,250,30);
        userNameLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        userNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        newUsernameTextfield.setBounds(350,300,250,50);
        genderLabel.setBounds(50,375,250,30);
        genderLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        genderLabel.setHorizontalAlignment(SwingConstants.CENTER);
        maleRadioButton.setBounds(50,400,250,25);
        maleRadioButton.setBackground(Color.white);
        maleRadioButton.setFont(new Font("Tahoma",Font.PLAIN,15));
        femaleRadioButton.setBounds(50,425,250,25);
        femaleRadioButton.setBackground(Color.white);
        femaleRadioButton.setFont(new Font("Tahoma",Font.PLAIN,15));
        registerButton.setBackground(menuColor);
        registerButton.setForeground(Color.white);
        registerButton.setBounds(250,500,100,50);
        registerButton.setFont(new Font("Tahoma",Font.PLAIN,17));
        registerButton.setBorderPainted(false);
        enterPasswordLabel.setBounds(350,350,250,50);
        enterPasswordLabel.setFont(new Font("Tahoma",Font.PLAIN,15));
        enterPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
        passwordTextField.setBounds(350,400,250,50);

        registerButton.addActionListener(this);

        newUserLoginPanel.add(nameLabel);
        newUserLoginPanel.add(registerLabel);
        newUserLoginPanel.add(nameTextField);
        newUserLoginPanel.add(surnameLabel);
        newUserLoginPanel.add(surnameTextField);
        newUserLoginPanel.add(emailLabel);
        newUserLoginPanel.add(emailTextField);
        newUserLoginPanel.add(userNameLabel);
        newUserLoginPanel.add(newUsernameTextfield);
        newUserLoginPanel.add(genderLabel);
        newUserLoginPanel.add(maleRadioButton);
        newUserLoginPanel.add(femaleRadioButton);
        newUserLoginPanel.add(registerButton);
        newUserLoginPanel.add(enterPasswordLabel);
        newUserLoginPanel.add(passwordTextField);
        componentPanel.add(newUserLoginPanel);
        componentPanel.revalidate();
        componentPanel.repaint();
        //add(componentPanel);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==login){
            componentPanel.removeAll();
            designLoginPanel();
        }
        if (e.getSource()==newUserButton){
            componentPanel.removeAll();
            designNewUserLoginPanel();
        }
        if (e.getSource()== loginButton){
            if(validateUserLogin()==true){
                JOptionPane.showMessageDialog(null,"Login was successful");
            }
        }
        else if (e.getSource()==registerButton){
            if (validateNewUserRegistration()==true){
                JOptionPane.showMessageDialog(null,"Registration was successful");
            }
        }


    }



    private boolean validateUserLogin(){
        boolean valid = true;

        if ((this.passwordField.getPassword().length<1)&&(this.usernameTextField.getText().length()<1)){
            JOptionPane.showMessageDialog(null,"Please enter username and password!", "No username and Password Error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        else if(this.usernameTextField.getText().length()<1) {
            JOptionPane.showMessageDialog(null,"Please enter your username!", "No name error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        else if (this.passwordField.getPassword().length<1){
            JOptionPane.showMessageDialog(null,"Please enter your password!", "No password error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        return valid;

    }

    private boolean validateNewUserRegistration(){
        boolean valid = true;
        if ((this.nameTextField.getText().length()<1)&&(this.surnameTextField.getText().length()<1)&&(this.emailTextField.getText().length()<1)
                &&(this.newUsernameTextfield.getText().length()<1)&&(this.maleRadioButton.isSelected()==false && this.femaleRadioButton.isSelected()==false)
                &&(this.passwordTextField.getText().length()<1)) {
            JOptionPane.showMessageDialog(null,"Please Fill in your details!", "Empty form error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        else if (this.nameTextField.getText().length()<1) {
            JOptionPane.showMessageDialog(null,"Please enter your name!", "No name error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        else if (this.surnameTextField.getText().length()<1)
        {
            JOptionPane.showMessageDialog(null,"Please enter your surname!", "No name error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        else if (this.emailTextField.getText().length()<1)
        {
            JOptionPane.showMessageDialog(null,"Please enter your email!", "No email error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        else if (this.newUsernameTextfield.getText().length()<1){
            JOptionPane.showMessageDialog(null,"Please choose a username!", "No username error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        else if (this.maleRadioButton.isSelected()==false && this.femaleRadioButton.isSelected()==false){
            JOptionPane.showMessageDialog(null,"Please select a gender!", "Unspecified gender error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        else if (this.passwordTextField.getText().length()<1){
            JOptionPane.showMessageDialog(null,"Please choose a password!", "No password error", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
        return valid;
    }

}
