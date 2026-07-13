package organiser.service;

import organiser.model.Problem;

import java.util.*;

public class ProblemService {
    private final List<Problem> problems;

    public ProblemService(List<Problem> problems) {
        this.problems = problems;//It doesn't create the list anymore. it recieves one. this is called constructor injection
    }

    public List<Problem> getAllProblems() {
        return problems;
    }

    public void getSize() {
        System.out.println("Total Problems: " + problems.size());
    }

    public void Total_Difficulty() {
        int easy = 0;
        int medium = 0;
        int hard = 0;
        for (Problem problem : problems) {
            if (problem.getDifficulty() != null) {
                if (problem.getDifficulty().equals("Easy")) {
                    easy++;
                } else if (problem.getDifficulty().equals("Medium")) {
                    medium++;
                } else if (problem.getDifficulty().equals("Hard")) {
                    hard++;
                }
            }
        }
        System.out.println("Easy: " + easy);
        System.out.println("Medium: " + medium);
        System.out.println("Hard: " + hard);
    }
    public void searchByTopic(String topic){

    }

    public void searchByDifficulty(String difficulty) {
        System.out.println("===========================================================================================================");
        System.out.printf("%-5s %-20s %-12s %-12s %-20s %-20s%n", "No.", "File Name", "Difficulty", "Topic", "Algorithm", "Problem");
        System.out.println("===========================================================================================================");
        for (int i = 0; i < problems.size(); i++) {
            Problem problem = problems.get(i);
            if (problem.getDifficulty() != null && problem.getDifficulty().toLowerCase().contains(difficulty)) {
                System.out.printf("%-5d %-20s %-12s %-12s %-20s %-20s%n", i + 1, problem.getFileName(), problem.getDifficulty(), problem.getTopic(), problem.getAlgorithm(), problem.getProblemName());
            }
        }
        System.out.println("===========================================================================================================");
        getSize();
        System.out.println("===========================================================================================================");
        System.out.println();
    }


    public void searchByAlgorithm(String Algorithm) {
        System.out.println("===========================================================================================================");
        System.out.printf("%-5s %-20s %-12s %-12s %-20s %-20s%n", "No.", "File Name", "Difficulty", "Topic", "Algorithm", "Problem");
        System.out.println("===========================================================================================================");
        for (int i = 0; i < problems.size(); i++) {
            Problem problem = problems.get(i);
            if (problem.getAlgorithm() != null && problem.getAlgorithm().toLowerCase().contains(Algorithm)) {
                System.out.printf("%-5d %-20s %-12s %-12s %-20s %-20s%n", i + 1, problem.getFileName(), problem.getDifficulty(), problem.getTopic(), problem.getAlgorithm(), problem.getProblemName());
            }
        }
        System.out.println("===========================================================================================================");
        getSize();
        System.out.println("===========================================================================================================");
        System.out.println();
    }


    public void showTopicStatistics() {
        HashMap<String, Integer> topiccount = new HashMap<>();
        for (Problem problems : problems) {
            String topic = problems.getTopic();

            topiccount.put(topic,
                    topiccount.getOrDefault(topic, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : topiccount.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }


    public void showStatistics() {
        System.out.println("=========== DSA DASHBOARD ===========");
        System.out.println();
        getSize();
        System.out.println();
        System.out.println("Difficulty");
        System.out.println("-----------------");
        Total_Difficulty();
        System.out.println();
        System.out.println("Topic's");
        System.out.println("-----------------");
        showTopicStatistics();
        System.out.println();
        System.out.println("====================================");

    }

    public void printAlldata() {
        System.out.println("===========================================================================================================");
        System.out.printf("%-5s %-20s %-12s %-12s %-20s %-20s%n", "No.", "File Name", "Difficulty", "Topic", "Algorithm", "Problem");
        System.out.println("===========================================================================================================");
        for (int i = 0; i < problems.size(); i++) {

            System.out.printf("%-5d %-20s %-12s %-12s %-20s %-20s%n", i + 1, problems.get(i).getFileName(), problems.get(i).getDifficulty(), problems.get(i).getTopic(), problems.get(i).getAlgorithm(), problems.get(i).getProblemName());
        }
        System.out.println("===========================================================================================================");
        getSize();
        System.out.println("===========================================================================================================");
        System.out.println();
    }
}
