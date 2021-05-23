/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.awt.Color;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Hossa
 */
public class Calculator {
    
    
     JFrame frame;
    JLabel label = new JLabel();
    JTextField textField = new JTextField(" 0 ");
    JButton buttonMC = new JButton("MC");
    JButton buttonZero = new JButton("0");
    JButton buttonOne = new JButton("1");
    JButton buttonTwo = new JButton("2");
    JButton buttonThree = new JButton("3");
    JButton buttonFour = new JButton("4");
    JButton buttonFive = new JButton("5");
    JButton buttonSix = new JButton("6");
    JButton buttonSeven = new JButton("7");
    JButton buttonEight = new JButton("8");
    JButton buttonNine = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonMR = new JButton("MR");
    JButton buttonMS = new JButton("MS");
    JButton buttonmplus = new JButton("M+");
    JButton buttonBack = new JButton("<-");
    JButton buttonCE = new JButton("CE");
    JButton buttonC = new JButton("C");
    JButton buttonand = new JButton("&");
    JButton buttonroot = new JButton("[]");
    JButton buttonDivison = new JButton("/");    
    JButton buttonPresent = new JButton("%");
    JButton buttonMultiply = new JButton("X");
    JButton buttononedivisionx = new JButton("1/x");
    JButton buttonMinus = new JButton("-");
    JButton buttonPlus = new JButton("+");
    JButton buttonEqual = new JButton("=");
    JButton buttonminus = new JButton("M-");

    
     Calculator() {
        GUII();
        addComponents();
    }
    public void GUII()
    {
        frame = new JFrame();
        frame . setTitle("Calculator");
        frame.setSize(300,375);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.getHSBColor(220, 230, 242));
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void addComponents() {
        label.setBounds(250, 0, 50, 50);
        label.setForeground(Color.white);
        frame.add(label);

        textField.setBounds(11,8, 270, 60);
        textField.setFont(new Font("Arial", Font.BOLD, 30));
        textField.setEditable(false);
        textField.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textField);

        buttonSeven.setBounds(10, 165, 50, 40);
        buttonSeven.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonSeven);

        buttonEight.setBounds(65, 165, 50, 40);
        buttonEight.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonEight);

        buttonNine.setBounds(120, 165, 50, 40);
        buttonNine.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonNine);

        buttonFour.setBounds(10, 210, 50, 40);
        buttonFour.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonFour);

        buttonFive.setBounds(65, 210, 50, 40);
        buttonFive.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonFive);

        buttonSix.setBounds(120, 210, 50, 40);
        buttonSix.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonSix);

        buttonOne.setBounds(10, 255, 50, 40);
        buttonOne.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonOne);

        buttonTwo.setBounds(65, 255, 50, 40);
        buttonTwo.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonTwo);

        buttonThree.setBounds(120, 255, 50, 40);
        buttonThree.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonThree);

        buttonDot.setBounds(120, 300, 50, 40);
        buttonDot.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonDot);

        buttonZero.setBounds(10, 300, 105, 40);
        buttonZero.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonZero);

        buttonEqual.setBounds(230, 255, 50, 85);
        buttonEqual.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonEqual);

        buttonPlus.setBounds(175, 300, 50, 40);
        buttonPlus.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonPlus);
        
        buttonMinus.setBounds(175, 255, 50, 40);
        buttonMinus.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMinus);
        
        buttononedivisionx.setBounds(230, 210, 50, 40);
        buttononedivisionx.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttononedivisionx);
        
        buttonMultiply.setBounds(175, 210, 50, 40);
        buttonMultiply.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMultiply);
              
        buttonPresent.setBounds(230, 165, 50, 40);
        buttonPresent.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonPresent);
      
        buttonDivison.setBounds(175, 165, 50, 40);
        buttonDivison.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonDivison);
              
        buttonroot.setBounds(230, 120, 50, 40);
        buttonroot.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonroot);
        
        buttonand.setBounds(175, 120, 50, 40);
        buttonand.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonand);
                
        buttonC.setBounds(120, 120, 50, 40);
        buttonC.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonC);
                
        buttonCE.setBounds(65, 120, 50, 40);
        buttonCE.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonCE);
                
        buttonBack.setBounds(10, 120, 50, 40);
        buttonBack.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonBack);
        
        buttonminus.setBounds(230, 75, 50, 40);
        buttonminus.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonminus);

        buttonmplus.setBounds(175, 75, 50, 40);
        buttonmplus.setFont(new Font("Arial", Font.BOLD, 10));
        buttonmplus.setForeground(Color.BLACK);
        frame.add(buttonmplus);

        buttonMS.setBounds(120, 75, 50, 40);
        buttonMS.setFont(new Font("Arial", Font.BOLD, 10));
        buttonMS.setForeground(Color.BLACK);
        frame.add(buttonMS);

        buttonMR.setBounds(65, 75, 50, 40);
        buttonMR.setFont(new Font("Arial", Font.BOLD, 10));
        buttonMR.setForeground(Color.BLACK);
        frame.add(buttonMR);
        
        buttonMC.setBounds(10 , 75 , 50, 40 );
        buttonMC.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(buttonMC);

    }
}
