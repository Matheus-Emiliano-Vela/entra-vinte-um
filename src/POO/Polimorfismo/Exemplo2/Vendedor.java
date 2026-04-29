package POO.Polimorfismo.Exemplo2;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(double salarioBase, double comissao) {
        super.setSalarioBase(salarioBase);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double getSalarioBase() {
        return super.getSalarioBase() + this.comissao;

    }
}
