package c_strategy;

public class Disciplina {
	
	float p1;
    float p2;
    float media;
    String situacao;
    String nome;
    ICalcMedia calculo;
    IMudaSituacao ajuste;

    public float getP1() {
        return p1;
    }

    public void setP1(float p1) {
        this.p1 = p1;
    }

    public float getP2() {
        return p2;
    }

    public void setP2(float p2) {
        this.p2 = p2;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getMedia() {
        return media;
    }

    public void setCalculo(ICalcMedia calculo) {
        this.calculo = calculo;
    }

    public void setAjuste(IMudaSituacao ajuste) {
        this.ajuste = ajuste;
    }

    public Disciplina()
    {

    }

    public Disciplina(ICalcMedia calculo ,IMudaSituacao ajuste)
    {
        this.ajuste = ajuste;
        this.calculo = calculo;
    }

}
