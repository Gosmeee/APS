package Aps;

public class Agua {
    private double tempo;
    private double consumo;
    
    double calculo()
    {
        this.consumo = (this.tempo * 60) * 16;
        return getConsumo();
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
}
