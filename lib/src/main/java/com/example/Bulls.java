package com.example;

public class Bulls {
    public static void main(String args[]){
        String[] players = {"Robin Lopez", "Jimmy Butler", "Taj Gibson", "Cristiano Felicio",
                "Dwyane Wade", "Rajon Rondo", "Nikola Mirotic", "Jerian Grant", "Doug McDermott",
                "Bobby Portis", "Denzel Valentine", "Isaiah Canaan", "Michael Carter-Williams",
                "Paul Zipser", "RJ Hunter", "Cameron Payne", "Joffrey Lauvergne", "Anthony Morrow"};
        double[] points = {10.0, 23.9, 11.6, 4.9, 19.1, 6.9, 9.2, 5.8, 10.2, 5.3, 3.9, 5.3, 8.1,
                4.3, 0.0, 5.3, 2.0, 0.0};
        double[] rebounds ={6.7, 6.2, 6.9, 5.0, 4.6, 5.0, 5.2, 1.6, 3.0, 3.7, 1.9, 1.4, 4.6, 2.3,
                0.3, 1.0, 1.0, 0.0};
        double[] fieldGoalPercentage = {48.6, 44.5, 52.1, 57.1, 43.7, 38.8, 38.8, 42.0, 44.5, 47.4,
                    35.2, 37.2, 38.9, 36.5, 0.0, 33.3, 50.0, 0.0};
        double total = 0;  // will hold total points
        double teamAverage = 0; //will hold team average points
        double shooter1Pct = 0; //top 3 point shooter
        double shooter2Pct = 0; // second 3 point shooter
        double shooter3Pct = 0; // third 3 point shooter
        int shooter1index = 0;
        int shooter2index = 0;
        int shooter3index = 0;
        double reboundAverage;




        //calculate average points

        for (int c = 0; c < points.length; c++){
            total += points[c];
            teamAverage = total/points.length;
        }
        System.out.format("The average points earned by team members is:  " + "%.3f"  + "\n", teamAverage);



        // bubble sort to get top 3 players
        for(int i = 0; i<fieldGoalPercentage.length; i++){
            if (fieldGoalPercentage[i] > shooter1Pct) {
                shooter1Pct = fieldGoalPercentage[i];
                shooter1index = i;
            }
            else if (fieldGoalPercentage[i] > shooter2Pct) {
                shooter2Pct = fieldGoalPercentage[i];
                shooter2index = i;
            }
            else if (fieldGoalPercentage[i] > shooter3Pct) {
                shooter3Pct = fieldGoalPercentage[i];
                shooter3index = i;
            }
        }
        System.out.println("The player with the highest 3 point field goal percentage is: " +
                players[shooter1index] + "with %" +  shooter1Pct);
        System.out.println("The player with the second highest 3 point field goal percentage is: " +
                players[shooter2index] + "with %" +  shooter2Pct );
        System.out.println("The player with the third highest 3 point field goal percentage is: " +
                players[shooter3index] + "with %" +  shooter3Pct);

        // calculate average rebounds for top 3point field goal players
        //System.out.println(rebounds[shooter1index]+ "  " + rebounds[shooter2index]+ "  " +  rebounds[shooter3index]);
        reboundAverage = ((rebounds[shooter1index] + rebounds[shooter2index] + rebounds[shooter3index]) /3);
        System.out.format("\nThe average amount of rebounds for the top three three point shooters is:  "
        + "%.1f", reboundAverage);


        System.out.println("\nUpdate your assignment. Derrick Rose no longer plays for the Bulls");
        System.out.println("he is with the New York Nicks now.");
    }


}

