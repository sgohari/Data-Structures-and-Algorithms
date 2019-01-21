package week02.lab;

public class MainTest {

	public static void main(String[] args) {


		CreditCard[] wallet=new CreditCard[3];
		wallet[0]=new CreditCard("Nasir","Toronto Saving","00000000000000",5000);
		wallet[1]=new CreditCard("Sepeher","Quebec Saving","10000000000000",6000);
		wallet[2]=new CreditCard("Manizha","Columbia Saving","20000000000000",7000);
		
		for(int val=1; val<=16;val++) {
			wallet[0].charge(3*val);
			wallet[1].charge(2*val);
			wallet[2].charge(val);
		}
		
		for(CreditCard card: wallet) {
			CreditCard.printSummary(card);
			while(card.getBalance()>100) {
				card.makePayment(1500);
				System.out.println("New Balance = "+card.getBalance());
			}
		}
	}

}
