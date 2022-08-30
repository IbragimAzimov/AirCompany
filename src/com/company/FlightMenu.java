package com.company;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FlightMenu {
    public static void start (){
        Scanner sc = new Scanner(System.in);
        while(true){
            int menuItem;
            System.out.println("Меню рейсов: ");
            System.out.println("1) Добавление рейса");
            System.out.println("2) Удаление рейса");
            System.out.println("3) Изменение рейса");
            System.out.println("4) Поиск рейса по номеру");
            System.out.println("5) Вывод списка рейсов");
            System.out.println("0) Выход");
            menuItem = sc.nextInt();
            if(menuItem == 1){
                // Логика добавления рейса
                Flights insertFlights = new Flights();
                System.out.println("Добавить номер рейса");
                insertFlights.setFlight_Number(sc.nextInt());
                System.out.println("Добавить модель самолета");
                insertFlights.setAircraft_Model(sc.nextLine());
                System.out.println("Добавить время вылета");
                insertFlights.setDeparture_Time(sc.nextLine());
                System.out.println("Добавить откуда вылет (код аэропорта)");
                insertFlights.setDeparture_From(sc.nextLine());
                System.out.println("Добавить где будет прилет (код аэропорта)");
                insertFlights.setArrival_In(sc.nextLine());
                System.out.println("Добавить длительность полета");
                insertFlights.setFlight_Duration(sc.nextInt());
                System.out.println("Добавить количество мест");
                insertFlights.setNumber_Of_Seats(sc.nextInt());

                Connection connection1 = new Connection();
                connection1.insertFlights(insertFlights);

            }else if(menuItem == 2){
                // Логика удаления рейса
                Connection connection2 = new Connection();
                connection2.deleteFlights();

            }else if(menuItem == 3){
                // Логика изменения рейса
                Connection connection3 = new Connection();
                connection3.updateFlights();

            }else if(menuItem == 4){
                // Логика поиска рейса по номеру
                Connection connection4 = new Connection();
                connection4.searchFlight();

            }else if(menuItem == 5){
                // Логика вывода списка рейсов
                Connection connection5 = new Connection();
                connection5.getflights();

            }else if(menuItem == 0){
                System.out.println("Выход в главное меню...");
                return;
            }else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }
}
