public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    // metodo construtor
   public Funcionario(String nome, int idade, double salario) {
       this.nome = nome;
       this.idade = idade;
       this.salario = salario;
   }

   //metodo para exibir os detalhes dos funcionarios
   public static void exibirInformacoes(String nome, int idade, double salario) {
       System.out.println("Nome: " + nome);
       System.out.printf("Idade: %d\n", idade);
       System.out.printf("Salario: %.2f\n", salario);
   }

}
