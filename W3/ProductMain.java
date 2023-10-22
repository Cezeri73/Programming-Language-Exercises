/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W3;

/**
 *
 * @author murat
 */
public class ProductMain {

    public static void main(String[] args) {
        Product product = new Product();

        product.setName("Çay ");
        product.setDescription("KaraliÇay");
        product.setId(2023);
        product.setPrice(100);
        product.setStockAmount(500);
        product.setRenk("Siyah");
        product.setStockAmount(10);

        System.out.println(product.getName());
        System.out.println(product.getDescription());
        System.out.println(product.getId());
        System.out.println(product.getPrice());
        System.out.println(product.getStockAmount());
        System.out.println(product.getRenk());

        ProductManager productManager = new ProductManager();

        productManager.Add(product);

    }

}
