package problem2.service;


import problem2.dto.ShoppingCentre;
import problem2.interfaces.ICentre;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CentreImpl implements ICentre {
    private List<ShoppingCentre> productos;

    public CentreImpl() throws IOException, ClassNotFoundException {
        productos = new ArrayList<>();
    }

    @Override
    public ShoppingCentre findById(int id) {
        return productos.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<ShoppingCentre> findAll() throws IOException, ClassNotFoundException {
        productos = (List<ShoppingCentre>) ObjectSerializer.readObjectFromFile("productos.ax");
       return productos;
    }

    @Override
    public void save(ShoppingCentre producto) throws IOException {
        productos.add(producto);
        ObjectSerializer.writeObjectToFile(productos, "productos.ax");
    }

    @Override
    public void update(ShoppingCentre producto) throws IOException {
        ShoppingCentre oldProducto = findById(producto.getId());
        if (oldProducto != null) {
            productos.remove(oldProducto);
            productos.add(producto);
            ObjectSerializer.writeObjectToFile(productos, "productos.ax");
        }
    }

    @Override
    public void delete(ShoppingCentre producto) throws IOException {
        productos.remove(producto);
        ObjectSerializer.writeObjectToFile(productos, "productos.ax");
    }
}

