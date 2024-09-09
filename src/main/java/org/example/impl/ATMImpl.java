package org.example.impl;

import org.example.core.ATM;
import org.example.core.BanknoteDenomination;

import java.util.Map;

public class ATMImpl implements ATM {
    private final BanknotesStorage banknotesStorage;
    public ATMImpl(BanknotesStorage banknotesStorage){

        this.banknotesStorage = banknotesStorage;
    }

    @Override
    public int cashBalanceInATM() {
        return banknotesStorage.cashBalance();
    }

    @Override
    public Map<BanknoteDenomination, Integer> withdrawCashFromATM(int sumOfRequestedCash) {
        return banknotesStorage.withdrawCash(sumOfRequestedCash);
    }

    @Override
    public void putCashInATM(Map<BanknoteDenomination, Integer> someSumOfBanknotes) {
        banknotesStorage.putCash(someSumOfBanknotes);
    }
}
