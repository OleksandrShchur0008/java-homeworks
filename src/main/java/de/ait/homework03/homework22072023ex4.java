package de.ait.homework03;

public class homework22072023ex4 {

    //Задание 4: Создайте программу для книжного магазина, которая проверяет, есть ли книга
    // на складе и доступна ли она для покупки. Пусть у каждой книги будет булева переменная inStock,
    // которую можно проверить при принятии решения о покупке.

    public static void main(String[] args) {
        String book = "To Kill a Mockingbird";
        int quantityBookToKillAMockingbird = 11;
        boolean inStock = quantityBookToKillAMockingbird > 0;

        if (inStock) {
            System.out.println("The book " + book + " in stock " + quantityBookToKillAMockingbird + " stuck");
        } else {
            System.out.println("The book" + book + " not in the stock");
        }
    }
}
