import java.util.Scanner;

public class MaiorNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[10];
        double maiorNota = 0; 
        System.out.println("Digite as notas de 10 alunos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota do aluno " + (i + 1) + ": ");
            String entrada = scanner.next(); 
            entrada = entrada.replace(',', '.'); 
            notas[i] = Double.parseDouble(entrada); 
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        System.out.printf("\nA maior nota da turma foi: %.2f\n", maiorNota);
        
        scanner.close();
    }
}
