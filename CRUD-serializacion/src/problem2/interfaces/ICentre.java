package problem2.interfaces;

import problem2.dto.ShoppingCentre;

import java.io.IOException;
import java.util.List;

public interface ICentre {
    ShoppingCentre findById(int id);
    List<ShoppingCentre> findAll() throws IOException, ClassNotFoundException;
    void save(ShoppingCentre producto) throws IOException;
    void update(ShoppingCentre producto) throws IOException;
    void delete(ShoppingCentre producto) throws IOException;
}
