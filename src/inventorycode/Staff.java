/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorycode;

import GUI.addUser;

/**
 *
 * @author farisha qistina
 */
public class Staff { //SUPERCLASS
    
    //DATA MEMBERS
    private int staffID;
    private String staffPass;
    private String staffRole;
    private staffName name; //'HAS-A' RELATIONSHIP (COMPOSITION)
    private staffAddress address; //'HAS-A' RELATIONSHIP (COMPOSITION)

    public Staff() {
        staffID = 0;
        staffPass = null;
        name = new staffName(null,null);
        address = new staffAddress(null,null,null,0,null,null);
    }//DEFAULT CONSTRUCTOR
    
    public Staff(int staffID, String staffPass, String firstName, String lastName, String houseNo, String buildingName, String streetName, int postCode, String city, String state,String staffRole) {
        this.staffPass = staffPass;
        this.staffID = staffID;
        this.name = new staffName(firstName, lastName);
        this.address = new staffAddress(houseNo, buildingName, streetName, postCode, city, state);
        this.staffRole = staffRole;
        addUser au = new addUser();
        au.appendUserdata(staffID, staffPass, firstName, lastName, houseNo, buildingName, streetName, postCode, city, state,staffRole);  
    }//CONSTRUCTOR WITH PARAMETER

    public int getStaffID() {
        return staffID;
    }//GETTER STAFFID

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }//SETTER STAFFID
    
        public String getStaffPass() {
        return staffPass;
    }//GETTER STAFFPASS

    public void setStaffPass(String staffPass) {
        this.staffPass = staffPass;
    }//SETTER STAFFPASS

    public staffName getName() {
        return this.name;
    }//GETTER STAFFNAME

    public void setName(String firstName, String lastName) {
        this.name = new staffName(firstName, lastName);
    }//SETTER STAFFNAME

    public staffAddress getAddress() {
        return this.address;
    }//GETTER STAFFADDRESS

    public void setAddress(String houseNo, String buildingName, String streetName, int postCode, String city, String state) {
        this.address = new staffAddress(houseNo, buildingName, streetName, postCode, city, state);
    }//SETTER STAFFADDRESS

    @Override
    public String toString() {
        return "Staff ID : " + staffID + "\n" +
               name + "\n" + 
               address;
    }//END TOSTRING

}//END CLASS
