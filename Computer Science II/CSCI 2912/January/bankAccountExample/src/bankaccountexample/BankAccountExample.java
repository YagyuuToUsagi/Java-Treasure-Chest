package bankaccountexample;

public class BankAccountExample {

    public static void main(String[] args) {
        bankAccount aAccount=
                new bankAccount(100.00, new PersonalInfo("John", "abcd"));
        bankAccount bAccount=
                new bankAccount(aAccount.getBalance(), aAccount.getPersonalInfoDeepCopy());//Makes a copy of first account using the classes
        
        bAccount.setBalance(20.00);
        bAccount.getPersonalInfoReferenceCopy().setUserName("Alice"); //Gets personal info from bank account b and sets new username
        bAccount.getPersonalInfoReferenceCopy().setPassword("5678"); //Gets personal info from bank account b and sets new password
        
        System.out.println("The Balance: "+aAccount.getBalance());
        System.out.println("The Personal Username: "+aAccount.getPersonalInfoReferenceCopy().getUsername());
        System.out.println("The Personal Password: "+aAccount.getPersonalInfoReferenceCopy().getPassword());

        
    }
    
}
