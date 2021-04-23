package Aps;

public class Agua {
    private double tempo;
    private double consumo;
    private double gastos;
    
    double calculo()
    {
        this.consumo = (this.tempo * 16) * 30 ;//(Tempo de uso diário * Qntd de Litros/minuto) * Qntd de Dias
        return getConsumo();
    }
    
    double gastos()
    {
        this.gastos = calculo() * 0.005;//Resultado do consumo * Preço do Litro de Agua
        
        return getGastos();
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
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
