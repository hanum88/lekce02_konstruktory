import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("macbook", 15.5, true, new BigDecimal(2000), false);
        computer.setModel("ABC");
        System.out.println(computer.getModel());

             System.out.println("cena je: " + computer.getPrice());

       System.out.println("je překročen cenový limit? " +  computer.isOverPriceLimit(new BigDecimal(2000000)));

       Computer secondComputer = new Computer("nejnovější model", new BigDecimal(25000));
        System.out.println("model second computeru: " + secondComputer.getModel());
        System.out.println("cena second computeru: " + secondComputer.getPrice());

    }
}