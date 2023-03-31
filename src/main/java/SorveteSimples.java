public class SorveteSimples implements Sorvete{
    public SorveteSimples(Sorvete sorvete) {
        super();
    }

    public float getPrecoSorvete() {
        return 20.0f;
    }

    public String getNomeIngrediente() {
        return "Sorvete";
    }

    @Override
    public float getPreco() {
        return 0;
    }

    @Override
    public String getIngrediente() {
        return null;
    }
}
