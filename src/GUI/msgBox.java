
/*
    *
    *



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author dutyg
 */
public class msgBox {
    
   //DATA MEMBERS
    String message;
    String title;

    public msgBox() {
        this(null,null);
    }//DEFAULT CONSTRUCTOR

    public msgBox(String message, String title) {
        this.message = message;
        this.title = title;
    }//CONSTRUCTOR WITH PARAMETER

    public String getMessage() {
        return message;
    }//GETTER MESSAGE

    public void setMessage(String message) {
        this.message = message;
    }//SETTER MESSAGE

    public String getTitle() {
        return title;
    }//GETTER TITLE

    public void setTitle(String title) {
        this.title = title;
    }//SETTER TITLE
    
    //METHOD TO SHOW AN ERROR MESSAGE BOX
    public void showerrorMsg(){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.ERROR_MESSAGE);
    }//METHOD ERROR MESSAGE
    
    //METHOD TO SHOW AN INFORMATION MESSAGE BOX
    public void showinfoMsg(){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }//METHOD INFO MESSAGE
    
    //METHOD TO SHOW A WARNING MESSAGE BOX
    public void showwarningMsg(){
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.WARNING_MESSAGE);
    }//METHOD INFO MESSAGE
    
}//END CLASS
