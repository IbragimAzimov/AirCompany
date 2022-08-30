package com.company;

import java.util.Scanner;

public class CountryMenu {
    public static void start (){
        Scanner sc = new Scanner(System.in);
        while(true){
            int menuItem;
            System.out.println("Меню стран: ");
            System.out.println("1) Добавление страны");
            System.out.println("2) Удаление страны");
            System.out.println("3) Изменение страны");
            System.out.println("4) Поиск страны по коду");
            System.out.println("5) Вывод списка стран");
            System.out.println("0) Выход");
            menuItem = sc.nextInt();
            if(menuItem == 1){
                // Логика добавления страны
                Countries insertCountries = new Countries();
                System.out.println("Добавить код страны");
                insertCountries.setCountry_ID(sc.nextLine());
                System.out.println("Добавить наименование страны");
                insertCountries.setCountry_Name(sc.nextLine());

                Connection connection1 = new Connection();
                connection1.insertCountry(insertCountries);

            }else if(menuItem == 2){
                // Логика удаления страны
                Connection connection2 = new Connection();
                connection2.deleteCountry();

            }else if(menuItem == 3){
                // Логика изменения страны
                Connection connection3 = new Connection();
                connection3.updateCountry();

            }else if(menuItem == 4){
                // Логика поиска страны по коду
                Connection connection4 = new Connection();
                connection4.searchCountry();

            }else if(menuItem == 5){
                // Логика вывода списка стран
                Connection connection5 = new Connection();
                connection5.searchCountry();

            }else if(menuItem == 0){
                System.out.println("Выход в главное меню...");
                return;
            }else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }
}
