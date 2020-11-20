package model;
import java.util.*;
public class Shop {
  private String name;
  private int id;
  private Product[][] saleShelf;
  private Product[][] literatureShelf;
  private Product[][] movieShelf;
  public Shop(String name, int id) {
    this.name = name;
    this.id = id;
    saleShelf = new Product[5][8];
    literatureShelf = new Product[10][15];
    movieShelf = new Product[15][15];
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void addProduct(Product product) {
    boolean out1=false;
    for(int i=0; i<saleShelf.length && !out1; i++){
      for(int j=0; j<saleShelf[0].length && !out1; j++){
         if(saleShelf[i][j].equals(null)){
            saleShelf[i][j]= product;
            out1=true;
            System.out.println("Entró vida hp");
         }
      }

    }
          
  }
  public void addProduct(Product product, int a){
    boolean out = false;
    for(int i = 0; i < literatureShelf.length && !out; i++){
     // boolean out2 = false;
      for(int j = 0; j < literatureShelf[0].length && !out; j++){
        if(literatureShelf[i][j].equals(null)){
          literatureShelf[i][j] = product;
          out = true; 
          System.out.println("Entró vida hp");

        }
      }
    }
    
  }

  public void addProduct(Product product, String b) {
    boolean out = false;
    for(int i = 0; i < movieShelf.length && !out; i++){
     // boolean out2 = false;
      for(int j = 0; j < movieShelf[0].length && !out; j++){
        if(movieShelf[i][j].equals(null)){
          movieShelf[i][j] = product;
          out = true; 
          System.out.println("Entró vida hp");

        }
      }
    }
  }

  public String infoProducts() {
    String msg = "";
    msg += "saleShelf";
    for(int i = 0; i < saleShelf.length;i++){
        for(int j = 0; j < saleShelf[0].length; j++){
            msg += saleShelf[i][j].getTitle();
            msg += saleShelf[i][j].description();
        }
    }
    msg += "literatureShelf";
    for(int i = 0; i < saleShelf.length;i++){
        for(int j = 0; j < saleShelf[0].length; j++){
            msg += literatureShelf[i][j].getTitle();
            msg += literatureShelf[i][j].description();
        }
    }
    msg += "movieShelf";
    for(int i = 0; i < saleShelf.length;i++){
        for(int j = 0; j < saleShelf[0].length; j++){
            msg += movieShelf[i][j].getTitle();
            msg += movieShelf[i][j].description();
        }
    }
    return msg;
  }
  
}
