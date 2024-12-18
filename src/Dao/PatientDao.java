package Dao;

import Entity.Account;

import java.util.HashMap;
import java.util.Map;

public class PatientDao {

    private Map<Integer, Account> accountMap;

    public PatientDao() {
        this.accountMap = new HashMap<>();
    }

    public Map<Integer, Account> getAccountMap() {
        return accountMap;
    }

    public void setAccountMap(Map<Integer, Account> accountMap) {
        this.accountMap = accountMap;
    }
}
