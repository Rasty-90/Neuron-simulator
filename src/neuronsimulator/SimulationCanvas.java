package neuronsimulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;






public class SimulationCanvas extends javax.swing.JFrame {

    //constructor
    public SimulationCanvas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newJPanel1 = new neuronsimulator.NewJPanel();
        numberOfNeuronsTextField = new javax.swing.JTextField();
        numberOfNeighborsTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        neuronNumberErrrorLabel = new javax.swing.JLabel();
        neighborNumberErrorLabel = new javax.swing.JLabel();
        secondsLabel = new javax.swing.JLabel();
        otherLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Neuron simulator");
        setResizable(false);
        setSize(new java.awt.Dimension(0, 630));

        newJPanel1.setMaximumSize(new java.awt.Dimension(32767, 630));

        javax.swing.GroupLayout newJPanel1Layout = new javax.swing.GroupLayout(newJPanel1);
        newJPanel1.setLayout(newJPanel1Layout);
        newJPanel1Layout.setHorizontalGroup(
            newJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1011, Short.MAX_VALUE)
        );
        newJPanel1Layout.setVerticalGroup(
            newJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        numberOfNeuronsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfNeuronsTextFieldActionPerformed(evt);
            }
        });

        numberOfNeighborsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfNeighborsTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Number of neurons");
        jLabel1.setToolTipText("");

        jLabel2.setText("Number of neighbors");
        jLabel2.setToolTipText("");

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        neuronNumberErrrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        neuronNumberErrrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        neighborNumberErrorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        neighborNumberErrorLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(newJPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numberOfNeighborsTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                            .addComponent(numberOfNeuronsTextField))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(otherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(secondsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(neuronNumberErrrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(neighborNumberErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numberOfNeuronsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(neuronNumberErrrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(numberOfNeighborsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(neighborNumberErrorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(otherLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(secondsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numberOfNeighborsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfNeighborsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfNeighborsTextFieldActionPerformed

    private void numberOfNeuronsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfNeuronsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfNeuronsTextFieldActionPerformed

    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String neurons= numberOfNeuronsTextField.getText();
      int neuronNumber; 
      try {       
         neuronNumber = Integer.parseInt(neurons); // Parse string into number
         if (neuronNumber>0){
             numberOfNeurons=neuronNumber;
         }else{
           neuronNumberErrrorLabel.setText("Input should be a positive integer");  
         } 
      } catch (NumberFormatException e) {
          neuronNumberErrrorLabel.setText("Input should be a positive integer");
            e.printStackTrace();
            
      }
      
      String neighbors =numberOfNeighborsTextField.getText();
      int neighborNumber;
      
      try {       
         neighborNumber= Integer.parseInt(neighbors);
         if (neighborNumber>0&&neighborNumber<=(numberOfNeurons/2)){
             r=neighborNumber;
         }else{
           neighborNumberErrorLabel.setText("Input should be a positive integer and must be less than half the number of neurons");  
         }
// Parse string into number
      } catch (NumberFormatException e) {
          neighborNumberErrorLabel.setText("Input should be a positive integer and must be less than half the number of neurons");
            e.printStackTrace();
      } 
      
       Network network = new Network(numberOfNeurons,r,mu);
       network.createNetwork();
       /* Create and display the form */
       timer = new Timer(100, timerListener);
       millis= System.currentTimeMillis();
       timer.setInitialDelay(0);
       timer.start();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SimulationCanvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulationCanvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulationCanvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulationCanvas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        
        /* Create and display the form */
        SimulationCanvas c = new SimulationCanvas();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                c.setVisible(true);
            }
        });
        
        
        
        
        c.timerListener = new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {      
               currentmillis=System.currentTimeMillis();
               wup =currentmillis - millis;
               secondsLabel.setText( "Time elapsed: "+String.valueOf(wup)+" ms with dt=0.0001");
            }
        };
        
        
        
        
       while(true){
                  c.repaint();
                    try {
                        Thread.sleep((long) 1);
                    } catch (InterruptedException ex) {
                System.out.println("Interrupted Exception on Thread " + ex);
                }
             }       
    }
    
 
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel neighborNumberErrorLabel;
    private javax.swing.JLabel neuronNumberErrrorLabel;
    private neuronsimulator.NewJPanel newJPanel1;
    private javax.swing.JTextField numberOfNeighborsTextField;
    private javax.swing.JTextField numberOfNeuronsTextField;
    public static javax.swing.JLabel otherLabel;
    public static javax.swing.JLabel secondsLabel;
    // End of variables declaration//GEN-END:variables
    int numberOfNeurons =0;
    int r = 0;
    double dt=1000;
    double mu=1.0;
    static long millis; 
    static long currentmillis;
    static long wup;
    static Timer timer;
    ActionListener timerListener;
   }