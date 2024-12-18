package Service;

import Dao.PatientDao;
import Entity.Account;

import java.math.BigDecimal;
import java.util.Map;

public class HospitalService {

    private PatientDao dao;

    private Account account;

    public HospitalService() {
        this.dao = new PatientDao();
    }

    public void createAccount(String name, BigDecimal amount){
        Account account = new Account(name, amount);
        dao.getAccountMap().put(account.getAccountNumber(), account);
        System.out.println("Account created for user " + name + " with accountNo. " + account.getAccountNumber());
    }

    public void updateFeesStatus(Integer accNumber, String update){
        /*
        This method only updates the status of the patient account with
        Paid and Unpaid
         */

        dao.getAccountMap().get(accNumber).setFeesPaid(update);
    }

    public void overview(){
        for (int accNum: dao.getAccountMap().keySet()){
            System.out.println("Details of the patient account "+ accNum);
            System.out.println(dao.getAccountMap().get(accNum).getUser().toString());
            System.out.println(dao.getAccountMap().get(accNum).getFees().toString());
            System.out.println(dao.getAccountMap().get(accNum).getFeesPaid().toString());
        }
    }
}
