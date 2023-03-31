public abstract class SorveteDecorator implements Sorvete{

    private Sorvete sorvete;
    public String ingrediente;

    public SorveteDecorator(Sorvete sorvete){
        this.sorvete = sorvete;
    }

    public Sorvete getSorvete() {
        return sorvete;
    }

    public void setSorvete(Sorvete sorvete) {
        this.sorvete = sorvete;
    }

    public abstract float getPrecoSorvete();

    public float getPrecoPorIngrediente(){
        return this.sorvete.getPreco() + (1 + this.getPrecoSorvete());
    }

    public abstract String getNomeSorvete();

    public String getIngrediente() {
        return this.sorvete.getIngrediente() + "/" + this.getNomeSorvete();
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }

}
