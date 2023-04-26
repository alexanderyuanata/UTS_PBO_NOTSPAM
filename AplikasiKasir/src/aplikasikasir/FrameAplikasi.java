
package aplikasikasir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class FrameAplikasi extends javax.swing.JFrame {
    ArrayList <Barang> daftarbarang;
    ArrayList <Transaksi> historytransaksi = new ArrayList<>();
    
    TableModel model_tabel;
    
    int jlhbelanja = 0;
    
    public FrameAplikasi() {
        DBConnector.initDBConnection();
        Barang.loadBarang();
        daftarbarang = Barang.daftarBarang;

        initComponents();
        
        model_tabel = tabel_barang.getModel();
        model_tabel.addTableModelListener(new TableModelListener() {
            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getColumn() == 4){
                    int baris = e.getFirstRow();
                    
                    float harga = (float)model_tabel.getValueAt(baris, 3);
                    int jlh = (int)model_tabel.getValueAt(baris, 4);
                    
                    float total = harga * jlh;
                    
                    model_tabel.setValueAt(total, baris, 5);
                    
                    total = 0.0f;
                    float totalBelanja = 0f;
                    for (int i = 0; i < jlhbelanja; i++){
                        total = (float)model_tabel.getValueAt(i, 5);
                        totalBelanja += total;
                    }
                    
                    fieldtotalbelanja.setText(Float.toString(totalBelanja));

                }
            }
        }
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_frame = new javax.swing.JPanel();
        label_kode = new javax.swing.JLabel();
        label_nama = new javax.swing.JLabel();
        label_harga = new javax.swing.JLabel();
        kode_input = new javax.swing.JTextField();
        nama_field = new javax.swing.JTextField();
        harga_field = new javax.swing.JTextField();
        panel_tabel = new javax.swing.JScrollPane();
        tabel_barang = new javax.swing.JTable();
        label_jumlah = new javax.swing.JLabel();
        jumlah_field = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();
        fieldtotalbelanja = new javax.swing.JTextField();
        labelTotalBelanja = new javax.swing.JLabel();
        labelJlhPembayaran = new javax.swing.JLabel();
        fieldpembayaran = new javax.swing.JTextField();
        fieldkembalian = new javax.swing.JTextField();
        labelKembalian = new javax.swing.JLabel();
        checkout_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(1280, 720));

        label_kode.setText("Kode");

        label_nama.setText("Nama");

        label_harga.setText("Harga");

        kode_input.setName(""); // NOI18N
        kode_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_inputActionPerformed(evt);
            }
        });

        nama_field.setEditable(false);
        nama_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_fieldActionPerformed(evt);
            }
        });

        harga_field.setEditable(false);
        harga_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harga_fieldActionPerformed(evt);
            }
        });

        tabel_barang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No", "Kode", "Nama", "Harga", "Jlh", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabel_barang.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tabel_barangPropertyChange(evt);
            }
        });
        panel_tabel.setViewportView(tabel_barang);
        if (tabel_barang.getColumnModel().getColumnCount() > 0) {
            tabel_barang.getColumnModel().getColumn(0).setResizable(false);
            tabel_barang.getColumnModel().getColumn(0).setPreferredWidth(5);
            tabel_barang.getColumnModel().getColumn(1).setResizable(false);
            tabel_barang.getColumnModel().getColumn(1).setPreferredWidth(50);
            tabel_barang.getColumnModel().getColumn(2).setResizable(false);
            tabel_barang.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabel_barang.getColumnModel().getColumn(3).setResizable(false);
            tabel_barang.getColumnModel().getColumn(3).setPreferredWidth(50);
            tabel_barang.getColumnModel().getColumn(4).setResizable(false);
            tabel_barang.getColumnModel().getColumn(4).setPreferredWidth(20);
            tabel_barang.getColumnModel().getColumn(5).setResizable(false);
            tabel_barang.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        label_jumlah.setText("Jumlah");

        jumlah_field.setText("1");
        jumlah_field.setMinimumSize(new java.awt.Dimension(54, 22));
        jumlah_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlah_fieldActionPerformed(evt);
            }
        });

        label_status.setText("...");

        fieldtotalbelanja.setEditable(false);

        labelTotalBelanja.setText("Total Belanja");

        labelJlhPembayaran.setText("Jumlah Pembayaran");

        fieldpembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldpembayaranActionPerformed(evt);
            }
        });
        fieldpembayaran.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldpembayaranKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldpembayaranKeyTyped(evt);
            }
        });

        fieldkembalian.setEditable(false);

        labelKembalian.setText("Kembalian");

        checkout_btn.setText("Checkout");
        checkout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkout_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout main_frameLayout = new javax.swing.GroupLayout(main_frame);
        main_frame.setLayout(main_frameLayout);
        main_frameLayout.setHorizontalGroup(
            main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_frameLayout.createSequentialGroup()
                .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_frameLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(main_frameLayout.createSequentialGroup()
                                .addComponent(label_kode, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kode_input, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(main_frameLayout.createSequentialGroup()
                                .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nama_field, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(harga_field))
                                .addGap(18, 18, 18)
                                .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(main_frameLayout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(label_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(main_frameLayout.createSequentialGroup()
                                        .addComponent(label_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jumlah_field, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(panel_tabel)
                    .addGroup(main_frameLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelKembalian)
                            .addComponent(labelJlhPembayaran)
                            .addComponent(labelTotalBelanja))
                        .addGap(62, 62, 62)
                        .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldtotalbelanja, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(checkout_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        main_frameLayout.setVerticalGroup(
            main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_frameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_kode)
                    .addComponent(kode_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nama_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nama)
                    .addComponent(jumlah_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_jumlah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(harga_field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_harga)
                    .addComponent(label_status))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_tabel, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(main_frameLayout.createSequentialGroup()
                        .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldtotalbelanja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTotalBelanja))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldpembayaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelJlhPembayaran))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldkembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelKembalian))
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addComponent(checkout_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(main_frame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nama_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_fieldActionPerformed

    private void harga_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harga_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_harga_fieldActionPerformed
    
    private void sendStatus(String message){
        label_status.setText(message);
    }
    
    //called when user presses enter, takes string from code textfield input
    private void kode_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_inputActionPerformed
        // gets text from textfield, declare temp object of class Barang
        String kode_masuk = kode_input.getText();
        Barang tempBarang;
               
        //Iterates through rows with value and checks if there any kode that already exists, kinda redundant, fix later
        int j = 0;
        while (model_tabel.getValueAt(j, 1) != null) {
            if (model_tabel.getValueAt(j, 1).equals(kode_masuk)) {
                //get jumlah at that row, add value of jlh in textfield to that row
                int oldJlh = (int) model_tabel.getValueAt(j, 4);
                model_tabel.setValueAt(oldJlh + Integer.parseInt(jumlah_field.getText()), j, 4);
                sendStatus("Memperbarui row "+(j+1)+"!");
                return;
            }
            j++;
        }
        
        //only reaches here if theres no kode that exists, add kode to table
        //scans the list of barang available and checks if kode barang is found
        for (int i = 0; i < daftarbarang.size(); i++) {
            tempBarang = daftarbarang.get(i);
            //if theres barang with the same code, put it into cart
            int tempIndex = 0;
            if (tempBarang.kode.equals(kode_masuk)) {
                //increments index of items inside cart by 1
                tempIndex = jlhbelanja;
                jlhbelanja++;
                
                //sets name and price of object into respective text field
                nama_field.setText(tempBarang.nama);
                harga_field.setText(Float.toString(tempBarang.harga));
                
                //fills table
                model_tabel.setValueAt(tempIndex+1, tempIndex, 0);
                model_tabel.setValueAt(kode_masuk, tempIndex, 1);
                model_tabel.setValueAt(tempBarang.nama, tempIndex, 2);
                model_tabel.setValueAt(tempBarang.harga, tempIndex, 3);
                model_tabel.setValueAt(Integer.valueOf(jumlah_field.getText()) , tempIndex, 4);
                model_tabel.setValueAt(Integer.parseInt(jumlah_field.getText()) * tempBarang.harga, tempIndex, 5);
                
                sendStatus("Barang ditambah!");                
                return;
            }
        }
        sendStatus("Barang tidak ditemukan!");
    }//GEN-LAST:event_kode_inputActionPerformed

    private void tabel_barangPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tabel_barangPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabel_barangPropertyChange

    private void jumlah_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlah_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlah_fieldActionPerformed

    private void fieldpembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldpembayaranActionPerformed
        // TODO add your handling code here:
        String totalBelanjaStr = fieldtotalbelanja.getText();
        totalBelanjaStr = totalBelanjaStr.replace(",", "");
        
        String dibayarStr = fieldpembayaran.getText();
        dibayarStr = dibayarStr.replace(",", "");
        
        float totalBelanja = Float.valueOf(totalBelanjaStr);
        float dibayar = Float.valueOf(dibayarStr    );
        
        int kembalian = (int) (dibayar - totalBelanja);
        
        fieldkembalian.setText(String.format("Rp. %,d", kembalian));
        
    }//GEN-LAST:event_fieldpembayaranActionPerformed

    private void fieldpembayaranKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldpembayaranKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldpembayaranKeyTyped

    private void fieldpembayaranKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldpembayaranKeyReleased
        // TODO add your handling code here:
        String dibayarString = fieldpembayaran.getText();
        dibayarString = dibayarString.replace(",", "");
        
        int dibayarInput = Integer.valueOf(dibayarString);
        fieldpembayaran.setText(String.format("%,d", dibayarInput));
    }//GEN-LAST:event_fieldpembayaranKeyReleased

    private void checkout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkout_btnActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabel_barang.getModel();
        
        //make sure kembalian is calculated
        String totalBelanjaStr = fieldtotalbelanja.getText();
        totalBelanjaStr = totalBelanjaStr.replace(",", "");
        
        String dibayarStr = fieldpembayaran.getText();
        dibayarStr = dibayarStr.replace(",", "");
        
        float totalBelanja = Float.valueOf(totalBelanjaStr);
        float dibayar = Float.valueOf(dibayarStr    );
        
        int kembalian = (int) (dibayar - totalBelanja);
        
        fieldkembalian.setText(String.format("Rp. %,d", kembalian));

        //create transaction
        //format kembalian
        String kembalianStr = fieldkembalian.getText();
        kembalianStr = kembalianStr.replace("Rp", "");
        kembalianStr = kembalianStr.replace(".", "");
        kembalianStr = kembalianStr.replace(" ", "");
        kembalianStr = kembalianStr.replace(",", "");
        System.out.println(kembalianStr);
        
        //format belanjaan
        totalBelanjaStr = fieldtotalbelanja.getText();
        totalBelanjaStr = totalBelanjaStr.replace(",", "");
        System.out.println(totalBelanjaStr);
        
        //format bayar
        dibayarStr = fieldpembayaran.getText();
        dibayarStr = dibayarStr.replace(",", "");
        System.out.println(dibayarStr);
        
        totalBelanja = Float.valueOf(totalBelanjaStr);
        dibayar = Float.valueOf(dibayarStr);
        kembalian = Integer.valueOf(kembalianStr);
        
        Transaksi new_transaksi = new Transaksi(totalBelanja, dibayar, kembalian);
        
        //insert data from rows into transaksi
        System.out.println(jlhbelanja);
        //temporary variables
        Barang tempbarang;
        int tempamount;
        
        for (int rows = 0; rows < jlhbelanja; rows++){
            //store the temps and insert a new item into new_transaksi
            tempbarang = new Barang();
            
            tempbarang.kode = model.getValueAt(rows, 1).toString();
            tempbarang.nama = model.getValueAt(rows, 2).toString();
            tempbarang.harga = Float.parseFloat(model.getValueAt(rows, 3).toString());
            
            tempamount = Integer.parseInt(model.getValueAt(rows, 4).toString());
            
            new_transaksi.addItem(tempbarang, tempamount);
        }
        
        historytransaksi.add(new_transaksi);
        
        for (int i = 0; i < historytransaksi.size(); i++){
            historytransaksi.get(i).displayTransaksi();
        }
        
        //clear rows
        model.setRowCount(0);
        
        //reset table
        jlhbelanja = 0;
        model.setRowCount(100);
        
        //insert data to database
        //if table is empty
        if(model.getRowCount()==0)
        {
            JOptionPane.showMessageDialog(this, "Table is empty");
        }
        //if table not empty
        else
        {
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/uts_pbo", "root", "");
                    String query = "INSERT INTO transaksi(totalBelanja, dibayar, kembalian, waktu) values (?, ?, ?, ?)";
                    PreparedStatement prepstmt = conn.prepareStatement(query);
                    prepstmt.setString(1, Float.toString(new_transaksi.getTotalBelanja()));
                    prepstmt.setString(2, Float.toString(new_transaksi.getJumlahDibayar()));
                    prepstmt.setString(3, Float.toString(new_transaksi.getKembalian()));
                    prepstmt.setString(4, new_transaksi.getTime());
                    
                    prepstmt.execute();
                    
                    String number = "SELECT no FROM transaksi where no = (SELECT LAST_INSERT_ID()";
                    PreparedStatement numstat = conn.prepareStatement(number);
                    numstat.execute();
                    System.out.println(numstat);
                    
                    /*for(int i = 0; i < new_transaksi.getItemCount(); i++)
                    {
                        String s = "INSERT INTO item_in_transaksi (kode, jumlah, no_transaksi) values (?, ?, ?)";
                        PreparedStatement ps = conn.prepareStatement(s);
                        ps.setString(1, new_transaksi.getBarangAt(i).kode);
                        ps.setString(2, Integer.toString(new_transaksi.getAmountAt(i)));
                        ps.setString(3, );
                        
                        ps.execute();
                    }*/
                JOptionPane.showMessageDialog(this, "Data Inserted Successfully");
                jlhbelanja = 0;
                model.setRowCount(100);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_checkout_btnActionPerformed

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
            java.util.logging.Logger.getLogger(FrameAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAplikasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAplikasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkout_btn;
    private javax.swing.JTextField fieldkembalian;
    private javax.swing.JTextField fieldpembayaran;
    private javax.swing.JTextField fieldtotalbelanja;
    private javax.swing.JTextField harga_field;
    private javax.swing.JTextField jumlah_field;
    private javax.swing.JTextField kode_input;
    private javax.swing.JLabel labelJlhPembayaran;
    private javax.swing.JLabel labelKembalian;
    private javax.swing.JLabel labelTotalBelanja;
    private javax.swing.JLabel label_harga;
    private javax.swing.JLabel label_jumlah;
    private javax.swing.JLabel label_kode;
    private javax.swing.JLabel label_nama;
    private javax.swing.JLabel label_status;
    private javax.swing.JPanel main_frame;
    private javax.swing.JTextField nama_field;
    private javax.swing.JScrollPane panel_tabel;
    private javax.swing.JTable tabel_barang;
    // End of variables declaration//GEN-END:variables
}