
package mvc;

    import java.awt.BorderLayout;
    import java.awt.FlowLayout;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JPanel;    

public class Vista extends JFrame{
    
    public JButton servicio, funcionario, fecha;
    private JPanel panelB, panelR, panelX;
    public JLabel lProduccion, lMensaje;
    
    public Vista(){
        
        getContentPane().setLayout(new BorderLayout());
        
        panelB = new JPanel();
        panelB.setLayout(new FlowLayout());
        panelR = new JPanel();
        panelR.setLayout(new FlowLayout());
        panelX = new JPanel();
        panelX.setLayout(new FlowLayout());
        
        servicio = new JButton("Por tipo de servicio");
        funcionario = new JButton("Por funcionario");
        fecha = new JButton("Por rango de fecha");
        
        lProduccion = new JLabel("Produccion diaria:");
        lMensaje = new JLabel("ES NECESARIO INGRESAR TIPO DE SERVICIO "+"\n"+"PARA PODER CALCULAR CORRECTAMENTE");
        
        panelB.add(servicio);
        panelB.add(funcionario);
        panelB.add(fecha);
        
        panelR.add(lProduccion);
        
        panelX.add(lMensaje);
        
        add(panelX, BorderLayout.NORTH);
        add(panelB, BorderLayout.CENTER);
        add(panelR, BorderLayout.SOUTH);
    }
    
}
