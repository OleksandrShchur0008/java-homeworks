package de.ait.homework05;

public class homework27072023ex1 {

    //Задание 1: Напишите программу, которая выводит в консоль календарь на текущий месяц.
    // Даты должны быть выровнены по столбцам.

    public static void main(String[] args) {
        System.out.println("Here is the calendar for the current month - July: \n");
        String mon = "Monday";
        String tue = "Tuesday";
        String wed = "Wednesday";
        String thu = "Thursday";
        String fr = "Friday";
        String sat = "Saturday";
        String sun = "Sunday";
        String sp = "   ";
        String sp2 = "           ";
        {
            System.out.printf("%s %s %s %s %s %s %s %s %s %s %s %s %s",
                    mon, sp, tue, sp, wed, sp, thu, sp, fr, sp, sat, sp, sun);

            System.out.println(" ");
            System.out.println(sp + "-" + sp2 + "  -" + sp2 + "-" + sp2 + "-" + sp2 + "-" + sp2 + "1" + sp2 + "2");
            System.out.println(sp + "3" + sp2 + " 4" + sp2 + "5" + sp2 + "6" + sp2 + "7" + sp2 + "8" + sp2 + "9");
            System.out.println(sp + "10" + sp2 + "11" + sp2 + "12" + sp2 + "13" + sp2 + "14" + sp2 + "15" + sp2 + "16");
            System.out.println(sp + "17" + sp2 + "18" + sp2 + "19" + sp2 + "20" + sp2 + "21" + sp2 + "22" + sp2 + "23");
            System.out.println(sp + "24" + sp2 + "25" + sp2 + "26" + sp2 + "27" + sp2 + "28" + sp2 + "29" + sp2 + "30");
            System.out.println(sp + "31" + sp2 + "-" + sp2 + "-" + sp2 + "-" + sp2 + "-" + sp2 + "-" + sp2 + "-");
        }
    }
}
