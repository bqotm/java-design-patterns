package dev.bqot.template_method;

public class Zmain {

    public static void main(String[] args) {
        GTA5Loading gta5Loading=new GTA5Loading();
        gta5Loading.load();
        ChessLoading chessLoading=new ChessLoading();
        chessLoading.load();
    }

}
