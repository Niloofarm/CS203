public calss phrase-o-matic { 
	public static void meain ( String[] args ) {
		String[] wordsOne = {"happy", "dance", "music", "smile", "change", "TM"};
		
		String[] wordsTwo = {"Food", "Cold"};
		
		String[] wordsThree = {"Global", "challenge", "Solutions", "climate" };
		
		int onelength = wordsOne.length;
		int twolength = wordsTwo.length;
		int threelength = words.Three.length;
		
		int rand1 = (int) (Math.random() * onelength);
		int rand2 = (int) (Math.random() * twolength);
		int rand3 = (int) (Math.random() * threelength);
		
		String Phrase = wordsOne[rand1] + " " + wordsTwo[rand2] + " " + wordsThree[rand3];
		
		System.out.println("what I need is a phrase" + Phrase);
	}
}