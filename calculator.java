//package calculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

 class Calculator implements ActionListener{
    
    public static void main(String a[]){
        new Calculator();
        
    }
    boolean isOperatorClicked=false;

    int n;
    float result;
    String oldValue;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton plusButton;
    JButton allclearButton;
    JButton deleteButton;
    JButton multipleButton;
    JButton divisionButton;
    JButton zeroButton;
    JButton equalButton;
    JButton darkButton;
    JButton whiteButton;

    public Calculator(){
         jf=new JFrame("CALCULATOR");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(500,150);

        
        displayLabel=new JLabel("");
        displayLabel.setBounds(30,50,410,60);
        displayLabel.setBackground(Color.DARK_GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);
        jf.add(displayLabel);

        

        sevenButton=new JButton("7");
        sevenButton.setBounds(30, 120, 80, 80);
        sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(sevenButton);
        sevenButton.addActionListener(this);

        eightButton=new JButton("8");
        eightButton.setBounds(140, 120, 80, 80);
        eightButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(eightButton);
        eightButton.addActionListener(this);

        nineButton=new JButton("9");
        nineButton.setBounds(250, 120, 80, 80);
        nineButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(nineButton);
        nineButton.addActionListener(this);

        divisionButton=new JButton("%");
        divisionButton.setBounds(360, 120, 80, 80);
        divisionButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(divisionButton);
        divisionButton.addActionListener(this);

        fourButton=new JButton("4");
        fourButton.setBounds(30, 220, 80, 80);
        fourButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(fourButton);
        fourButton.addActionListener(this);

        fiveButton=new JButton("5");
        fiveButton.setBounds(140, 220, 80, 80);
        fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(fiveButton);
        fiveButton.addActionListener(this);

        sixButton=new JButton("6");
        sixButton.setBounds(250, 220, 80, 80);
        sixButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(sixButton);
        sixButton.addActionListener(this);

        multipleButton=new JButton("X");
        multipleButton.setBounds(360, 220, 80, 80);
        multipleButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(multipleButton);
        multipleButton.addActionListener(this);

        darkButton=new JButton("DARK");
        darkButton.setBounds(470, 220, 80, 80);
        darkButton.setFont(new Font("Arial",Font.PLAIN,15));
        jf.add(darkButton);
        darkButton.addActionListener(this);

        oneButton=new JButton("1");
        oneButton.setBounds(30, 320, 80, 80);
        oneButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(oneButton);
        oneButton.addActionListener(this);

        twoButton=new JButton("2");
        twoButton.setBounds(140, 320, 80, 80);
        twoButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(twoButton);
        twoButton.addActionListener(this);

        threeButton=new JButton("3");
        threeButton.setBounds(250, 320, 80, 80);
        threeButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(threeButton);
        threeButton.addActionListener(this);

        plusButton=new JButton("+");
        plusButton.setBounds(360, 320, 80, 80);
        plusButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(plusButton);
        plusButton.addActionListener(this);

        whiteButton=new JButton("WHITE");
        whiteButton.setBounds(470, 320, 80, 80);
        whiteButton.setFont(new Font("Arial",Font.PLAIN,13));
        jf.add(whiteButton);
        whiteButton.addActionListener(this);

        allclearButton=new JButton("AC");
        allclearButton.setBounds(30, 420, 80, 80);
        allclearButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(allclearButton);
        allclearButton.addActionListener(this);

        zeroButton=new JButton("0");
        zeroButton.setBounds(140, 420, 80, 80);
        zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(zeroButton);
        zeroButton.addActionListener(this);

        deleteButton=new JButton("Del");
        deleteButton.setBounds(250, 420, 80, 80);
        deleteButton.setFont(new Font("Arial",Font.PLAIN,30));
        jf.add(deleteButton);
        deleteButton.addActionListener(this); 
        
        equalButton=new JButton("=");
        equalButton.setBounds(360, 420, 80, 80);
        equalButton.setFont(new Font("Arial",Font.PLAIN,40));
        jf.add(equalButton); 
        equalButton.addActionListener(this);
        


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==sevenButton){
            if(isOperatorClicked){
                displayLabel.setText("7");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"7");
            }
            
        }else if(e.getSource()==eightButton){
            if(isOperatorClicked){
                displayLabel.setText("8");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"8");
            }
           
            
        }else if(e.getSource()==nineButton){
            if(isOperatorClicked){
                displayLabel.setText("9");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"9");
            }
            
            
        }else if(e.getSource()==fourButton){
            if(isOperatorClicked){
                displayLabel.setText("4");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"4");
            }
            
            
        }else if(e.getSource()==fiveButton){
            if(isOperatorClicked){
                displayLabel.setText("5");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"5");
            }
            
            
        }else if(e.getSource()==sixButton){
            if(isOperatorClicked){
                displayLabel.setText("6");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"6");
            }
            
            
        }else if(e.getSource()==oneButton){
            if(isOperatorClicked){
                displayLabel.setText("1");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"1");
            }
            
            
        }else if(e.getSource()==twoButton){
            if(isOperatorClicked){
                displayLabel.setText("2");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"2");
            }
            
            
        }else if(e.getSource()==threeButton){
            if(isOperatorClicked){
                displayLabel.setText("3");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"3");
            }
            
            
        }else if(e.getSource()==zeroButton){
            if(isOperatorClicked){
                displayLabel.setText("0");
                isOperatorClicked=false;
            }else{
                displayLabel.setText(displayLabel.getText()+"0");
            }
            
            
        }else if(e.getSource()==plusButton){
           //displayLabel.setText(displayLabel.getText()+" + ");
           isOperatorClicked=true;
           oldValue=displayLabel.getText();
            n=1;
            
        }else if(e.getSource()==divisionButton){
           // displayLabel.setText(displayLabel.getText()+" % ");
            isOperatorClicked=true;
           oldValue=displayLabel.getText();
           n=2;
        
        }else if(e.getSource()==multipleButton){
            //displayLabel.setText(displayLabel.getText()+" x ");
            isOperatorClicked=true;
           oldValue=displayLabel.getText();
           n=3;
            
        }else if(e.getSource()==darkButton){
            jf.getContentPane().setBackground(Color.DARK_GRAY);
            displayLabel.setBackground(Color.LIGHT_GRAY);
            displayLabel.setForeground(Color.BLACK);
            
            
        }else if(e.getSource()==whiteButton){
            jf.getContentPane().setBackground(Color.WHITE);
            displayLabel.setBackground(Color.DARK_GRAY);
            displayLabel.setForeground(Color.WHITE);
        }else if(e.getSource()==allclearButton){
            
            displayLabel.setText("");
        }
        //.......................................................................................................
        else if(e.getSource()==deleteButton){
            String currentText = displayLabel.getText();
        if (!currentText.isEmpty()) {
            // Remove the last character from the display label
            displayLabel.setText(currentText.substring(0, currentText.length() - 1));
        }
            
            
        }
        //........................................................................................................
        else if(e.getSource()==equalButton){
            
            String newValue=displayLabel.getText();
            float oldValueF=Float.parseFloat(oldValue);
            float newValueF=Float.parseFloat(newValue);
            switch(n){
                case 1: result=oldValueF+newValueF;
                        break;
                case 2: result=oldValueF/newValueF;
                        break;
                case 3: result=oldValueF*newValueF;
                        break;        
            }
            
            displayLabel.setText(Float.toString(result));

        }

        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }



}