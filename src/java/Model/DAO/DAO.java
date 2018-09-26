package Model.DAO;

import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Marce
 */
public interface DAO<T> {

    void create(T ob) throws SQLException;
    List<T> read() throws SQLException;
    void update(T ob) throws SQLException;
    void delete(int id) throws SQLException;

    List<T> searchByText(String txt) throws SQLException;
    T searchById(String id) throws SQLException;

}
