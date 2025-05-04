import javax.swing.*;

public class RandomGuess
{
    public static void main(String[]args)
    {
        JOptionPane.showMessageDialog(null, "Think of a number between 1 and 10");
        JOptionPane.showMessageDialog(null, "The numer is " + (1 + (int)(Math.random() * 10)));
    }
}
