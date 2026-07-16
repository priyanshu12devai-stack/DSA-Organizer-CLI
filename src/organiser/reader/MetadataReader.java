package organiser.reader;

import organiser.model.Problem;

import java.io.*;

public class MetadataReader {
    public Problem readMetadata(File file) {
        Problem problem = new Problem();
        problem.setFileName(file.getName());
        // this method in java automatically closes the file and also helps to manage exception error , while in other case we have to manually close the file
        try (
                BufferedReader br = new BufferedReader(new FileReader(file))// new FileReader(file) it is the shortcut for opening the file to read, instead of making the object of FileReader
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("@")) {
                    String[] parts = line.split("=");
                    String key = parts[0].trim();
                    String value = parts[1].trim();
//                    System.out.println(key + "->" + value);
                    switch (key) {
                        case "@Problem":
                            problem.setProblemName(value);
                            break;
                        case "@Algorithm":
                            problem.setAlgorithm(value);
                            break;
                        case "@Topic":
                            problem.setTopic(value);
                            break;
                        case "@Difficulty":
                            problem.setDifficulty(value);
                            break;
                        case "@Problem_num":
                            problem.setProblemNumber(value);
                            break;
                        case "@Link":
                            break;
                        case "@Time":
                            break;


                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return problem;
    }
}
