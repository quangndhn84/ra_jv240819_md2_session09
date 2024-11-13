package generic;

import java.util.List;

public class BookManagement implements IApp<Book>{
    @Override
    public List<Book> findAll() {
        return List.of();
    }

    @Override
    public boolean create(Book obj) {
        return false;
    }

    @Override
    public boolean update(Book obj) {
        return false;
    }

    @Override
    public boolean delete(Book obj) {
        return false;
    }
}
