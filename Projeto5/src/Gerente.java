public class Gerente extends Funcionario{
    private String departamento;

    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
        this.departamento = "Gerente";
    }
    @Override
    public static void exibirInformacoes(String nome, int idade, double salario){
        super.exibirInformacoes();

        System.out.println("Departamento: " + depart);
    }

}
