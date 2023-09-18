import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Listenerbutton {
    JFrame f;
    JTextField tf;
    JButton btn;
    Listenerbutton (){
        btn = new JButton ("press");
        tf = new JTextField("plis press me");
        f = new JFrame("ButtonText");
        f.setSize(600, 300);
        tf.setBounds(20, 20, 180, 20);
        btn.setBounds(160, 160, 80, 20);
        f.add(btn);
        f.add(tf);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(tf.getText());
            }
        });
    }
    public void mostrar(){
      f.setVisible(true);
    }
    public static void main(String[] args) {
        Listenerbutton lb;
        lb = new Listenerbutton();
        lb.mostrar();
        System.out.println(lb.tf.getText());
    }

}
