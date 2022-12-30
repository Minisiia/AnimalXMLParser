package xml;

/**
 * Створити XML файл.
 * Створити клас AnimalParser.
 * Вивести у консоль name, breed всіх котів використовуючи будь-який з парсерів.
 */

public class Main {
    public static void main(String[] args) {
        AnimalSaveXML.DOMsaveXML();
        AnimalParser.parserDOM();
    }
}
