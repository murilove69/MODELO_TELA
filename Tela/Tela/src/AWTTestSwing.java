import javax.swing.*;
import java.awt.*;

public class AWTTestSwing {
    public static void main (String [] args) {
       
//Modelo padrão para a cração da "janela" (Frame)

	JFrame frame = new JFrame("AWT Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

//Determinando o "Label" e sua quantidade de caracteres.

        JLabel label1 = new JLabel("Label1");
        JTextField textField1 = new JTextField(15);

//Usando o termo topPanel para inserir os termos na primeira parte do Panel.

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(label1);
        topPanel.add(textField1);

//Criando os "buttons" e determinando oque será escrito nos mesmos.

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

//usando button.Panel.add para criar o "formato" dos botões criados acima.

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

//Determinando a localização dos itens citados acima, tanto topPanel, como buttonPanel.

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

//Exibindo a janela criada.

        frame.setVisible(true);    
    }
}
