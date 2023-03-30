/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorycode;

/**
 *
 * @author farisha qistina
 */
//AV is refer as AudioVideo
public class AV extends Products { //INHERIT PRODUCTS CLASS
    
    //DATA MEMBERS
    protected String avTitle;
    protected int avVol;
    protected int avSerial;
    protected boolean isDVD;
    protected boolean isCD;
    
    public AV(){
        this(null,0,0,false,false,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public AV(String avTitle,int avVol,int avSerial, boolean isDVD, boolean isCD, int prodID, String prodName, int prodQty, double prodPrice){
        super(prodID, prodName, prodQty, prodPrice); //INVOKING SUPER CONSTRUCTOR
        this.avTitle = avTitle;
        this.avVol = avVol;
        this.avSerial = avSerial;
        this.isDVD = isDVD;
        this.isCD = isCD;
    }

    public String getAvTitle() {
        return avTitle;
    }//GETTER AVTITLE

    public void setAvTitle(String avTitle) {
        this.avTitle = avTitle;
    }//SETTER AVTITLE

    public int getAvVol() {
        return avVol;
    }//GETTER AVVOL

    public void setAvVol(int avVol) {
        this.avVol = avVol;
    }//SETTER AVVOL

    public int getAvSerial() {
        return avSerial;
    }//GETTER AVSERIAL

    public void setAvSerial(int avSerial) {
        this.avSerial = avSerial;
    }//SETTER AVSERIAL

    public boolean isIsDVD() {
        return isDVD;
    }//GETTER ISDVD

    public void setIsDVD(boolean isDVD) {
        this.isDVD = isDVD;
    }//SETTER ISDVD
    
    public boolean isIsCD() {
        return isCD;
    }//GETTER ISCD

    public void setIsCD(boolean isCD) {
        this.isCD = isCD;
    }//SETTER ISCD
    
    public String toString() {
        return super.toString() + "\n" +
                "=============================== \n" +
                "Title     : " + avTitle + "\n" +
                "Volume    : " + avVol + "\n" +
                "Serial No : " + avSerial + "\n" +
                "isDVD     : " + isDVD + "\n" + 
                "isCD      : " + isCD;
    }//END TOSTRING
}//END CLASS
 