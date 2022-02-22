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







    }

