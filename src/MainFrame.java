import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JLabel jlabBattleship =new JLabel();
    private JLabel jlabtarget1 =new JLabel();
    private JLabel jlabtarget2 =new JLabel();
    private JLabel jlabtarget3 =new JLabel();
    private JLabel jlabbigtar1 =new JLabel();
    private JLabel jlabigbtar2 =new JLabel();
    private JLabel jlabsealine =new JLabel();
    private JLabel jlabbullet =new JLabel();
    private JLabel jlabscore =new JLabel("Point:");

    private JButton jbtnvoice=new JButton();

    private ImageIcon imgBattleship =new ImageIcon("");
    private ImageIcon imgtarget1 =new ImageIcon("");
    private ImageIcon imgtarget2 =new ImageIcon("");
    private ImageIcon imgtarget3 =new ImageIcon("");
    private ImageIcon imgbigtar1 =new ImageIcon("");
    private ImageIcon imgbigtar2 =new ImageIcon("");

    private Container cp;

    public  MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,700,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        cp.setLayout(null);
        cp=this.getContentPane();


       cp.add(jlabscore);
       jlabscore.setBounds(10,10,30,50);
    }
}
