package school;

import java.io.IOException;

public class StudentManager {
    private static final String URL = "src/school/input.txt";
    public static void main(String[] args)  {
        FileController fileController = new FileController();
        fileController.readFile(URL);
        while (fileController.arrayList.size()>1){
            Student student = fileController.readData();
            ResultView.printNumOfMajorSubject(student);
            ResultView.printTotalScoreSumAndAverage(student);
        }
    }
}
