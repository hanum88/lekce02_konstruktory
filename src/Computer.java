import java.math.BigDecimal;

public class Computer {
    private String model;
    private double diagonalOfScreen;
    private boolean isCompanyComputer;
    private BigDecimal price;
    private boolean isLaptop;

    public boolean isOverPriceLimit (BigDecimal priceLimit) {
        return price.compareTo(priceLimit) > 0;
    }


    public boolean getIsLaptop() {
        return isLaptop;
    }

    public void setIsLaptop(boolean type) {
        this.isLaptop = isLaptop;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    public double getDiagonalOfScreen() {
        return diagonalOfScreen;
    }

    public void setDiagonalOfScreen(double diagonalOfScreen) {
        this.diagonalOfScreen = diagonalOfScreen;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

   public Computer(String model, double diagonalOfScreen, boolean isCompanyComputer, BigDecimal price, boolean isLaptop) {
        this.model = model;
        this.diagonalOfScreen = diagonalOfScreen;
        this.isCompanyComputer = isCompanyComputer;
        this.price = price;
        this.isLaptop = isLaptop;
    }
    public Computer (String model, BigDecimal price){
       /* this.model = "DEF";
        this.diagonalOfScreen = 25;
        this.isCompanyComputer = true;
        this.price = price;
        this.isLaptop = true; nahrazeno this+konstruktor*/
        this(model, 15.6, true, price, true);

    }
}
