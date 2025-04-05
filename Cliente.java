public class Cliente {
    String nome;
    long cpf;
    int i;
    int matricula;

    Computador pc;
    Computador [] pcComprado = new Computador[5]; 
    

    float calculaTotalCompra(){

        float custoTotal = 0;
        for (Computador pc: pcComprado) {
            if(pc != null){
                custoTotal += pc.preco;
            }
        }
        return custoTotal;
    }

}
