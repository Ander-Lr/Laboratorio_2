import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickBeforeAfter {

    public class QuickBeforeAfterTest {
        //antes de
        @BeforeEach
        void preparado(){
            System.out.println("Antes de la prueba");
        }

        @Test
        void test1(){
            System.out.println("Test 1 ejecutado");
        }

        @Test
        void test2(){
            System.out.println("Test 2 ejecutado");
        }

        //despues de
        @AfterEach
        void alfinal(){
            System.out.println("Despues de la prueba");
        }
    }
}
