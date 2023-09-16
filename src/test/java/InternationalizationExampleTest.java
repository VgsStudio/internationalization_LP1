import static org.junit.jupiter.api.Assertions.*;

class InternationalizationExampleTest {

    @org.junit.jupiter.api.Test
    void getRaul() {
        InternationalizationExample internationalizationExample = new InternationalizationExample("pt");
        assertEquals("Eu nasci há 10 mil anos atrás", internationalizationExample.getRaul());

        internationalizationExample = new InternationalizationExample("en");
        assertEquals("I was born 10 thousand years ago", internationalizationExample.getRaul());

        internationalizationExample = new InternationalizationExample("fr");
        assertEquals("Je suis né il y a 10 mille ans", internationalizationExample.getRaul());

        internationalizationExample = new InternationalizationExample("it");
        assertEquals("Sono nato 10 mila anni fa", internationalizationExample.getRaul());
    }
}
