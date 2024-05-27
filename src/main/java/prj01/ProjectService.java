package prj01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectService {
    Map<String, Product> products = new HashMap<String, Product>();
    private Product p;

    public ProjectService(){
        p = new Product("101","애플폰","애플전자",1200000,"2024.01.23");
        products.put("101",p);
        p = new Product("102","삼성갤럭시","삼성전자",1000000,"2024.02.24");
        products.put("102",p);
        p = new Product("103","엘지폰","LG전자",800000,"2024.03.28");
        products.put("103",p);
    }
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }
    public Product find(String id) {
        return products.get(id);
    }
}
