package persistence;

import model.Film;

public class MockImageLoader implements ImageLoader{

    @Override
    public String load(Film film) {
        return film.getTitle() + ".jpg";
    }

}
