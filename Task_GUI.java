import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author liorz
 */
public class Task_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Tasks
     */
    public Task_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        pageName = new java.awt.Label();
        deliverablesB = new javax.swing.JButton();
        tasksB = new javax.swing.JButton();
        actionB = new javax.swing.JButton();
        issueB = new javax.swing.JButton();
        resourceB = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        assignButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        createButton = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        text = new java.awt.TextArea();
        editButton = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();
        tasks = new LinkedList<Tasks>();
        table = new javax.swing.JTable();
        

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pageName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pageName.setMinimumSize(new java.awt.Dimension(40, 20));
        pageName.setName(""); // NOI18N
        pageName.setPreferredSize(new java.awt.Dimension(40, 20));
        pageName.setText("    Tasks");

        tasksB.setText("Tasks");
        
        deliverablesB.setText("Deliverables");
        deliverablesB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliverablesButtonActionPerformed(evt);
            }
        });

        issueB.setText("Tasks");
        issueB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TasksBActionPerformed(evt);
            }
        });

        actionB.setText("Action Items");
        actionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionItemsButtonActionPerformed(evt);
            }
        });

        issueB.setText("Issues");
        issueB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionItemsButtonActionPerformed(evt);
            }
        });

        resourceB.setText("Resources");
        resourceB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResourcesButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        
        assignButton.setText("Assign");

        table.setAutoCreateRowSorter(true);
        table.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Name", "Expected Start Date", "Expected End Date", "Expected Duration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        this.model = (DefaultTableModel) table.getModel(); 
        table.setRowHeight(18);
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setHeaderValue("Name");
            table.getColumnModel().getColumn(1).setHeaderValue("Expected Start Date");
            table.getColumnModel().getColumn(2).setHeaderValue("Expected End Date");
            table.getColumnModel().getColumn(3).setHeaderValue("Expected Duration");
        }

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateButtonActionPerformed(evt);
            }
        });

        text.setEditable(false);
        text.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                TextTextValueChanged(evt);
            }
        });

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
       
        homeButton.setText("Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pageName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deliverablesB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tasksB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(actionB, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(issueB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(resourceB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(assignButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(homeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pageName, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(homeButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton)
                            .addComponent(assignButton)
                            .addComponent(createButton)
                            .addComponent(editButton))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(deliverablesB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tasksB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(actionB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(issueB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resourceB))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>    
    
    private void TableMouseClicked(java.awt.event.MouseEvent evt) {                                   
        this.selectedRowIndex = table.getSelectedRow();
   }                                  
   
    private void DeliverablesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        Deliverables_GUI deliverables = new Deliverables_GUI();
        deliverables.setVisible(true);
        setVisible(false);
    }       
    
    private void TasksBActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
    }                
    private void ResourcesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	Resources_GUI resource=new Resources_GUI();
        resource.setVisible(true);
        setVisible(false);
    }                                                

    private void ActionItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	ActionItems_GUI items = new ActionItems_GUI();
        items.setVisible(true);
        setVisible(false);
    } 

    private void CreateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        String [] inputs = inputAdd();
        Tasks task = new Tasks(inputs[0],inputs[2],inputs[3],inputs[1]);
        this.tasks.add(task);
        Object[] row = new Object [4];
       
        row[0] = tasks.get(tasks.size()-1).getName();
        row[1] = tasks.get(tasks.size()-1).getType();
        row[2] = tasks.get(tasks.size()-1).getExpectedStartDate();
        row[3] = tasks.get(tasks.size()-1).getExpectedEndDate();
        	
       
        model.addRow(row);
    }       
    private void issuesButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
    	Issues_GUI issues = new Issues_GUI();
        issues.setVisible(true);
        setVisible(false);
    }
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        this.tasks.remove(selectedRowIndex);
        model.removeRow(selectedRowIndex);
    }
    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Tasks currTask = this.tasks.get(selectedRowIndex);
        
        
    }   
    


    private void TextTextValueChanged(java.awt.event.TextEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void HomeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        HomePage home=new HomePage();
        home.setVisible(true);
        setVisible(false);        // TODO add your handling code here:
    }                                          
    
    
    
    
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
            java.util.logging.Logger.getLogger(Task_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Task_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Task_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Task_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Task_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton actionB;
    private javax.swing.JButton assignButton;
    private javax.swing.JButton createButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deliverablesB;
    private javax.swing.JButton editButton;
    private javax.swing.JButton homeButton;
    private javax.swing.JButton issueB;
    private java.awt.Label pageName;
    private javax.swing.JButton resourceB;
    private javax.swing.JTable table;
    private javax.swing.JButton tasksB;
    private java.awt.TextArea text;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private java.awt.Panel panel1;
    private LinkedList<Tasks> tasks;
    private DefaultTableModel model;
    int selectedRowIndex;
    // End of variables declaration                   

    
    
    public static String[] inputAdd() {
		  String[] strings = new String[4]; 
	      JTextField name= new JTextField(10);
	      JTextField type = new JTextField(5);
	      JTextField start = new JTextField(5);
	      JTextField end = new JTextField(5);
	      Object[] fields= {"please enter values","Enter title",name,"Enter type",type,"Enter start",start,"Enter end",end};
	    //Input message with the textfields
	      int result = JOptionPane.showConfirmDialog(null, fields, 
	               "Add Product", JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
	      if (result == JOptionPane.OK_OPTION) {
	    	  String names = name.getText();
	    	  String types=type.getText();
	    	  String starts=start.getText();
	    	  String ends  = end.getText();
	    	//if the user hasn't entered anything and clicked OK 
	    	  if (names == ""&& starts==""&& ends=="") {
	    		  JOptionPane.showMessageDialog(null, "Wrong input\n\n try Again");	
	    		//restarting the method.
	    		  inputAdd();
	    		  } 	  
	    	  	  
	    	 strings[0]=names;strings[1]=types;strings[2]=starts;strings[3]= ends;
	      }
	      return strings;
	  }
}

