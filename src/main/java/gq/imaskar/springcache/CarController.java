package gq.imaskar.springcache;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CarController {

  private static final Logger LOG = LoggerFactory.getLogger("cars");

  @RequestMapping("/{customerName}")
  @Cacheable(value = "customerCars", key = "#customerName")
  public Map<String, List<Car>> get(@PathVariable String customerName){

    LOG.info("Building object");
    Map<String, List<Car>> result = new HashMap<>();
    result.put("owned", Arrays.asList(
        new Car("Mirai", "Toyota"), new Car("Model S", "Tesla")));
    result.put("leased", Arrays.asList(
        new Car("Thundra", "Toyota"), new Car("Semi", "Tesla")));
    try {
      Thread.sleep(3000);
    } catch (InterruptedException e) {}
    return result;
  }
}
