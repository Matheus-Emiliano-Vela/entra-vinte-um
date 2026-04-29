package POO.Heranca.Exemplo2;

public class Vendedor extends Funcionario{

    private double comissao;

    public Vendedor(String nome, double salarioBase, double comsissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public double getSalarioBase() {
        return super.getSalarioBase() + this.comissao;
    }

    public double getSalarioTotal() {
        return this.getSalarioBase() + this.comissao;
    }
}
