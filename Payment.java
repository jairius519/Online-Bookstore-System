public class Payment {
    private String cardType; // The card type (debit or credit)
    private String cardNetwork; //the card network(Visa, Mastercard, American Express, etc)

    public Payment(String cardType, String cardNetwork) {
        this.cardType = cardType;
        this. cardNetwork = cardNetwork;
    }

    //returns the card type
    public String getCardType() {
        return cardType;
    }

    //returns the card network
    public String getCardNetwork() {
        return cardNetwork;
    }
}
