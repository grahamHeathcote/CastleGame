package CastleGame;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;


public class CastleGameTest implements ActionListener{
    static boolean secondTurn;

    static JLabel test = new JLabel("If this shows up it can change panel I think");

    static JFrame frame;
    static JPanel panel;
    static JButton enter;
    static JLabel error;
    static JLabel nextPlayer;
    static JLabel welcome;



    static JLabel castle1;
    static JLabel castle2;
    static JLabel castle3;
    static JLabel castle4;
    static JLabel castle5;
    static JLabel castle6;
    static JLabel castle7;
    static JLabel castle8;
    static JLabel castle9;
    static JLabel castle10;

    static JTextField castle1T;
    static JTextField castle2T;
    static JTextField castle3T;
    static JTextField castle4T;
    static JTextField castle5T;
    static JTextField castle6T;
    static JTextField castle7T;
    static JTextField castle8T;
    static JTextField castle9T;
    static JTextField castle10T;

    int c1;
    int c2;
    int c3;
    int c4;
    int c5;
    int c6;
    int c7;
    int c8;
    int c9;
    int c10;

    static int fc1;
    static int fc2;
    static int fc3;
    static int fc4;
    static int fc5;
    static int fc6;
    static int fc7;
    static int fc8;
    static int fc9;
    static int fc10;


    public static void clearplayer1(){
        panel.remove(castle1);
        panel.remove(castle1T);
        panel.remove(castle2);
        panel.remove(castle2T);
        panel.remove(castle3);
        panel.remove(castle3T);
        panel.remove(castle4T);
        panel.remove(castle4);
        panel.remove(castle5);
        panel.remove(castle5T);
        panel.remove(castle6T);
        panel.remove(castle6);
        panel.remove(castle7);
        panel.remove(castle7T);
        panel.remove(castle8);
        panel.remove(castle8T);
        panel.remove(castle9);
        panel.remove(castle9T);
        panel.remove(castle10);
        panel.remove(castle10T);
        panel.remove(enter);
        
    }

    public static void player1(){
        castle1 = new JLabel("Castle 1: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle1);

        castle1T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle1T);
        
        castle2 = new JLabel("Castle 2: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle2);

        castle2T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle2T);

        castle3 = new JLabel("Castle 3: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle3);

        castle3T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle3T);

        castle4 = new JLabel("Castle 4: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle4);

        castle4T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle4T);

        castle5 = new JLabel("Castle 5: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle5);

        castle5T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle5T);

        castle6 = new JLabel("Castle 6: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle6);

        castle6T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle6T);

        castle7 = new JLabel("Castle 7: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle7);

        castle7T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle7T);

        castle8 = new JLabel("Castle 8: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle8);

        castle8T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle8T);

        castle9 = new JLabel("Castle 9: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle9);

        castle9T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle9T);

        castle10 = new JLabel("Castle 10: ");
        //castle1.setBounds(100,20,80,25);
        panel.add(castle10);

        castle10T = new JTextField();
        //castle1.setBounds(100,20,80,25);
        panel.add(castle10T);

        enter = new JButton("Enter");
        castle1.setBounds(100,20,80,25);
        panel.add(enter);
        enter.addActionListener(new CastleGameTest());
   
        frame.setVisible(true); 
        
    }

    public static void main(String[] args) {
        frame = new JFrame();
        frame.setSize(1000,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel = new JPanel();
        frame.add(panel);
        panel.setLayout(new GridLayout(0,1));


        welcome = new JLabel("Please deploy your 100 troops into the ten different castles");
        //welcome.setBounds(100,20,80,25);
        panel.add(welcome);

        error = new JLabel("The troop count doesn't add up to 100!");
        //welcome.setBounds(100,20,80,25);
        panel.add(error);
        error.setVisible(false);

        nextPlayer = new JLabel("Player two, your turn!");
        //welcome.setBounds(100,20,80,25);
        panel.add(nextPlayer);
        nextPlayer.setVisible(false);
        secondTurn = false;
        player1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        c1 = Integer.valueOf(castle1T.getText());
        c2 = Integer.valueOf(castle2T.getText());
        c3 = Integer.valueOf(castle3T.getText());
        c4 = Integer.valueOf(castle4T.getText());
        c5 = Integer.valueOf(castle5T.getText());
        c6 = Integer.valueOf(castle6T.getText());
        c7 = Integer.valueOf(castle7T.getText());
        c8 = Integer.valueOf(castle8T.getText());
        c9 = Integer.valueOf(castle9T.getText());
        c10 = Integer.valueOf(castle10T.getText());

        if((c1+c2+c3+c4+c5+c6+c7+c8+c9+c10) != 100){
            error.setVisible(true);
            clearplayer1();
            player1();
            System.out.println("Invalid number count, second turn is: "+ secondTurn);
        }else{
            System.out.println("Entirely Legal number count, second turn is: "+ secondTurn);

            error.setVisible(false);
            if(secondTurn == false){
                nextPlayer.setVisible(true);
                secondTurn = true;
                saveplayer1();
                clearplayer1();
                panel.revalidate();
                panel.repaint();
                player1();
            }else{

                System.out.println("fc1= " +fc1 +" and c1= "+ c1);
                panel.add(test);
                test.setVisible(true);
                panel.remove(welcome);
                clearplayer1();
                panel.removeAll();
                panel.revalidate();
                panel.repaint();
                System.out.println("Made it to the bottom of Analyze Results");
        

            }
        }
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public void saveplayer1(){
        fc1=c1;
        fc2=c2;
        fc3=c3;
        fc4=c4;
        fc5=c5;
        fc6=c6;
        fc7=c7;
        fc8=c8;
        fc9=c9;
        fc10=c10;
    }

}