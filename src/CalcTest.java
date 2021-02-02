import static org.junit.jupiter.api.Assertions.*;

import java.util.List;


import org.junit.jupiter.api.*;

public class CalcTest {

    @Test
    @DisplayName("testnumero1.1")
    void testnumero11() {
        //fail("Not yet implemented");
       // 1 - preracion del test
        Calc c = new Calc();
       // 2 - Ejecutar lo que vamos a validar
       int result = c.numeroInt("   unnO   ");
       // 3 - Aserciones
       assertEquals( 1, result);
    }
    @Test
    @DisplayName("testnumero1")
    void testnumero12() {
        //fail("Not yet implemented");
       // 1 - preracion del test
        Calc c = new Calc();
       // 2 - Ejecutar lo que vamos a validar
       int result = c.numeroInt("   doss   ");
       // 3 - Aserciones
       assertEquals( 2, result);
    }

   @Test
    @DisplayName("testnumero2")
    void testnumero2() {
        //fail("Not yet implemented");
       // 1 - preracion del test
        Calc c = new Calc();
       // 2 - Ejecutar lo que vamos a validar
       List<Integer> result = c.valoresDeNumeros("uUno DoOS");
       // 3 - Aserciones
    
       assertEquals( "1,2", result);
    }

    @Test
    @DisplayName("testnumero3")
    void testnumero3() {
        //fail("Not yet implemented");
    // 1 - preracion del test
        Calc c = new Calc();
    // 2 - Ejecutar lo que vamos a validar
    double[] array = {1,2,3};
    List<Double> result = c.reglaDe3(array, 60);
    // 3 - Aserciones
    assertEquals( "10.0,20.0,30.0", result);
    }
    

}
