package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Film;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class filmManager10FilmsTest {

    FilmManager manager = new FilmManager();

    Film first = new Film(1, "Avatar");
    Film second = new Film(2, "Green Mile");
    Film third = new Film(3, "Venom 2");
    Film fourth = new Film(4, "Undisputed 4");
    Film fifth = new Film(5, "Star Wars Episode 9");
    Film sixth = new Film(6, "Warcraft");
    Film seventh = new Film(7, "Supernatural");
    Film eighth = new Film(8, "Predator");
    Film ninth = new Film(9, "The Witcher");
    Film tenth = new Film(10, "Avengers");
    Film eleventh = new Film(11, "Harry Potter");

    @BeforeEach
    void prepareFilmManager() {
        manager.addNewFilm(first);
        manager.addNewFilm(second);
        manager.addNewFilm(third);
        manager.addNewFilm(fourth);
        manager.addNewFilm(fifth);
        manager.addNewFilm(sixth);
        manager.addNewFilm(seventh);
        manager.addNewFilm(eighth);
        manager.addNewFilm(ninth);
        manager.addNewFilm(tenth);

    }

    @Test
    public void shouldSaveNewFilm() {
        manager.addNewFilm(eleventh);
        Film[] expected = new Film[]{
                eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first
        };
        Film[] actual = manager.getLast10Films();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldGetAll() {
        Film[] actual = manager.getLast10Films();
        Film[] expected = {
                tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first
        };
        assertArrayEquals(expected, actual);
    }

};
