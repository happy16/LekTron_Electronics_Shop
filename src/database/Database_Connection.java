package database;

import gui.Home_Form;

import javax.swing.*;
import java.sql.*;

public class Database_Connection {

    Connection conn = null;

    private Connection connect (){
        String url = "jdbc:sqlite:Resources/Database/OopProject.db";
        try {
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    private Connection disconnect (){
        try {
            this.conn.close();
        }
        catch (SQLException e){
            System.out.println();e.getMessage();
        }
        return conn;
    }
    public void selectAllPhones(){
        String sql = "SELECT * FROM phones";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            Home_Form home_form = new Home_Form();
            while (rs.next()) {
                //home_form.designViewItems();
                home_form.productName.setText(rs.getString("product_name"));
                home_form.productQuantity.setText(Integer.toString(rs.getInt("product_quantity")));
                home_form.productPrice.setText(Integer.toString(rs.getInt("product_price")));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertPhones(String product_name, int product_price, int product_quantity, int product_id) {

        try {

            Connection conn = this.connect();
            String SQLStatement = "INSERT INTO phones VALUES (?, ?, ?, ?)";
            PreparedStatement p = conn.prepareStatement(SQLStatement);
            p.setString(1,product_name);
            p.setInt(2,product_price);
            p.setInt(3,product_id);
            p.setInt(4,product_quantity);
            p.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: INSERT INTO", "No database specified", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
    public void insertTelevisions(String product_name, int product_price, int product_quantity, int product_id) {

        try {

            Connection conn = this.connect();
            String SQLStatement = "INSERT INTO televisions VALUES (?, ?, ?, ?)";
            PreparedStatement p = conn.prepareStatement(SQLStatement);
            p.setString(1,product_name);
            p.setInt(2,product_price);
            p.setInt(3,product_id);
            p.setInt(4,product_quantity);
            p.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: INSERT INTO", "No database specified", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void updateUsers (String name, String surname, String username, String password, String email, String gender, int user_id){

        try{
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();

            String SQLStatement = "UPDATE PHONES SET product_name = ?, product_price = ?,product_quantity = ? WHERE product_id = ?";
            PreparedStatement p = conn.prepareStatement(SQLStatement);
            p.setString(1, name);
            p.setString(2, surname);
            p.setString(3,username);
            p.setString(4, password);
            p.setString(5,email);
            p.setString(6,gender);
            p.setInt(7,user_id);
            p.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR: UPDATE", "No database specified", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    public void updatePhones(String product_name, int product_price, int product_quantity, int product_id){

        try{
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();

            String SQLStatement = "UPDATE PHONES SET product_name = ?, product_price = ?,product_quantity = ? WHERE product_id = ?";
            PreparedStatement p = conn.prepareStatement(SQLStatement);
            p.setString(1, product_name);
            p.setInt(2, product_price);
            p.setInt(3,product_quantity);
            p.setInt(4, product_id);
            p.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR: UPDATE", "No database specified", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    public void updateTelevisions(String product_name, int product_price, int product_quantity, int product_id){

        try{
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();

            String SQLStatement = "UPDATE TELEVISIONS SET product_name = ?, product_price = ?,product_quantity = ? WHERE product_id = ?";
            PreparedStatement p = conn.prepareStatement(SQLStatement);
            p.setString(1, product_name);
            p.setInt(2, product_price);
            p.setInt(3,product_quantity);
            p.setInt(4, product_id);
            p.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR: UPDATE", "No database specified", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

    }

    public void deletePhones(int product_id){

        try{
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();

            String SQLStatement = "DELETE FROM PHONES WHERE product_id = ?";
            PreparedStatement p = conn.prepareStatement(SQLStatement);
            p.setInt(1, product_id);
            p.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR: DELETE FROM", "No database specified", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void deleteTelevisions(int product_id){

        try{
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();

            String SQLStatement = "DELETE FROM TELEVISIONS WHERE product_id = ?";
            PreparedStatement p = conn.prepareStatement(SQLStatement);
            p.setInt(1, product_id);
            p.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR: DELETE FROM", "No database specified", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void deleteUser(int user_Id){

        try{
            Connection conn = this.connect();
            Statement stmt  = conn.createStatement();

            String SQLStatement = "DELETE FROM users WHERE name user_id= ?";
            PreparedStatement p = conn.prepareStatement(SQLStatement);
            p.setInt(1, user_Id);
            p.executeUpdate();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"ERROR: DELETE FROM", "No database specified", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void insertUser(String name, String surname, String username, String password, String email, String gender,int user_id) {

        try {

            Connection conn = this.connect();
            String SQLStatement = "INSERT INTO users VALUES (?, ?, ?, ?,?,?)";
            PreparedStatement p = conn.prepareStatement(SQLStatement);
            p.setString(1,name);
            p.setString(2,surname);
            p.setString(3,username);
            p.setString(4,password);
            p.setString(5,email);
            p.setString(6,gender);
            p.setInt(7,user_id);
            p.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ERROR: INSERT INTO", "No database specified", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void product1Name(int product1Key, int product2Key){
        //String name1 = "SELECT * FROM product_list WHERE product_id ="+product1Key;
        //String name2 = "SELECT * FROM product_list WHERE product_id ="+product2Key;
        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
        )
        {
            /*Product_Form product_form = new Product_Form();
            product_form.productKey1 = product1Key;
            product_form.productKey2 = product2Key;

            product_form.productName.setText(stmt.executeQuery("SELECT * FROM product_list WHERE product_id ="+product1Key).getString("product_name"));
            product_form.product2Name.setText(stmt.executeQuery("SELECT * FROM product_list WHERE product_id ="+product2Key).getString("product_name"));
            product_form.productQuantity.setText(stmt.executeQuery("SELECT * FROM product_list WHERE product_id ="+product1Key).getString("product_quantity"));
            product_form.product2QuantityLabel.setText(stmt.executeQuery("SELECT * FROM product_list WHERE product_id ="+product2Key).getString("product_quantity"));

            product_form.productPrice.setText("€"+stmt.executeQuery("SELECT * FROM product_list WHERE product_id ="+product1Key).getString("product_price"));
            product_form.product2PriceLabel.setText("€"+stmt.executeQuery("SELECT * FROM product_list WHERE product_id ="+product2Key).getString("product_price"));
            */


        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public void selectAllAdmins(){
        String sql = "SELECT * FROM admins";

        try (Connection conn = this.connect();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){

            // loop through the result set
            System.out.println("\nusername\tpassword\tname\tsurname");
            System.out.println("---------------------------");
            while (rs.next()) {
                System.out.println(rs.getInt("username") +  "\t" +
                        rs.getString("password") + "\t" +
                        rs.getString("name") +"\t"+rs.getString("surname"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
