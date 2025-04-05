import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //(학점*과목평점) + (학점*과목평점) + ... / 학점의 총합
        // ((4 * 4.5) + (3 * 4.0) ) / (4+3)
        String[] subject = new String[20];
        double[] time = new double[20];
        String[] grade = new String[20];
        double[] score = new double[20];

        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            subject[i] = st.nextToken();
            time[i] = Double.parseDouble(st.nextToken());
            grade[i] = st.nextToken();

            if (grade[i].equals("A+")) {
                score[i] = 4.5;
            }else if(grade[i].equals("A0")) {
                score[i] = 4.0;
            }else if(grade[i].equals("B+")) {
                score[i] = 3.5;
            }else if(grade[i].equals("B0")) {
                score[i] = 3.0;
            }else if(grade[i].equals("C+")) {
                score[i] = 2.5;
            }else if(grade[i].equals("C0")) {
                score[i] = 2.0;
            }else if(grade[i].equals("D+")) {
                score[i] = 1.5;
            }else if(grade[i].equals("D0")) {
                score[i] = 1.0;
            }else if(grade[i].equals("F")) {
                score[i] = 0.0;
            }else{
                time[i] = 0.0;
                score[i] =0.0;
            }
        }
        double totalTime = 0.0;

        for(int i = 0; i < 20; i++) {
            totalTime += time[i];
        }
        double timeScore = 0.0;
        for(int i = 0; i < 20; i++) {
            timeScore += time[i] * score[i];
        }
        double result = timeScore/totalTime;

        System.out.printf("%.6f",result);

    }
}