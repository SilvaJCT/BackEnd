import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);

        System.out.println("insira a primeira nota:");
        double nota1 = sc.nextDouble();
        System.out.println("Insira a segunda nota:");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("Aluno Aprovado com média " + media);
        
        }
        else {
            System.out.println("ALUNO REPROVADO POR MÉDIA " + media);
        }

        sc.close();
    }

       
}
