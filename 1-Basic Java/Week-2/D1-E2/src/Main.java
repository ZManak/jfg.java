/*Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).*/

import cloth.Models.*;

public class Main {
    public static void main(String[] args) {
        Cloth[] clothes = new Cloth[9];
        clothes[0] = new Shoes(1, "Shoes 1", 1000, "Panama", "Size 1", "Color 1", "Material 1", "Closure 1");
        clothes[1] = new Shoes(2, "Shoes 2", 2000, "Nike", "Size 2", "Color 2", "Material 2", "Closure 2");
        clothes[2] = new Shoes(3, "Shoes 3", 3000, "Adidas", "Size 3", "Color 3", "Material 3", "Closure 3");
        clothes[3] = new Trousers(4, "Trousers 1", 4000, "Brand 4", "Size 4", "Color 4", "Style 1", "Cloth Type 1");
        clothes[4] = new Trousers(5, "Trousers 2", 5000, "Brand 5", "Size 5", "Color 5", "Style 2", "Cloth Type 2");
        clothes[5] = new Trousers(6, "Trousers 3", 6000, "Brand 6", "Size 6", "Color 6", "Style 3", "Cloth Type 3");
        clothes[6] = new Shirt(7, "Shirt 1", 7000, "Brand 7", "Size 7", "Color 7", "Sleeve 1", "Collar 1");
        clothes[7] = new Shirt(8, "Shirt 2", 8000, "Brand 8", "Size 8", "Color 8", "Sleeve 2", "Collar 2");
        clothes[8] = new Hat(9, "Hat 1", 9000, "Brand 9", "Size 9", "Color 9", "Material 9", "Style 9");

        for (Cloth cloth : clothes) {
            cloth.showInfo();
        }
    }
}
