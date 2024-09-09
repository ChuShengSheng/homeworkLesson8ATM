package org.example.core.CashBoxFactory;

import org.example.core.BanknoteDenomination;

public class CashBoxTwoThousand extends CashBoxAbstract {
    protected CashBoxTwoThousand(int banknoteLimit, int banknoteCount) {
        super(banknoteLimit, banknoteCount);
    }

    @Override
    public BanknoteDenomination getDenomination() {
        return BanknoteDenomination.TWO_THOUSAND;
    }
}
