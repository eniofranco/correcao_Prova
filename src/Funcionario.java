
public class Funcionario {
    
    private double salario;
    
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double s){
        this.salario = s;
    }
    
    double calcularSalarioFinal(){
        double desconto = salario * 0.89;
        return desconto;
    }
    
}
