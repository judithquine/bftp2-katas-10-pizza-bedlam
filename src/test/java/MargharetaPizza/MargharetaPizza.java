package MargharetaPizza;

public class MargharetaPizza {

    private Double price;

    public MargharetaPizza(){

    }

    public MargharetaPizza(Double price){
        this.price = price;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTicket() {
        return ("""
                 MARGHARETA   9,30€\s
                 _____________________________
                 TOTAL                 9,30€""");
    }
}
