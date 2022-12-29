package Rihanna;

import java.awt.*;
import static java.awt.Font.BOLD;
import java.awt.event.ActionEvent;
import java.util.Random;
import javax.swing.*;

    public class GuessingGame {
        static int lives=3;
        static int score=0;
        public static void main(String[] args) {
            JFrame frame = new JFrame("NumberGuesingGame");
            frame.setSize(500,500);
            frame.setLocation(200, 100);
            frame.setLayout(null);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JLabel label0 = new JLabel();
            label0.setText("Your Lives :"+lives);
            label0.setBounds(10,0,200,50);
            label0.setFont(new Font("",BOLD,20));
            label0.setForeground(Color.green);
            frame.add(label0);

            JLabel label1 = new JLabel();
            label1.setText("Your Score :"+score);
            label1.setBounds(10,60,200,50);
            label1.setFont(new Font("",BOLD,20));
            label1.setForeground(Color.BLUE);
            frame.add(label1);

            JLabel label2 = new JLabel();
            label2.setText("Guese number between 0 to 100 .");
            label2.setBounds(10,100,400,50);
            label2.setFont(new Font("",BOLD,20));
            frame.add(label2);

            JTextField tf = new JTextField();
            tf.setBounds(50,180,100,50);
            tf.setFont(new Font("",BOLD,20));
            frame.add(tf);

            JButton btn = new JButton("Check..");
            btn.setBounds(180,180,100,50);
            frame.add(btn);


            JLabel label3 = new JLabel();
            label3.setText("Guess No :"+"---");
            label3.setBounds(20,200,200,200);
            label3.setFont(new Font("",BOLD,20));
            label3.setForeground(Color.ORANGE);
            frame.add(label3);


            JLabel label4 = new JLabel();
            label4.setText("Actual No :"+"--");
            label4.setBounds(250,200,200,200);
            label4.setFont(new Font("",BOLD,20));
            label4.setForeground(Color.MAGENTA);
            frame.add(label4);

            frame.setVisible(true);


            btn.addActionListener((ActionEvent ae)->{
                if(lives==0){
                    JOptionPane.showMessageDialog(null, "No Lives...");
                    System.exit(0);
                }
                if(tf.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Please enter a valid number");
                }else if(Integer.parseInt(tf.getText())>100){
                    JOptionPane.showMessageDialog(null,"this number is >5");
                }else{
                    int num=Integer.parseInt(tf.getText());
                    Random random = new Random();
                    int rNum=random.nextInt(100);

                    label3.setText("Guess No :"+tf.getText());
                    label4.setText("Actual No :"+rNum);

                    if(num==rNum){
                        score+=20;
                        label1.setText("Your Score :"+score);
                    }else{
                        lives--;
                        label0.setText("Your Lives :"+lives);
                    }

                }
            });
        }

    }

