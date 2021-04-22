package Aps;

public class Eletrodomestico {
    private double potencia;
    private double tempo;
    private double consumo;
    private double gastos;

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    
     double calculo_consumo()
    {
        this.consumo = ((this.getPotencia() / 1000) * this.getTempo()) * 30;//((Potência do Produto/1000) * HorasDiáriasUtilizadas) * Dias em um mês = Consumo em kWh / mês
        return getConsumo();
    }
     double calculo_gastos()
     {         
        this.setGastos(calculo_consumo() * 0.31);//Consumo * Preço de 1kWh          
        return this.getGastos();
     }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
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
