package ru.x5.Task3.ptoneTask;

public class PhoneApp {
    public static void main(String[] args) {

        Phone[] phones = new Phone[3];
        String[] callers = new String[3];
        String[] numbers = new String[3];
        phones[0] = new Phone();
        phones[1] = new Phone();
        phones[2] = new Phone();
        callers[0] = "Zibulba";
        callers[1] = "Test";
        callers[2] = "Oleg";
        numbers[0] = "4252";
        numbers[1] = "425232";
        numbers[2] = "4251112";
        for (int i = 0; i < 3; i++) {
            System.out.println(phones[i].getNumber() + " " + phones[i].getModel() + " " + phones[i].getWeight());
            phones[0].recieveCall(callers[i]);
            phones[0].recieveCall(callers[i], numbers[i]);
            phones[i].sendMessage("+79992221133", "+71234212233", "+79123219815");
        }
    }
}
