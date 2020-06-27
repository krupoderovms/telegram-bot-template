package com.KrupoderovMikhail.github.telegrambot.dto.videos;

/**
 * @author Krupoderov Mikhail
 * @version 1.0
 */
public class VideoDTO {

    private String title;

    private String url;

    private String thumbs;

    private String duration;

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbs() {
        return thumbs;
    }

    public void setThumbs(String thumbs) {
        this.thumbs = thumbs;
    }
}
