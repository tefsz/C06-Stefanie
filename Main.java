import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
  
        
    //fazendo a instancia de computadores, cliente e memória Usb

     Computador pc1 = new Computador();
     Computador pc2 = new Computador();
     Computador pc3 = new Computador();

     Cliente cliente = new Cliente();

     MemoriaUSB mUsb = new MemoriaUSB();

     Scanner sc = new Scanner(System.in);

    //informações da cliente

     cliente.nome = "Marina";
     cliente.cpf = 987654321;
     

    // informações do PC da Apple
     pc1.marca = "Apple";
     pc1.preco = 773;
     pc1.hard.nome = "Pentium core i3, 8 GB de Memoria RAM, 500GB de HD";
     pc1.hard.capacidade = 2200;
     pc1.OS.nome = "Linux Ubuntu";
     pc1.OS.tipo = 32;
     pc1.usb = new MemoriaUSB();
     mUsb.nome = "Pen-Drive";
     mUsb.capacidade = 16;
     pc1.addMemoriaUSB(mUsb);


    // informações do PC da Samsung
    pc2.marca = "Samsung";
    pc2.preco = 2007;
    pc2.hard.nome = "Pentium core i5, 16 GB de Memoria RAM, 1Tb de HD";
    pc2.hard.capacidade = 3370;
    pc2.OS.nome = "Windows 8";
    pc2.OS.tipo = 64;
    pc2.usb = new MemoriaUSB();
    mUsb.nome = "Pen-Drive";
    mUsb.capacidade = 32;
    pc2.addMemoriaUSB(mUsb);


    // informações do PC da Dell
       pc3.marca = "Dell";
       pc3.preco = 6451;
       pc3.hard.nome = "Pentium core i7, 32 GB de Memoria RAM, 2Tb de HD";
       pc3.hard.capacidade = 4500;
       pc3.OS.nome = "Windows 10";
       pc3.OS.tipo = 64;
       pc3.usb = new MemoriaUSB();
       mUsb.nome = "HD externo";
       mUsb.capacidade = 1000;
       pc3.addMemoriaUSB(mUsb);


       //Mostrando o menu de promoções
       pc1.mostraPCConfigs();
       pc2.mostraPCConfigs();
       pc3.mostraPCConfigs();

    int codigo;
    System.out.println("0 - Encerrando as compras");
    System.out.println("Digite o numero da promoçao que deseja comprar: ");
    codigo = sc.nextInt();

    while(codigo != 0){
        for (int i = 0; i < cliente.pcComprado.length; i++) {
            //Fazendo a verificação do código
            if(codigo != 1 && codigo != 2 && codigo != 3){
                System.out.println("codigo invalido"); 
                break;
            }

            if(cliente.pcComprado[i] == null){
                cliente.pcComprado[i] = new Computador();

                if(codigo == 1){
                    System.out.println("PC1 COMPRADO");
                    cliente.pcComprado[i] = pc1;
                }
                else if(codigo == 2){
                    System.out.println("PC2 COMPRADO");
                    cliente.pcComprado[i] = pc2;
                }
                else {
                    System.out.println("PC3 COMPRADO");
                    cliente.pcComprado[i] = pc3;
                }

                break;
            }
        }

        System.out.println("Promocao 1: ");
        pc1.mostraPCConfigs();

        System.out.println("Promocao 2: ");
        pc2.mostraPCConfigs();

        System.out.println("Promocao 3: ");
        pc3.mostraPCConfigs();

        System.out.println("0 - Encerrando as compras");
        System.out.println("Digite o numero da promoçao que deseja comprar: ");

        codigo = sc.nextInt();
    }

    
    System.out.println("Você saiu da loja, volte sempre!:)");

      //Mostrando todos os PCs que o cliente comprou
      System.out.println("Total de PCs comprados:");
      for (Computador p: cliente.pcComprado) {
        if( p != null){
            p.mostraPCConfigs();
        }
    }

      System.out.println("VALOR TOTAL DA COMPRA : " + cliente.calculaTotalCompra() + "R$");
    


}

}
