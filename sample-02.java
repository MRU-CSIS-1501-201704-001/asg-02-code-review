final int SET_SASHIMI = 3;
final int SASHIMI_POINTS = 10;
int setSashimi = sashimis / SET_SASHIMI;
int scoreSashimi = setSashimi * SASHIMI_POINTS;
//Triangle sequence used for dumpling score
//The dumpling score cap is 15 so I need to take the Math.min score of 15
//To avoid evil magic numbers for dumpling score I had to make final int variables
final int CAP_SCORE = 15;
final int WIDE_VARIABLE = 1;
final int HALF_RECTANGLE = 2;

int scoreDumplingprocess = dumplings * (dumplings + WIDE_VARIABLE) 
/ HALF_RECTANGLE;
int scoreDumpling = Math.min(scoreDumplingprocess,CAP_SCORE);

final int SQUID_POINTS = 3;
int scoreSquid = squidNigiri * SQUID_POINTS;

final int SALMON_POINTS = 2;
int scoreSalmon = salmonNigiri * SALMON_POINTS;

final int EGG_POINTS = 1;
int scoreEgg = eggNigiri * EGG_POINTS;

int userScore = scoreTempura + scoreSashimi + scoreDumpling + scoreSquid + scoreSalmon + scoreEgg;

int totalNigiri = scoreSquid + scoreSalmon + scoreEgg;