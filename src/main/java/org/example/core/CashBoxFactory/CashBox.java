package org.example.core.CashBoxFactory;

import org.example.core.BanknoteDenomination;

public interface CashBox extends Comparable<CashBox> {
    BanknoteDenomination getDenomination();

    int getBanknoteLimit();

    int getBalance();

    void putCash(int banknote);

    int getCash(int banknote);

    int compareTo(CashBox cashBox);
}
