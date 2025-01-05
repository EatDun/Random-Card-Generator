class Main {
    public static void main(String[] args) {
        int cardVal = Card.generateVal();
        String cardSuit = Card.generateSuit();
        String cardName = Card.generateName(cardVal);

        Card card = new Card(cardVal, cardSuit, cardName);
        
        System.out.println(card.cardName + " of " + card.cardSuit);
    }
}
