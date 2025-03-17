package entities;

public abstract class Company extends TaxPayer {

    private int numberOfEmployess;

    public Company(String name, Double annualIncome, int numberOfEmployess) {
        super(name, annualIncome);
        this.numberOfEmployess = numberOfEmployess;
    }

    public int getNumberOfEmployess() {
        return numberOfEmployess;
    }

    public void setNumberOfEmployess(int numberOfEmployess) {
        this.numberOfEmployess = numberOfEmployess;
    }


    @Override
    public Double tax() {
        if(numberOfEmployess > 10) {
            return getAnnualIncome() * 0.14;
        }
        else {
            return getAnnualIncome() * 0.16;
        }
    }

}
