/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorycode;

/**
 *
 * @author farisha qistina
 */
public class staffAddress { //COMPOSITION CLASS
    
    //DATA MEMBERS
    private String houseNo;
    private String buildingName;
    private String streetName;
    private int postCode;
    private String city;
    private String state;
    
    public staffAddress(){
        this(null,null,null,0,null,null);
    }//DEFAULT CONSTRUCTOR
    
    public staffAddress(String houseNo, String buildingName, String streetName, int postCode, String city, String State){
        this.houseNo = houseNo;
        this.buildingName = buildingName;
        this.streetName = streetName;
        this.postCode = postCode;
        this.city = city;
        this.state = state;
    }//CONSTRUCTOR WITH PARAMETER

    public String getHouseNo() {
        return houseNo;
    }//GETTER HOUSENO

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }//SETTER HOUSENO

    public String getBuildingName() {
        return buildingName;
    }//GETTER BUILDINGNAME

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }//SETTER BUILDINGNAME

    public String getStreetName() {
        return streetName;
    }//GETTER STREETNAME

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }//SETTER STREETNAME

    public int getPostCode() {
        return postCode;
    }//GETTER POSTCODE

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }//SETTER POSTCODE

    public String getCity() {
        return city;
    }//GETTER CITY

    public void setCity(String city) {
        this.city = city;
    }//SETTER CITY

    public String getState() {
        return state;
    }//GETTER STATE

    public void setState(String state) {
        this.state = state;
    }//SETTER STATE
    
    public String tostring(){
        return  "House No      : " + houseNo + "\n" +
                "Building Name : " + buildingName + "\n" +  
                "Street Name   : " + streetName + "\n" +
                "Postcode      : " + postCode + "\n" +
                "City          : " + city + "\n" +
                "State         : " + state;
    }//END TOSTRING
}//END CLASS