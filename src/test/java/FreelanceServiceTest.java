import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.services.FreelanceService;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {

    @Test
    public void test1() {
        FreelanceService service =  new FreelanceService();

        int expended = 3;
        int actual = service.calculate(10_000, 3_000, 20_000);

        Assertions.assertEquals(expended, actual);
    }


    @Test
    public void test2() {
        FreelanceService service = new FreelanceService();

        int expended = 2;
        int actual = service.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expended, actual);
    }

}