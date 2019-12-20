package com.example.elwarsha.Home;

public class HomeModel {
    String CatName;
    int CatImge;
    String CatId;

    public HomeModel(String catName,int catImge,String catId) {
        CatName = catName;
        CatImge = catImge;
        CatId = catId;
    }

    public String getCatName() {
        return CatName;
    }

    public int getCatImge() {
        return CatImge;
    }

    public String getCatId() {
        return CatId;

}
}
