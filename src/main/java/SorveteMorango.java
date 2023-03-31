public class SorveteMorango extends SorveteDecorator{
    public SorveteMorango(Sorvete sorvete){
        super(sorvete);
    }

    @Override
    public float getPreco() {
        return 7.0f;
    }

    public String getNomeIngrediente(){
        return "Morango";
    }
}
