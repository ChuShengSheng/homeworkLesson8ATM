package org.example;

import org.example.core.ATMException;
import org.example.core.BanknoteDenomination;
import org.example.core.CashBoxFactory.CashBox;
import org.example.core.CashBoxFactory.CashBoxFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestCashBoxes {
    @Test
    @DisplayName("Соответствие номинала ячейки номиналу банкноты")
    void BanknoteDenominationEqualsCashBoxDenominationTest() {
        Assertions.assertEquals(BanknoteDenomination.ONE_HUNDRED, CashBoxFactory.getCashBox(BanknoteDenomination.ONE_HUNDRED).getDenomination());
        Assertions.assertEquals(BanknoteDenomination.TWO_HUNDRED, CashBoxFactory.getCashBox(BanknoteDenomination.TWO_HUNDRED).getDenomination());
        Assertions.assertEquals(BanknoteDenomination.FIVE_HUNDRED, CashBoxFactory.getCashBox(BanknoteDenomination.FIVE_HUNDRED).getDenomination());
        Assertions.assertEquals(BanknoteDenomination.ONE_THOUSAND, CashBoxFactory.getCashBox(BanknoteDenomination.ONE_THOUSAND).getDenomination());
        Assertions.assertEquals(BanknoteDenomination.TWO_THOUSAND, CashBoxFactory.getCashBox(BanknoteDenomination.TWO_THOUSAND).getDenomination());
        Assertions.assertEquals(BanknoteDenomination.FIVE_THOUSAND, CashBoxFactory.getCashBox(BanknoteDenomination.FIVE_THOUSAND).getDenomination());
    }

    @Test
    @DisplayName("Проверка ячейки")
    void cashBoxTest() {
        CashBox cashBoxOneHundred = CashBoxFactory.getCashBox(BanknoteDenomination.ONE_HUNDRED);
        int cashBoxBanknoteLimit = cashBoxOneHundred.getBanknoteLimit();

        Assertions.assertEquals(0, cashBoxOneHundred.getBalance());

        cashBoxOneHundred.putCash(10);
        Assertions.assertEquals(1000, cashBoxOneHundred.getBalance());

        Assertions.assertThrows(ATMException.class, () -> cashBoxOneHundred.putCash(cashBoxBanknoteLimit + 1));

        cashBoxOneHundred.getCash(5);
        Assertions.assertEquals(500, cashBoxOneHundred.getBalance());

        Assertions.assertThrows(ATMException.class, () -> cashBoxOneHundred.getCash(cashBoxBanknoteLimit + 1));
    }
}
