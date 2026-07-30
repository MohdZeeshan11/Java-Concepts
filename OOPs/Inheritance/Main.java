

public class Main {
    public static void main(String[] args) {

        HomeLoan homeLoan = new HomeLoan();
        homeLoan.loanApproved(); // Output: Loan Approved

    }
}


class Loan{

    public void loanApproved(){
        System.out.println("Loan Approved");
    }

    public void loanRejected(){
        System.out.println("Loan Rejected");
    }
}

class HomeLoan extends Loan{

}

class PersonalLoan extends Loan{

}