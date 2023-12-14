public abstract class Funcionario {
    private Double salario;
    private String nome;
    private Double cargaHoraria;

    public Funcionario(String nome, Double cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        calculaSalario(cargaHoraria);
    }

    public abstract void retornaSobrenome(String nome);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public abstract void calculaSalario(Double cargaHoraria);
}
