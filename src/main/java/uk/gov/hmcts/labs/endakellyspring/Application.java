package uk.gov.hmcts.labs.endakellyspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@SuppressWarnings("HideUtilityClassConstructor") // Spring needs a constructor, its not a utility class
public class Application {

    public static void main(final String[] args) {

        Logger logger
            = Logger.getLogger(
                Application.class.getName());

        SpringApplication.run(Application.class, args);
        {
            String str1 = """
                Str1 text """;
            logger.log(Level.INFO, str1);
        }
    }
}
