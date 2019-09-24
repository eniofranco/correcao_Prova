
public class Livro {
    
    private String nome;
    private double preco;
    private Data dataDeLancamento;
    
    public Livro (String n, double p, Data dn){
        this.setNome (n);
        this.setPreco (p);
        this.setDataDeLancamento (dn);
        
    }
    
    public String getNome(){
        return this.nome;
    }
    public double getPreco(){
        return this.preco;
    }
    public Data getData(){
        return this.dataDeLancamento;
    }
    public void setNome (String n){
        this.nome = n;
    }
    public void setPreco (double p){
        this.preco = p;
    }
    public void setDataDeLancamento(Data d){
        this.dataDeLancamento = d;
    }
}
