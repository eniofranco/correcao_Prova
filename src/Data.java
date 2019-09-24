
public class Data {
    
    private int dia;
    private int mes;
    private int ano;
    
    public Data(int d, int m, int a){
        this.setDia(d);
        this.setMes(m);
        this.setAno(a);
    }
    
    public int getDia(){
        return this.dia;
    }
    public int getMes(){
        return this.mes;
    }
    public int getAno(){
        return this.ano;
    }
    
    public void setDia (int d){
        this.dia=d;
    }
    public void setMes (int m){
        this.mes=m;
    }
    public void setAno (int a){
        this.ano=a;
    }
 
    String imprimir(){
        String Data = this.dia+ "/" +this.mes +"/" +this.ano;
        return Data;
   }
            
}
