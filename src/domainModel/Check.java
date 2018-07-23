package domainModel;

public class Check extends PaymentMethod {

    private Integer number;
    private Integer bankld;
    private String holder;

    public Check(Integer number, Integer bankld, String holder) {
        this.number = number;
        this.bankld = bankld;
        this.holder = holder;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getBankld() {
        return bankld;
    }

    public String getHolder() {
        return holder;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setBankld(Integer bankld) {
        this.bankld = bankld;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    @Override
    public void authorize(){
        System.out.println("payment Authorized");
    }
}
