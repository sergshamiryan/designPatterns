package org.example.behavioural.strategy.problem2;

public class PhotoSharingContext {
    private SocialPlatformStrategy socialPlatformStrategy;

    public PhotoSharingContext(SocialPlatformStrategy socialPlatformStrategy) {
        this.socialPlatformStrategy = socialPlatformStrategy;
    }

    public void sharePhoto(Photo photo) {
        socialPlatformStrategy.share(photo);
    }
}
