package uk.ac.westminster.shop.repository;

import org.springframework.stereotype.Repository;
import uk.ac.westminster.products_api.Product;

import java.util.List;
import java.util.Optional;
import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryProductRepository implements ProductRepository {

    private final Map<Long, Product> store = new HashMap<>();
    private Long nextId = 1L;

    public InMemoryProductRepository() {

    }

    @Override
    public List<Product> findAll() {
        return List.of();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product save(Product product) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
