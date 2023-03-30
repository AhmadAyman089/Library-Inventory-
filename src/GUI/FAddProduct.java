
/*
    *
    *



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import GUI.LoadingPage;

import GUI.checkText;
import GUI.msgBox;
import inventorycode.CD;
import inventorycode.DVD;
import inventorycode.Journal;
import inventorycode.Novel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Set;
/**
 *
 * @author dutyg
 */
public class FAddProduct extends javax.swing.JFrame {

    // Audio Video Component
         
         JLabel audioVideoTitle     = new JLabel("Audio Video Title : ");  
         JLabel audioVideoVol     = new JLabel("Vol No : ");
         JLabel audioVideoSerial     = new JLabel("Serial : ");
       
        JTextField  txtaudioVideoTitle = new JTextField(15);
        JTextField  txtaudioVideoVol = new JTextField(15);
        JTextField  txtaudioVideoSerial = new JTextField(15);
        
        
    // CD Component
        
        JLabel lblCDCategory   = new JLabel("CD Category : ");
        JLabel lblCDYearsCategory   = new JLabel("CD Years : ");
        JTextField txtCDYearsCategory = new JTextField(15);
        JTextField txtCDCategory = new JTextField(15);
        
    // DVD Component
        
        JLabel lblDVDCategory   = new JLabel("DVD Category : ");
        JLabel lblDVDYearsCategory   = new JLabel("DVD Years : ");
        JTextField txtDVDYearsCategory = new JTextField(15);
        JTextField txtDVDCategory = new JTextField(15);
        
    /**
    Books Components
     */
        JLabel lblBooksTitle =    new JLabel("Books Title : ");
        JLabel lblBooksVol =  new JLabel("Volume : ");
        JLabel lblBooksSerial =    new JLabel("Serial : ");
        
        JTextField  txtBooksTitle = new JTextField(15);
        JTextField  txtBooksVolume = new JTextField(15);
        JTextField  txtBooksSerial = new JTextField(15);
        
    //  Novel Component
         JLabel novelCategory = new JLabel("Novel Category : ");
         JTextField txtnovelCategory = new JTextField(15);
        
        
     //  Jornal Component
         JLabel journalCategory = new JLabel("Journal Category : ");
         JTextField txtjournalCategory = new JTextField(15);
        
        
    //  Magazine Component
         
         JLabel magazineCategory = new JLabel("Magazine Category : ");
         JTextField txtmagazineCategory = new JTextField(15);   
         
         
        Timer timer;
        int i =0;
    
         LoadPage addLoad = new LoadPage();
        
        
        
        
    public FAddProduct() {
        
        initComponents();
        invCategorySelect();
        
        checkText ct = new checkText();
        System.out.println(ct);
        
      txtProdID.setText(Integer.toString(getLine()));
    }//DEFAULT CONSTRUCTOR
    
    public static int getLine(){
        
        String strPath = "C:/Inventory.txt"; //SET TXT PATH VALUE
        int lines = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(strPath))) {
          while (reader.readLine() != null) lines++;
        } catch (IOException e) {
          e.printStackTrace();
        }//END TRY CATCH
        return lines+1;
    }//END METHOD
    
    public void invCategorySelect(){
         //USING IF ELSE STRUCTURE TO DETERMINE SELECTED ITEM TYPE
        if (invCategory.getSelectedIndex() == 0){ //IF AUDIO VIDEO  IS SELECTED 
            invType.removeAllItems();
            invType.addItem("CD");
            invType.addItem("DVD");
        }else
        if (invCategory.getSelectedIndex() == 1){ //IF BOOKS  IS SELECTED
            invType.removeAllItems();
            invType.addItem("Novel");
            invType.addItem("Journal");
            invType.addItem("Magazine");
        }//END IF
    }//END METHOD
    
     public void invTypeSelect(){
         if(invCategory.getSelectedIndex()== 0){ // If Audio Video Selected
             
             if(invType.getSelectedIndex() == 0){ // IF CD Selected 
                 makeCDPanel();    
             }else
              if (invType.getSelectedIndex() == 1){ //IF DVD IS SELECTED
                makeDVDPanel();
             }//END NESTED IF   
         } else 
             if (invCategory.getSelectedIndex () == 1){ // IF BOOK IS SELECTED
                if (invType.getSelectedIndex() == 0){ //IF NOVEL IS SELECTED
                    makeNovelPanel();
                }
                makeNovelPanel();
                if (invType.getSelectedIndex() == 1){ //IF Journal IS SELECTED
                makeJournalPanel();
         }else    
                if (invType.getSelectedIndex() == 2){ // IF Magazine IS SELECTED
                makeMagazinePanel();
            
         }
    } // END IF
    
   }
  
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        invCategory = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtProdID = new javax.swing.JTextField();
        txtProdName = new javax.swing.JTextField();
        txtQty = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        mkPanel = new javax.swing.JPanel();
        txtClearText = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        invType = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producrt Discription", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabel4.setText("Category");

        invCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Audio Video", "Book" }));
        invCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invCategoryActionPerformed(evt);
            }
        });

        jLabel5.setText("Product ID:");

        jLabel6.setText("Product Name:");

        jLabel7.setText("Product Quantity:");

        txtProdID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdIDActionPerformed(evt);
            }
        });

        txtProdName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdNameActionPerformed(evt);
            }
        });

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel8.setText("Price:");

        mkPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout mkPanelLayout = new javax.swing.GroupLayout(mkPanel);
        mkPanel.setLayout(mkPanelLayout);
        mkPanelLayout.setHorizontalGroup(
            mkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mkPanelLayout.setVerticalGroup(
            mkPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        txtClearText.setText("Save");
        txtClearText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClearTextActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Type");

        invType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1" }));
        invType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtProdID)
                            .addComponent(txtProdName)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(invCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 135, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                            .addComponent(txtQty)
                            .addComponent(invType, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtClearText, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(invCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(invType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtProdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtProdName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(txtClearText))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 0, 102));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.icon.png"))); // NOI18N
        jLabel2.setText("ADD PRODUCT ITEM");
        jPanel3.add(jLabel2);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(780, 567));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void invCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invCategoryActionPerformed
                invCategorySelect();
    }//GEN-LAST:event_invCategoryActionPerformed

    private void txtProdIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdIDActionPerformed

    private void invTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invTypeActionPerformed
        invTypeSelect();
    }//GEN-LAST:event_invTypeActionPerformed
    
    private void clearTextField(){
        JTextField temp=null;
        for(Component clr:jPanel1.getComponents()){ //CLEAR ALL TEXTFIELD IN 
            if(clr.getClass().toString().contains("javax.swing.JTextField")){
            temp=(JTextField)clr;
            temp.setText("");
            }//END IF
        }//END FOR
        
        for(Component clr:mkPanel.getComponents()){ //CLEAR ALL TEXTFIELD IN MKPANEL
            if(clr.getClass().toString().contains("javax.swing.JTextField")){
            temp=(JTextField)clr;
            temp.setText("");
            }//END IF
        }//END FOR
        
        txtProdID.setText(Integer.toString(getLine())); //UPDATE LINE NO TO MAINTAIN PRODUCT ID VALUE
    }//END METHOD CLEARTEXTFIELD
    
    private void txtClearTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClearTextActionPerformed
        saveProducts(); //CALL METHOD SAVEPRODUCTS
    }//GEN-LAST:event_txtClearTextActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        clearTextField();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtProdNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
     private void txtProdIDMousePressed(java.awt.event.MouseEvent evt) {                                       
        
        new msgBox("Product ID cannot be modified.\nIt is an auto generated by the program !","WARNING").showwarningMsg();
     }
    public void saveProducts(){
        
        //USING TRY CATCH
        try {
        
        //DECLARE VARIABLE TO FETCH VALUE FROM TEXTFIELD
        int prodID = Integer.parseInt(txtProdID.getText());
        String prodName = txtProdName.getText();
        int prodqty = Integer.parseInt(txtQty.getText());
        double price = Double.parseDouble(txtPrice.getText());
       
                
        //USING IF TO DETERMINE PRODUCT
          //MATCH STRING ITEM VALUE FROM COMBOBOX
        if (invType.getSelectedItem() == "CD") {
            
            //FOR AUDIO VIDEO
            String avTitle = txtaudioVideoTitle.getText();
            int avVol = Integer.parseInt(txtaudioVideoVol.getText());
            int avSerial = Integer.parseInt(txtaudioVideoSerial.getText());
   
            //DECLARE BOOLEAN VARIABLE TO SET AUDIO  TYPE
            boolean isCD = true;
            boolean isDVD = false;
            
            //FETCH CD CATEGORY YEARS
            
            String cdCategory = txtCDCategory.getText();
            int cdYears = Integer.parseInt(txtCDYearsCategory.getText());
            
            
            //CREATE NEW OBJECT TO ADD CD PRODUCT(S)
            CD addCD = new CD();
            
            //INVOKE METHOD WITH PARAMETER
            addCD.setProdID(prodID);
            addCD.setProdName(prodName);
            addCD.setProdQty(prodqty);
            addCD.setProdPrice(price);
            addCD.setAvTitle(avTitle);
            addCD.setAvVol(avVol);
            addCD.setAvSerial(avSerial);
            addCD.setIsDVD(isDVD);
            addCD.setIsCD(isCD);
            addCD.setCdCategory(cdCategory);
            addCD.setCdYears(cdYears);
            
            
            System.out.println(addCD);
                    
            timer = new Timer(80, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   i++;
                     if(i==1){
                         dispose();//CLOSE FRAME
                         addLoad.setVisible(true);
                         addLoad.lblTitle.setText("Preparing to append data . . .");
                     }//END IF

                     if(i==15){
                         addLoad.lblTitle.setText("Writing data . . . ");       
                     }//END IF
                     
                    if(i==18){
                         addLoad.lblTitle.setText("Writing data | Product ID : " + prodID + " . . .");       
                    }//END IF
                    
                    if(i==21){
                         addLoad.lblTitle.setText("Writing data | Product Name : " + prodName + " . . .");       
                    }//END IF
                    
                    if(i==24){
                         addLoad.lblTitle.setText("Writing data | Quantity : " + prodqty + " . . .");       
                    }//END IF
                    
                    if(i==27){
                         addLoad.lblTitle.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==30){
                         addLoad.lblTitle.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                   
                    if(i==59){
                    addLoad.setVisible(false);
                    addCD.appenddatacd();//CHECK IF TXT FILE IS EXISTS AND ADD PRODUCT TO TXT FILE
                   
                    dispose();
                    savecallMsgBox(prodID, prodName); //CALL THIS METHOD TO SAVE AND DISPLAY MSGBOX
                     }//END IF
                    
                     if(i>60){
                         timer.stop();
                         i=0;
                     }//END IF
                }//END PUBLIC VOID
                });
            timer.start();

     
        }
        else
        if (invType.getSelectedItem() == "DVD") {
            //FOR AUDIO VIDEO
            String avTitle = txtaudioVideoTitle.getText();
            int avVol = Integer.parseInt(txtaudioVideoVol.getText());
            int avSerial = Integer.parseInt(txtaudioVideoSerial.getText());
   
            //DECLARE BOOLEAN VARIABLE TO SET AUDIO  TYPE
            boolean isCD = false;
            boolean isDVD = true;
            
            //FETCH DVD CATEGORY VALUE
            String dvdCategory = txtDVDCategory.getText();
            int dvdYears = Integer.parseInt(txtDVDYearsCategory.getText());
            
            //CREATE NEW OBJECT TO ADD DVD PRODUCT(S)
            DVD addDvd = new DVD();
            
            //INVOKE METHOD WITH PARAMETER
            
            addDvd.setProdID(prodID);
            addDvd.setProdName(prodName);
            addDvd.setProdQty(prodqty);
            addDvd.setProdPrice(price);
            addDvd.setAvTitle(avTitle);
            addDvd.setAvVol(avVol);
            addDvd.setAvSerial(avSerial);  
            addDvd.setIsDVD(isDVD);
            addDvd.setIsCD(isCD);
            addDvd.setDvdCategory(dvdCategory);
            addDvd.setDvdYears(dvdYears);
            
            System.out.println(addDvd);
            
             timer = new Timer(80, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   i++;
                     if(i==1){
                         dispose();//CLOSE FRAME
                         addLoad.setVisible(true);
                         addLoad.lblTitle.setText("Preparing to append data . . .");
                     }//END IF

                     if(i==15){
                         addLoad.lblTitle.setText("Writing data . . . ");       
                     }//END IF
                     
                    if(i==18){
                         addLoad.lblTitle.setText("Writing data | Product ID : " + prodID + " . . .");       
                    }//END IF
                    
                    if(i==21){
                         addLoad.lblTitle.setText("Writing data | Product Name : " + prodName + " . . .");       
                    }//END IF
                    
                    if(i==24){
                         addLoad.lblTitle.setText("Writing data | Quantity : " + prodqty + " . . .");       
                    }//END IF
                    
                    if(i==27){
                         addLoad.lblTitle.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==30){
                         addLoad.lblTitle.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                   
                    if(i==59){
                    addLoad.setVisible(false);
                    addDvd.appenddatadvd();//CHECK IF TXT FILE IS EXISTS AND ADD PRODUCT TO TXT FILE
                   
                    dispose();
                    savecallMsgBox(prodID, prodName); //CALL THIS METHOD TO SAVE AND DISPLAY MSGBOX
                     }//END IF
                    
                     if(i>60){
                         timer.stop();
                         i=0;
                     }//END IF
                }//END PUBLIC VOID
                });
            timer.start();

     
        }
        else
        if (invType.getSelectedItem() == "Novel") {
        
            //FOR Novel
            
            String booksTitle = txtBooksTitle.getText();
            String booksVol = txtBooksVolume.getText();
            
            int booksSerial = Integer.parseInt(txtBooksSerial.getText());
           
                      
            
            //DECLARE BOOLEAN VARIABLE TO SET BOOKS TYPE
            boolean isNovel = true;
            boolean isJournal = false;
            
            //FETCH NOVEL CATEGORY VALUE
            String novelCategory = txtnovelCategory.getText();
            
            //CREATE NEW OBJECT TO ADD SMARTPHONE PRODUCT(S)
            Novel addNovel = new Novel();
            
            //INVOKE METHOD WITH PARAMETER
            addNovel.setProdID(prodID);
            addNovel.setProdName(prodName);
            addNovel.setProdQty(prodqty);
            addNovel.setProdPrice(price);
            addNovel.setBooksTitle(booksTitle);
            
            addNovel.setBooksVol(booksVol);

            addNovel.setBooksSerial(booksSerial);
            addNovel.setIsNovel(isNovel);
            addNovel.setIsJournal(isJournal);


            addNovel.setNovelCategory(novelCategory);
            
            System.out.println(addNovel);
             timer = new Timer(80, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   i++;
                     if(i==1){
                         dispose();//CLOSE FRAME
                         addLoad.setVisible(true);
                         addLoad.lblTitle.setText("Preparing to append data . . .");
                     }//END IF

                     if(i==15){
                         addLoad.lblTitle.setText("Writing data . . . ");       
                     }//END IF
                     
                    if(i==18){
                         addLoad.lblTitle.setText("Writing data | Product ID : " + prodID + " . . .");       
                    }//END IF
                    
                    if(i==21){
                         addLoad.lblTitle.setText("Writing data | Product Name : " + prodName + " . . .");       
                    }//END IF
                    
                    if(i==24){
                         addLoad.lblTitle.setText("Writing data | Quantity : " + prodqty + " . . .");       
                    }//END IF
                    
                    if(i==27){
                         addLoad.lblTitle.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==30){
                         addLoad.lblTitle.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                   
                    if(i==59){
                    addLoad.setVisible(false);
                    addNovel.appenddatanovel();//CHECK IF TXT FILE IS EXISTS AND ADD PRODUCT TO TXT FILE
                   
                    dispose();
                    savecallMsgBox(prodID, prodName); //CALL THIS METHOD TO SAVE AND DISPLAY MSGBOX
                     }//END IF
                    
                     if(i>60){
                         timer.stop();
                         i=0;
                     }//END IF
                }//END PUBLIC VOID
                });
            timer.start();

     
        }
        else
        if (invType.getSelectedItem() == "Journal") {
            //FOR Journal
            
            String booksTitle = txtBooksTitle.getText();
            String booksVol = txtBooksVolume.getText();
            
            int booksSerial = Integer.parseInt(txtBooksSerial.getText());
           
                      
            
            //DECLARE BOOLEAN VARIABLE TO SET BOOKS TYPE
            boolean isNovel = false;
            boolean isJournal = true;
            
            //FETCH Journal CATEGORY VALUE
            String journalCategory = txtjournalCategory.getText();
            
            //CREATE NEW OBJECT TO ADD TABLET PRODUCT(S)
            Journal addJournal = new Journal();
           
            //INOKE METHOD WITH PARAMETER
            addJournal.setProdID(prodID);
            addJournal.setProdName(prodName);
            addJournal.setProdQty(prodqty);
            addJournal.setProdPrice(price);
            addJournal.setBooksTitle(booksTitle);
            addJournal.setBooksVol(booksVol);
            addJournal.setBooksSerial(booksSerial);
            addJournal.setIsNovel(isNovel);
            addJournal.setIsJournal(isJournal);
           
            
            addJournal.setJournalCategory(journalCategory);
            
            System.out.println(addJournal);
            
             timer = new Timer(80, new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   i++;
                     if(i==1){
                         dispose();//CLOSE FRAME
                         addLoad.setVisible(true);
                         addLoad.lblTitle.setText("Preparing to append data . . .");
                     }//END IF

                     if(i==15){
                         addLoad.lblTitle.setText("Writing data . . . ");       
                     }//END IF
                     
                    if(i==18){
                         addLoad.lblTitle.setText("Writing data | Product ID : " + prodID + " . . .");       
                    }//END IF
                    
                    if(i==21){
                         addLoad.lblTitle.setText("Writing data | Product Name : " + prodName + " . . .");       
                    }//END IF
                    
                    if(i==24){
                         addLoad.lblTitle.setText("Writing data | Quantity : " + prodqty + " . . .");       
                    }//END IF
                    
                    if(i==27){
                         addLoad.lblTitle.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
                    
                    if(i==30){
                         addLoad.lblTitle.setText("Writing data | Price : " + price + " . . .");       
                    }//END IF
               
                    if(i==59){
                         addLoad.lblTitle.setText("Finalizing . . .");       
                    }//END IF 
                        
                    if(i==60){
                    addLoad.setVisible(false);
                    addJournal.appenddatjournal();//CHECK IF TXT FILE IS EXISTS AND ADD PRODUCT TO TXT FILE

                    dispose();
                    savecallMsgBox(prodID, prodName); //CALL THIS METHOD TO SAVE AND DISPLAY MSGBOX
                     }//END IF
                    
                     if(i>51){
                         timer.stop();
                         i=0;
                     }//END IF
                }//END PUBLIC VOID
                });
            timer.start();

        }//END IF
        } catch (InputMismatchException e){
            new msgBox("Some value in textfield cannot be left empty or nulled.\nPlease try again !","ERROR").showerrorMsg();
        } catch (NumberFormatException e) {
            new msgBox("Some value in textfield required number format only.\nPlease try again !","ERROR").showerrorMsg();
        }//END TRY CATCH
        
         txtProdID.setText(Integer.toString(getLine())); //UPDATE LINE NO TO MAINTAIN PRODUCT ID VALUE
         
    }//END METHOD SAVEPRODUCTS
    
    private void savecallMsgBox(int prodID, String prodName){
            String message = "A product has been added."
                             + " \n  Product ID   : " + prodID
                             + " \n  Product Name : " + prodName
                             + " \n  Product Type : " + invType.getSelectedItem() +"\n";
            new msgBox(message,"PRODUCT ADDED !").showinfoMsg();
            clearTextField();
            txtProdID.setText(Integer.toString(getLine())); //UPDATE LINE NO AND PRODUCT ID    
    }//END METHOD
    


//METHOD TO PLAY EXCLAMATION SOUND FOR MSGBOX

   
    
    
    
    private void makeCDPanel(){
        mkPanel.removeAll();
        mkPanel.setLayout(new GridBagLayout());
        mkPanel.setBorder(BorderFactory.createTitledBorder("CD"));
        
        GridBagConstraints c = new GridBagConstraints();  
        
        //Y-AXIS = 0 | FOR comName
        //GRID (0,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 0;  
        mkPanel.add(audioVideoTitle,c);
        
        //GRID (1,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 0;  
        mkPanel.add(txtaudioVideoTitle,c);
        
        //Y-AXIS = 1 | FOR Audio Video Vol
        //GRID (0,1)
        c.insets = new Insets(18, 0, 0, 0);//SET TOP PADDING
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 1;  
        mkPanel.add(audioVideoVol,c);
        
        //GRID (1,1)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 1;  
        mkPanel.add(txtaudioVideoVol,c);
        
        //Y-AXIS = 2 | FOR Audio Serial
        //GRID (0,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 2; 
        mkPanel.add(audioVideoSerial,c);
        
        //GRID (1,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 2;
        mkPanel.add(txtaudioVideoSerial,c);
        
        //Y-AXIS = 3 | FOR CD Category
        //GRID (0,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 3;
        mkPanel.add(lblCDCategory,c);
        
        //GRID (1,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 3;
        mkPanel.add(txtCDCategory,c);
        
        //Y-AXIS = 4 | FOR CD Years
        //GRID (0,4)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 4;
        mkPanel.add(lblCDYearsCategory,c);
        
        //GRID (1,4)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 4;
        mkPanel.add(txtCDYearsCategory,c);
        
        
        //REFRESH PANEL
        mkPanel.revalidate();
        mkPanel.repaint();
 }//END METHOD CD PANEL
    
    private void makeDVDPanel() {
        mkPanel.removeAll();
        mkPanel.setLayout(new GridBagLayout());
        mkPanel.setBorder(BorderFactory.createTitledBorder("DVD"));
        
        GridBagConstraints c = new GridBagConstraints();  
        
        //Y-AXIS = 0 | FOR Auio Video Title
        //GRID (0,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 0;  
        mkPanel.add(audioVideoTitle,c);
        
        //GRID (1,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 0;  
        mkPanel.add(txtaudioVideoTitle,c);
        
        //Y-AXIS = 1 | FOR Audio Video Vol
        //GRID (0,1)
        c.insets = new Insets(18, 0, 0, 0);//SET TOP PADDING
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 1;  
        mkPanel.add(audioVideoVol,c);
        
        //GRID (1,1)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 1;  
        mkPanel.add(txtaudioVideoVol,c);
        
        //Y-AXIS = 2 | FOR Audio Video Vol
        //GRID (0,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 2; 
        mkPanel.add(audioVideoSerial,c);
        
        //GRID (1,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 2;
        mkPanel.add(txtaudioVideoSerial,c);
        
        //Y-AXIS = 3 | FOR DVD Category
        //GRID (0,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 3;
        mkPanel.add(lblDVDCategory,c);
        
        //GRID (1,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 3;
        mkPanel.add(txtDVDCategory,c);
        
        //Y-AXIS = 4 | FOR CD Years
        //GRID (0,4)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 4;
        mkPanel.add(lblDVDYearsCategory,c);
        
        //GRID (1,4)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 4;
        mkPanel.add(txtDVDYearsCategory,c);
        
        
        //REFRESH PANEL
        mkPanel.revalidate();
        mkPanel.repaint();
 }//END METHOD DVD PANEL
    
    private void makeNovelPanel() {
        mkPanel.removeAll();
        mkPanel.setLayout(new GridBagLayout());
        mkPanel.setBorder(BorderFactory.createTitledBorder("Novel"));
        
        GridBagConstraints c = new GridBagConstraints();  
        
        //Y-AXIS = 0 | FOR BOOKS TITLE
        //GRID (0,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 0;  
        mkPanel.add(lblBooksTitle,c);
        
        //GRID (1,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 0;  
        mkPanel.add(txtBooksTitle,c);
        
        //Y-AXIS = 1 | FOR Book Vol
        //GRID (0,1)
        c.insets = new Insets(18, 0, 0, 0);//SET TOP PADDING
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 1;  
        mkPanel.add(lblBooksVol,c);
        
        //GRID (1,1)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 1;  
        mkPanel.add(txtBooksVolume,c);
        
        //Y-AXIS = 2 | FOR Book Serial
        //GRID (0,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 2; 
        mkPanel.add(lblBooksSerial,c);
        
        //GRID (1,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 2;
        mkPanel.add(txtBooksSerial,c);
        
        //Y-AXIS = 3 | FOR Novel Category
        //GRID (0,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 3;
        mkPanel.add(novelCategory,c);
        
        //GRID (1,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 3;
        mkPanel.add(txtnovelCategory,c);
        
        //REFRESH PANEL
        mkPanel.revalidate();
        mkPanel.repaint();
 }//END METHOD NOVEL PANEL
    
    private void makeJournalPanel() {
        mkPanel.removeAll();
        mkPanel.setLayout(new GridBagLayout());
        mkPanel.setBorder(BorderFactory.createTitledBorder("Journal"));
        
        GridBagConstraints c = new GridBagConstraints();  
        
        //Y-AXIS = 0 | FOR BOOKS TITLE
        //GRID (0,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 0;  
        mkPanel.add(lblBooksTitle,c);
        
        //GRID (1,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 0;  
        mkPanel.add(txtBooksTitle,c);
        
        //Y-AXIS = 1 | FOR Book Vol
        //GRID (0,1)
        c.insets = new Insets(18, 0, 0, 0);//SET TOP PADDING
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 1;  
        mkPanel.add(lblBooksVol,c);
        
        //GRID (1,1)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 1;  
        mkPanel.add(txtBooksVolume,c);
        
        //Y-AXIS = 2 | FOR Book Serial
        //GRID (0,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 2; 
        mkPanel.add(lblBooksSerial,c);
        
        //GRID (1,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 2;
        mkPanel.add(txtBooksSerial,c);
        
        //Y-AXIS = 3 | FOR Novel Category
        //GRID (0,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 3;
        mkPanel.add(journalCategory,c);
        
        //GRID (1,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 3;
        mkPanel.add(txtjournalCategory,c);
        
        //REFRESH PANEL
        mkPanel.revalidate();
        mkPanel.repaint();
 }//END METHOD Journal PANEL
    
    private void makeMagazinePanel() {
        mkPanel.removeAll();
        mkPanel.setLayout(new GridBagLayout());
        mkPanel.setBorder(BorderFactory.createTitledBorder("Magazine"));
        
        GridBagConstraints c = new GridBagConstraints();  
        
        //Y-AXIS = 0 | FOR BOOKS TITLE
        //GRID (0,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 0;  
        mkPanel.add(lblBooksTitle,c);
        
        //GRID (1,0)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 0;  
        mkPanel.add(txtBooksTitle,c);
        
        //Y-AXIS = 1 | FOR Book Vol
        //GRID (0,1)
        c.insets = new Insets(18, 0, 0, 0);//SET TOP PADDING
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 1;  
        mkPanel.add(lblBooksVol,c);
        
        //GRID (1,1)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 1;  
        mkPanel.add(txtBooksVolume,c);
        
        //Y-AXIS = 2 | FOR Book Serial
        //GRID (0,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 2; 
        mkPanel.add(lblBooksSerial,c);
        
        //GRID (1,2)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 2;
        mkPanel.add(txtBooksSerial,c);
        
        //Y-AXIS = 3 | FOR Novel Category
        //GRID (0,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;  
        c.gridy = 3;
        mkPanel.add(magazineCategory,c);
        
        //GRID (1,3)
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;  
        c.gridy = 3;
        mkPanel.add(txtmagazineCategory,c);
        
        //REFRESH PANEL
        mkPanel.revalidate();
        mkPanel.repaint();
 }//END METHOD Magazine PANEL
    
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAddProduct().setVisible(true);
            }
        });
    }// END MAIN

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> invCategory;
    private javax.swing.JComboBox<String> invType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel mkPanel;
    private javax.swing.JButton txtClearText;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProdID;
    private javax.swing.JTextField txtProdName;
    private javax.swing.JTextField txtQty;
    // End of variables declaration//GEN-END:variables
}
