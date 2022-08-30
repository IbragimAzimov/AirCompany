package com.company;

import java.sql.*;
import java.util.Scanner;

public class Connection {
    private final String url = "jdbc:postgresql://localhost:5432/";
    private final String user = "postgres";
    private final String password = "123";

    public java.sql.Connection connect() {
        java.sql.Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to server successfully");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void insertCountry(Countries countries) {
        String SQL = "INSERT INTO \"Airline\".countries" +
                " (country_ID, country_Name)" +
                " VALUES (?, ?); ";
        try (java.sql.Connection conn = connect();
            PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, countries.getCountry_ID());
            stmt.setString(2, countries.getCountry_Name());
            ResultSet rs = stmt.executeQuery();
            rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteCountry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код страны для удаления:");
        String countryIDforDelete;
        countryIDforDelete = sc.nextLine();

        String SQL = "DELETE * FROM \"Airline\".countries where country_ID = countryIDforDelete";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getString("country_ID") + "  ");
                System.out.print(rs.getString("country_Name") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Страна с таким кодом не имеется в БД");
        }
    }

    public void updateCountry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код страны для изменения:");
        String countryIDforUpdate;
        countryIDforUpdate = sc.nextLine();

        System.out.println("Введите новый код страны:");
        String newCountryID;
        newCountryID = sc.nextLine();

        System.out.println("Введите новое наименование страны:");
        String newCountryName;
        newCountryName = sc.nextLine();

        String SQL = "UPDATE \"Airline\".countries set country_ID = newCountryID, country_Name = newCountryName where ID = countryIDforUpdate";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getString("country_ID") + "  ");
                System.out.print(rs.getString("country_Name") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void searchCountry() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код страны для поиска:");
        String countryIDforLook;
        countryIDforLook = sc.nextLine();

        String SQL = "SELECT countryIDforLook FROM \"Airline\".countries";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getString("country_ID") + "  ");
                System.out.print(rs.getString("country_Name") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void getCountries() {

        String SQL = "SELECT * FROM \"Airline\".countries";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getString("country_ID") + "  ");
                System.out.print(rs.getString("country_Name") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void insertAirport(Airports airports) {
        String SQL = "INSERT INTO \"Airline\".airports" +
                " (airport_ID, city, country_ID, airport_Name)" +
                " VALUES (?, ?, ?, ?); ";
        try (java.sql.Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setString(1, airports.getAirport_ID());
            stmt.setString(2, airports.getCity());
            stmt.setString(3, airports.getCountry_ID());
            stmt.setString(4, airports.getAirport_Name());

            ResultSet rs = stmt.executeQuery();
            rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAirport() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код аэропорта для удаления:");
        String airportIDforDelete;
        airportIDforDelete = sc.nextLine();

        String SQL = "DELETE * FROM \"Airline\".airports where airport_ID = airportIDforDelete";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getString("airport_ID") + "  ");
                System.out.print(rs.getString("city") + "  ");
                System.out.print(rs.getString("country_ID") + "  ");
                System.out.print(rs.getString("airport_Name") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Аэропорт с таким кодом не имеется в БД");
        }
    }

    public void updateAirport() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код аэропорта для изменения:");
        String airportIDforUpdate;
        airportIDforUpdate = sc.nextLine();

        System.out.println("Введите новый код аэропорта:");
        String newAirportID;
        newAirportID = sc.nextLine();

        System.out.println("Введите новое наименование города:");
        String newCityName;
        newCityName = sc.nextLine();

        System.out.println("Введите новый код страны:");
        String newCountry_ID;
        newCountry_ID = sc.nextLine();

        System.out.println("Введите новое наименование аэропорта:");
        String newAirport_Name;
        newAirport_Name = sc.nextLine();

        String SQL = "UPDATE \"Airline\".airports set Airport_ID = newAirportID, City = newCityName, Country_ID = newCountry_ID, airport_Name = newAirport_Name where Airport_ID = airportIDforUpdate";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getString("airport_ID") + "  ");
                System.out.print(rs.getString("city") + "  ");
                System.out.print(rs.getString("country_ID") + "  ");
                System.out.print(rs.getString("airport_Name") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void searchAirport() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите код страны для поиска:");
        String airportIDforLook;
        airportIDforLook = sc.nextLine();

        String SQL = "SELECT airportIDforLook FROM \"Airline\".airports";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getString("airport_ID") + "  ");
                System.out.print(rs.getString("city") + "  ");
                System.out.print(rs.getString("country_ID") + "  ");
                System.out.print(rs.getString("airport_Name") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void getAirports() {

        String SQL = "SELECT * FROM \"Airline\".airports";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getString("airport_ID") + "  ");
                System.out.print(rs.getString("city") + "  ");
                System.out.print(rs.getString("country_ID") + "  ");
                System.out.print(rs.getString("airport_Name") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void insertFlights(Flights flights) {
        String SQL = "INSERT INTO \"Airline\".flights" +
                " (flight_Number, aircraft_Model, departure_Time, departure_From, arrival_In, flight_Duration, number_Of_Seats)" +
                " VALUES (?, ?, ?, ?, ?, ?, ?); ";
        try (java.sql.Connection conn = connect();
             PreparedStatement stmt = conn.prepareStatement(SQL)) {
            stmt.setInt(1, flights.getFlight_Number());
            stmt.setString(2, flights.getAircraft_Model());
            stmt.setString(3, flights.getDeparture_Time());
            stmt.setString(4, flights.getDeparture_From());
            stmt.setString(5, flights.getArrival_In());
            stmt.setInt(6, flights.getFlight_Duration());
            stmt.setInt(7, flights.getNumber_Of_Seats());
            ResultSet rs = stmt.executeQuery();
            rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteFlights() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер рейса для удаления:");
        String flight_NumberforDelete;
        flight_NumberforDelete = sc.nextLine();

        String SQL = "DELETE * FROM \"Airline\".flights where flight_Number = flight_NumberforDelete";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getInt("flight_Number") + "  ");
                System.out.print(rs.getString("aircraft_Model") + "  ");
                System.out.print(rs.getString("departure_Time") + "  ");
                System.out.print(rs.getString("departure_From") + "  ");
                System.out.print(rs.getString("arrival_In") + "  ");
                System.out.print(rs.getInt("flight_Duration") + "  ");
                System.out.print(rs.getInt("number_Of_Seats") + "  ");

                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("рейс с таким номером не имеется");
        }
    }

    public void updateFlights() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер рейса для изменения:");
        int flight_NumberforUpdate;
        flight_NumberforUpdate = sc.nextInt();

        System.out.println("Введите новый номер рейса:");
        int newFlight_Number;
        newFlight_Number = sc.nextInt();

        System.out.println("Добавить модель самолета:");
        String newAircraft_Model;
        newAircraft_Model = sc.nextLine();

        System.out.println("Введите новое время вылета:");
        String newDeparture_Time;
        newDeparture_Time = sc.nextLine();

        System.out.println("Введите новый код аэропорта для вылета:");
        String newDeparture_From;
        newDeparture_From = sc.nextLine();

        System.out.println("Введите новый код аэропорта для прилета:");
        String newArrival_In;
        newArrival_In = sc.nextLine();

        System.out.println("Введите время полета для нового рейса:");
        int newFlight_Duration;
        newFlight_Duration = sc.nextInt();

        System.out.println("Введите количество мест для нового рейса:");
        int newNumber_Of_Seats;
        newNumber_Of_Seats = sc.nextInt();

        String SQL = "UPDATE \"Airline\".flights set Flight_Number = newFlight_Number, Aircraft_Model = newAircraft_Model, Departure_Time = newDeparture_Time, Departure_From = newDeparture_From, Arrival_In = newArrival_In, Flight_Duration = newFlight_Duration, Number_Of_Seats = newNumber_Of_Seats  where Flight_Number = flight_NumberforUpdate";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getInt("flight_Number") + "  ");
                System.out.print(rs.getString("aircraft_Model") + "  ");
                System.out.print(rs.getString("departure_Time") + "  ");
                System.out.print(rs.getString("departure_From") + "  ");
                System.out.print(rs.getString("arrival_In") + "  ");
                System.out.print(rs.getInt("flight_Duration") + "  ");
                System.out.print(rs.getInt("number_Of_Seats") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void searchFlight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер рейса для поиска:");
        String flight_NumberforLook;
        flight_NumberforLook = sc.nextLine();

        String SQL = "SELECT flight_NumberforLook FROM \"Airline\".flights";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getInt("flight_Number") + "  ");
                System.out.print(rs.getString("aircraft_Model") + "  ");
                System.out.print(rs.getString("departure_Time") + "  ");
                System.out.print(rs.getString("departure_From") + "  ");
                System.out.print(rs.getString("arrival_In") + "  ");
                System.out.print(rs.getInt("flight_Duration") + "  ");
                System.out.print(rs.getInt("number_Of_Seats") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void getflights() {

        String SQL = "SELECT * FROM \"Airline\".flights";

        try (java.sql.Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {

            while (rs.next()) {
                System.out.print(rs.getInt("flight_Number") + "  ");
                System.out.print(rs.getString("aircraft_Model") + "  ");
                System.out.print(rs.getString("departure_Time") + "  ");
                System.out.print(rs.getString("departure_From") + "  ");
                System.out.print(rs.getString("arrival_In") + "  ");
                System.out.print(rs.getInt("flight_Duration") + "  ");
                System.out.print(rs.getInt("number_Of_Seats") + "  ");
                System.out.println();
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
