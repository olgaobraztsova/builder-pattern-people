public class Main {
    public static void main(String[] args) {

        // создаем объект через билдер
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();

        // выводим на экран
        System.out.println(mom);
        System.out.println();

        // создаем объект ребенка через билдер с предзаполненной фамилией и городом проживания
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(5)
                .build();

        // увеличим возраст объекта мамы
        mom.happyBirthday();
        System.out.println(mom);

        System.out.println("\nУ " + mom.getName() + " есть сын, " + son.getName() + ":");

        System.out.println(son);
        System.out.println();


        // проверка ошибок
        try {
            // Не хватает обяхательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder()
                    .setName("Ирина")
                    .setSurname("Волкова")
                    .setAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
