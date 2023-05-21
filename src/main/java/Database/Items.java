package Database;

import Models.User;

public class Items {


    /*

        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.

     */

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı

        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli

     */

    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------
    public static double ItemName(String myitem){
        switch (myitem){
            case "Rose teddy bear":return 30;

            case "Iphone max":return 850.23;
            case "laptop mouse":return 23.50;

            case "Monitor":return 90.23;
            case "charger":return 43.20;
            case "hdmi cable":return 5.90;

            case "mug":return 30;
            default: return 0;
        }
    }
    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı

        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli

     */
public static  double colorPrice(String color){
    switch (color){
        case "Red":return 10;
        case "Blue":return 6;
        case "Black" :return 4;
        case "White": return 2;
        default:return 0;
    }
}
    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------

    //---------------------------------------------------------------------------------------

    /*

        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı

        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */
 public static double customText(String text){
    if (text.length()>10)
        return 5;
    else
        return 3;
}
    // Method buraya yazılacak

    //---------------------------------------------------------------------------------------



}



