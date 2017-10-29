import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class InterfazReceptor extends JFrame implements Runnable {
    JTextArea textArea;
    JButton btnSend;
	

    public InterfazReceptor() {

        super("PepaServer");
        setSize(300, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createContent();
    }    
    
    
    public void createContent() {
        JPanel panelChat = new JPanel();
        panelChat.setLayout(new BorderLayout());
        textArea = new JTextArea();
        panelChat.add(textArea, BorderLayout.CENTER);

        add(panelChat, BorderLayout.CENTER);
    }
    
    @Override
    public void run() {
        String mensaje;
        while (true) {
            try {
                ServerSocket server = new ServerSocket(9300);
                Socket socketAux = server.accept();
                DataInputStream flujoEntrada = new DataInputStream(socketAux.getInputStream());
                mensaje = flujoEntrada.readUTF();

                textArea.append(mensaje + "\n");
                flujoEntrada.close();
                socketAux.close();
                server.close();
            } catch (IOException ex) {
                System.out.println("Exception :" + ex.getMessage());
            }
        }
    }
	
	
	
}
