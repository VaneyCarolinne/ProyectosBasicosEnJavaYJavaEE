import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class InterfazEmisor extends JFrame implements ActionListener{

	JTextField textField;
    JButton btnSend;
    public InterfazEmisor(){
        super("PepaCliente");
        setSize(300, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        createContent();
    }
    
    public void createContent(){
        JPanel panelChat = new JPanel();
        panelChat.setLayout(new BorderLayout());
        textField = new JTextField(20);
        btnSend = new JButton("Enviar");
        btnSend.addActionListener(this);
        panelChat.add(textField, BorderLayout.CENTER);
        panelChat.add(btnSend, BorderLayout.SOUTH);
        
        add(panelChat, BorderLayout.CENTER);
        
    }
	
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnSend){
            try {
                Socket socketCliente = new Socket("192.168.1.2", 9300);
                DataOutputStream flujoSalida = new DataOutputStream(socketCliente.getOutputStream());
                flujoSalida.writeUTF(textField.getText());
                
                textField.setText("");
                flujoSalida.close();
                socketCliente.close();
            } catch (IOException ex) {
                System.out.println("Exception de tipo IOException: " + ex.getMessage());
            }
        }
    }
    
	
	
}
