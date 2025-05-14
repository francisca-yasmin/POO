public class FuncionarioCLT extends Funcionario {
    protected double beneficio;

    //obrigatoriamente eu preciso ter um override
    @Override
    public void calcular_salario() {
        this.salario_base + this.beneficio;
    }
}
