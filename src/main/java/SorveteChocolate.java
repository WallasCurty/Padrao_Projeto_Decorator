public class SorveteChocolate extends SorveteDecorator{
    public SorveteChocolate(Sorvete sorvete){
        super(sorvete);
    }

    @Override
    public float getPreco() {
        return 10.0f;
    }

    public String getNomeIngrediente(){
        return "Chocolate";
    }
}
