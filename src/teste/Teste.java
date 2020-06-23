package teste;

public class Teste {
    public static void main(String[] args) {
        double preco = 100;
        double desconto = (preco >   20)?preco*0.10:preco*0.05;
        System.out.println(desconto);
    }

}
