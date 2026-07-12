package organiser.scanner;

import organiser.model.Problem;
import organiser.reader.MetadataReader;

import java.io.*;
import java.util.ArrayList;

public class FolderScanner {

    public ArrayList<Problem> scanFolder() throws IOException {
//      System.out.println("Working Directory: " + System.getProperty("user.dir"));
        ArrayList<Problem> problems = new ArrayList<>();
        File folder = new File("DSA");
        MetadataReader metadataReader = new MetadataReader();
        File[] files = folder.listFiles();

        for (File currentFolder : files) {
            if (currentFolder.isDirectory()) {

                File[] innerFile = currentFolder.listFiles();

                if (innerFile == null) {
                    continue;
                }

                for (File infile : innerFile) {
                    if (infile.isFile()) {
                        Problem problem = metadataReader.readMetadata(infile);
                        problems.add(problem);
                    }
                }
            }
        }
        return problems;

    }
}


//        System.out.println("Absolute Path: " + folder.getAbsolutePath());
//        if (folder.exists()) {
//            System.out.println("Folder exists!");
//        } else {
//            System.out.println("Folder doesn't exist.");
//        }