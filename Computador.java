import java.util.Scanner;

public class Computador {

    String marca;
    float preco;
    SistemaOperacional OS;
    HardwareBasico hard;
    MemoriaUSB usb = new MemoriaUSB();
    Scanner sc = new Scanner(System.in);

    public Computador(){

        OS = new SistemaOperacional();
        hard = new HardwareBasico();

    }

    void mostraPCConfigs(){

        System.out.println("marca = " + marca);
        System.out.println("preco = " + preco);
        System.out.println("capacidade do processador = " + hard.capacidade);
        System.out.println("Bits do Sistema Operacional (64) ou (32) = " + OS.tipo);
        System.out.println("hardware = " + hard.nome);
        System.out.println("Sistema Operacional = " + OS.nome);
        System.out.println("Acompanhamento: " + usb.nome + " " + usb.capacidade + "Gb");
        


    }

    void addMemoriaUSB(MemoriaUSB musb){

        usb.nome = musb.nome;
        usb.capacidade = musb.capacidade;

    }


}
