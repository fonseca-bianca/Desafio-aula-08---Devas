public class CLT extends Funcionario{
    private String cpf;

    public CLT(String nome, Double cargaHoraria, String cpf) {
        super(nome, cargaHoraria);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void retornaSobrenome(String nome) {
        String sobrenome = nome.split(" ")[nome.split(" ").length - 1];
        System.out.println("Caro senhor " + sobrenome);
    }

    @Override
    public void calculaSalario(Double cargaHoraria){
        Double salario = cargaHoraria * 50;
        setSalario(salario);
    }
    public Double calculaComissao(Double salario, int bonificacao) {
        Double comissao = salario * bonificacao;
        return comissao;
    }

    public Double calculaComissao(Double salario, double bonificacao) {
        Double comissao = salario * bonificacao;
        return comissao;
    }
}
