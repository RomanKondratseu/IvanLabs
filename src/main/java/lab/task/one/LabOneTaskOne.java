package lab.task.one;

public class LabOneTaskOne {

    public static void main(String[] args) {
        System.out.println(generateGreeting());
    }

    public static String generateExclamationMarks(int count) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < count; i++) {
            builder.append("!");
        }

        return builder.toString();
    }

    public static int random(int from, int to) {
        return from + (int) (Math.random() * (to- from) + 1);
    }

    public static String generateGreeting() {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello world!\n");
        builder.append("Andhiagain!\n");
        builder.append(generateExclamationMarks(random(5, 50)));

        return builder.toString();
    }
}
