package com.alandev.app;

import com.alandev.entities.Lesson;
import com.alandev.entities.Task;
import com.alandev.entities.Video;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Lesson> list = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println();
            System.out.println("Dados da " + i + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Título: ");
            sc.nextLine();
            String title = sc.nextLine();
            if (ch == 'c') {
                System.out.print("URL do vídeo: ");
                String url = sc.nextLine();
                System.out.print("Duração em segundos: ");
                int seconds = sc.nextInt();
                list.add(new Video(title, url, seconds));
            } else {
                System.out.print("Descrição: ");
                String description = sc.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = sc.nextInt();
                list.add(new Task(title, description, questionCount));
            }
        }

        System.out.println();
        double totalDuration = 0.0;
        for (Lesson lesson : list) {
            totalDuration += lesson.duration();
        }
        System.out.println("DURAÇÃO TOTAL DO CURSO = " + totalDuration + " segundos");
    }
}
