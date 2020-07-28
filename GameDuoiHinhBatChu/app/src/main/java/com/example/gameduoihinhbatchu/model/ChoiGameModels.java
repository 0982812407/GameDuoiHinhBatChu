package com.example.gameduoihinhbatchu.model;

import com.example.gameduoihinhbatchu.ChoiGameActivity;
import com.example.gameduoihinhbatchu.DATA;
import com.example.gameduoihinhbatchu.object.CauDo;
import com.example.gameduoihinhbatchu.object.NguoiDung;

import java.util.ArrayList;

public class ChoiGameModels {
    ChoiGameActivity c;
    ArrayList<CauDo> arr;
    int cauSo=-1;
    public NguoiDung nguoiDung;
    public ChoiGameModels(ChoiGameActivity c){
        this.c = c;
        nguoiDung = new NguoiDung();
        taoData();
    }
    private void taoData(){
        arr = new ArrayList<>(DATA.getData().arrCauDo);
//        arr.add(new CauDo("","sauxa","https://lazi.vn/uploads/dhbc/1470406880_sau-xa.jpg"));
//        arr.add(new CauDo("","nguao","https://lazi.vn/uploads/dhbc/1466667821_ngua-o.jpg"));
//        arr.add(new CauDo("","madu","https://lazi.vn/uploads/dhbc/1514479758_bc2.jpg"));
//        arr.add(new CauDo("Màn 1","baola","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQB6MgYRd3JTu0N3BJLLLgh2T1jjIlh50clQAQCWEQqQ2J2vBlv&usqp=CAU"));
    }
    public CauDo layCauDo(){
        cauSo++;
        if (cauSo>=arr.size()){
            cauSo=arr.size()-1;
        }
        return arr.get(cauSo);
    }
    public void layThongTin(){
        nguoiDung.getTT(c);
    }
    public void luuThongTin(){
        nguoiDung.saveTT(c);
    }
}
