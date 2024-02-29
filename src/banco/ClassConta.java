package banco;
import java.util.Random;

public class ClassConta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    public ClassConta(float saldo, boolean status){
    this.saldo = 0;
    this.status = false;}
    
    public void abrirConta(String t){
    Random rand = new Random();
    int n = rand.nextInt(1000);
    this.setTipo(t);
    this.setStatus(true);
    this.setNumConta(n);
    if(t.equals("cc")){
    this.setSaldo(50);}
    else if(t.equals("cp")){
    this.setSaldo(150);}
     System.out.println("Conta: " + this.getTipo() + " numero: " + this.getNumConta() + " aberta com sucesso");
    };
   
    public void fecharConta(){
        if(this.getSaldo() > 0){
        System.out.println("Saldo em conta, faca a retirada antes de fechar!");}
        else if(this.getSaldo() < 0){
        System.out.println("Conta em debito, favor acertar o valor antes de fechar!");}
        else{setStatus(false);
        System.out.println("Conta fechada com seucesso");
        }
    };
    public void depositar(float v){
        if(this.getStatus() == true){
        setSaldo(this.getSaldo() + v);
        System.out.println("Deposito realizado com sucesso na conta de: " + this.getDono() + " Conta:" + this.getNumConta());}
        else {System.out.println("Impossivel depositar!");}
        
    };
    public void sacar(float v){
        if(this.getStatus() == true){
        if(this.getSaldo() >= v){
        setSaldo(this.getSaldo()- v);
        System.out.println("Saque realizado na conta de: " + this.getDono()+ " Conta:" + this.getNumConta());}
        else{System.out.println("Saldo insuficiente!");}
        }else{System.out.println("Impossivel sacar!");}
    };
    public void pagarMensal(){
        int v = 0;
        if(getTipo().equals("cc")){
        v = 12;}
        else if(getTipo().equals("cp")){
        v = 20;}
        if(getStatus() == true){
        if(getSaldo() > v){
        setSaldo(getSaldo() - v);}
        else {System.out.println("Saldo insufuciente ");}
        }else{System.out.println("Impossivel pagar");}
    };
    public void exibir(){
    System.out.println("------------------------------------------");
    System.out.println("Conta esta aberta: " + this.getStatus());
    System.out.println("Numero da conta: " + this.getNumConta());
    System.out.println("Tipo de conta: " + this.getTipo());
    System.out.println("Dono da conta: " + this.getDono());
    System.out.println("Saldo da conta: " + this.getSaldo());
    System.out.println("------------------------------------------");
    }
    public void setNumConta(int n){
    this.numConta = n;}
    public int getNumConta(){
    return this.numConta;}
    public void setTipo(String t){
    this.tipo = t;}
    public String getTipo(){
    return this.tipo;}
    public void setDono(String d){
    this.dono = d;}
    public String getDono(){
    return this.dono;}
    public void setSaldo(float s){
    this.saldo = s;}
    public float getSaldo(){
    return this.saldo;}
    public void setStatus(boolean u){
    this.status = u;}
    public boolean getStatus(){
    return this.status;}
    

    
            
            
}
