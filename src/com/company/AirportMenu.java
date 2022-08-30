package com.company;

import java.util.Scanner;

public class AirportMenu {
    public static void start (){
        Scanner sc = new Scanner(System.in);
        while(true){
            int menuItem;
            System.out.println("Меню аэропортов: ");
            System.out.println("1) Добавление аэропорта");
            System.out.println("2) Удаление аэропорта");
            System.out.println("3) Изменение аэропорта");
            System.out.println("4) Поиск аэропорта по коду");
            System.out.println("5) Вывод списка аэропортов");
            System.out.println("0) Выход");
            menuItem = sc.nextInt();
            if(menuItem == 1){
                // Логика добавления аэропорта
                Airports insertAirports = new Airports();
                System.out.println("Добавить код аэропорта");
                insertAirports.setAirport_ID(sc.nextLine());
                System.out.println("Добавить наименование города");
                insertAirports.setCity(sc.nextLine());
                System.out.println("Добавить код страны");
                insertAirports.setCountry_ID(sc.nextLine());
                System.out.println("Добавить наименование аэропрта");
                insertAirports.setAirport_Name(sc.nextLine());

                Connection connection1 = new Connection();
                connection1.insertAirport(insertAirports);

            }else if(menuItem == 2){
                // Логика удаления аэропорта
                Connection connection2 = new Connection();
                connection2.deleteAirport();

            }else if(menuItem == 3){
                // Логика изменения аэропорта
                Connection connection3 = new Connection();
                connection3.updateAirport();

            }else if(menuItem == 4){
                // Логика поиска аэропорта по коду
                Connection connection4 = new Connection();
                connection4.searchAirport();

            }else if(menuItem == 5){
                // Логика вывода списка аэропортов
                Connection connection5 = new Connection();
                connection5.getAirports();

            }else if(menuItem == 0){
                System.out.println("Выход в главное меню...");
                return;
            }else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }
}
