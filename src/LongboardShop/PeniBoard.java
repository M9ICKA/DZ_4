package LongboardShop;

public class PeniBoard implements Board {

    protected String manufacturer;
    protected String typeDeck;
    protected String materialsDecks;
    protected String trucks;
    String boardInfo;
    public PeniBoard(String manufacturer, String typeDeck, String materialsDecks, String trucks) {
        this.manufacturer = manufacturer;
        this.typeDeck = typeDeck;
        this.materialsDecks = materialsDecks;
        this.trucks = trucks;
    }
    public String getBoardInfo() {
        return boardInfo  = ("\nmanufacturer - " + manufacturer + "\ntype deck - " + typeDeck +
                "\nmaterials decks - " + materialsDecks  + "\ntrucks - " + trucks);
    }

}
