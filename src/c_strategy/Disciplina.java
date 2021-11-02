package c_strategy;

import java.util.Scanner;

public class Disciplina {
	
	public float p1;
    public float p2;
    private double media;
	private String situacao;
    ICalcMedia calculo;
    IMudaSituacao ajuste;
    
    Scanner entrada = new Scanner(System.in);
    
    public void Notas() {
		System.out.println("\nP1: ");
		this.p1 = entrada.nextFloat();
		System.out.println("P2: ");
		this.p2 = entrada.nextFloat();
	}
    
    public void Media() {
    	System.out.printf("Sua media é: %d e você foi %s",
    			this.media, this.situacao);
    }

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

    public void setMedia(double d) {
		this.media = d;
	}
    
    public double getMedia() {
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
