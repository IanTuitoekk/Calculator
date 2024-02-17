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
    JButton buttonroot=new JButton("(U+02B8)\u221Ax");
    JButton buttonfactorial=new JButton("x!");
    JButton buttonexp=new JButton("e");
    JButton buttonexpraised=new JButton("e(U+0058)");
    JButton buttonln=new JButton("ln");
    JButton buttonlogbase10=new JButton("log₁₀");
    JButton buttonSin=new JButton("sin");
    JButton buttonCos=new JButton("cos");
    JButton buttonTan=new JButton("tan");
    JButton buttonRad= new JButton("Rad");
    JButton buttonpie=new JButton("π");
    JButton buttonsininverse=new JButton("sin⁻¹");
    JButton buttoncosinverse=new JButton("cos⁻¹");
    JButton buttontaninverse=new JButton("tan⁻¹");
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
        frame.setSize(512,400);
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

        textfield.setBounds(0,0,595,60);
        textfield.setFont(new Font("Arial",Font.BOLD,20));
        textfield.setEditable(false);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);

        buttonSeven.setBounds(275,120,60,60);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(330,120,60,60);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(385,120,60,60);
        buttonNine.setFont(new Font("Arial",Font.BOLD,20));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonFour.setBounds(275,180,60,60);
        buttonFour.setFont(new Font("Arial",Font.BOLD,20));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(330,180,60,60);
        buttonFive.setFont(new Font("Arial",Font.BOLD,20));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(385,180,60,60);
        buttonSix.setFont(new Font("Arial",Font.BOLD,20));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonOne.setBounds(275,240,60,60);
        buttonOne.setFont(new Font("Arial",Font.BOLD,20));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(330,240,60,60);
        buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(385,240,60,60);
        buttonThree.setFont(new Font("Arial",Font.BOLD,20));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonDot.setBounds(385,300,60,60);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonZero.setBounds(275,300,130,60);
        buttonZero.setFont(new Font("Arial",Font.BOLD,20));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonEqual.setBounds(440,300,60,60);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setBackground(new Color(255,102,0));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDivision.setBounds(440,60,60,60);
        buttonDivision.setFont(new Font("Arial",Font.BOLD,20));
        buttonDivision.setBackground(new Color(255,102,0));
        buttonDivision.setFocusable(false);
        frame.add(buttonDivision);

        buttonMul.setBounds(440,120,60,60);
        buttonMul.setFont(new Font("Arial",Font.BOLD,20));
        buttonMul.setBackground(new Color(255,102,0));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);

        buttonAdd.setBounds(440,240,60,60);
        buttonAdd.setFont(new Font("Arial",Font.BOLD,20));
        buttonAdd.setBackground(new Color(255,102,0));
        buttonAdd.setFocusable(false);
        frame.add(buttonAdd);

        buttonSub.setBounds(440,180,60,60);
        buttonSub.setFont(new Font("Arial",Font.BOLD,20));
        buttonSub.setBackground(new Color(255,102,0));
        buttonSub.setFocusable(false);
        frame.add(buttonSub);

        buttonSqrt.setBounds(55,120,60,60);
        buttonSqrt.setFont(new Font("Arial",Font.BOLD,18));
        buttonSqrt.setBackground(new Color(51,51,51));
        buttonSqrt.setForeground(Color.DARK_GRAY);
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);

        buttoncuberoot.setBounds(110,120,60,60);
        buttoncuberoot.setFont(new Font("Arial",Font.BOLD,18));
        buttoncuberoot.setBackground(new Color(51,51,51));
        buttoncuberoot.setForeground(Color.DARK_GRAY);
        buttoncuberoot.setFocusable(false);
        frame.add(buttoncuberoot);

        buttonroot.setBounds(165,120,60,60);
        buttonroot.setFont(new Font("Arial",Font.BOLD,18));
        buttonroot.setBackground(new Color(51,51,51));
        buttonroot.setForeground(Color.DARK_GRAY);
        buttonroot.setFocusable(false);
        frame.add(buttonroot);

        buttonfactorial.setBounds(220,120,60,60);
        buttonfactorial.setFont(new Font("Arial",Font.BOLD,18));
        buttonfactorial.setBackground(new Color(51,51,51));
        buttonfactorial.setForeground(Color.DARK_GRAY);
        buttonfactorial.setFocusable(false);
        frame.add(buttonfactorial);

        buttonexp.setBounds(0,180,60,60);
        buttonexp.setFont(new Font("Arial",Font.BOLD,20));
        buttonexp.setForeground(Color.DARK_GRAY);
        buttonexp.setBackground(new Color(51,51,51));
        buttonexp.setFocusable(false);
        frame.add(buttonexp);

        buttonexpraised.setBounds(55,180,60,60);
        buttonexpraised.setFont(new Font("Arial",Font.BOLD,20));
        buttonexpraised.setForeground(Color.DARK_GRAY);
        buttonexpraised.setBackground(new Color(51,51,51));
        buttonexpraised.setFocusable(false);
        frame.add(buttonexpraised);

        buttonln.setBounds(165,180,60,60);
        buttonln.setFont(new Font("Arial",Font.BOLD,20));
        buttonln.setForeground(Color.DARK_GRAY);
        buttonln.setBackground(new Color(51,51,51));
        buttonln.setFocusable(false);
        frame.add(buttonln);

        buttonlogbase10.setBounds(220,180,60,60);
        buttonlogbase10.setFont(new Font("Arial",Font.BOLD,20));
        buttonlogbase10.setForeground(Color.DARK_GRAY);
        buttonlogbase10.setBackground(new Color(51,51,51));
        buttonlogbase10.setFocusable(false);
        frame.add(buttonlogbase10);

        buttonSin.setBounds(0,240,60,60);
        buttonSin.setFont(new Font("Arial",Font.BOLD,20));
        buttonSin.setForeground(Color.DARK_GRAY);
        buttonSin.setBackground(new Color(51,51,51));
        buttonSin.setFocusable(false);
        frame.add(buttonSin);

        buttonCos.setBounds(55,240,60,60);
        buttonCos.setFont(new Font("Arial",Font.BOLD,20));
        buttonCos.setForeground(Color.DARK_GRAY);
        buttonCos.setBackground(new Color(51,51,51));
        buttonCos.setFocusable(false);
        frame.add(buttonCos);

        buttonTan.setBounds(110,240,60,60);
        buttonTan.setFont(new Font("Arial",Font.BOLD,20));
        buttonTan.setForeground(Color.DARK_GRAY);
        buttonTan.setBackground(new Color(51,51,51));
        buttonTan.setFocusable(false);
        frame.add(buttonTan);

        buttonRad.setBounds(165,240,120,60);
        buttonRad.setFont(new Font("Arial",Font.BOLD,20));
        buttonRad.setForeground(Color.DARK_GRAY);
        buttonRad.setBackground(new Color(51,51,51));
        buttonRad.setFocusable(false);
        frame.add(buttonRad);

        buttonpie.setBounds(0,300,120,60);
        buttonpie.setFont(new Font("Arial",Font.BOLD,20));
        buttonpie.setForeground(Color.DARK_GRAY);
        buttonpie.setBackground(new Color(51,51,51));
        buttonpie.setFocusable(false);
        frame.add(buttonpie);

        buttonsininverse.setBounds(110,300,60,60);
        buttonsininverse.setFont(new Font("Arial",Font.BOLD,20));
        buttonsininverse.setForeground(Color.DARK_GRAY);
        buttonsininverse.setBackground(new Color(51,51,51));
        buttonsininverse.setFocusable(false);
        frame.add(buttonsininverse);

        buttoncosinverse.setBounds(165,300,60,60);
        buttoncosinverse.setFont(new Font("Arial",Font.BOLD,20));
        buttoncosinverse.setForeground(Color.DARK_GRAY);
        buttoncosinverse.setBackground(new Color(51,51,51));
        buttoncosinverse.setFocusable(false);
        frame.add(buttoncosinverse);

        buttontaninverse.setBounds(220,300,60,60);
        buttontaninverse.setFont(new Font("Arial",Font.BOLD,20));
        buttontaninverse.setForeground(Color.DARK_GRAY);
        buttontaninverse.setBackground(new Color(51,51,51));
        buttontaninverse.setFocusable(false);
        frame.add(buttontaninverse);

        buttonSquare.setBounds(110,60,60,60);
        buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
        buttonReciprocal.setBackground(new Color(51,51,51));
        buttonSquare.setForeground(Color.DARK_GRAY);
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(0,120,60,60);
        buttonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        buttonReciprocal.setBackground(new Color(51,51,51));
        buttonReciprocal.setForeground(Color.DARK_GRAY);
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);

        buttonClear.setBounds(275,60,60,60);
        buttonClear.setFont(new Font("Arial",Font.BOLD,20));
        buttonClear.setBackground(new Color(51,51,51));
        buttonClear.setForeground(Color.DARK_GRAY);
        buttonClear.setFocusable(false);
        frame.add(buttonClear);

        buttonPercentage.setBounds(385,60,60,60);
        buttonPercentage.setFont(new Font("Arial",Font.BOLD,20));
        buttonPercentage.setBackground(new Color(51,51,51));
        buttonPercentage.setForeground(Color.DARK_GRAY);
        buttonPercentage.setFocusable(false);
        frame.add(buttonPercentage);

        buttonNegate.setBounds(330,60,60,60);
        buttonNegate.setFont(new Font("Arial",Font.BOLD,20));
        buttonNegate.setBackground(new Color(51,51,51));
        buttonNegate.setForeground(Color.DARK_GRAY);
        buttonNegate.setFocusable(false);
        frame.add(buttonNegate);

        button10raisedtox.setBounds(110,180,60,60);
        button10raisedtox.setFont(new Font("Arial",Font.BOLD,20));
        button10raisedtox.setBackground(new Color(51,51,51));
        button10raisedtox.setForeground(Color.DARK_GRAY);
        button10raisedtox.setFocusable(false);
        frame.add(button10raisedtox);

        buttonraised.setBounds(220,60,60,60);
        buttonraised.setFont(new Font("Arial",Font.BOLD,20));
        buttonraised.setBackground(new Color(51,51,51));
        buttonraised.setForeground(Color.DARK_GRAY);
        buttonraised.setFocusable(false);
        frame.add(buttonraised);

        buttonCubed.setBounds(165,60,60,60);
        buttonCubed.setFont(new Font("Arial",Font.BOLD,20));
        buttonCubed.setBackground(new Color(51,51,51));
        buttonCubed.setForeground(Color.DARK_GRAY);
        buttonCubed.setFocusable(false);
        frame.add(buttonCubed);

        buttonRightbracket.setBounds(55,60,60,60);
        buttonRightbracket.setFont(new Font("Arial",Font.BOLD,20));
        buttonRightbracket.setBackground(new Color(51,51,51));
        buttonRightbracket.setForeground(Color.DARK_GRAY);
        buttonRightbracket.setFocusable(false);
        frame.add(buttonRightbracket);

        buttonLeftbracket.setBounds(0,60,60,60);
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
