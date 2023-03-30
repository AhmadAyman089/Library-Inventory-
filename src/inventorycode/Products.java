/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorycode;

/**
 *
 * @author farisha qistina
 */
public class Products {
    
    //DATA MEMBERS
    protected int prodID;
    protected String prodName;
    protected int prodQty;
    protected double prodPrice;
    
    public Products(int prodID, String prodName, int prodQty, double prodPrice){
        this.prodID = prodID;
        this.prodName = prodName;
        this.prodQty = prodQty;
        this.prodPrice = prodPrice;
    }//CONSTRUCTOR WITH PARAMETER

    public int getProdID() {
        return prodID;
    }//GETTER PRODID

    public void setProdID(int prodID) {
        this.prodID = prodID;
    }//SETTER PRODID

    public String getProdName() {
        return prodName;
    }//GETTER PRODNAME

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }//SETTER PRODNAME

    public int getProdQty() {
        return prodQty;
    }//GETTER PRODQTY

    public void setProdQty(int prodQty) {
        this.prodQty = prodQty;
    }//SETTER PRODQTY

    public double getProdPrice() {
        return prodPrice;
    }//GETTER PRODPRICE

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }//SETTER PRODPRICE
    
    @Override
    public String toString(){
        return "Product ID    : " + prodID + "\n" + 
                "Product Name  : " + prodName + "\n" + 
                "Product Qty   : " + prodQty + "\n" + 
                "Product Price : " + prodPrice;
    }//END TOSTRING
}//END CLASS