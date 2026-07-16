package organiser.menu;

import organiser.model.Problem;
import organiser.service.ProblemService;
import organiser.exporter.CsvExporter;
import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private final ProblemService problemService;
    private final Scanner sc = new Scanner(System.in);
    private final CsvExporter  exporter = new CsvExporter();
    public Menu(ProblemService problemService){
        this.problemService = problemService;
    }

    public void printMenu() {
        System.out.println("========= DSA ORGANIZER =========");
        System.out.println();
        System.out.println("1. Show All Problems");
        System.out.println("2. Search");
        System.out.println("3. Sort");
        System.out.println("4. Statistics");
        System.out.println("5. Topic Statistics");
        System.out.println("6. Export CSV");
        System.out.println("7. Exit");
        System.out.println();
    }

    public void start() {


            while (true) {
                try{
                printMenu();
                System.out.println("Enter choice in number: ");
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {
                    case 1:
                        problemService.printAlldata(problemService.getAllProblems());
                        break;
                    case 2:
                        problemService.search();
                        break;
                    case 3:
                        problemService.sort();
                    case 4:
                        problemService.showStatistics();
                        break;
                    case 5:
                        problemService.showTopicStatistics();
                        break;
                    case 6:
                        System.out.print("Enter the file name for the report (leave blank to use 'DSA_report.csv'): ");
                        String fileName = sc.nextLine().trim();

                        // 1. Determine the final file name first
                        if (fileName.isEmpty()) {
                            fileName = "DSA_report.csv";
                        } else if (!fileName.endsWith(".csv")) {
                            fileName += ".csv"; // Automatically add .csv if the user forgot it
                        }
                        exporter.exportCsv(problemService.getAllProblems(),fileName);

                        System.out.println("CSV exported successfully");
                        break;
                    case 7:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid choice. Enter again!");
                        break;
                }
            }
                catch (NumberFormatException e) {
                    System.out.println("Invalid input! Please enter a number.");

                }
                catch(IOException e){
                    System.out.println("Failed to export CSV!");
                }

            }


    }


}



