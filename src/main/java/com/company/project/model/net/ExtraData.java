package com.company.project.model.net;

/**
 * Created by liubo on 17/11/9.
 */
public class ExtraData {
    private String title;
    private String pic;
    private String priceL;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getPriceL() {
        return priceL;
    }

    public void setPriceL(String priceL) {
        this.priceL = priceL;
    }

    @Override
    public String toString() {
        return "ExtraData{" +
                "title='" + title + '\'' +
                ", pic='" + pic + '\'' +
                ", priceL='" + priceL + '\'' +
                '}';
    }
}
