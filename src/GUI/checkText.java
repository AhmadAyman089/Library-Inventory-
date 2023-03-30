
package GUI;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.FileNotFoundException;

/**
 *
 * @author dutyg
 */
public class checkText {
       String strProduct = "C:/Inventory.txt";
        String strStaff = "C:/Staff.txt";
        
    public checkText(){        
        
        try {
            File file = new File(strProduct);
            boolean fvar = file.createNewFile();
                if (fvar){
                     System.out.println("File Created !");
             }
                else{
                    System.out.println("File Exists !");
                }//END IF   
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH
     try {
            File file = new File(strStaff);
            boolean fvar = file.createNewFile();
                if (fvar){
                    System.out.println("File Created !");
                }
                else{
                    System.out.println("File Exists !");
                }//END IF
        } catch (FileNotFoundException e) {
            e.printStackTrace();        
        } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH
        
    }//DEFAULT CONSTRUCTOR
    public void appendprodCD(int pCode, String pName, int pQty, double pPrice, String avTitle,int avVol,
                                  int cSerial, boolean isDVD, boolean isCD, String cdCategory,int cdYear){
         
          // IF STATEMENT TO DETERMINE EITHER THE PRODUCT IS CD OR DVD
          
                  String avType = null;
                   if(isDVD == true){
                          avType = "DVD";
                   }else 
                   if(isCD == true) {
                       avType = "CD";
                   }//END if
             try {  
              String getData = pCode+","+avType+","+pName+","+pQty+","+pPrice+","+ avTitle+","+cSerial+","+cdCategory+","+cdYear+"\n";
              
              File file = new File(strProduct);    
              FileWriter fw = new FileWriter(file,true);   
              BufferedWriter bw = new BufferedWriter(fw);
              bw.write(getData);
              bw.close();
              System.out.println("Data has been saved !");
              
              
             } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH
    
        }    
    public void appendprodDVD(int pCode, String pName, int pQty, double pPrice, String avTitle,int avVol,int cSerial, boolean isDVD, boolean isCD, String dvdCategory,int dvdYear){
        //USING IF STATEMENT TO DETERMINE EITHER THE PRODUCT IS CD OR DVD
        String avType = null;
        if(isDVD == true){
            avType = "DVD";
        }else
        if(isCD == true) {
            avType = "CD";
        }//END IF
        
        //USING TRY CATCH
        try {
            String getData =  pCode+","+avType+","+pName+","+pQty+","+pPrice+","+ avTitle+","+cSerial+","+dvdCategory+","+dvdYear+"\n";
            File file = new File(strProduct);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getData);
            bw.close();
            System.out.println("Data has been saved !");
            
        } catch (IOException e) {
            e.printStackTrace();
        }//END TRY CATCH
        
    }//END METHOD
    
    public void appendprodNovel(int pCode, String pName, int pQty, double pPrice,String booksTitle,String bookVol,int bookSerial, boolean isNovel,boolean isMagazine,boolean isJournal,String novelCategory){
    
        String bookType = null;
        if(isNovel == true){
            bookType = "Novel";
        }
        else
        if(isJournal == true){
            bookType = "Journal";
       
        }//END IF

    //USING TRY CATCH
        try {
            String getData =  pCode+","+bookType+","+pName+","+pQty+","+pPrice+","+
                              booksTitle+","+bookVol+","+
                              bookSerial+","+novelCategory+"\n";
            
            File file = new File(strProduct);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getData);
            bw.close();
            System.out.println("Data has been saved !");
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }//END TRY CATCH    
    
    }//END METHOD  

    public void appendprodJournal(int pCode, String pName, int pQty, double pPrice,String booksTitle,String bookVol,int bookSerial, boolean isNovel,boolean isMagazine,boolean isJournal,String journalCategory){
    
        String bookType = null;
        if(isNovel == true){
            bookType = "Novel";
        }
        else
        if(isJournal == true){
            bookType = "Journal";
       
        }//END IF

    //USING TRY CATCH
        try {
            String getData =  pCode+","+bookType+","+pName+","+pQty+","+pPrice+","+
                              booksTitle+","+bookVol+","+
                              bookSerial+","+journalCategory+"\n";
            
            File file = new File(strProduct);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getData);
            bw.close();
            System.out.println("Data has been saved !");
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }//END TRY CATCH    
    
    }//END METHOD  
     
     public void appendprodMagazine(int pCode, String pName, int pQty, double pPrice,String booksTitle,String bookVol,int bookSerial, boolean isNovel,boolean isMagazine,boolean isJournal,String megazineCategory){
    
        String bookType = null;
        if(isNovel == true){
            bookType = "Novel";
        }
        else
        if(isJournal == true){
            bookType = "Journal";
       
        }//END IF

    //USING TRY CATCH
        try {
            String getData =  pCode+","+bookType+","+pName+","+pQty+","+pPrice+","+
                              booksTitle+","+bookVol+","+
                              bookSerial+","+megazineCategory+"\n";
            
            File file = new File(strProduct);
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(getData);
            bw.close();
            System.out.println("Data has been saved !");
            
        } catch (IOException e) {
            e.printStackTrace();
            
        }//END TRY CATCH    
    
    }//END METHOD  
               
     }     
                   
                   
                   
            
            
     
   
  
 
 
    

