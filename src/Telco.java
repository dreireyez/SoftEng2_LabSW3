public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    // Constructor
    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    // Getters and Setters
    @Override
    public String getTelcoName() {
        return telcoName;
    }

    @Override
    public double getPromoPrice() {
        return promoPrice;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    @Override
    public boolean getUnliCallText() {
        return unliCallText;
    }

    public void setTelcoName(String telcoName) {
        this.telcoName = telcoName;
    }

    public void setPromoPrice(double promoPrice) {
        this.promoPrice = promoPrice;
    }

    public void setDataAllowance(int dataAllowance) {
        this.dataAllowance = dataAllowance;
    }

    public void setUnliCallText(boolean unliCallText) {
        this.unliCallText = unliCallText;
    }

    // Accepting Visitor Methods
    @Override               
    public String accept(UsagePromo promo, double price) {
        this.promoPrice = price;
        return promo.showAllowance(telcoName, price);
    }
    @Override
    public String accept(UnliCallOffer unliPackage, boolean unliCallText) {
        this.unliCallText = unliCallText;
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

}