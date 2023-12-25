package de.ait.testJavaIO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeInputStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeInputStream.class);
    private static String path = "employees.txt";

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream(path);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Employee employee = (Employee) objectInputStream.readObject();

            LOGGER.info("Обьект успешно создан, ID: {}, Name: {}", employee.getId(), employee.getName());

            if(employee.getSalary() >= 50000) {
                LOGGER.warn("Обьект с зарплатой больше 50000 найден! ID: {}, Name: {}", employee.getId(), employee.getName());
            } else {
                LOGGER.info("Обьект с зарплатой меньше 50000, ID: {}, Name: {}", employee.getId(), employee.getName());
            }


        } catch (FileNotFoundException exception) {
            LOGGER.error("Файл {} не найден или не создан {}", path, exception.getMessage());

        } catch (IOException exception) {
            LOGGER.error("Ошибка в обработке данных. Файл {}, {}", path, exception.getMessage());

        } catch (ClassNotFoundException exception) {
            LOGGER.error("Ошибка в поиску класса для десериализации. {}", exception.getMessage());
        }
    }
}
