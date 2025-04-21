public class ControlStructure {
    public static int randomDay() {
        return (int) (Math.random() * 7) + 1;
    }

    public static void main(String[] args) {
        // FOR LOOP
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0)
                continue;
            else
                System.out.println("odd:" + i);
        }

        // WHILE LOOP
        int i = 0;
        while (i < 10) {
            i = i + 1;
            if (i == 5)
                break;
            System.out.println(i);
        }
        System.out.println("loop exited");

        // SWITCH STAEMENT
        String[] days = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday" };
        switch (randomDay()) {
            case 1:System.out.println(days[0]);break;
            case 2:System.out.println(days[1]);break;
            case 3:System.out.println(days[2]);break;
            case 4:System.out.println(days[3]);break;
            case 5:System.out.println(days[4]);break;
            case 6:System.out.println(days[5]);break;
            case 7:System.out.println(days[6]);break;
        }
    }
}
