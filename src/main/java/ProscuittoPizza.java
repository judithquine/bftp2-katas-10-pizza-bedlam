public class ProscuittoPizza {

    private Double price;

    public ProscuittoPizza(){

    }

    public ProscuittoPizza(Double price){
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
                 PROSCUITTO   12,00€\s
                 _____________________________
                 TOTAL                 12,00€""");
    }
}