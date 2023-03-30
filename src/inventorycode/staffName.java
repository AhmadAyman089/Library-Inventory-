/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorycode;

/**
 *
 * @author farisha qistina
 */
public class staffName { //COMPOSITION CLASS
    
    //DATA MEMBERS
    private String firstName;
    private String lastName;
    
    public staffName(){
        this(null,null);
    }//DEFAULT CONSTRUCTOR
    
    public staffName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }//CONSTRUCTOR WITH PARAMETER

    public String getFirstName() {
        return firstName;
    }//GETTER FIRSTNAME

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }//SETTER FIRSTNAME

    public String getLastName() {
        return lastName;
    }//GETTER LASTNAME

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }//SETTER LASTNAME
    
    public String tostring(){
        return "First Name : " + firstName + "\n" +
               "Last Name  : " + lastName;
    }//END TOSTRING
}//END CLASS