/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author farisha qistina
 */
public class Start {
    public static void main(String[] args){
       LoadingPage s = new LoadingPage();
       s.setVisible(true);
       try {
           for (int i = 0; i<=100; i++){
               Thread.sleep(40);
               s.label2.setText("Loading..."+ Integer.toString(i)+ "%");
               s.b1.setValue(i);
               LoginPage p = new LoginPage();
               if ( i == 100){
                   s.dispose();
                   p.show();
               }
           }
       }catch (Exception e){
           
       }
        
        
    }
    
}
