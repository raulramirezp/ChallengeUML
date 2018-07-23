package domainModel;

import java.util.Date;

public class CreditCard extends PaymentMethod {

    private Double number;
    private Date expDate;
    private Integer maxInstallements;
    private Issuer issuer;

    public CreditCard(Double number, Date expDate, Integer maxInstallements, Issuer issuer) {
        this.number = number;
        this.expDate = expDate;
        this.maxInstallements = maxInstallements;
        this.issuer = issuer;
    }

    public void setNumber(Double number) {
        this.number = number;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public void setMaxInstallements(Integer maxInstallements) {
        this.maxInstallements = maxInstallements;
    }

    public void setIssuer(Issuer issuer) {
        this.issuer = issuer;
    }

    public Double getNumber() {

        return number;
    }

    public Date getExpDate() {
        return expDate;
    }

    public Integer getMaxInstallements() {
        return maxInstallements;
    }

    public Issuer getIssuer() {
        return issuer;
    }

    @Override
    public void authorize(){
        System.out.println("payment Authorized");
    }
}
