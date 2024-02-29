package banco;

public class Banco {

    public static void main(String[] args) {
       ClassConta b = new ClassConta(0, false);
       b.abrirConta("cp");
       b.setDono("Rafael");
       b.setSaldo(1000);
       b.exibir();
       System.out.print("\n");
       
       ClassConta b2 = new ClassConta(0, false);
       b2.setStatus(true);
       b2.setSaldo(-10);
       b2.setTipo("cc");
       b2.setNumConta(5696);
       b2.setDono("Bruno");
       b2.sacar(100);
       b2.fecharConta();
       b2.exibir();
       System.out.println("\n");
       
       ClassConta b3 = new ClassConta(0,false);
       b3.setStatus(true);
       b3.setDono("Mariana");
       b3.setNumConta(4598);
       b3.setTipo("cc");
       b3.depositar(100);
       b3.sacar(72);
       b3.pagarMensal();
       b3.exibir();
       
    }
    
}
