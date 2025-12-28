public class Card extends Payment {
    private String cardNum; //the 16-digit card number
    private int cvv; // the 3 or 4 digit number on the card
    private String holderName; //card holder's name
    private String expireDate; //expiration date

 public Card(String cardType, String cardNetwork,String cardNum, int cvv, String holderName, String expireDate) {
        super(cardType, cardNetwork);
        this.cardNum = cardNum;
        this.cvv = cvv;
        this.holderName = holderName;
        this.expireDate = expireDate;
    }

    //returns the card number 
    public String getCardNum() {
        return cardNum;
    }

    //returns the cvv number
    public int getCvv() {
        return cvv;
    }

    //returns the card holder's name
    public String getHolderName() {
        return holderName;
    }

    //returns the expiration date of the card
    public String getExpireDate() {
        return expireDate;
    }

    

    
    
}
