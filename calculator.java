import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

class Calculator{
    public static void main(String a[]){
        new Calculator();
        


    }
    public Calculator(){
        JFrame jf=new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(500,150);

        
        JLabel displayLabel=new JLabel("hii");
        displayLabel.setBounds(30,50,410,60);
        displayLabel.setBackground(Color.DARK_GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        

        JButton sevenButton=new JButton("7");
        sevenButton.setBounds(30, 120, 80, 80);
        sevenButton.setFont(null);
        jf.add(sevenButton);

        JButton eightButton=new JButton("8");
        eightButton.setBounds(140, 120, 80, 80);
        jf.add(eightButton);

        JButton nineButton=new JButton("9");
        nineButton.setBounds(250, 120, 80, 80);
        jf.add(nineButton);

        JButton divisionButton=new JButton("%");
        divisionButton.setBounds(360, 120, 80, 80);
        jf.add(divisionButton);

        JButton fourButton=new JButton("4");
        fourButton.setBounds(30, 220, 80, 80);
        jf.add(fourButton);

        JButton fiveButton=new JButton("5");
        fiveButton.setBounds(140, 220, 80, 80);
        jf.add(fiveButton);

        JButton sixButton=new JButton("6");
        sixButton.setBounds(250, 220, 80, 80);
        jf.add(sixButton);

        JButton multipleButton=new JButton("X");
        multipleButton.setBounds(360, 220, 80, 80);
        jf.add(multipleButton);

        JButton darkButton=new JButton("DARK");
        darkButton.setBounds(470, 220, 80, 80);
        jf.add(darkButton);

        JButton oneButton=new JButton("1");
        oneButton.setBounds(30, 320, 80, 80);
        jf.add(oneButton);

        JButton twoButton=new JButton("2");
        twoButton.setBounds(140, 320, 80, 80);
        jf.add(twoButton);

        JButton threeButton=new JButton("3");
        threeButton.setBounds(250, 320, 80, 80);
        jf.add(threeButton);

        JButton plusButton=new JButton("+");
        plusButton.setBounds(360, 320, 80, 80);
        jf.add(plusButton);

        JButton whiteButton=new JButton("WHITE");
        whiteButton.setBounds(470, 320, 80, 80);
        jf.add(whiteButton);

        JButton allclearButton=new JButton("AC");
        allclearButton.setBounds(30, 420, 80, 80);
        jf.add(allclearButton);

        JButton zeroButton=new JButton("0");
        zeroButton.setBounds(140, 420, 80, 80);
        jf.add(zeroButton);

        JButton deleteButton=new JButton("Del");
        deleteButton.setBounds(250, 420, 80, 80);
        jf.add(deleteButton); 
        
        JButton equalButton=new JButton("=");
        equalButton.setBounds(360, 420, 80, 80);
        jf.add(equalButton); 


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }

}