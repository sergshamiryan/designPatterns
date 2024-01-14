package org.example.behavioural.strategy;

import org.example.behavioural.strategy.problem1.Item;
import org.example.behavioural.strategy.problem1.PayPalStrategy;
import org.example.behavioural.strategy.problem1.PaymentStrategy;
import org.example.behavioural.strategy.problem1.ShoppingCardContext;
import org.example.behavioural.strategy.problem2.FacebookPlatformStrategy;
import org.example.behavioural.strategy.problem2.Photo;
import org.example.behavioural.strategy.problem2.PhotoSharingContext;
import org.example.behavioural.strategy.problem2.SocialPlatformStrategy;
import org.example.behavioural.strategy.sofarchandcleandesign.*;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        strategy3();
    }

    void strategy() {
        Item item = new Item("Tv", 60);
        Item item2 = new Item("PlayStation", 90);
        PaymentStrategy paymentStrategy = new PayPalStrategy("admin@bank.com", "234");
        ShoppingCardContext shoppingCardContext = new ShoppingCardContext(List.of(item, item2));
        shoppingCardContext.pay(paymentStrategy);
    }

    static void strategy2() {
        Photo photo = new Photo("Family Photo");
        SocialPlatformStrategy fbPlatform = new FacebookPlatformStrategy();
        PhotoSharingContext photoSharingContext = new PhotoSharingContext(fbPlatform);
        photoSharingContext.sharePhoto(photo);
    }

    static void strategy3() {
        File file = new File("Document");
        CompressionStrategy rarStrategy = new ZipCompressionStrategy();
        CompressionContext ctxt = new CompressionContext(rarStrategy);
        ctxt.compressFiles(List.of(file));
        ctxt.compressFiles(List.of(file),
                files -> new RarCompressionStrategy().compresFiles(files));
    }
}
