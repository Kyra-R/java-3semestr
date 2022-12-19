package work22;

import javax.swing.*;
import java.util.EmptyStackException;
import java.util.Stack;

public class Calculator
{
    public String calc(String exp) throws IllegalArgumentException, ArithmeticException {
        try {
            String[] expArr = exp.split(" ");
            /*for(int i=0;i<expArr.length;i++){
                System.out.println(expArr[i]);
            }*/

            Stack<Integer> st = new Stack<>();

            for (String s : expArr) {
                switch (s) {
                    case "-" -> {
                        Integer a = st.pop();
                        Integer b = st.pop();
                        st.push(b - a);

                    }
                    case "+" -> {

                        Integer a = st.pop();
                        Integer b = st.pop();

                        st.push(b + a);

                    }
                    case "/" -> {

                        Integer a = st.pop();
                        Integer b = st.pop();

                        st.push(b / a);

                    }
                    case "*" -> {

                        Integer a = st.pop();
                        Integer b = st.pop();

                        st.push(b * a);

                    }
                    default -> st.push(Integer.parseInt(s));
                }
               // System.out.println("Stack: " + st);
            }

            return String.valueOf(st.peek());
        } catch (EmptyStackException | IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Error: неверные параметры ввода");
            return "";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return "";
        }
    }
}