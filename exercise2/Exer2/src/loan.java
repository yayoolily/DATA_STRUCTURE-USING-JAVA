import java.util.Date;

public class loan {
    private double annual_interest_rate;
    private int number_of_year;
    private double loanAmount;
    private Date loanDate;

    //No_Arg
    public loan(){
        annual_interest_rate=2.5;
        number_of_year=1;
        loanAmount=1000;
        loanDate=new Date();
    }
    // parameterized

    public loan(double annual_interest_rate,int number_of_year,double loanAmount){
        this.annual_interest_rate=annual_interest_rate;
        this.number_of_year=number_of_year;
        this.loanAmount=loanAmount;
        loanDate=new Date();
    }
    //Getters


    public double getAnnual_interest_rate() {
        return annual_interest_rate;
    }

    public int getNumber_of_year() {
        return number_of_year;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    //setters

    public void setAnnual_interest_rate(double annual_interest_rate) {
        this.annual_interest_rate = annual_interest_rate;
    }

    public void setNumber_of_year(int number_of_year) {
        this.number_of_year = number_of_year;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    //Calculations
    public double getMonthlyPayment(){
        double monthlyInterest=annual_interest_rate/1200;
        int numberOfPayment=number_of_year*12;

        return loanAmount*monthlyInterest/(1-Math.pow(1+monthlyInterest,-numberOfPayment));
    }

    public double getTotalPayment(){
        return getMonthlyPayment()*number_of_year*12;
    }
}

 class TestLoan {
    public static void main(String[] args){
        loan myloan=new loan();

        System.out.println("loan amount:   "+ myloan.getLoanAmount());
        System.out.println("Monthly Payment : "+String.format("%.2f",myloan.getMonthlyPayment()));
        System.out.println("Total Payment :   "+String.format("%.2f",myloan.getTotalPayment()));
        System.out.println("loanDate : "+myloan.getLoanDate());
    }
}
