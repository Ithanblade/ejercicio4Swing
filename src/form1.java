import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    public JPanel mainPanel;
    private JTextField nombretxt;
    private JButton aceptarButton;
    private JTextField contrasenatxt;
    private JLabel mensaje;


    public form1() {
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Este es el boton de Aceptar");
                int a=0;
                int b=2;
                System.out.println(a+b);

                String nombre = nombretxt.getText();
                String contra = contrasenatxt.getText();

                String credencial1="java";
                String credencial2="java";

                if ((nombre.equals(credencial1) ) && (contra.equals(credencial2))){

                    JFrame frame = new JFrame("bienvenido");
                    frame.setContentPane(new form2().menu2);
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(800, 600);
                    frame.setPreferredSize(new Dimension(800, 600));
                    frame.setMinimumSize(new Dimension(800, 600));
                    frame.pack();
                    frame.setVisible(true);

                }else {

                    mensaje.setText("Las credenciales no son correctas");

                }




            }
        });
    }
}
