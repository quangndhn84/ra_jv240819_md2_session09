package generic;

import java.util.List;

public interface IApp<G> {
    List<G> findAll();

    boolean create(G obj);

    boolean update(G obj);

    boolean delete(G obj);
}
