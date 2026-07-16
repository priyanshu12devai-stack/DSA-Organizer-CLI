package organiser.service;
import java.util.function.Predicate;
import organiser.model.Problem;

import java.util.*;

public class ProblemService {
    private final List<Problem> problems;
    private final Scanner sc = new Scanner(System.in);
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
//    public void searchByTopic(String topic){
//        System.out.println("===========================================================================================================");
//        System.out.printf("%-5s %-20s %-12s %-12s %-20s %-20s%n", "No.", "File Name", "Difficulty", "Topic", "Algorithm", "Problem");
//        System.out.println("===========================================================================================================");
//        for (int i = 0; i < problems.size(); i++) {
//            Problem problem = problems.get(i);
//            if (problem.getTopic()!=null && problem.getTopic().toLowerCase().contains(topic.toLowerCase())) {
//                System.out.printf("%-5d %-20s %-12s %-12s %-20s %-20s%n", i + 1, problem.getFileName(), problem.getDifficulty(), problem.getTopic(), problem.getAlgorithm(), problem.getProblemName());
//            }
//        }
//        System.out.println("===========================================================================================================");
//        System.out.println();
//    }
//
//    public void searchByDifficulty(String difficulty) {
//        System.out.println("===========================================================================================================");
//        System.out.printf("%-5s %-20s %-12s %-12s %-20s %-20s%n", "No.", "File Name", "Difficulty", "Topic", "Algorithm", "Problem");
//        System.out.println("===========================================================================================================");
//        for (int i = 0; i < problems.size(); i++) {
//            Problem problem = problems.get(i);
//            if (problem.getDifficulty() != null && problem.getDifficulty().toLowerCase().contains(difficulty)) {
//                System.out.printf("%-5d %-20s %-12s %-12s %-20s %-20s%n", i + 1, problem.getFileName(), problem.getDifficulty(), problem.getTopic(), problem.getAlgorithm(), problem.getProblemName());
//            }
//        }
//        System.out.println("===========================================================================================================");
//        System.out.println();
//    }
//
//
//    public void searchByAlgorithm(String Algorithm) {
//        System.out.println("===========================================================================================================");
//        System.out.printf("%-5s %-20s %-12s %-12s %-20s %-20s%n", "No.", "File Name", "Difficulty", "Topic", "Algorithm", "Problem");
//        System.out.println("===========================================================================================================");
//        for (int i = 0; i < problems.size(); i++) {
//            Problem problem = problems.get(i);
//            if (problem.getAlgorithm() != null && problem.getAlgorithm().toLowerCase().contains(Algorithm)) {
//                System.out.printf("%-5d %-20s %-12s %-12s %-20s %-20s%n", i + 1, problem.getFileName(), problem.getDifficulty(), problem.getTopic(), problem.getAlgorithm(), problem.getProblemName());
//            }
//        }
//        System.out.println("===========================================================================================================");
//        getSize();
//        System.out.println("===========================================================================================================");
//        System.out.println();
//    }

    public void search() {
        while (true) {
            System.out.println("=========== SEARCH ===========");
            System.out.println("1. Search by Topic");
            System.out.println("2. Search by Difficulty");
            System.out.println("3. Search by Algorithm");
            System.out.println("4. Search by Problem Name");
            System.out.println("5. Back");
            System.out.println("==============================");
            try {
                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Enter Topic:");
                        String topic = sc.nextLine().toLowerCase();
                        executeSearch(p -> p.getTopic() != null && p.getTopic().toLowerCase().contains(topic), false);
                        break;
                    case 2:
                        System.out.println("Enter Difficulty:");
                        String difficulty = sc.nextLine().toLowerCase();
                        executeSearch(p -> p.getDifficulty() != null && p.getDifficulty().toLowerCase().contains(difficulty), false);
                        break;
                    case 3:
                        System.out.println("Enter Algorithm:");
                        String algorithm = sc.nextLine().toLowerCase();
                        // Notice 'true' is passed here to trigger getSize() just like your original code
                        executeSearch(p -> p.getAlgorithm() != null && p.getAlgorithm().toLowerCase().contains(algorithm), true);
                        break;
                    case 4:
                        System.out.println("Enter Problem Name:");
                        String name= sc.nextLine().toLowerCase();
                        executeSearch(p -> p.getProblemName()!=null && p.getProblemName().toLowerCase().contains(name), false);
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Invalid choice. Enter again!");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input! Please enter a number.");
            }
        }
    }

    // 2. The combined helper method that does the actual printing
    private void executeSearch(Predicate<Problem> condition, boolean printSize) {
        System.out.println("===========================================================================================================");
        System.out.printf("%-5s %-20s %-12s %-12s %-20s %-20s%n", "No.", "File Name", "Difficulty", "Topic", "Algorithm", "Problem");
        System.out.println("===========================================================================================================");

        for (int i = 0; i < problems.size(); i++) {
            Problem problem = problems.get(i);
            // This tests the problem against whichever rule was passed from the switch statement
            if (condition.test(problem)) {
                System.out.printf("%-5d %-20s %-12s %-12s %-20s %-20s%n",
                        i + 1, problem.getFileName(), problem.getDifficulty(),
                        problem.getTopic(), problem.getAlgorithm(), problem.getProblemName());
            }
        }

        System.out.println("===========================================================================================================");

        // Handles the getSize() logic you originally had only in searchByAlgorithm
        if (printSize) {
            getSize();
            System.out.println("===========================================================================================================");
        }
        System.out.println();
    }



    public void sort() {
        while (true) {
            System.out.println("=========== SORT ===========");
            System.out.println("1. Sort by Topic");
            System.out.println("2. Sort by Difficulty");
            System.out.println("3. Sort by Algorithm");
            System.out.println("4. Sort by Problem Name");
            System.out.println("5. Sort by Problem Number");
            System.out.println("6. Back");
            System.out.println("==============================");
            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        executeSort(Comparator.comparing(Problem::getTopic,Comparator.nullsLast(Comparator.naturalOrder())));
                        break;

                    case 2:
                        executeSort(Comparator.comparing(Problem::getDifficulty,Comparator.nullsLast(Comparator.naturalOrder())));
                        break;

                    case 3:
                        executeSort(Comparator.comparing(Problem::getAlgorithm,Comparator.nullsLast(Comparator.naturalOrder())));
                        break;

                    case 4:
                        executeSort(Comparator.comparing(Problem::getProblemName,Comparator.nullsLast(Comparator.naturalOrder())));
                        break;

                    case 5:
                        executeSort(Comparator.comparing(Problem::getProblemNumber,Comparator.nullsLast(Comparator.naturalOrder())));
                        break;
                    case 6:
                        return;

                    default:
                        System.out.println("Invalid choice. Enter again!");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid Input! Please enter a number.");
            }
        }
    }

    public void executeSort(Comparator<Problem> comparator){
        ArrayList<Problem> sortedList = new ArrayList<>(problems);
        sortedList.sort(comparator);
        printAlldata(sortedList);
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

    public void printAlldata(List<Problem> list) {
        System.out.println("===========================================================================================================");
        System.out.printf("%-5s %-20s %-12s %-12s %-20s %-20s%n", "No.", "File Name", "Difficulty", "Topic", "Algorithm", "Problem");
        System.out.println("===========================================================================================================");
        for (int i = 0; i < list.size(); i++) {

            System.out.printf("%-5d %-20s %-12s %-12s %-20s %-20s%n", i+1, list.get(i).getFileName(), list.get(i).getDifficulty(), list.get(i).getTopic(), list.get(i).getAlgorithm(), list.get(i).getProblemName());
        }
        System.out.println("===========================================================================================================");
        getSize();
        System.out.println("===========================================================================================================");
        System.out.println();
    }
}
