package ossp2;

import java.io.*;

public class practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number, university;

        System.out.print("이름을 입력해주세요: ");
        name = br.readLine();
        System.out.print("학번을 입력해주세요: ");
        number = br.readLine();
        System.out.print("대학교를 입력해주세요: ");
        university = br.readLine();

        System.out.println("\n<출력>\n이름: " + name + "\n학번: " + number + "\n대학교: " + university);

    }
}