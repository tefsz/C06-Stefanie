import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner entrada = new Scanner(System.in);

        int np3, npa;

        System.out.println("Digite sua NPA: ");
        npa = entrada.nextInt();

        if (npa >= 60) {
            System.out.println("Você foi aprovado");
            
        }else{
            System.out.println("Precisa realizar a NP3");
            np3 = entrada.nextInt();
        }

        System.out.println("Digite sua nota da NP3: ");
        np3 = entrada.nextInt();

        if ((np3 + npa)/2 >= 50){
            System.out.println("Você foi aprovado!");
            
        }else{
            System.out.println("Você foi reprovado.");
        }

        entrada.close();

    }

    
}
