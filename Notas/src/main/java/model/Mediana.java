package model;


import javax.swing.*;

public class Mediana {
    private double nota1;
    private double nota2;
    private double nota3;
    private String aluno;

    public Mediana() {
        this(0, 0, 0, "");
    }

    public double getNota1() {
        return nota1;
    }

    public Mediana(double nota1, double nota2, double nota3, String aluno) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.aluno = aluno;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public double calcularMedia() {
        return (this.nota1 + this.nota2 + this.nota3);
    }

    public String toString() {
        double media = calcularMedia();
        if (media > 60.0) {
            JOptionPane.showMessageDialog(null, "O " + aluno + " passou de ano com a média: " + media);
        } else {
            JOptionPane.showMessageDialog(null, "O " + aluno + " reprovou de ano com a média: \n" + media
                    + " faltaram " + (60.0 - media) + " pontos.");
        }
        return "Parabéns " + aluno;
    }
}