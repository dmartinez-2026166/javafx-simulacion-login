package com.diegomartinez.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BienvenidaView extends VBox {
    
    private static BienvenidaView instanciaBienvenidaView;
    private Label lblMensaje;
    private Button btnAceptar;
    private String nombreUsuarioInicial = ""; // Variable para guardar el nombre temporalmente
    
    // 1. Modificamos el constructor para que reciba el nombre de una vez
    public BienvenidaView(String nombreUsuario) {
        this.nombreUsuarioInicial = nombreUsuario;
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        this.setAlignment(Pos.CENTER);
        this.setSpacing(20);
        
        this.setStyle(
            "-fx-background-color: #2c3e50; " +
            "-fx-background-radius: 15; " +
            "-fx-border-radius: 15; " +
            "-fx-border-color: #34495e; " +
            "-fx-border-width: 2; " +
            "-fx-padding: 25;"
        );
        
        // 2. Aquí creamos la etiqueta directamente con el mensaje "Bienvenido, " + nombre
        lblMensaje = new Label("Bienvenido, " + nombreUsuarioInicial);
        lblMensaje.setStyle(
            "-fx-text-fill: #ecf0f1; " +
            "-fx-font-size: 16px; " +
            "-fx-font-weight: bold; " +
            "-fx-font-family: 'Segoe UI', Arial;"
        );
        
        btnAceptar = new Button("Aceptar");
        btnAceptar.setPrefWidth(120);
        btnAceptar.setStyle(
            "-fx-background-color: #e74c3c; " +
            "-fx-text-fill: white; " +
            "-fx-font-weight: bold; " +
            "-fx-background-radius: 5; " +
            "-fx-cursor: hand;"
        );
        
        btnAceptar.setOnMouseEntered(e -> btnAceptar.setStyle("-fx-background-color: #c0392b; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5; -fx-cursor: hand;"));
        btnAceptar.setOnMouseExited(e -> btnAceptar.setStyle("-fx-background-color: #e74c3c; -fx-text-fill: white; -fx-font-weight: bold; -fx-background-radius: 5; -fx-cursor: hand;"));

        btnAceptar.setOnAction(evento -> {
            Stage stage = (Stage) this.getScene().getWindow();
            if (stage != null) {
                stage.close();
            }
        });
        
        this.getChildren().addAll(lblMensaje, btnAceptar);
    }

    // Método para actualizar el nombre dinámicamente si se llega a necesitar después
    public void setNombreUsuario(String nombre) {
        this.nombreUsuarioInicial = nombre;
        if (lblMensaje != null) {
            lblMensaje.setText("Bienvenido, " + nombre);
        }
    }

    // 3. Ajustamos el Singleton para que reciba el parámetro
    public static BienvenidaView getInstancaBienvenidaView(String nombreUsuario) {
        if (instanciaBienvenidaView == null) {
            instanciaBienvenidaView = new BienvenidaView(nombreUsuario);
        } else {
            // Si ya existía la instancia, actualizamos su nombre antes de devolverla
            instanciaBienvenidaView.setNombreUsuario(nombreUsuario);
        }
        return instanciaBienvenidaView;
    }

    public static void setInstanciBienvenidaView(BienvenidaView instanciaBienvenidaView) {
        BienvenidaView.instanciaBienvenidaView = instanciaBienvenidaView;
    }
}