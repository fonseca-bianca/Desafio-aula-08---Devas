public class PJ extends Funcionario{
    private String cnpj;

    public PJ(String nome, Double cargaHoraria, String cnpj) {
        super(nome, cargaHoraria);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public void retornaSobrenome(String nome) {
        String sobrenome = nome.split(" ")[nome.split(" ").length - 1];
        System.out.println("Nesse caso, faz mais sentido falar com o empregador, do que tratar com o senhor " + sobrenome);
    }

    @Override
    public void calculaSalario(Double cargaHoraria){
        Double salario = cargaHoraria * 25;
        setSalario(salario);
    }
}
