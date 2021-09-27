package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.management.RuntimeOperationsException;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    public Long sustraction(Long number1, Long number2) {
        logger.info( "subtracting {} - {}", number1, number2 );
        return number1 - number2;
    }

    public Long multiply(Long number1, Long number2) {
        logger.info( "multiplying {} * {}", number1, number2 );
        return number1 * number2;
    }

    public Long divide(Long number1, Long number2){
        try {
            logger.info( "dividing {} / {}", number1, number2 );
            return number1 / number2;
        }
        catch (Exception e){
            System.out.println("Division en 0 no valida, retornando 0 en su lugar");
            return 0L;
        }
    }

}
