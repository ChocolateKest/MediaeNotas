import model.Mediana;

import javax.swing.*;

public static void main(String[] args){
    Mediana mediana = new Mediana();
    mediana.setAluno(JOptionPane.showInputDialog("Digite o nome do aluno: "));
    mediana.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do primeiro Trimestre: ")));
    mediana.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do segundo Trimestre: ")));
    mediana.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do terceiro Trimestre: ")));
    JOptionPane.showMessageDialog(null,mediana.toString());
}
