public class Main {

    public static void main(String[] args) {
        Employee worker1 = new Employee("Adam Jensen", "Security chief", "aj@gmail.com", "89003101337", 10000, (byte) 36);
        worker1.getEmployee();
        System.out.print("------------------ \n");

        Employee[] workersArray = new Employee[5];
        workersArray[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "8923123123", 30000, (byte) 30);
        workersArray[1] = new Employee("Petrov Dmitriy", "Doctor", "dp@yandex.ru", "8926783995", 20000, (byte) 45);
        workersArray[2] = new Employee("Maria Fisichenko", "Artist", "fism@mailbox.com", "8923623707", 50000, (byte) 54);
        workersArray[3] = new Employee("Daria Bukreeva", "Writer", "darb@mailbox.com", "8910100001", 25000, (byte) 21);
        workersArray[4] = new Employee("Smirnov Nikita", "Streamer", "sm@gmail.com", "84951231231", 30000, (byte) 33);

        for (Employee employee : workersArray) {
            if (employee.getAge() > 40) {
                employee.getEmployee();
                System.out.print("------------------ \n");
            }
        }
    }
}
