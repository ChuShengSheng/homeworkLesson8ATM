package org.example.core.CashBoxFactory;

import org.example.core.BanknoteDenomination;

public class CashBoxTwoHundred extends CashBoxAbstract {
    protected CashBoxTwoHundred(int banknoteLimit, int banknoteCount) {
        super(banknoteLimit, banknoteCount);
    }

    @Override
    public BanknoteDenomination getDenomination() {
        return BanknoteDenomination.TWO_HUNDRED;
    }
}
