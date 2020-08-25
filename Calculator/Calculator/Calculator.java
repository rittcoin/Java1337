import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.lang.Math;



public class Calculator extends JFrame implements ActionListener{
    private JTextArea inputField = new JTextArea();
    private JFrame frame = new JFrame("Calculator");
    public Font font = new Font("Arial Unicode MS",1,16);
    public Font clearFont = new Font("Arial Unicode MS",1,10);
    public Font backFont = new Font("Arial Unicode MS",0,16);
    
    private double result = 0.0;
    //used for parsing inputs during calculation
    String strNum1;
    String strNum2;
    String []statement;
    double dub1;
    double dub2;
    //buttons
    private JButton btn0 = new JButton("0");
    private JButton btn1 = new JButton("1");
    private JButton btn2 = new JButton("2");
    private JButton btn3 = new JButton("3");
    private JButton btn4 = new JButton("4");
    private JButton btn5 = new JButton("5");
    private JButton btn6 = new JButton("6");
    private JButton btn7 = new JButton("7");
    private JButton btn8 = new JButton("8");
    private JButton btn9 = new JButton("9");

    private JButton btnAdd = new JButton("+");
    private JButton btnSub = new JButton("-");
    private JButton btnMul = new JButton("*");
    private JButton btnDiv = new JButton("/");
    private JButton btnInv = new JButton("1/x");
    private JButton btnSqr = new JButton("x\u00B2");
    private JButton btnPow = new JButton("^");
    private JButton btnPnt = new JButton(".");
    private JButton btnEql = new JButton("=");
    private JButton btnSign = new JButton("\u00B1");
    private JButton btnSqrt = new JButton("\u221A");
    private JButton btnPer = new JButton("%"); 
    private JButton btnClr = new JButton("CLEAR");
    private JButton btnBack = new JButton("\u232B");       
    private JButton [] buttonArray = { btn0,   btn1,   btn2,   btn3,   btn4,   btn5,    btn6,
                                       btn7,   btn8,   btn9,   btnAdd, btnSub, btnMul,  btnDiv, 
                                       btnInv, btnSqr, btnPow, btnPnt, btnEql, btnSign, btnSqrt,
                                       btnPer, btnClr, btnBack};


    public Calculator(){
        //frame props
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 550);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setFont(font);

        //create textArea props
        inputField.setSize(350,100);
        inputField.setLocation(15,5);
        inputField.setEditable(false);
        inputField.setFont(font);

        //add input field to screen
        frame.add(inputField);

        //set all buttons to same size
        for(JButton jb : buttonArray){
            jb.setSize(80,50);
        }
        //btn locations
        btn0.setLocation(105,460);
        btn1.setLocation(10,395);
        btn2.setLocation(105,395);
        btn3.setLocation(200,395);
        btn4.setLocation(10,330);
        btn5.setLocation(105,330);
        btn6.setLocation(200,330);
        btn7.setLocation(10,265);
        btn8.setLocation(105,265);
        btn9.setLocation(200,265);
        btnAdd.setLocation(295,395);
        btnSub.setLocation(295,330);
        btnMul.setLocation(295,265);
        btnDiv.setLocation(295,200);
        btnInv.setLocation(105,200);
        btnSqr.setLocation(200,200);
        btnPow.setLocation(10,200);
        btnPnt.setLocation(200,460);
        btnEql.setLocation(295,460);
        btnSign.setLocation(10,460);
        btnSqrt.setLocation(10,135);
        btnPer.setLocation(105,135);
        btnClr.setLocation(200,135);
        btnBack.setLocation(295,135);
        
        
        //add buttons to screen
        for(JButton jb : buttonArray){
            frame.add(jb);
            jb.setFont(font);
            jb.addActionListener(this);
        }
        //CLEAR font is too big lol Back looks ugly
        btnClr.setFont(clearFont);
        btnBack.setFont(backFont);       
        
    }
    public void actionPerformed(ActionEvent e){
        try
        {
            assumingCorrectNumberFormatting(e);
        }
        catch (NumberFormatException e2)
        {
            String command = e.getActionCommand();
            if(command.equals("CLEAR")){
                inputField.setText("");
            }
            else 
                inputField.setText("Error: Reenter Number.");
        }
    }
    //button listener
    public void assumingCorrectNumberFormatting(ActionEvent e){
        String command = e.getActionCommand();
        if(command.equals("0")){
            inputField.append("0");
        }
        else if(command.equals("1")){
            inputField.append("1");
        }
        else if(command.equals("2")){
            inputField.append("2");
        }
        else if(command.equals("3")){
            inputField.append("3");
        }
        else if(command.equals("4")){
            inputField.append("4");
        }
        else if(command.equals("5")){
            inputField.append("5");
        }
        else if(command.equals("6")){
            inputField.append("6");
        }
        else if(command.equals("7")){
            inputField.append("7");
        }
        else if(command.equals("8")){
            inputField.append("8");
        }
        else if(command.equals("9")){
            inputField.append("9");
        }

        if(command.equals("+")){
            inputField.append("+");
            result = result + stringToDouble(inputField.getText());
            inputField.setText(Double.toString(result));
        }
        else if(command.equals("-")){
            result = result - stringToDouble(inputField.getText());
            inputField.setText(Double.toString(result));
        }
        else if(command.equals("CLEAR")){
            result = result - stringToDouble(inputField.getText());
            inputField.setText("");
        }
        else if(e.getSource().equals(btnSqrt)) {
            String number = inputField.getText();
            //parse strings to double
            dub1 = stringToDouble(number);
            result = Math.sqrt(dub1);
            //parse back to string and append to text area
            inputField.setText(Double.toString(result));
        }
        else if(e.getSource().equals(btnSqr)) {
            String number = inputField.getText();
            //parse strings to double
            dub1 = stringToDouble(number);
            result = Math.pow(dub1,2);
            //parse back to string and append to text area
            inputField.setText(Double.toString(result));
        }
        else if(command.equals("*")){
            result = result * stringToDouble(inputField.getText());
            inputField.setText(Double.toString(result));
        }
        else if(command.equals("/")){
            result = result / stringToDouble(inputField.getText());
            inputField.setText(Double.toString(result));
        }
        else if(e.getSource().equals(btnInv)) {
            String number = inputField.getText();
            //parse strings to double
            dub1 = stringToDouble(number);
            result = 1/(result);
            //parse back to string and append to text area
            inputField.setText(Double.toString(result));
        }
        else if(command.equals(".")) {
            inputField.append(".");
        }



        //if equals is pressed, do some math
        else if(command.equals("=")){
            //parse calculation based on operator in statement
            if(inputField.getText().contains("+")){
                statement = inputField.getText().split("\\+");
                strNum1 = statement[0];
                strNum2 = statement[1];
                //parse strings to double
                dub1 = stringToDouble(strNum1);
                dub2 = stringToDouble(strNum2);
                result = dub1 + dub2;
                //parse back to string and append to text area
                inputField.setText(Double.toString(result));
            }
            else if(inputField.getText().contains("-")) {
                statement = inputField.getText().split("\\-");
                strNum1 = statement[0];
                strNum2 = statement[1];
                //parse strings to double
                dub1 = stringToDouble(strNum1);
                dub2 = stringToDouble(strNum2);
                result = dub1 - dub2;
                //parse back to string and append to text area
                inputField.setText(Double.toString(result));
            }
            else if(inputField.getText().contains("/")) {
                statement = inputField.getText().split("\\/");
                strNum1 = statement[0];
                strNum2 = statement[1];
                //parse strings to double
                dub1 = stringToDouble(strNum1);
                dub2 = stringToDouble(strNum2);
                result = dub1 / dub2;
                //parse back to string and append to text area
                inputField.setText(Double.toString(result));
            }
            else if(inputField.getText().contains("*")) {
                statement = inputField.getText().split("\\*");
                strNum1 = statement[0];
                strNum2 = statement[1];
                //parse strings to double
                dub1 = stringToDouble(strNum1);
                dub2 = stringToDouble(strNum2);
                result = dub1 * dub2;
                //parse back to string and append to text area
                inputField.setText(Double.toString(result));
            }
            else if(inputField.getText().contains("^")) {
                statement = inputField.getText().split("\\^");
                strNum1 = statement[0];
                strNum2 = statement[1];
                //parse strings to double
                dub1 = stringToDouble(strNum1);
                dub2 = stringToDouble(strNum2);
                result = Math.pow(dub1, dub2);
                //parse back to string and append to text area
                inputField.setText(Double.toString(result));
            }
                          
        }
    }
    //static helper method for parsing double values
    //throws NumberFormatException
    private static double stringToDouble(String stringObject){
        return Double.parseDouble(stringObject.trim());
    }
    
    public static void main(String[] args){
        new Calculator();
        
    }
}
