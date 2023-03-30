/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorycode;

import GUI.checkText;

/**
 *
 * @author farisha qistina
 */
public class CD extends AV{ //INHERITS AV CLASS
    //DATA MEMBERS
    private String cdCategory;
    private int cdYears;
    
    public CD(){
        this(null,0,null,0,0,false,false,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public CD( String cdCategory,int cdYears,String avTitle,int avVol,int avSerial, boolean isDVD, boolean isCD, int prodID, String prodName, int prodQty, double prodPrice){
        super(avTitle,avVol,avSerial,isDVD,isCD,prodID,prodName,prodQty,prodPrice);
        this.cdCategory = cdCategory;
        this.cdYears = cdYears;
    }//CONSTRUCTOR WITH PARAMETER

    public String getCdCategory() {
        return cdCategory;
    }//GETTER CDCATEGORY

    public void setCdCategory(String cdCategory) {
        this.cdCategory = cdCategory;
    }//SETTER CDCATEGORY

    public int getCdYears() {
        return cdYears;
    }//GETTER CDYEARS

    public void setCdYears(int cdYears) {
        this.cdYears = cdYears;
    }//SETTER CDYEARS
    
    //METHOD TO APPEND TEXT FILE OF CD PRODUCT
    public void appenddatacd(){
    checkText cf = new checkText();
    cf.appendprodCD(prodID, prodName, prodQty, prodPrice,
                     avTitle, avVol, avSerial,
                     isDVD, isCD, cdCategory, cdYears);
    }//END METHOD
    
    @Override
    public String toString(){
        return super.toString() + "\n" +
               "============================================ \n" +
               "CD Category     : " + cdCategory + "\n" +
               "CD Release Year : " + cdYears;
    }//END TOSTRING
}//END CLASS
