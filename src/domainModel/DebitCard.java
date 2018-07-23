package domainModel;

import java.util.Date;

public class DebitCard extends PaymentMethod {

    private Integer number;
    private Date expDate;
    private Issuer issuer;

    public DebitCard(Integer number, Date expDate, Issuer issuer) {

        this.number = number;
        this.expDate = expDate;
        this.issuer = issuer;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }

    public Integer getNumber() {

        return number;
    }

    public Date getExpDate() {
        return expDate;
    }

    public Issuer getIssuer() {
        return issuer;
    }

    @Override
    public void authorize(){
        System.out.println("payment Authorized");
    }

}
