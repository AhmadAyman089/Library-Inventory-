package GUI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author syahmiwafiy
 */
public class deleteProduct {
    int productId;
    
    public deleteProduct() {
        this(0);
    }//DEFAULT CONSTRUCTOR

    public deleteProduct(int productId) {
        this.productId = productId;
        getText(productId);
    }//CONSTRUCTOR WITH PARAMETER
    
    //METHOD TO GET TEXT DATA FROM THE LINE
    public void getText(int n){
    n=n-1;
    String strPath = "C:/Inventory.txt";
    String existingStr = null;
    //USING TRY CATCH BLOCKS
    try (BufferedReader br = new BufferedReader(new FileReader(strPath))) {
        for (int i = 0; i < n; i++)
            br.readLine();
            existingStr = br.readLine(); //READ TXT OF NTH LINE
            String replaceStr = (n+1) + ",null";
            deleteText(existingStr, replaceStr); //CALL METHOD DELETETEXT
      }
      catch(IOException e){
        System.out.println(e);
      }//END TRY CATCH
    }//END METHOD GETTEXT
    
    //METHOD TO DELETE THE TEXT FROM THE FILE
    private void deleteText(String oldStr, String newStr){
        String strPath = "C:/Inventory.txt";
        File fileToBeModified = new File(strPath);
        String oldContent = "";
        BufferedReader reader = null;
        FileWriter writer = null;
        
        //USING TRY CATCH BLOCKS
        try
        {   
            //READ LINES OF TXT FILE
            reader = new BufferedReader(new FileReader(fileToBeModified));
            String line = reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator();
                line = reader.readLine();
            }//ENDDO
             
            //REPLACING WITH NEW DATA
            String newContent = oldContent.replaceAll(oldStr, newStr);

            //REWRITE THE NEW DATA 
            writer = new FileWriter(fileToBeModified);
            writer.write(newContent);
            System.out.println("DONE !");
       
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }//END TRY CATCH
        finally{
            try
            {
                //CLOSE READER & WRITER
                reader.close();
                writer.close();
            } 
            catch (IOException e) 
            {
                e.printStackTrace();
            }//END NESTED TRY CATCH
        }//END FINALLY
    }//END METHOD
    
}//END CLASS
