package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            //1
            ArrayList<Student> students = new ArrayList<>();
        while (true) {
            System.out.println("PRESS [1] TO ADD STUDENT ");
            System.out.println("PRESS [2] TO LIST STUDENT ");
            System.out.println("PRESS [0] TO EXIT");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Insert name:");
                    String name = in.nextLine();
                    System.out.println("Insert surname:");
                    String surname = in.nextLine();
                    System.out.println("Insert gpa");
                    double gpa = in.nextDouble();
                    students.add(new Student(name, surname, gpa));
                    System.out.println("Student added successfully!");
                    break;
                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students to list.");
                    } else {
                        for (int i = 0; i < students.size(); i++) {
                            Student student = students.get(i);
                            System.out.println((i + 1) + ". " + student.getName() + " " + student.getSurname() + " " + student.getGpa());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 0, 1, or 2.");
            }
        }
//2
        Player[]players1=new Player[5];
        players1[0]=new Player(1,"Криштиану","Роналду","защитник");
        players1[1]=new Player(2,"Лионель","Месси","нападающие");
        players1[2]=new Player(3,"Луис","Суарес","защитник");
        players1[3]=new Player(4,"Антуан"," Гризман","нападающие");
        players1[4]=new Player(5," Неймар ","  ","защитник");
        Player[]players2=new Player[5];
        players2[0]=new Player(1,"Гарет","Бейл","вратарь");
        players2[1]=new Player(2,"Роберт ","Левандовский","полузащитник");
        players2[2]=new Player(3,"Кевин-де","Брюйне","защитник");
        players2[3]=new Player(4," Серхио ","Агуэро","нападающие");
        players2[4]=new Player(5,"Мануэль","Нойер","защитник");


        Club club1=new Club("Барселона","Испания",34,players1);
        Club club2=new Club("Челси", "Англия", 20,players2);
        Club[] league={club1,club2};


        for (Club club:league) {
            club.printClubData();
            System.out.println();
        }
        //3
        for (Club club:league) {
            club.players=sortPlayers(club.players);
        }

        league = sortClub(league);

        for (Club club : league) {
            System.out.println("Club: " + club.name + ", Rating Points: " + club.ratingPoints);
            for (Player player : club.players) {
                System.out.println("Player: " + player.name + ", Number: " + player.number);
            }
            System.out.println();
        }

    }
    public static Player[] sortPlayers(Player[] players) {
        for (int i = 0; i < players.length-1; i++) {
            for (int j = 0; j < (players.length)-i-1; j++) {
                if (players[j].number < players[j+1].number) {
                    Player temp = players[j];
                    players[j] = players[j+1];
                    players[j+1] = temp;
                }
            }
        }
        return players;
    }
    public  static  Club[] sortClub(Club[] clubs){
        for (int i = 0; i < clubs.length-1; i++) {
            for (int j = 0; j < clubs.length-i-1; j++) {
                if (clubs[j].ratingPoints<clubs[j+1].ratingPoints){
                    Club temp=clubs[j];
                    clubs[j]=clubs[j+1];
                    clubs[j+1]=temp;
                }
            }
        }
        return  clubs;
    }
}
