package projectBank;

// Imports necesarios para la GUI programática
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Separator; // Añadido para el Separator
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List; // Para la lista de cuentas
// Ya no necesitamos IOException aquí si no cargamos FXML
// Ya no necesitamos FXMLLoader ni Parent

public class App extends Application {

    // Atributos para la lógica de la aplicación y los controles de la GUI
    private Banco miBanco;
    private final String NOMBRE_ARCHIVO = "cuentas.txt"; // Nombre del archivo de datos

    private TextField txtNoCuenta;
    private TextField txtSaldo;
    private TextField txtCantidad;
    private TextArea areaCuentas; // Para mostrar las cuentas

    @Override
    public void start(Stage primaryStage) { // Quitamos 'throws IOException'
        miBanco = new Banco(50); // Capacidad para 50 cuentas, ajusta según necesites

        // Cargar cuentas del archivo al iniciar
        BancoIO.leerArchivo(NOMBRE_ARCHIVO, miBanco);

        primaryStage.setTitle("Gestión Bancaria App");

        // --- Controles de la GUI ---
        Label lblNoCuenta = new Label("Número de Cuenta (5 dígitos):");
        txtNoCuenta = new TextField();
        txtNoCuenta.setPromptText("Ej: 12345");

        Label lblSaldo = new Label("Saldo Inicial (para agregar cuenta):");
        txtSaldo = new TextField();
        txtSaldo.setPromptText("Ej: 100.00");

        Label lblCantidad = new Label("Cantidad (para depositar/retirar):");
        txtCantidad = new TextField();
        txtCantidad.setPromptText("Ej: 50.00");

        Button btnAgregar = new Button("1. Agregar Cuenta");
        Button btnDepositar = new Button("2. Depositar");
        Button btnRetirar = new Button("3. Retirar");
        Button btnMostrar = new Button("4. Mostrar Cuentas");
        Button btnSalir = new Button("5. Salir y Guardar");

        areaCuentas = new TextArea();
        areaCuentas.setEditable(false);
        areaCuentas.setPrefHeight(150);

        // --- Lógica de los Botones (Event Handlers) ---
        btnAgregar.setOnAction(e -> agregarCuenta());
        btnDepositar.setOnAction(e -> depositar());
        btnRetirar.setOnAction(e -> retirar());
        btnMostrar.setOnAction(e -> mostrarCuentas());
        btnSalir.setOnAction(e -> {
            BancoIO.escribirArchivo(NOMBRE_ARCHIVO, miBanco);
            primaryStage.close();
        });
        
        // Acción al cerrar la ventana (guardar también)
        primaryStage.setOnCloseRequest(event -> {
            BancoIO.escribirArchivo(NOMBRE_ARCHIVO, miBanco);
            System.out.println("Cuentas guardadas al cerrar la ventana.");
        });

        // --- Layout ---
        VBox layout = new VBox(10); // Espaciado de 10px
        layout.setPadding(new Insets(15));
        layout.getChildren().addAll(
                lblNoCuenta, txtNoCuenta,
                lblSaldo, txtSaldo,
                lblCantidad, txtCantidad,
                btnAgregar, btnDepositar, btnRetirar, btnMostrar,
                new Separator(), // Una línea para separar
                new Label("Cuentas Registradas:"),
                areaCuentas,
                btnSalir
        );

        // Creamos la escena aquí directamente
        Scene scene = new Scene(layout, 400, 550); // Ancho y alto de la ventana
        primaryStage.setScene(scene);
        primaryStage.show();

        // Mostrar cuentas al inicio también
        mostrarCuentas();
    }

    // --- Métodos para las Acciones de los Botones ---
    // Debes pegar aquí los métodos:
    // private void agregarCuenta() { ... }
    // private void depositar() { ... }
    // private void retirar() { ... }
    // private void mostrarCuentas() { ... }
    // private void showAlert(String title, String message) { ... }
    // private void limpiarCamposEntrada() { ... }
    // (El código completo de estos métodos te lo di en la primera respuesta detallada)

    private void agregarCuenta() {
        try {
            int noCuenta = Integer.parseInt(txtNoCuenta.getText());
            double saldo = Double.parseDouble(txtSaldo.getText());

            CuentaBancaria nuevaCuenta = new CuentaBancaria(saldo, noCuenta);
            miBanco.agregarCuenta(nuevaCuenta);
            mostrarCuentas();
            showAlert("Éxito", "Cuenta " + noCuenta + " agregada exitosamente.");
            limpiarCamposEntrada();
        } catch (NumberFormatException ex) {
            showAlert("Error de Entrada", "Número de cuenta y saldo deben ser números válidos.");
        } catch (IllegalArgumentException ex) {
            showAlert("Error al Agregar Cuenta", ex.getMessage());
        }
    }

    private void depositar() {
        try {
            int noCuenta = Integer.parseInt(txtNoCuenta.getText());
            double cantidad = Double.parseDouble(txtCantidad.getText());

            CuentaBancaria cuenta = miBanco.buscarCuenta(noCuenta);
            if (cuenta != null) {
                cuenta.depositar(cantidad);
                mostrarCuentas();
                showAlert("Éxito", "Depósito de " + cantidad + " realizado a la cuenta " + noCuenta);
            } else {
                showAlert("Error de Operación", "Cuenta " + noCuenta + " no encontrada.");
            }
            limpiarCamposEntrada();
        } catch (NumberFormatException ex) {
            showAlert("Error de Entrada", "Número de cuenta y cantidad deben ser números válidos.");
        } catch (IllegalArgumentException ex) {
            showAlert("Error de Operación", ex.getMessage());
        }
    }

    private void retirar() {
        try {
            int noCuenta = Integer.parseInt(txtNoCuenta.getText());
            double cantidad = Double.parseDouble(txtCantidad.getText());

            CuentaBancaria cuenta = miBanco.buscarCuenta(noCuenta);
            if (cuenta != null) {
                cuenta.retirar(cantidad); // Esto puede lanzar InsufficientFundsException
                mostrarCuentas();
                showAlert("Éxito", "Retiro de " + cantidad + " realizado de la cuenta " + noCuenta);
            } else {
                showAlert("Error de Operación", "Cuenta " + noCuenta + " no encontrada.");
            }
            limpiarCamposEntrada();
        } catch (NumberFormatException ex) {
            showAlert("Error de Entrada", "Número de cuenta y cantidad deben ser números válidos.");
        } catch (IllegalArgumentException | InsufficientFundsException ex) {
            showAlert("Error de Operación", ex.getMessage());
        }
    }

    private void mostrarCuentas() {
        if (areaCuentas == null || miBanco == null) { // Comprobación adicional
             System.err.println("Intentando mostrar cuentas pero areaCuentas o miBanco no están inicializados.");
             if(areaCuentas != null) areaCuentas.setText("Error interno al cargar cuentas.");
             return;
        }
        areaCuentas.clear();
        List<CuentaBancaria> cuentas = miBanco.getCopiaDeCuentas();
        if (cuentas.isEmpty()) {
            areaCuentas.setText("No hay cuentas registradas.");
        } else {
            for (CuentaBancaria cuenta : cuentas) {
                areaCuentas.appendText(cuenta.toString() + "\n");
            }
        }
    }
    
    private void limpiarCamposEntrada() {
        txtNoCuenta.clear();
        txtSaldo.clear();
        txtCantidad.clear();
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (title.toLowerCase().contains("error")) {
            alert.setAlertType(Alert.AlertType.ERROR);
        }
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    // El método main para lanzar la aplicación
    public static void main(String[] args) {
        launch(args); // Usar launch(args) para pasar argumentos si los hubiera
    }
}
