public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Francisco", 30, "123.456.789-00");
        System.out.println("=== Pessoa ===");
        p.mostrarDados();

        p.setNome("Francisco Silva");
        p.setIdade(31);
        System.out.println("\nDados atualizados:");
        p.mostrarDados();

        Funcionario f = new Funcionario("Amanda", 19, "987.654.321-00",
                "Analista", "01/01/2022", 4000);
        System.out.println("\n=== Funcionário ===");
        f.mostrarDados();
        System.out.println("Salário Anual: " + f.calcularSalarioAnual());
        f.receberAumento(10);

        Gerente g = new Gerente("Neymar", 33, "111.222.333-44",
                "Gerente de Projetos", "10/05/2020", 8000,
                5, 20000);
        System.out.println("\n=== Gerente ===");
        g.mostrarDados();
        System.out.println("Salário com Bônus: " + g.calcularSalarioComBonus());
        g.gerenciarEquipe();
    }
}
