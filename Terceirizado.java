public class Terceirizado extends Funcionario{
    private String fornecedor;
    private String cpf;

    public Terceirizado(String nome, Double cargaHoraria, String fornecedor, String cpf) {
        super(nome, cargaHoraria);
        this.fornecedor = fornecedor;
        this.cpf = cpf;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
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
        System.out.println("Nesse caso, faz mais sentido falar com o empregador, do que tratar com o senhor " + sobrenome);
    }

    @Override
    public void calculaSalario(Double cargaHoraria){
        Double salario = cargaHoraria * 10;
        setSalario(salario);
    }

}
