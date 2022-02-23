import MargharetaPizza.MargharetaPizza;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {


    @Test
    void pizzaMarghareta(){
      MargharetaPizza margharetaPizza = new MargharetaPizza();

      String ticket = margharetaPizza.getTicket();

      assertThat(ticket, equalTo(
        """
         MARGHARETA   9,30€\s
         _____________________________
         TOTAL                 9,30€"""));
    }

    @Test
    void pizzaProsciutto(){

        ProscuittoPizza proscuittoPizza = new ProscuittoPizza();

        String ticket = proscuittoPizza.getTicket();

        assertThat(ticket, equalTo(
                """
                 PROSCUITTO   12,00€\s
                 _____________________________
                 TOTAL                 12,00€"""));
    }

    @Test
    void pizzaTicket(){

        Pizza pizza = new Pizza();

        String ticket = pizza.getTicket();

        assertThat(ticket, equalTo(
                pizza.getName() +        pizza.getPrice() + "€" +
                        "_____________________________" +
                        "TOTAL                 " + pizza.getPrice() + "€"));
    }

    @Test
    void pizzaTicketMarghareta(){

        Pizza pizza = new Pizza("MARGHARETA", 9.30);

        String ticket = pizza.getTicket();

        assertThat(ticket, equalTo(
                pizza.getName() +        pizza.getPrice() + "€" +
                        "_____________________________" +
                        "TOTAL                 " + pizza.getPrice() + "€"));
    }








    }

