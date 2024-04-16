package ro.ase.cts.Facade_HR;

public class FinancialSystemFacade {
    private AccountingSystem accounting;
    private PayRollSystem payroll;
    private  InvestmentSystem investment;

    FinancialSystemFacade(AccountingSystem accounting, PayRollSystem payroll, InvestmentSystem investment){
        this.accounting=accounting;
        this.payroll=payroll;
        this.investment=investment;
    }

    void processSalaryPayments(){
        payroll.calculatePay();
        accounting.updateLadger(payroll);
    }

    void manageInvestments(){
        double funds=accounting.availableFunds();
        investment.investFunds(funds);
    }
}

