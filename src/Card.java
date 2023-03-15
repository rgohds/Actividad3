public class Card {
    public EnumPalo Palo;
    public EnumColor Color;
    public EnumValor Valor;

    public Card (EnumPalo PaloParam, EnumColor ColorParam, EnumValor ValorParam)
    {
        this.Palo = PaloParam;
        this.Color = ColorParam;
        this.Valor = ValorParam;
    }
}
