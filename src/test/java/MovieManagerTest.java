import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void AddingMoviesTest() {
        MovieManager manager = new MovieManager();
        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IIII");
        manager.add("Film IIIII");
        manager.add("Film IIIIII");
        manager.add("Film IIIIIII");

        String[] expected = {"Film I", "Film II", "Film III", "Film IIII", "Film IIIII", "Film IIIIII", "Film IIIIIII"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WithoutAddingMoviesTest() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void AddingOneMovieTest() {
        MovieManager manager = new MovieManager();
        manager.add("Film I");

        String[] expected = {"Film I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TheLastFiveFilmsTest() {
        MovieManager manager = new MovieManager();

        manager.add("Film III");
        manager.add("Film IIII");
        manager.add("Film IIIII");
        manager.add("Film IIIIII");
        manager.add("Film IIIIIII");

        String[] expected = {"Film IIIIIII", "Film IIIIII", "Film IIIII", "Film IIII", "Film III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void TheLastSevenFilmsTest() {
        MovieManager manager = new MovieManager(7);

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IIII");
        manager.add("Film IIIII");
        manager.add("Film IIIIII");
        manager.add("Film IIIIIII");

        String[] expected = {"Film IIIIIII", "Film IIIIII", "Film IIIII", "Film IIII", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TheLastThreeFilmsTest() {
        MovieManager manager = new MovieManager();


        manager.add("Film IIIII");
        manager.add("Film IIIIII");
        manager.add("Film IIIIIII");

        String[] expected = {"Film IIIIIII", "Film IIIIII", "Film IIIII"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void TheLastLimitFilmsTest() {
        MovieManager manager = new MovieManager();

        manager.add("Film III");
        manager.add("Film IIII");
        manager.add("Film IIIII");
        manager.add("Film IIIIII");
        manager.add("Film IIIIIII");

        String[] expected = {"Film IIIIIII", "Film IIIIII", "Film IIIII", "Film IIII", "Film III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WithoutLimitFilmsTest() {

        MovieManager manager = new MovieManager(3);

        manager.add("Film II");
        manager.add("Film III");
        manager.add("Film IIII");
        manager.add("Film IIIII");

        String[] expected = {"Film IIIII", "Film IIII", "Film III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void WithLimitFilmsTest() {

        MovieManager manager = new MovieManager(3);


        manager.add("Film III");
        manager.add("Film IIII");
        manager.add("Film IIIII");

        String[] expected = {"Film IIIII", "Film IIII", "Film III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


}
