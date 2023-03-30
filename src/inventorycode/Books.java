/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventorycode;

/**
 *
 * @author farisha qistina
 */
public class Books extends Products{ //INHERIT PRODUCTS CLASS
    
    //DATA MEMBERS
    protected String booksTitle;
    protected String booksVol;
    protected int booksSerial;
    protected boolean isNovel;
    protected boolean isMagazine;
    protected boolean isJournal;
    
    public Books(){
        this(null,null,0,false,false,false,0,null,0,0.0);
    }//DEFAULT CONSTRUCTOR
    
    public Books(String booksTitle, String booksVol, int booksSerial, boolean isNovel, boolean isMagazine, boolean isJournal,int prodID, String prodName, int prodQty, double prodPrice ){
        super(prodID, prodName, prodQty, prodPrice);
        this.booksTitle = booksTitle;
        this.booksVol = booksVol;
        this.booksSerial = booksSerial;
        this.isNovel = isNovel;
        this.isMagazine = isMagazine;
        this.isJournal = isJournal;
    }//CONSTRUCTOR EITH PARAMETER

    public String getBooksTitle() {
        return booksTitle;
    }//GETTER BOOKSTITLE

    public void setBooksTitle(String booksTitle) {
        this.booksTitle = booksTitle;
    }//SETTER BOOKSTITLE

    public String getBooksVol() {
        return booksVol;
    }//GETTER BOOKSVOL

    public void setBooksVol(String booksvol) {
        this.booksVol = booksVol;
    }//SETTER BOOKSVOL

    public int getBooksSerial() {
        return booksSerial;
    }//GETTER BOOKSSERIAL

    public void setBooksSerial(int booksSerial) {
        this.booksSerial = booksSerial;
    }//SETTER BOOKSSERIAL

    public boolean isIsNovel() {
        return isNovel;
    }//GETTER ISNOVEL

    public void setIsNovel(boolean isNovel) {
        this.isNovel = isNovel;
    }//SETTER ISNOVEL

    public boolean isIsMagazine() {
        return isMagazine;
    }//GETTER ISMAGAZINE

    public void setIsMagazine(boolean isMagazine) {
        this.isMagazine = isMagazine;
    }//SETTER ISMAGAZINE

    public boolean isIsJournal() {
        return isJournal;
    }//GETTER ISJOURNAL

    public void setIsJournal(boolean isJournal) {
        this.isJournal = isJournal;
    }//SETTER ISJOURNAL
    
    @Override
    public String toString(){
        return
        super.toString() + "\n" +
        "============================================ \n" +         
        "Title      : " + booksTitle + "\n" + 
        "Volume     : " + booksVol + "\n" +  
        "Serial No  : " + booksSerial + "\n" +   
        "isNovel    : " + isNovel + "\n" + 
        "isMagazine : " + isMagazine + "\n" + 
        "isJournal  : " + isJournal ;
    }//END TOSTRING
}//END CLASS