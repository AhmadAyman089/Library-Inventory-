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
public class Novel extends Books{ //INHERITS BOOKS CLASS
    
    //DATA MEMBERS
    private String novelCategory;
    
    public Novel() {
        this(null,null,null,0,false,false,false,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public Novel(String novelCategory,String booksTitle, String booksVol, int booksSerial, boolean isNovel, boolean isMagazine, boolean isJournal,int prodID, String prodName, int prodQty, double prodPrice){
        super(booksTitle,booksVol,booksSerial,isNovel,isMagazine,isJournal,prodID,prodName,prodQty,prodPrice);
        this.novelCategory = novelCategory;
    }//CONSTRUCTOR WITH PARAMETER

    public String getNovelCategory() {
        return novelCategory;
    }//GETTER NOVELCATEGORY

    public void setNovelCategory(String novelCategory) {
        this.novelCategory = novelCategory;
    }//SETTER NOVELCATEGORY
    
    public void appenddatanovel(){
        checkText cf = new checkText();
        cf.appendprodNovel(prodID, prodName, prodQty, prodPrice,
                           booksTitle, booksVol, booksSerial, isNovel, isMagazine, isJournal,
                           novelCategory);
    }//END METHOD
    
    @Override
    public String toString(){
        return
        super.toString() + "\n" +
        "======================================== \n" +
        "Novel Category : " + novelCategory;
    }//END TOSTRING
}//END CLASS
