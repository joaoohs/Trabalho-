public class Gerente extends Funcionario {
    private int equipe;
    private double bonus;

    public Gerente(String nome, int idade, String cpf,
                   String cargo, String dataAdmissao, double salario,
                   int equipe, double bonus) {
        super(nome, idade, cpf, cargo, dataAdmissao, salario);
        this.equipe = equipe;
        this.bonus = bonus;
    }

    public int getEquipe() {
        return equip;
    }

    public double getBonus() {
        return bonus;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void mostrarDados() {
        super.mostrarDados();
        System.out.println("Equipe: " + equipe + " pessoas");
        System.out.println("Bônus: " + bonus);
    }

    public double calcularSalarioComBonus() {
        return calcularSalarioAnual() + bonus;
    }

    public void gerenciarEquipe() {
        System.out.println("Gerenciando equipe de " + equipe + " funcionários...");
    }
}
