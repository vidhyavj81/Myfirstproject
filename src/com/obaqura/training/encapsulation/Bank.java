package com.obaqura.training.encapsulation;

public class Bank {
private int pin;
public void validPin() {
	
	if(pin==1001||pin==1234||pin==1212) {
	System.out.println("PIN is valid");
	}
	else {
		System.out.println("PIN is not valid");
	}
	}




public int getPin() {
	return pin;
}

public void setPin(int pin) {
	this.pin = pin;
}

}
