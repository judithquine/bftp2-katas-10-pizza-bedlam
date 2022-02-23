public class Pizza {
    
    private String name;
    private Double price;
    
    
    public Pizza() {

    }

    public Pizza(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice(){
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    public String toString(){
            return( this.name +        this.price + "€" +
                    "_____________________________" +
                    "TOTAL                 " + this.price + "€");
    }

    public String getTicket() {
        return toString();
    }
}

