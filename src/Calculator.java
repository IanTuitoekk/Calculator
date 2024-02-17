package calculator;
import javax.swing.*;
import java.awt.*;

public class Calculator {

    JFrame frame=new JFrame("Calculator");
    JLabel label=new JLabel();
    JTextField textfield=new JTextField();
    JButton buttonZero=new JButton("0");
    JButton button=new JButton("0");
    JButton buttonOne=new JButton("1");
    JButton buttonTwo=new JButton("2");
    JButton buttonThree=new JButton("3");
    JButton buttonFour=new JButton("4");
    JButton buttonFive=new JButton("5");
    JButton buttonSix=new JButton("6");
    JButton buttonSeven=new JButton("7");
    JButton buttonEight=new JButton("8");
    JButton buttonNine=new JButton("9");
    JButton buttonDot=new JButton(".");
    JButton buttonClear=new JButton("C");
    JButton buttonEqual=new JButton("=");
    JButton buttonMul=new JButton("X");
    JButton buttonDivision=new JButton("/");
    JButton buttonAdd=new JButton("+");
    JButton buttonSub=new JButton("-");
    JButton buttonSquare=new JButton("x²");
    JButton buttonCubed=new JButton("x³");
    JButton buttonraised=new JButton("xʸ");
    JButton buttonReciprocal=new JButton("1/x");
    JButton buttonSqrt=new JButton("√x");
    JButton buttoncuberoot=new JButton("(U+00B3)√x");
    JButton buttonSin=new JButton("sin");
    JButton buttonCos=new JButton("cos");
    JButton buttonTan=new JButton("tan");
    JButton buttonNegate=new JButton("+/-");
    JButton buttonPercentage=new JButton("%");
    JButton buttonLeftbracket=new JButton("(");
    JButton buttonRightbracket=new JButton(")");
    JButton button10raisedtox=new JButton("10ˣ");
    public Calculator(){

        prepareGui();
        addComponenets();
    }

    public void prepareGui(){
        frame.setSize(600,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponenets(){
        label.setBounds(250,0,15,50);
        label.setForeground(Color.GRAY);
        frame.add(label);

        textfield.setBounds(0,110,595,60);
        textfield.setFont(new Font("Arial",Font.BOLD,20));
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);

        buttonSeven.setBounds(345,230,60,60);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(405,230,60,60);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(465,230,60,60);
        buttonNine.setFont(new Font("Arial",Font.BOLD,20));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonFour.setBounds(345,290,60,60);
        buttonFour.setFont(new Font("Arial",Font.BOLD,20));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(405,290,60,60);
        buttonFive.setFont(new Font("Arial",Font.BOLD,20));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(465,290,60,60);
        buttonSix.setFont(new Font("Arial",Font.BOLD,20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonOne.setBounds(345,350,60,60);
        buttonOne.setFont(new Font("Arial",Font.BOLD,20));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(405,350,60,60);
        buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(465,350,60,60);
        buttonThree.setFont(new Font("Arial",Font.BOLD,20));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonDot.setBounds(465,410,60,60);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(345,410,130,60);
        buttonZero.setFont(new Font("Arial",Font.BOLD,20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonEqual.setBounds(525,410,60,60);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setBackground(new Color(255,102,0));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDivision.setBounds(525,170,60,60);
        buttonDivision.setFont(new Font("Arial",Font.BOLD,20));
        buttonDivision.setBackground(new Color(255,102,0));
        buttonDivision.setFocusable(false);
        frame.add(buttonDivision);

        buttonMul.setBounds(525,230,60,60);
        buttonMul.setFont(new Font("Arial",Font.BOLD,20));
        buttonMul.setBackground(new Color(255,102,0));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);

        buttonAdd.setBounds(525,350,60,60);
        buttonAdd.setFont(new Font("Arial",Font.BOLD,20));
        buttonAdd.setBackground(new Color(255,102,0));
        buttonAdd.setFocusable(false);
        frame.add(buttonAdd);

        buttonSub.setBounds(525,290,60,60);
        buttonSub.setFont(new Font("Arial",Font.BOLD,20));
        buttonSub.setBackground(new Color(255,102,0));
        buttonSub.setFocusable(false);
        frame.add(buttonSub);

        buttonSqrt.setBounds(55,230,60,60);
        buttonSqrt.setFont(new Font("Arial",Font.BOLD,18));
        buttonSqrt.setBackground(new Color(51,51,51));
        buttonSqrt.setForeground(Color.DARK_GRAY);
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);

        buttoncuberoot.setBounds(115,230,60,60);
        buttoncuberoot.setFont(new Font("Arial",Font.BOLD,18));
        buttoncuberoot.setBackground(new Color(51,51,51));
        buttoncuberoot.setForeground(Color.DARK_GRAY);
        buttoncuberoot.setFocusable(false);
        frame.add(buttoncuberoot);

        buttonSquare.setBounds(115,170,60,60);
        buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
        buttonSquare.setForeground(Color.DARK_GRAY);
        buttonReciprocal.setBackground(new Color(51,51,51));
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(0,230,60,60);
        buttonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        buttonReciprocal.setBackground(new Color(51,51,51));
        buttonReciprocal.setForeground(Color.DARK_GRAY);
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);

        buttonClear.setBounds(345,170,60,60);
        buttonClear.setFont(new Font("Arial",Font.BOLD,20));
        buttonClear.setBackground(new Color(51,51,51));
        buttonClear.setForeground(Color.DARK_GRAY);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);

        buttonPercentage.setBounds(465,170,60,60);
        buttonPercentage.setFont(new Font("Arial",Font.BOLD,20));
        buttonPercentage.setBackground(new Color(51,51,51));
        buttonPercentage.setForeground(Color.DARK_GRAY);
        buttonPercentage.setFocusable(false);
        frame.add(buttonPercentage);

        buttonNegate.setBounds(405,170,60,60);
        buttonNegate.setFont(new Font("Arial",Font.BOLD,20));
        buttonNegate.setBackground(new Color(51,51,51));
        buttonNegate.setForeground(Color.DARK_GRAY);
        buttonNegate.setFocusable(false);
        frame.add(buttonNegate);

        button10raisedtox.setBounds(285,170,60,60);
        button10raisedtox.setFont(new Font("Arial",Font.BOLD,20));
        button10raisedtox.setBackground(new Color(51,51,51));
        button10raisedtox.setForeground(Color.DARK_GRAY);
        button10raisedtox.setFocusable(false);
        frame.add(button10raisedtox);

        buttonraised.setBounds(225,170,60,60);
        buttonraised.setFont(new Font("Arial",Font.BOLD,20));
        buttonraised.setBackground(new Color(51,51,51));
        buttonraised.setForeground(Color.DARK_GRAY);
        buttonraised.setFocusable(false);
        frame.add(buttonraised);

        buttonCubed.setBounds(165,170,60,60);
        buttonCubed.setFont(new Font("Arial",Font.BOLD,20));
        buttonCubed.setBackground(new Color(51,51,51));
        buttonCubed.setForeground(Color.DARK_GRAY);
        buttonCubed.setFocusable(false);
        frame.add(buttonCubed);

        buttonRightbracket.setBounds(55,170,60,60);
        buttonRightbracket.setFont(new Font("Arial",Font.BOLD,20));
        buttonRightbracket.setBackground(new Color(51,51,51));
        buttonRightbracket.setForeground(Color.DARK_GRAY);
        buttonRightbracket.setFocusable(false);
        frame.add(buttonRightbracket);

        buttonLeftbracket.setBounds(00,170,60,60);
        buttonLeftbracket.setFont(new Font("Arial",Font.BOLD,20));
        buttonLeftbracket.setBackground(new Color(51,51,51));
        buttonLeftbracket.setForeground(Color.DARK_GRAY);
        buttonLeftbracket.setFocusable(false);
        frame.add(buttonLeftbracket);

    }

    public static void main(String[] args){

        Calculator calc=new Calculator();



    }
}
