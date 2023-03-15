import java.util.ArrayList;
public class Deck {
    private ArrayList<Card> MiDeck;
    private ArrayList<Card> MiDeckShuffle;
    public Deck ()
    {
        MiDeck = new ArrayList<Card>();
        EnumPalo Palo[] = EnumPalo.values();
        EnumColor Color[] = EnumColor.values();
        EnumValor Valor[] = EnumValor.values();
        System.out.println("Creación del Deck:");
        for(EnumPalo liPalo: Palo) {
            for (EnumColor liColor: Color)
            {
                for (EnumValor liValor: Valor) {
                    Card card = new Card(liPalo,liColor,liValor);
                    MiDeck.add(card);
                    System.out.println(card.Palo + " " + card.Color + " " + card.Valor );
                }
            }
        }
        System.out.println(MiDeck.size());
    };
    public void shuffle()
    {
        System.out.println("Shuffle:");
        MiDeckShuffle = new ArrayList<Card>();
        int totalCartas = MiDeck.size();
        //System.out.println(totalCartas);
        for(int i=0;i<totalCartas;i++)
        {
            int index = (int) (Math.random() * MiDeck.size());
            Card card = MiDeck.get(index);
            MiDeckShuffle.add(card);
            System.out.println(card.Palo + " " + card.Color + " " + card.Valor );
            MiDeck.remove(index);
        }
        System.out.println("Se mezcló el Deck");
    }
    public void head()
    {
        int totalCartas;
        Card card = MiDeckShuffle.get(0);
        System.out.println("Head:" );
        System.out.println(card.Palo + " " + card.Color + " " + card.Valor );
        MiDeckShuffle.remove(0);
        totalCartas = MiDeckShuffle.size();
        System.out.println("Quedan " + totalCartas );
    }

    public void pick()
    {
        this.pick(true,true);
    }
    public void pick(boolean imprimirHead, boolean ImprimirTotal)
    {
        int totalCartas;
        int index = (int) (Math.random() * MiDeck.size());
        Card card = MiDeckShuffle.get(index);
        if(imprimirHead)
         {
             System.out.println("Pick:" );
         }
        System.out.println(card.Palo + " " + card.Color + " " + card.Valor );
        MiDeckShuffle.remove(index);
        totalCartas = MiDeckShuffle.size();
        if(ImprimirTotal)
        {
            System.out.println("Quedan " + totalCartas );
        }
    }

    public void hand()
    {
        System.out.println("hand:" );
        for (int x =1 ; x<=5 ; x++) {
            this.pick(false, x == 5);
        }
    }
}
