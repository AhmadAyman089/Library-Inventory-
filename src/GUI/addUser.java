
/*
    *
    *



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author dutyg
 */
public class addUser {
    public addUser(){
        checkText cf = new checkText();
    }//DEFAULT CONSTRUCTOR
    
    //METHOD TO ADD USER DATA INTO TXT FILE
    public void appendUserdata(int staffId, String staffPass,String firstName, String lastName, 
                               String houseNo, String buildingName, String streetName, 
                               int postcode, String city, String state, String role){
        String strPath = "C:/Staff.txt";
        try {
            String getData =  staffId+","+staffPass+","+firstName+","+lastName+
                              ","+houseNo+","+buildingName+","+streetName+","+
                              postcode+","+city+","+state+","+role+"\n";
            File file = new File(strPath);
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
