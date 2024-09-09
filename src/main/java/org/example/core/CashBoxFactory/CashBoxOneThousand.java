package org.example.core.CashBoxFactory;

import org.example.core.BanknoteDenomination;

public class CashBoxOneThousand extends CashBoxAbstract  {
    protected CashBoxOneThousand(int banknoteLimit, int banknoteCount) {
        super(banknoteLimit, banknoteCount);
    }

    @Override
    public BanknoteDenomination getDenomination() {
        return BanknoteDenomination.ONE_THOUSAND;
    }
}
