package ossp1;

import java.io.*;

public class practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number, department;

        System.out.print("이름을 입력해주세요: ");
        name = br.readLine();
        System.out.print("학번을 입력해주세요: ");
        number = br.readLine();
        System.out.print("학과을 입력해주세요: ");
        department = br.readLine();

        System.out.println("\n<출력>\n이름: " + name + "\n학번: " + number + "\n학과: " + department);

    }
}