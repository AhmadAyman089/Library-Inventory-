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
public class DVD extends AV{ //INHERITS AV CLASS
    
    //DATA MEMBERS
    private String dvdCategory;
    private int dvdYears;
    
    public DVD(){
        this(null,0,null,0,0,false,false,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public DVD( String dvdCategory,int dvdYears,String avTitle,int avVol,int avSerial, boolean isDVD, boolean isCD, int prodID, String prodName, int prodQty, double prodPrice){
        super(avTitle,avVol,avSerial,isDVD,isCD,prodID,prodName,prodQty,prodPrice);
        this.dvdCategory = dvdCategory;
        this.dvdYears = dvdYears;
    }//CONSTRUCTOR WITH PARAMETER

    public String getDvdCategory() {
        return dvdCategory;
    }//GETTER DVDCATEGORY

    public void setDvdCategory(String dvdCategory) {
        this.dvdCategory = dvdCategory;
    }//SETTER DVDCATEGORY

    public int getDvdYears() {
        return dvdYears;
    }//GETTER DVDYEARS

    public void setDvdYears(int dvdYears) {
        this.dvdYears = dvdYears;
    }//SETTER DVDYEARS
    
    //METHOD TO APPEND TEXT FILE OF DVD PRODUCT
    public void appenddatadvd(){
    checkText cf = new checkText();
    cf.appendprodDVD(prodID, prodName, prodQty, prodPrice,
                     avTitle, avVol, avSerial,
                     isDVD, isCD, dvdCategory, dvdYears);
    }//END METHOD
    
    @Override
    public String toString(){
        return super.toString() + "\n" +
               "============================================ \n" +
               "DVD Category     : " + dvdCategory + "\n" +
               "DVD Release Year : " + dvdYears;
    }//END TOSTRING
}//END CLASS