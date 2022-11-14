package ru.netology.manager;

import ru.netology.domain.Film;

public class FilmManager {
    private Film[] films = new Film[0];
    int limit =9;

    public void addNewFilm(Film film) {
        int length = films.length + 1;
        Film[] tmp = new Film[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Film[] getALLFilms() {
        Film[] result = new Film[films.length];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }

    public Film[] findLast() {
        int resultLength;

        if (films.length < limit) {
            resultLength = films.length;
        } else {
            resultLength = limit;
        }

        Film[] ans = new Film[resultLength];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = films[films.length - 1 - i];
        }
        return ans;
    }
}

