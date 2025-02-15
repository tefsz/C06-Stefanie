import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       Scanner entrada = new Scanner(System.in);

       int numAlunos = entrada.nextInt();
       
       switch (numAlunos) {
        case 10:
        case 20:

        System.out.println("A aula será na sala I-16");
            
            break;
        case 30:
            System.out.println("Sala I-22");
       
        default:
        System.out.println("Numero incorreto, tente novamente");
            break;
       }

    entrada.close();

    }
}
