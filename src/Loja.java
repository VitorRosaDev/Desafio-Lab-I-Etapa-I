
public class Loja{

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
  
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
      this.nome = nome;
      this.quantidadeFuncionarios = quantidadeFuncionarios;
      this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
  
    public Loja(String nome, int quantidadeFuncionarios) {
      this.nome = nome;
      this.quantidadeFuncionarios = quantidadeFuncionarios;
      this.salarioBaseFuncionario = -1;
    }
    
    public String getNome(){
      return nome;
    }
    
    public void setNome(String nome){
      this.nome = nome;
    }
    
    public int getQuantidadeFuncionarios(){
      return quantidadeFuncionarios;
    }
    
    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
      this.quantidadeFuncionarios = quantidadeFuncionarios;
    }
    
    public double getSalarioBaseFuncionario(){
      return salarioBaseFuncionario;
    }
    
    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
      this.salarioBaseFuncionario = salarioBaseFuncionario;
    }
  
    public String toString() {
      return "Nome da Loja: " +nome+ 
      "\nQuantidade de Funcionários: " +quantidadeFuncionarios+ 
      "\nSalário Base de Funcionário: R$" +salarioBaseFuncionario ;
    }

    public double gastosComSalario() {
      if (salarioBaseFuncionario == -1) {
        return -1;
      } else {
        return quantidadeFuncionarios * salarioBaseFuncionario;
      }
    }
    public char tamanhoDaLoja() {
      if (quantidadeFuncionarios < 10) {
        return 'P';
      } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
        return 'M';
      } else {
        return 'G';
      }
    }
      
  }