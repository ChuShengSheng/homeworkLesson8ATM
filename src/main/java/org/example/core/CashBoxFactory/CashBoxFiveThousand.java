package org.example.core.CashBoxFactory;

import org.example.core.BanknoteDenomination;

public class CashBoxFiveThousand extends CashBoxAbstract {
    protected CashBoxFiveThousand(int banknoteLimit, int banknoteCount) {
        super(banknoteLimit, banknoteCount);
    }

    @Override
    public BanknoteDenomination getDenomination() {
        return BanknoteDenomination.FIVE_THOUSAND;
    }
}
