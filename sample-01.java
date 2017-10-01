System.out.println("Now enter the number of tempura cards");
int tempura = keyboard.nextInt();
System.out.println("Now the number of sashimi cards");
int sashimi = keyboard.nextInt();
System.out.println("And finally the number of dumpling cards");
int dumpling = keyboard.nextInt();    

nigiriSquid *= 3;
nigiriSalmon *= 2;
nigiriEgg *= 1;

int nigiriTotal = nigiriSquid + nigiriSalmon + nigiriEgg;

tempura = (int)(tempura/2) * 5;
sashimi = (int)(sashimi/3) * 5;
dumpling = (int)(dumpling * (dumpling+1)) / 2; 
dumpling = Math.min(15, dumpling);
int totalScore = tempura + sashimi + dumpling + nigiriTotal;
