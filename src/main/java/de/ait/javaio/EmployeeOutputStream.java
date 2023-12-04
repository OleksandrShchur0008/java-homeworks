package de.ait.javaio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeOutputStream {
    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeOutputStream.class);
    private static String path = "employees.txt";

    public static void main(String[] args) {
        Employee employeeBatman = new Employee(2400, "Batman", 40000);
        Employee employeeRobin = new Employee(2405, "Robin", 50000);

        try (FileOutputStream fileOutputStream = new FileOutputStream(path);
             ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)) {

            outputStream.writeObject(employeeBatman);
            outputStream.writeObject(employeeRobin);
            outputStream.flush();
            LOGGER.info("Данные сотрудника успешно сохранены. id: {}", employeeBatman.getId());
            LOGGER.info("Данные сотрудника успешно сохранены. id: {}", employeeRobin.getId());

        } catch (FileNotFoundException exception) {
            LOGGER.error("Файл {} не найден или не создан {}", path, exception.getMessage());
        } catch (IOException exception) {
            LOGGER.error("Ошибка в обработке данных. Файл {}, {}", path, exception.getMessage());
        }
    }
}
