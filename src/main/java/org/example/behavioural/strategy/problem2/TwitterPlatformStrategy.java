package org.example.behavioural.strategy.problem2;

public class TwitterPlatformStrategy implements SocialPlatformStrategy {

    @Override
    public void share(Photo photo) {
        System.out.println("Sharing photo in Twitter " + photo.name);
    }
}
