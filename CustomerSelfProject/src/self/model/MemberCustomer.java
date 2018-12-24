package self.model;

public class MemberCustomer extends Customer {

    private double points;
    private static double discountRate ;

    public MemberCustomer() {

    }

    public MemberCustomer( String name, String surname, double points) {
        super(name, surname);
        this.points = points;
        discountRate =  20.0/100.0;
        
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public double redeemPoint2Cash(int usePoints) {

        int voucher = 0;
        if (usePoints > points) {
            System.out.println("Your point are not enough");
            return -1;
        } else {
            voucher = usePoints / 800;
            points -= (voucher * 800);
            return voucher * 100;
        }
    }

    public void addPointFromBuyingTotalPrice(double buyingPrice) {
            points +=  (int)(buyingPrice/25);
    }

    @Override
    public String toString() {
        return "MemberCustomer{" + "points=" + points + '}';
    }
    

}
