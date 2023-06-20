import com.poc.authlib.AuthSystemAutoconfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = AuthSystemAutoconfiguration.class)
class IntegrationConfigTest {

    @Test
    void hasIntegrationConfigTurnedOn(ApplicationContext context) {
        assertTrue(Objects.nonNull(context.getBean(AuthSystemAutoconfiguration.class)));
    }

}
