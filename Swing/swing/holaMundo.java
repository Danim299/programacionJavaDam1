package swing;
import javax.swing.*;
import javax.swing.border.Border;
public class holaMundo {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Hola Mundo en Swing"); //creamos un JFrame con un título
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Acción al cerrar el JFrame
        JLabel label = new JLabel("Hola Mundo", JLabel.CENTER); //creamos una etiqueta con texto
        Border empty = BorderFactory.createEmptyBorder(100, 100, 100, 100);
        label.setBorder(empty); //creamos borde invisible y lo asignamos a la etiqueta
        frame.getContentPane().add(label);  //agregamos la etiqueta en el panel principal
        frame.pack();  //compactamos el tamaño al JFrame según el tamaño de los componentes
        frame.setLocationRelativeTo(null);  //centramos el JFrame en la pantalla
        frame.setVisible(true); //hacemos visible el JFrame
    }
    
}
