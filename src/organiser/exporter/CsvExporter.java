package organiser.exporter;
import organiser.model.Problem;
import java.util.*;
import java.io.*;

public class CsvExporter {
    public void exportCsv(List<Problem> problems,String fileName) throws IOException {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("File Name,Problem,Difficulty,Topic,Algorithm");
            bw.newLine();
            for (Problem problem : problems) {
                String line = problem.getFileName() + "," + "\"" + problem.getProblemName() + "\"" + "," + problem.getDifficulty() + "," + problem.getTopic() + "," + problem.getAlgorithm();
                bw.write(line);
                bw.newLine();
            }
        }
        System.out.println("Exported successfully to " + fileName);
    }
}