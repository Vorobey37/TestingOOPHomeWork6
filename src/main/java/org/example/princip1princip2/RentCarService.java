package org.example.princip1princip2;

public class RentCarService {

    //Класс несет только одно действие, для изменения только одна причина, 1 принцип
    public Order orderCar(String carNo, Client client){
        //заказ машины
        return null;
    }

    //Данный метод вынесем в класс CarService отдельно, 1 принцип
//    public Car findCar(String carNo){
//        //ищем машину по номеру
//        return null;
//    }

    //Данный метод вынесем в класс PrinterService отдельно, 1 принцип
//    public void printOrder(Order order){
//        //печатаем заказ
//    }

    //Данный метод вынесем в класс CarInfoService отдельно, 1 принцип
//    public void interestInfo(String carType){
//        if (carType.equals("sedan")){
//            //что-то делаем
//        }
//
//        if (carType.equals("pickup")){
//            //что-то делаем
//        }
//
//        if (carType.equals("van")){
//            //что-то делаем
//        }
//    }

    //Данный метод вынесем в класс CarNotificationService отдельно, 1 принцип
//    public void sendMessage(String typeMessage, String message){
//        if (typeMessage.equals("email")){
//            //пишем email
//            //используем соответствующее API
//        }
//    }
}
