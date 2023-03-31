public class SorveteBaunilha extends SorveteDecorator{
    public SorveteBaunilha(Sorvete sorvete){
        super(sorvete);
    }

    @Override
    public float getPreco() {
        return 15.0f;
    }

    public String getNomeIngrediente(){
        return "Baunilha";
    }
}
