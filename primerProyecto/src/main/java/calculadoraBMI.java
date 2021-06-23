package main.java;

import javax.swing.*;

public class calculadoraBMI {

    public static void main(String[] args) {
        String altura = JOptionPane.showInputDialog("Para conocer su BMI introduzca su altura (Ej 1.60 mts)");
        double alturaUsuario = Double.parseDouble(altura);

        String kg = JOptionPane.showInputDialog("Por favor, introduzca su peso");
        double pesoUsuario = Double.parseDouble(kg);

        double resultado = BMI(alturaUsuario, pesoUsuario);
        JOptionPane.showMessageDialog(null, "Su body mass index (BMI) es de: " + resultado);
        System.out.println("");

        if (resultado < 18.5) {
            JOptionPane.showMessageDialog(null, "Usted esta con bajo peso", "BMI Calcutator", JOptionPane.WARNING_MESSAGE);
        }
        if (resultado > 18.5 && resultado < 24.9) {
            JOptionPane.showMessageDialog(null, "Su peso esta en el rango normal, felicitaciones!", "BMI Calcutator", JOptionPane.INFORMATION_MESSAGE);
        }
        if (resultado > 24.9 && resultado < 35) {
            JOptionPane.showMessageDialog(null, "Usted tiene sobrepeso! Hay que empezar a cuidarse", "BMI Calcutator", JOptionPane.WARNING_MESSAGE);
        }
        if (resultado > 35) {
            JOptionPane.showMessageDialog(null, "Usted es considerado un obeso morbido (su vida esta en peligro)", "BMI Calcutator", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static double BMI(double a, double p) {
        double resultado = p / (a * a);
        return resultado;
    }
}
