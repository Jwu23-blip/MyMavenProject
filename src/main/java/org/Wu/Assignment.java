package org.Wu;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Random;

@Setter
@Getter
@ToString
public class Assignment {

    private static int nextId = 1;

    private String assignmentId;
    private String assignmentName;
    private double weight;
    private ArrayList<Integer> scores;

    public Assignment(String assignmentId, String assignmentName, ArrayList<Integer> scores, double weight) {
        this.assignmentId = "A" + nextId++;
        this.assignmentName = assignmentName;
        this.scores = new ArrayList<>();
        this.weight = weight;
    }

    public void generateRandomScore() {
        Random random = new Random();

        for (int i = 0; i < scores.size(); i++) {
            int n = random.nextInt(11);
            int score;

            if (n == 0) score = random.nextInt(60)
        }
    }
}
