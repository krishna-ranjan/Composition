package com.vincii.composition;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimension dimension = new Dimension(20,20,5);
        Case theCase = new Case("220B","Dell","240",dimension);

        Monitor theMonitor = new Monitor("27inch beast","acer",27,new Resolution(2540,1440));

        MotherBoard theMotherBoard = new MotherBoard("SK -500","Asus",4,6,"2,44");
        PC thePC = new PC(theCase,theMonitor,theMotherBoard);
        thePC.getMonitor().drawPixelAt(30,30,"red-");
        thePC.getMotherBoard().loadProgress("Ubuntu");
        thePC.getTheCase().pressPowerButton();
    }
}
