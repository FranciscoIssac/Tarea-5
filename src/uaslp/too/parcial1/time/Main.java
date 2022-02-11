package uaslp.too.parcial1.time;

public class Main {

    public static void main(String[] args) {
        Time time = new Time(9,45,23);

        System.out.print(time);
        System.out.println();

        // Sumamos 20 horas de manera que las horas sobrepasen las 24
        time.addHour(20);

        System.out.print(time);
        System.out.println();

        // sumamos 20 minutos de manera que los minutos sobrepasen los 60
        time.addMinute(20);

        System.out.print(time);
        System.out.println();

        // sumamos 40 minutos de manera que los segundos sobrepasen los 60
        time.addSecond(40);

        System.out.print(time);
        System.out.println();

        // Sumamos 40 horas de manera que las horas sobrepasen las 24 mas de una vez para probar el ciclo
        time.addHour(40);

        System.out.print(time);
        System.out.println();

        // Sumamos 100 horas de manera que los minutos sobrepasen los 60 mas de una vez para probar el ciclo
        time.addMinute(100);

        System.out.print(time);
        System.out.println();

        // sumamos 3600 minutos de manera que los segundos sobrepasen los 60 mas de una vez para probar el ciclo
        time.addSecond(3600);

        System.out.print(time);
        System.out.println();
    }
}
