package ro.ase.cts.Facade_HR;

public class Main_Example2 {
    public static void main(String[] args){
        FinancialSystemFacade financialSystem= new FinancialSystemFacade(new AccountingSystem(), new PayRollSystem(), new InvestmentSystem());
        financialSystem.processSalaryPayments();
        financialSystem.manageInvestments();
    }
}
