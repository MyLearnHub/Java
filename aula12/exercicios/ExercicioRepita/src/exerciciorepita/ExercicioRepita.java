/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author pauloalvares
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "Olá, Mundo!", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
        /*
            int n, s = 0;
            do {
                n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
                s += n;
            } while(n != 0);
            JOptionPane.showMessageDialog(null, "<html>Resultado final <br><hr><br>Somatório vale " + s + "</html>");
        */
        
        int number, sum = 0, total = 0, even = 0, odd = 0, hundred = 0;
        float average;
        
        do {
            number = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(valor 0 interrompe)</em></html>"));
            
            sum += number;
            
            total++;
            
            if (number % 2 == 0) even++;
            else odd++;
           
            if (number > 100) hundred++;
        } while(number != 0);
        average = sum / total;
        
        JOptionPane.showMessageDialog(null, "<html>Resultado: <br><hr><br>"
                + "Total de Valores: " + total + "<br>"
                + "Total de Pares: " + even + "<br>"
                + "Total de Ímpares: " + odd + "<br>"
                + "Acima de 100: " + hundred + "<br>"
                + "Média dos valores: " + average + "<br>"
                + "</html>");
    }
    
}
