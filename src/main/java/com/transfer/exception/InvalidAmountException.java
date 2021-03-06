package com.transfer.exception;

import java.math.BigDecimal;

public class InvalidAmountException extends GenericException {
    public InvalidAmountException(BigDecimal amount) {
	super("Invalid amount value:" + amount);
    }
}
