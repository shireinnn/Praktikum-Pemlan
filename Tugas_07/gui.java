import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class gui extends JFrame {
    JMenuBar mb = new JMenuBar();
    JMenu file = new JMenu("File"), edit = new JMenu("Edit"), help = new JMenu("Help");
    JMenuItem open = new JMenuItem("Open"), close = new JMenuItem("Close"), quit = new JMenuItem("Quit"),
              about = new JMenuItem("About"), copy = new JMenuItem("Copy"), paste = new JMenuItem("Paste"), 
              cut = new JMenuItem("Cut");

    JLabel lblnama = new JLabel("Nama"), lblTglLahir = new JLabel("Tanggal Lahir"), 
           lblNomor = new JLabel("No.Pendaftaran"), lblAlamat = new JLabel("Alamat"), 
           lblEmail = new JLabel("E-mail");
    JTextField txnama = new JTextField(30), txTglLahir = new JTextField(30), 
               txNomor = new JTextField(30), txAlamat = new JTextField(30), 
               txEmail = new JTextField(30);
    JButton submit = new JButton("Submit");
    JTextArea hasil = new JTextArea();

    gui() {
        setTitle("DATA MAHASISWA");
        setLocation(300, 100);
        setSize(340, 400);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    void initComponents() {
        setJMenuBar(mb);
        mb.add(file); mb.add(edit); mb.add(help);
        file.add(open); file.add(close); file.add(quit);
        edit.add(copy); edit.add(paste); edit.add(cut);
        help.add(about);
        close.setEnabled(false);
        getContentPane().setLayout(null);

        getContentPane().setBackground(new Color(255, 182, 193));

        lblnama.setForeground(new Color(255, 105, 180)); 
        lblTglLahir.setForeground(new Color(255, 105, 180)); 
        lblNomor.setForeground(new Color(255, 105, 180));
        lblAlamat.setForeground(new Color(255, 105, 180)); 
        lblEmail.setForeground(new Color(255, 105, 180)); 
        
        txnama.setBackground(new Color(255, 228, 225)); 
        txTglLahir.setBackground(new Color(255, 228, 225)); 
        txNomor.setBackground(new Color(255, 228, 225)); 
        txAlamat.setBackground(new Color(255, 228, 225)); 
        txEmail.setBackground(new Color(255, 228, 225)); 

        addComponent(lblnama, 10, 10, 200, 20);
        addComponent(txnama, 115, 10, 200, 20);
        addComponent(lblTglLahir, 10, 33, 200, 20);
        addComponent(txTglLahir, 115, 33, 200, 20);
        addComponent(lblNomor, 10, 56, 200, 20);
        addComponent(txNomor, 115, 56, 200, 20);
        addComponent(lblAlamat, 10, 80, 70, 20);
        addComponent(txAlamat, 115, 80, 200, 40);
        addComponent(lblEmail, 10, 126, 80, 20);
        addComponent(txEmail, 115, 126, 200, 20);
        addComponent(submit, 200, 170, 100, 20);

        addActionListeners();
    }

    void addComponent(JComponent comp, int x, int y, int width, int height) {
        getContentPane().add(comp);
        comp.setBounds(x, y, width, height);
    }

    void addActionListeners() {
        submit.addActionListener(event -> {
            if (txnama.getText().isEmpty() || txTglLahir.getText().isEmpty() || 
                txNomor.getText().isEmpty() || txAlamat.getText().isEmpty() || 
                txEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Semua kolom harus diisi.", "Peringatan", JOptionPane.WARNING_MESSAGE);
                return;
            }

            hasil.setText("");
            hasil.append("Nama                 \t:" + txnama.getText() + "\n");
            hasil.append("Tanggal Lahir    \t:" + txTglLahir.getText() + "\n");
            hasil.append("No.Pendaftaran \t:" + txNomor.getText() + "\n");
            hasil.append("Alamat               \t:" + txAlamat.getText() + "\n");
            hasil.append("E-mail                \t:" + txEmail.getText() + "\n");

            int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin data yang Anda isi sudah benar?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);

            if (response == JOptionPane.OK_OPTION) {
                JOptionPane.showMessageDialog(null, hasil.getText(), "Data Mahasiswa", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        new gui();
    }
}
