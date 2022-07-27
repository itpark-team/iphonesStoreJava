package com.company;

public class Main {

    public static void main(String[] args) {
        PhonesManager phonesManager = new PhonesManager();
        

        String model = Util.inputString("Введите модель телефона: ");
        int price = Util.inputInt("Введите цену телефона:", 1, 1000000);
        int quantity = Util.inputInt("Введите кол-во добавляемых телефонов: ", 1, 500);
        Phone phone = new Phone(model, price, quantity);
        phonesManager.addPhone(phone);


        for (int i = 0; i < phonesManager.getSize(); i++) {
            System.out.println(phonesManager.getPhone(i));
        }
    }
}
