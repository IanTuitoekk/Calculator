import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    double num1=0,num2=0,result=0;
    char operator;
    int calculation;

    JFrame frame=new JFrame("Calculator");
    JLabel label=new JLabel();
    JTextField textfield=new JTextField();
    JButton buttonZero=new JButton("0");
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
    JButton buttonDivision=new JButton("÷");
    JButton buttonAdd=new JButton("+");
    JButton buttonSub=new JButton("-");
    JButton buttonSquare=new JButton("x²");
    JButton buttonCubed=new JButton("x³");
    JButton buttonraised=new JButton("xʸ");
    JButton buttonReciprocal=new JButton("1/x");
    JButton buttonSqrt=new JButton("√x");
    JButton buttoncuberoot=new JButton("³√x");
    JButton buttonfactorial=new JButton("x!");
    JButton buttonexp=new JButton("e");
    JButton buttonexpraised=new JButton("eˣ");
    JButton buttonln=new JButton("ln");
    JButton buttonlogbase10=new JButton("log");
    JButton buttonSin=new JButton("sin");
    JButton buttonCos=new JButton("cos");
    JButton buttonTan=new JButton("tan");
    JButton buttonpi=new JButton("π");
    JButton buttonsininverse=new JButton("sin^-1");
    JButton buttoncosinverse=new JButton("cos^-1");
    JButton buttontaninverse=new JButton("tan^-1");
    JButton buttonNegate=new JButton("+/-");
    JButton buttonPercentage=new JButton("%");
    JButton buttonLeftbracket=new JButton("(");
    JButton buttonRightbracket=new JButton(")");
    JButton button10raisedtox=new JButton("10ˣ");

    public Calculator(){
        prepareGui();
        addComponents();
        addActionEvent();
    }

    public void prepareGui(){
        frame.setSize(653,397);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.BLACK);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void addComponents(){
        label.setBounds(250,0,15,50);
        label.setForeground(Color.GRAY);
        frame.add(label);

        textfield.setBounds(0,0,640,60);
        textfield.setFont(new Font("Arial",Font.BOLD,20));
        textfield.setBackground(Color.DARK_GRAY);
        textfield.setForeground(Color.GRAY);
        textfield.setEditable(true);
        textfield.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textfield);

        buttonSeven.setBounds(400,120,60,60);
        buttonSeven.setFont(new Font("Arial",Font.BOLD,20));
        buttonSeven.setForeground(new Color(249,246,238));
        buttonSeven.setBackground(new Color(64,64,64));
        buttonSeven.setFocusable(false);
        frame.add(buttonSeven);

        buttonEight.setBounds(460,120,60,60);
        buttonEight.setFont(new Font("Arial",Font.BOLD,20));
        buttonEight.setForeground(new Color(249,246,238));
        buttonEight.setBackground(new Color(64,64,64));
        buttonEight.setFocusable(false);
        frame.add(buttonEight);

        buttonNine.setBounds(520,120,60,60);
        buttonNine.setFont(new Font("Arial",Font.BOLD,20));
        buttonNine.setForeground(new Color(249,246,238));
        buttonNine  .setBackground(new Color(64,64,64));
        buttonNine.setFocusable(false);
        frame.add(buttonNine);

        buttonFour.setBounds(400,180,60,60);
        buttonFour.setFont(new Font("Arial",Font.BOLD,20));
        buttonFour.setForeground(new Color(249,246,238));
        buttonFour.setBackground(new Color(64,64,64));
        buttonFour.setFocusable(false);
        frame.add(buttonFour);

        buttonFive.setBounds(460,180,60,60);
        buttonFive.setFont(new Font("Arial",Font.BOLD,20));
        buttonFive.setForeground(new Color(249,246,238));
        buttonFive.setBackground(new Color(64,64,64));
        buttonFive.setFocusable(false);
        frame.add(buttonFive);

        buttonSix.setBounds(520,180,60,60);
        buttonSix.setFont(new Font("Arial",Font.BOLD,20));
        buttonSix.setForeground(new Color(249,246,238));
        buttonSix.setBackground(new Color(64,64,64));
        buttonSix.setFocusable(false);
        frame.add(buttonSix);

        buttonOne.setBounds(400,240,60,60);
        buttonOne.setFont(new Font("Arial",Font.BOLD,20));
        buttonOne.setForeground(new Color(249,246,238));
        buttonOne.setBackground(new Color(64,64,64));
        buttonOne.setFocusable(false);
        frame.add(buttonOne);

        buttonTwo.setBounds(460,240,60,60);
        buttonTwo.setFont(new Font("Arial",Font.BOLD,20));
        buttonTwo.setForeground(new Color(249,246,238));
        buttonTwo.setBackground(new Color(64,64,64));
        buttonTwo.setFocusable(false);
        frame.add(buttonTwo);

        buttonThree.setBounds(520,240,60,60);
        buttonThree.setFont(new Font("Arial",Font.BOLD,20));
        buttonThree.setForeground(new Color(249,246,238));
        buttonThree.setBackground(new Color(64,64,64));
        buttonThree.setFocusable(false);
        frame.add(buttonThree);

        buttonZero.setBounds(400,300,120,60);
        buttonZero.setFont(new Font("Arial",Font.BOLD,20));
        buttonZero.setForeground(new Color(249,246,238));
        buttonZero.setBackground(new Color(64,64,64));
        buttonZero.setFocusable(false);
        frame.add(buttonZero);

        buttonDot.setBounds(520,300,60,60);
        buttonDot.setFont(new Font("Arial",Font.BOLD,20));
        buttonDot.setForeground(new Color(249,246,238));
        buttonDot.setBackground(new Color(64,64,64));
        buttonDot.setFocusable(false);
        frame.add(buttonDot);

        buttonEqual.setBounds(580,300,60,60);
        buttonEqual.setFont(new Font("Arial",Font.BOLD,20));
        buttonEqual.setForeground(new Color(249,246,238));
        buttonEqual.setBackground(new Color(255,153,51));
        buttonEqual.setFocusable(false);
        frame.add(buttonEqual);

        buttonDivision.setBounds(580,60,60,60);
        buttonDivision.setFont(new Font("Arial",Font.BOLD,20));
        buttonDivision.setForeground(new Color(249,246,238));
        buttonDivision.setBackground(new Color(255,153,51));
        buttonDivision.setFocusable(false);
        frame.add(buttonDivision);

        buttonMul.setBounds(580,120,60,60);
        buttonMul.setFont(new Font("Arial",Font.BOLD,20));
        buttonMul.setForeground(new Color(249,246,238));
        buttonMul.setBackground(new Color(255,153,51));
        buttonMul.setFocusable(false);
        frame.add(buttonMul);

        buttonAdd.setBounds(580,240,60,60);
        buttonAdd.setFont(new Font("Arial",Font.BOLD,20));
        buttonAdd.setForeground(new Color(249,246,238));
        buttonAdd.setBackground(new Color(255,153,51));
        buttonAdd.setFocusable(false);
        frame.add(buttonAdd);

        buttonSub.setBounds(580,180,60,60);
        buttonSub.setFont(new Font("Arial",Font.BOLD,20));
        buttonSub.setForeground(new Color(249,246,238));
        buttonSub.setBackground(new Color(255,153,51));
        buttonSub.setFocusable(false);
        frame.add(buttonSub);

        buttonSqrt.setBounds(60,120,85,60);
        buttonSqrt.setFont(new Font("Arial",Font.BOLD,18));
        buttonSqrt.setBackground(new Color(51,51,51));
        buttonSqrt.setForeground(new Color(249,246,238));
        buttonSqrt.setFocusable(false);
        frame.add(buttonSqrt);

        buttoncuberoot.setBounds(145,120,85,60);
        buttoncuberoot.setFont(new Font("Arial",Font.BOLD,18));
        buttoncuberoot.setBackground(new Color(51,51,51));
        buttoncuberoot.setForeground(new Color(249,246,238));
        buttoncuberoot.setFocusable(false);
        frame.add(buttoncuberoot);

        buttonfactorial.setBounds(230,120,170,60);
        buttonfactorial.setFont(new Font("Arial",Font.BOLD,18));
        buttonfactorial.setBackground(new Color(51,51,51));
        buttonfactorial.setForeground(new Color(249,246,238));
        buttonfactorial.setFocusable(false);
        frame.add(buttonfactorial);

        buttonexp.setBounds(0,180,60,60);
        buttonexp.setFont(new Font("Arial",Font.BOLD,20));
        buttonexp.setForeground(new Color(249,246,238));
        buttonexp.setBackground(new Color(51,51,51));
        buttonexp.setFocusable(false);
        frame.add(buttonexp);

        buttonexpraised.setBounds(60,180,85,60);
        buttonexpraised.setFont(new Font("Arial",Font.BOLD,20));
        buttonexpraised.setForeground(new Color(249,246,238));
        buttonexpraised.setBackground(new Color(51,51,51));
        buttonexpraised.setFocusable(false);
        frame.add(buttonexpraised);

        button10raisedtox.setBounds(145,180,85,60);
        button10raisedtox.setFont(new Font("Arial",Font.BOLD,20));
        button10raisedtox.setBackground(new Color(51,51,51));
        button10raisedtox.setForeground(new Color(249,246,238));
        button10raisedtox.setFocusable(false);
        frame.add(button10raisedtox);

        buttonln.setBounds(230,180,170,60);
        buttonln.setFont(new Font("Arial",Font.BOLD,20));
        buttonln.setForeground(new Color(249,246,238));
        buttonln.setBackground(new Color(51,51,51));
        buttonln.setFocusable(false);
        frame.add(buttonln);

        buttonlogbase10.setBounds(300,240,100,60);
        buttonlogbase10.setFont(new Font("Arial",Font.BOLD,20));
        buttonlogbase10.setForeground(new Color(249,246,238));
        buttonlogbase10.setBackground(new Color(51,51,51));
        buttonlogbase10.setFocusable(false);
        frame.add(buttonlogbase10);

        buttonSin.setBounds(0,240,63,60);
        buttonSin.setFont(new Font("Arial",Font.BOLD,20));
        buttonSin.setForeground(new Color(249,246,238));
        buttonSin.setBackground(new Color(51,51,51));
        buttonSin.setFocusable(false);
        frame.add(buttonSin);

        buttonCos.setBounds(60,240,120,60);
        buttonCos.setFont(new Font("Arial",Font.BOLD,20));
        buttonCos.setForeground(new Color(249,246,238));
        buttonCos.setBackground(new Color(51,51,51));
        buttonCos.setFocusable(false);
        frame.add(buttonCos);

        buttonTan.setBounds(180,240,120,60);
        buttonTan.setFont(new Font("Arial",Font.BOLD,20));
        buttonTan.setForeground(new Color(249,246,238));
        buttonTan.setBackground(new Color(51,51,51));
        buttonTan.setFocusable(false);
        frame.add(buttonTan);

        buttonpi.setBounds(0,300,60,60);
        buttonpi.setFont(new Font("Arial",Font.BOLD,20));
        buttonpi.setForeground(new Color(249,246,238));
        buttonpi.setBackground(new Color(51,51,51));
        buttonpi.setFocusable(false);
        frame.add(buttonpi);

        buttonsininverse.setBounds(60,300,100,60);
        buttonsininverse.setFont(new Font("Arial",Font.BOLD,20));
        buttonsininverse.setForeground(new Color(249,246,238));
        buttonsininverse.setBackground(new Color(51,51,51));
        buttonsininverse.setFocusable(false);
        frame.add(buttonsininverse);

        buttoncosinverse.setBounds(160,300,100,60);
        buttoncosinverse.setFont(new Font("Arial",Font.BOLD,20));
        buttoncosinverse.setForeground(new Color(249,246,238));
        buttoncosinverse.setBackground(new Color(51,51,51));
        buttoncosinverse.setFocusable(false);
        frame.add(buttoncosinverse);

        buttontaninverse.setBounds(260,300,140,60);
        buttontaninverse.setFont(new Font("Arial",Font.BOLD,20));
        buttontaninverse.setForeground(new Color(249,246,238));
        buttontaninverse.setBackground(new Color(51,51,51));
        buttontaninverse.setFocusable(false);
        frame.add(buttontaninverse);

        buttonSquare.setBounds(145,60,85,60);
        buttonSquare.setFont(new Font("Arial",Font.BOLD,20));
        buttonSquare.setBackground(new Color(51,51,51));
        buttonSquare.setForeground(new Color(249,246,238));
        buttonSquare.setFocusable(false);
        frame.add(buttonSquare);

        buttonReciprocal.setBounds(0,120,60,60);
        buttonReciprocal.setFont(new Font("Arial",Font.BOLD,15));
        buttonReciprocal.setBackground(new Color(51,51,51));
        buttonReciprocal.setForeground(new Color(249,246,238));
        buttonReciprocal.setFocusable(false);
        frame.add(buttonReciprocal);

        buttonClear.setBounds(400,60,60,60);
        buttonClear.setFont(new Font("Arial",Font.BOLD,20));
        buttonClear.setBackground(new Color(51,51,51));
        buttonClear.setForeground(new Color(249,246,238));
        buttonClear.setFocusable(false);
        frame.add(buttonClear);

        buttonPercentage.setBounds(520,60,60,60);
        buttonPercentage.setFont(new Font("Arial",Font.BOLD,20));
        buttonPercentage.setBackground(new Color(51,51,51));
        buttonPercentage.setForeground(new Color(249,246,238));
        buttonPercentage.setFocusable(false);
        frame.add(buttonPercentage);

        buttonNegate.setBounds(460,60,60,60);
        buttonNegate.setFont(new Font("Arial",Font.BOLD,20));
        buttonNegate.setBackground(new Color(51,51,51));
        buttonNegate.setForeground(new Color(249,246,238));
        buttonNegate.setFocusable(false);
        frame.add(buttonNegate);

        buttonraised.setBounds(315,60,85,60);
        buttonraised.setFont(new Font("Arial",Font.BOLD,20));
        buttonraised.setBackground(new Color(51,51,51));
        buttonraised.setForeground(new Color(249,246,238));
        buttonraised.setFocusable(false);
        frame.add(buttonraised);

        buttonCubed.setBounds(230,60,85,60);
        buttonCubed.setFont(new Font("Arial",Font.BOLD,20));
        buttonCubed.setBackground(new Color(51,51,51));
        buttonCubed.setForeground(new Color(249,246,238));
        buttonCubed.setFocusable(false);
        frame.add(buttonCubed);

        buttonRightbracket.setBounds(60,60,85,60);
        buttonRightbracket.setFont(new Font("Arial",Font.BOLD,20));
        buttonRightbracket.setBackground(new Color(51,51,51));
        buttonRightbracket.setForeground(new Color(249,246,238));
        buttonRightbracket.setFocusable(false);
        frame.add(buttonRightbracket);

        buttonLeftbracket.setBounds(0,60,60,60);
        buttonLeftbracket.setFont(new Font("Arial",Font.BOLD,20));
        buttonLeftbracket.setBackground(new Color(51,51,51));
        buttonLeftbracket.setForeground(new Color(249,246,238));
        buttonLeftbracket.setFocusable(false);
        frame.add(buttonLeftbracket);
    }

    public void addActionEvent(){
        buttonZero.addActionListener(this);
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);
        buttonFour.addActionListener(this);
        buttonFive.addActionListener(this);
        buttonSix.addActionListener(this);
        buttonSeven.addActionListener(this);
        buttonEight.addActionListener(this);
        buttonNine.addActionListener(this);
        buttonDot.addActionListener(this);
        buttonEqual.addActionListener(this);
        buttonAdd.addActionListener(this);
        buttonSub.addActionListener(this);
        buttonMul.addActionListener(this);
        buttonDivision.addActionListener(this);
        buttonClear.addActionListener(this);
        buttonSquare.addActionListener(this);
        buttonCubed.addActionListener(this);
        buttonraised.addActionListener(this);
        buttonReciprocal.addActionListener(this);
        buttonSqrt.addActionListener(this);
        buttoncuberoot.addActionListener(this);
        buttonfactorial.addActionListener(this);
        buttonexp.addActionListener(this);
        buttonexpraised.addActionListener(this);
        buttonln.addActionListener(this);
        buttonlogbase10.addActionListener(this);
        buttonSin.addActionListener(this);
        buttonCos.addActionListener(this);
        buttonTan.addActionListener(this);
        buttonpi.addActionListener(this);
        buttonsininverse.addActionListener(this);
        buttoncosinverse.addActionListener(this);
        buttontaninverse.addActionListener(this);
        buttonNegate.addActionListener(this);
        buttonPercentage.addActionListener(this);
        buttonLeftbracket.addActionListener(this);
        buttonRightbracket.addActionListener(this);
        button10raisedtox.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        Object source=e.getSource();
        if(source==buttonZero)
            textfield.setText(textfield.getText()+"0");
        else if(source==buttonOne)
            textfield.setText(textfield.getText()+"1");
        else if(source==buttonTwo)
            textfield.setText(textfield.getText()+"2");
        else if(source==buttonThree)
            textfield.setText(textfield.getText()+"3");
        else if(source==buttonFour)
            textfield.setText(textfield.getText()+"4");
        else if(source==buttonFive)
            textfield.setText(textfield.getText()+"5");
        else if(source==buttonSix)
            textfield.setText(textfield.getText()+"6");
        else if(source==buttonSeven)
            textfield.setText(textfield.getText()+"7");
        else if(source==buttonEight)
            textfield.setText(textfield.getText()+"8");
        else if(source==buttonNine)
            textfield.setText(textfield.getText()+"9");
        else if(source==buttonDot){
            if(textfield.getText().contains(".")==false)
                textfield.setText(textfield.getText()+".");
        }
        else if(source==buttonAdd){
            num1=Double.parseDouble(textfield.getText());
            operator='+';
            textfield.setText("");
        }
        else if(source==buttonSub){
            num1=Double.parseDouble(textfield.getText());
            operator='-';
            textfield.setText("");
        }
        else if(source==buttonMul){
            num1=Double.parseDouble(textfield.getText());
            operator='*';
            textfield.setText("");
        }
        else if(source==buttonDivision){
            num1=Double.parseDouble(textfield.getText());
            operator='/';
            textfield.setText("");
        }

        else if(source==buttonClear)
            textfield.setText("");
        else if(source==buttonSquare){
            num1=Double.parseDouble(textfield.getText());
            result=Math.pow(num1,2);
            textfield.setText(""+result);
        }
        else if(source==buttonCubed){
            num1=Double.parseDouble(textfield.getText());
            result=Math.pow(num1,3);
            textfield.setText(""+result);
        }
        else if (source == buttonraised) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '^';
            textfield.setText("");  // Clear the textfield for entering num2

            num2 = Double.parseDouble(textfield.getText());
            result = Math.pow(num1, num2);
            textfield.setText("" + result);

    }
        else if(source==buttonReciprocal){
            num1=Double.parseDouble(textfield.getText());
            result=1/num1;
            textfield.setText(""+result);
        }
        else if(source==buttonSqrt){
            num1=Double.parseDouble(textfield.getText());
            result=Math.sqrt(num1);
            textfield.setText(""+result);
        }
        else if(source==buttoncuberoot){
            num1=Double.parseDouble(textfield.getText());
            result=Math.cbrt(num1);
            textfield.setText(""+result);
        }

        else if(source==buttonfactorial){
            num1=Double.parseDouble(textfield.getText());
            result=1;
            while(num1!=0){
                result*=num1;
                num1--;
            }
            textfield.setText(""+result);
        }
        else if(source==buttonexp){
            textfield.setText(""+Math.E);
        }
        else if(source==buttonexpraised){
            num1=Double.parseDouble(textfield.getText());
            result=Math.pow(Math.E,num1);
            textfield.setText(""+result);
        }
        else if(source==buttonln){
            num1=Double.parseDouble(textfield.getText());
            result=Math.log(num1);
            textfield.setText(""+result);
        }
        else if(source==buttonlogbase10){
            num1=Double.parseDouble(textfield.getText());
            result=Math.log10(num1);
            textfield.setText(""+result);
        }
        else if(source==buttonSin){
            num1=Double.parseDouble(textfield.getText());
            if(frame.getTitle().equals("Calculator")){
                if(frame.getWidth()==512)
                    result=Math.sin(Math.toDegrees(num1));
                else
                    result=Math.sin(num1);
            }
            else
                result=Math.sin(num1);
            textfield.setText(""+result);
        }
        else if(source==buttonCos){
            num1=Double.parseDouble(textfield.getText());
            if(frame.getTitle().equals("Calculator")){
                if(frame.getWidth()==512)
                    result=Math.cos(Math.toDegrees(num1));
                else
                    result=Math.cos(num1);
            }
            else
                result=Math.cos(num1);
            textfield.setText(""+result);
        }
        else if(source==buttonTan){
            num1=Double.parseDouble(textfield.getText());
            if(frame.getTitle().equals("Calculator")){
                if(frame.getWidth()==512)
                    result=Math.tan(Math.toDegrees(num1));
                else
                    result=Math.tan(num1);
            }
            else
                result=Math.tan(num1);
            textfield.setText(""+result);
        }

        else if(source==buttonpi)
            textfield.setText(""+Math.PI);
        else if(source==buttonsininverse){
            num1=Double.parseDouble(textfield.getText());
            if(frame.getTitle().equals("Calculator")){
                if(frame.getWidth()==512)
                    result=Math.toDegrees(Math.asin(num1));
                else
                    result=Math.asin(num1);
            }
            else
                result=Math.asin(num1);
            textfield.setText(""+result);
        }
        else if(source==buttoncosinverse){
            num1=Double.parseDouble(textfield.getText());
            if(frame.getTitle().equals("Calculator")){
                if(frame.getWidth()==512)
                    result=Math.toDegrees(Math.acos(num1));
                else
                    result=Math.acos(num1);
            }
            else
                result=Math.acos(num1);
            textfield.setText(""+result);
        }
        else if(source==buttontaninverse){
            num1=Double.parseDouble(textfield.getText());
            if(frame.getTitle().equals("Calculator")){
                if(frame.getWidth()==512)
                    result=Math.toDegrees(Math.atan(num1));
                else
                    result=Math.atan(num1);
            }
            else
                result=Math.atan(num1);
            textfield.setText(""+result);
        }
        else if(source==buttonNegate){
            num1=Double.parseDouble(textfield.getText());
            result=num1*(-1);
            textfield.setText(""+result);
        }
        else if(source==buttonPercentage){
            num1=Double.parseDouble(textfield.getText());
            result=num1/100;
            textfield.setText(""+result);
        }
        else if(source==buttonLeftbracket)
            textfield.setText(textfield.getText()+"(");
        else if(source==buttonRightbracket)
            textfield.setText(textfield.getText()+")");
        else if(source==button10raisedtox){
            num1=Double.parseDouble(textfield.getText());
            result=Math.pow(10,num1);
            textfield.setText(""+result);
        }
        else if(source==buttonEqual){
            num2=Double.parseDouble(textfield.getText());
            switch(operator){
                case '+': result=num1+num2; break;
                case '-': result=num1-num2; break;
                case '*': result=num1*num2; break;
                case '/': result=num1/num2; break;
                case '^': result=Math.pow(num1,num2); break;
            }
            textfield.setText(""+result);
        }

    }

    public static void main(String[] args){
        new Calculator();
    }
}
