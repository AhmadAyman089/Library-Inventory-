/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorycode;

/**
 *
 * @author farisha qistina
 */
public class Magazine extends Books{ //INHERITS BOOKS CLASS
    
    //DATA MEMBERS
    private String magazineCategory;
    
    public Magazine() {
        this(null,null,null,0,false,false,false,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public Magazine(String magazineCategory,String booksTitle, String booksVol, int booksSerial, boolean isNovel, boolean isMagazine, boolean isJournal,int prodID, String prodName, int prodQty, double prodPrice){
        super(booksTitle,booksVol,booksSerial,isNovel,isMagazine,isJournal,prodID,prodName,prodQty,prodPrice);
        this.magazineCategory = magazineCategory;
    }//CONSTRUCTOR WITH PARAMETER

    public String getMagazineCategory() {
        return magazineCategory;
    }//GETTER MAGAZINECATEGORY

    public void setMagazineCategory(String magazineCategory) {
        this.magazineCategory = magazineCategory;
    }//SETTER MAGAZINECATEGORY
    
    //public void appenddatamagazine(){
        //checkFile cf = new checkFile();
        //cf.appendprodnovel(prodID, prodName, prodQty, prodPrice,
                           //booksTitle, booksVol, booksSerial, isNovel, isMagazine, isJournal,
                           //magazineCategory);
    //}//END METHOD
    
    @Override
    public String toString(){
        return
        super.toString() + "\n" +
        "======================================== \n" +
        "Magazine Category : " + magazineCategory;
    }//END TOSTRING
}//END CLASS
