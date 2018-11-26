package gq.imaskar.springcache;


import java.io.Serializable;

public class Car implements Serializable {
  private String model;
  private String manufacturer;

  public Car(String model, String manufacturer) {
    this.model = model;
    this.manufacturer = manufacturer;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }
}
