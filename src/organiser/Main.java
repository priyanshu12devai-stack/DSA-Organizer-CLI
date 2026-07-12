package organiser;

import organiser.menu.Menu;
import organiser.scanner.FolderScanner;
import organiser.service.ProblemService;
import organiser.model.Problem;

import java.util.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FolderScanner scanner = new FolderScanner();

        ArrayList<Problem> problems = scanner.scanFolder();

        ProblemService service = new ProblemService(problems);

//        service.ShowStatastics();


        Menu menu = new Menu(service);

        menu.start();


    }
}
