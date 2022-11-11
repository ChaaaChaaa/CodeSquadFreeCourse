package school;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FileController {
    public ArrayList<String> arrayList = new ArrayList<>();

    public void readFile(String fileName) {
        File file = new File(fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                arrayList.add(data);
            }
            System.out.println("read success");
        } catch (Exception fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        /*
        이것도 가능
        String data = new String(Files.readAllBytes(Path.of(URL)));
        System.out.println(data);
         */
    }

    public Student readData() {
        Student student = null;
        for (int i = 1; i < arrayList.size(); i++) {
            student = createStudent(arrayList.get(i) + "  0");
            arrayList.remove(i);
        }
        return student;
    }

    private static Student createStudent(String input) {
        StringTokenizer st = new StringTokenizer(input);
        ArrayList<String> subjectList = new ArrayList<>();
        String name = st.nextToken();
        int id = Integer.parseInt(st.nextToken());
        String major = st.nextToken();
        subjectList.add(setScore(st.nextToken()));
        subjectList.add(setScore(st.nextToken()));
        subjectList.add(setScore(st.nextToken()));

        return new Student(name, id, major, subjectList.toArray(String[]::new));
    }

    private static String setScore(String num) {
        if (num == "-1") {
            return "0";
        }
        return num;
    }


}