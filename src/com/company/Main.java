package com.company;

public class Main {

    public static void main(String[] args) {
	String[] name = {"Вася", "Лена", "Игорь"};

        for (int b = 0; b < 4; b++)
            switch (b){
                case 1:
                    System.out.println("Добрый утро " + name[0]);
                    break;
                case 2:
                    System.out.println("Доброе день " + name[1]);
                    break;
                case 3:
                    System.out.println("Добрый вечер " + name[2]);
                    break;

            }
    }
}
