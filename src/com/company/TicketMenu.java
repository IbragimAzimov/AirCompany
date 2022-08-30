package com.company;

import java.util.Scanner;

public class TicketMenu {
    public static void start (){
        Scanner sc = new Scanner(System.in);
        while(true){
            int menuItem;
            System.out.println("Меню билетов: ");
            System.out.println("1) Добавление билета");
            System.out.println("2) Удаление билета");
            System.out.println("3) Изменение билета");
            System.out.println("4) Поиск билета по номеру");
            System.out.println("5) Вывод списка билетов");
            System.out.println("0) Выход");
            menuItem = sc.nextInt();
            if(menuItem == 1){
                // Логика добавления билета
            }else if(menuItem == 2){
                // Логика удаления билета
            }else if(menuItem == 3){
                // Логика изменения билета
            }else if(menuItem == 4){
                // Логика поиска билета по номеру
            }else if(menuItem == 5){
                // Логика вывода списка билетов
            }else if(menuItem == 0){
                System.out.println("Выход в главное меню...");
                return;
            }else {
                System.out.println("Ошибка! Введите цифру из меню!");
            }
        }
    }
}
