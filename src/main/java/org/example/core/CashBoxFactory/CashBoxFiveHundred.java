package org.example.core.CashBoxFactory;

import org.example.core.BanknoteDenomination;

public class CashBoxFiveHundred extends CashBoxAbstract {
    protected CashBoxFiveHundred(int banknoteLimit, int banknoteCount) {
        super(banknoteLimit, banknoteCount);
    }

    @Override
    public BanknoteDenomination getDenomination() {
        return BanknoteDenomination.FIVE_HUNDRED;
    }
}
