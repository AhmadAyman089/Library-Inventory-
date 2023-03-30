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
public class Journal extends Books{ //INHERITS BOOKS CLASS
    
    //DATA MEMBERS
    private String journalCategory;
    
    public Journal() {
        this(null,null,null,0,false,false,false,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public Journal(String journalCategory,String booksTitle, String booksVol, int booksSerial, boolean isNovel, boolean isMagazine, boolean isJournal,int prodID, String prodName, int prodQty, double prodPrice){
        super(booksTitle,booksVol,booksSerial,isNovel,isMagazine,isJournal,prodID,prodName,prodQty,prodPrice);
        this.journalCategory = journalCategory;
    }//CONSTRUCTOR WITH PARAMETER

    public String getJournalCategory() {
        return journalCategory;
    }//GETTER JOURNALCATEGORY

    public void setJournalCategory(String journalCategory) {
        this.journalCategory = journalCategory;
    }//SETTER JOURNALCATEGORY
    
    public void appenddatjournal(){
        checkText cf = new checkText();
        cf.appendprodJournal(prodID, prodName, prodQty, prodPrice,
                           booksTitle, booksVol, booksSerial, isNovel, isMagazine, isJournal,
                           journalCategory);
    }//END METHOD
    
    @Override
    public String toString(){
        return
        super.toString() + "\n" +
        "======================================== \n" +
        "Journal Category : " + journalCategory;
    }//END TOSTRING
}//END CLASS

