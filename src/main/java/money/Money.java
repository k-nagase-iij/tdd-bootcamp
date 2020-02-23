package money;

class Money {
    protected int amount;
    protected String currency;
    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }
    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
    String currency() {
        return currency;
    }
    static Money doller(int amount) {
        return new Money(amount, "USD");
    }
    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && currency().equals(money.currency());
    }
    public String toString() {
        return amount + " " + currency;
    }
}
