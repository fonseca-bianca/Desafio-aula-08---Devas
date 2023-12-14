public final class Diretor extends CLT{
    private Double premiacao;

    public Diretor(String nome, Double cargaHoraria, String cpf, Double premiacao) {
        super(nome, cargaHoraria, cpf);
        this.premiacao = premiacao;
    }

    public Double getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(Double premiacao) {
        this.premiacao = premiacao;
    }


    public final void adicionarPremiacao(Double cargaHoraria){
        Double premiacao = cargaHoraria * 50;
        setPremiacao(premiacao);
    }
}
