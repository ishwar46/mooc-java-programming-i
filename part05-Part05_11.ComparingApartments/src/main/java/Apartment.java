
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if(this.squares > compared.squares) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        if(price > comparedPrice) {
            return price - comparedPrice;
        }
        return comparedPrice - price;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int price = this.princePerSquare * this.squares;
        int comparedPrice = compared.princePerSquare * compared.squares;
        if(price > comparedPrice) {
            return true;
        }
        return false;
    }
}
