package com.diegomartinez.view;

import javafx.scene.layout.VBox;

public class BienvenidaView extends VBox{
    private static BienvenidaView instanciaBienvenidaView;
    
    public BienvenidaView() {
    
    }

    public static BienvenidaView getInstancaBienvenidaView() {
        if (instanciaBienvenidaView == null) {
            instanciaBienvenidaView = new BienvenidaView();
        }
        return instanciaBienvenidaView;
    }

    public static void setInstanciBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }
    
    
}
