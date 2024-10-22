/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instancias;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import manejadorArchivosUser.Pasaporte;
import cargaArchivos.*;
import cargaTablas.*;
import static instancias.FramePasajeros.c;
import static instancias.FrameVentaAsientos.frameVentaAsientos;
import static instancias.FrameVisualizarDistribucionAsientos.frameVisualizarDistribucionAsientos;
import java.awt.Toolkit;
import java.io.FileWriter;
import manejadorArchivosAeropuerto.Aerolineas;
import manejadorArchivosAeropuerto.Aeropuerto;
import manejadorArchivosAeropuerto.Aviones;
import manejadorArchivosAeropuerto.CrearAviones;
import manejadorArchivosAeropuerto.Distancia;
import manejadorArchivosAeropuerto.Renovacion;
import manejadorArchivosAeropuerto.Reservacion;
import manejadorArchivosAeropuerto.Vuelo;
import manejadorArchivosUser.*;
import static proyectofinal.ProyectoFinal.c1;
/**
 *
 * @author Mariano
 */
public class FrameDepartamentoAdministracion extends javax.swing.JFrame {
    private CargarPasaporteEnTexto cargarPasaporteEnTexto;
    private GuardarPasaporteBinario guardarPasaporteBinario;
    private CargarPasaporteBinario cargarPasaporteBinario;
    private CargarAeropuertoEnTexto cargarAeropuertoEnTexto;
    private GuardarAeropuertoBinario guardarAeropuertoBinario;
    private CargarAeropuertoBinario cargarAeropuertoBinario;
    private CargarAerolineasEnTexto cargarAerolineasEnTexto;
    private GuardarAerolineasBinario guardarAerolineasBinario;
    private CargarAerolineasBinario cargarAerolineasBinario;
    private CargarAvionesEnTexto cargarAvionesEnTexto;
    private GuardarAvionesBinario guardarAvionesBinario;
    private CargarAvionesBinario cargarAvionesBinario;  
    private CargarDistanciaEnTexto cargarDistanciaEnTexto;
    private GuardarDistanciaBinario guardarDistanciaBinario;
    private CargarDistanciaBinario cargarDistanciaBinario;
    private CargarVueloEnTexto cargarVueloEnTexto;
    private GuardarVueloBinario guardarVueloBinario;
    private CargarVueloBinario cargarVueloBinario;
    private CargarTarjetaEnTexto cargarTarjetaEnTexto;
    private GuardarTarjetaBinario guardarTarjetaBinario;
    private CargarTarjetaBinario cargarTarjetaBinario;
    private CargarRenovacionEnTexto cargarRenovacionEnTexto;
    private GuardarRenovacionBinario guardarRenovacionBinario;
    private CargarRenovacionBinario cargarRenovacionBinario;
    private CargarReservacionEnTexto cargarReservacionEnTexto;
    private GuardarReservacionBinario guardarReservacionBinario;
    private CargarReservacionBinario cargarReservacionBinario;
    /**
     * Creates new form DepartamentoAdministracion
     */
    FondoInicio departamentoAdmin = new FondoInicio();//Creamos un nuevo fondo
    public static FrameDepartamentoAdministracion frameDepartamentoAdministracion;
    public static void iniciarDepartamentoAdmin(){
        frameDepartamentoAdministracion=new FrameDepartamentoAdministracion();
    }
    public static void visible(){
        frameDepartamentoAdministracion.setVisible(true);
    }
    public FrameDepartamentoAdministracion() {
        this.setContentPane(departamentoAdmin);//Realizamos la pintada de nuestro fondo
        creacionDatosUsar();
        initComponents();
        
        this.setLocationRelativeTo(null);//Centramos nuestro frame
    }
    public void creacionDatosUsar(){
        this.cargarPasaporteEnTexto = new CargarPasaporteEnTexto();
        this.guardarPasaporteBinario = new GuardarPasaporteBinario();
        this.cargarPasaporteBinario = new CargarPasaporteBinario();
        this.cargarAeropuertoEnTexto = new CargarAeropuertoEnTexto();
        this.guardarAeropuertoBinario = new GuardarAeropuertoBinario();
        this.cargarAeropuertoBinario = new CargarAeropuertoBinario();
        this.cargarAerolineasEnTexto = new CargarAerolineasEnTexto();
        this.guardarAerolineasBinario = new GuardarAerolineasBinario();
        this.cargarAerolineasBinario = new CargarAerolineasBinario();  
        this.cargarAvionesEnTexto = new CargarAvionesEnTexto();
        this.guardarAvionesBinario = new GuardarAvionesBinario();
        this.cargarAvionesBinario = new CargarAvionesBinario();      
        this.cargarDistanciaEnTexto = new CargarDistanciaEnTexto();
        this.guardarDistanciaBinario = new GuardarDistanciaBinario();
        this.cargarDistanciaBinario = new CargarDistanciaBinario();  
        this.cargarVueloEnTexto = new CargarVueloEnTexto();
        this.guardarVueloBinario = new GuardarVueloBinario();
        this.cargarVueloBinario = new CargarVueloBinario();
        this.cargarTarjetaEnTexto = new CargarTarjetaEnTexto();
        this.guardarTarjetaBinario = new GuardarTarjetaBinario();
        this.cargarTarjetaBinario = new CargarTarjetaBinario();
        this.cargarRenovacionEnTexto = new CargarRenovacionEnTexto();
        this.guardarRenovacionBinario = new GuardarRenovacionBinario();
        this.cargarRenovacionBinario = new CargarRenovacionBinario();
        this.cargarReservacionEnTexto = new CargarReservacionEnTexto();
        this.guardarReservacionBinario = new GuardarReservacionBinario();
        this.cargarReservacionBinario = new CargarReservacionBinario();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        RegresarMenu = new javax.swing.JButton();
        SalirDelSistema = new javax.swing.JButton();
        Admin1 = new javax.swing.JTabbedPane();
        jDesktopPane9 = new javax.swing.JDesktopPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        mostrarDatosCargados = new javax.swing.JTextArea();
        InfoCargada1 = new javax.swing.JLabel();
        CargaPasaporte = new javax.swing.JButton();
        CargaTarjeta = new javax.swing.JButton();
        CargaDistancia = new javax.swing.JButton();
        CargaVuelo = new javax.swing.JButton();
        CargaAeropuerto = new javax.swing.JButton();
        CargaAerolineas = new javax.swing.JButton();
        CargaAviones = new javax.swing.JButton();
        CargaBoton1 = new javax.swing.JLabel();
        CargaRenovacion = new javax.swing.JButton();
        CargaReservacion = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaVerAerolineas = new javax.swing.JTable();
        verAerolineas = new javax.swing.JButton();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaVerAeropuertos = new javax.swing.JTable();
        verAeropuertos = new javax.swing.JButton();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaVerAviones = new javax.swing.JTable();
        verAviones = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        modificarAvion = new javax.swing.JButton();
        crearAvion = new javax.swing.JButton();
        nombreAerolinea = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        nombreAerolineaField = new javax.swing.JTextField();
        nombreAeropuertoField = new javax.swing.JTextField();
        nombreAerolinea1 = new javax.swing.JLabel();
        columasAsientosField = new javax.swing.JTextField();
        nombreAerolinea2 = new javax.swing.JLabel();
        pasillosField = new javax.swing.JTextField();
        pasillos = new javax.swing.JLabel();
        capacidadGasolinaField = new javax.swing.JTextField();
        consumoGasolina = new javax.swing.JLabel();
        consumoMillaField = new javax.swing.JTextField();
        consumoMilla = new javax.swing.JLabel();
        columnasAsientos = new javax.swing.JLabel();
        filaAsientos = new javax.swing.JLabel();
        CodigoAvionField = new javax.swing.JTextField();
        fileasAsientosField = new javax.swing.JTextField();
        pasillos2 = new javax.swing.JLabel();
        cadaCuantoPasillosField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        RegistrarBoton = new javax.swing.JButton();
        Pasaporte = new javax.swing.JLabel();
        PasaporteField = new javax.swing.JTextField();
        FechaNacimiento = new javax.swing.JLabel();
        FechaNacimientoField = new javax.swing.JFormattedTextField();
        Nacionalidad = new javax.swing.JLabel();
        NacionalidadCombo = new javax.swing.JComboBox<>();
        EstadoCivil = new javax.swing.JLabel();
        EstadoCivilCombo = new javax.swing.JComboBox<>();
        Nombres = new javax.swing.JLabel();
        NombresField = new javax.swing.JTextField();
        Apellidos = new javax.swing.JLabel();
        ApellidosField = new javax.swing.JTextField();
        Sexo = new javax.swing.JLabel();
        SexoCombo = new javax.swing.JComboBox<>();
        FechaVenPas = new javax.swing.JLabel();
        FechaVenPasField = new javax.swing.JFormattedTextField();
        FechaEmPas = new javax.swing.JLabel();
        FechaEmPasField = new javax.swing.JFormattedTextField();
        PaisActual = new javax.swing.JLabel();
        PaisActualCombo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVerPasaporte = new javax.swing.JTable();
        verPasaportes = new javax.swing.JButton();
        jDesktopPane6 = new javax.swing.JDesktopPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaVerTarjetas = new javax.swing.JTable();
        verTarjetas = new javax.swing.JButton();
        TarjetaField = new javax.swing.JTextField();
        Tarjetatext = new javax.swing.JLabel();
        Pasaporte2 = new javax.swing.JLabel();
        PasaporteTarjeta = new javax.swing.JTextField();
        dineroActual = new javax.swing.JLabel();
        dineroActualField = new javax.swing.JTextField();
        codigoCvC = new javax.swing.JLabel();
        codigoCVCField = new javax.swing.JTextField();
        AnadirTarjetaBoton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDesktopPane10 = new javax.swing.JDesktopPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaVerDistancias = new javax.swing.JTable();
        verDistancias = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane8 = new javax.swing.JScrollPane();
        tablaVerVuelo = new javax.swing.JTable();
        verVuelos = new javax.swing.JButton();
        jDesktopPane7 = new javax.swing.JDesktopPane();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaRenovacion = new javax.swing.JTable();
        verRenovacion = new javax.swing.JButton();
        jDesktopPane8 = new javax.swing.JDesktopPane();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaReservacion = new javax.swing.JTable();
        verReservacion = new javax.swing.JButton();
        jDesktopPane11 = new javax.swing.JDesktopPane();
        reporteAerolinea = new javax.swing.JButton();
        reporteVuelos = new javax.swing.JButton();
        reporteAvion = new javax.swing.JButton();
        reporteAeropuerto = new javax.swing.JButton();
        reportePasajero = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        cargaReportes = new javax.swing.JTextArea();
        limpiar = new javax.swing.JButton();
        exportar = new javax.swing.JButton();
        RegresarMenu1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Departamento de Administracion");

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo.PNG"))); // NOI18N
        jPanel2.add(Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, -1, -1));

        RegresarMenu.setBackground(new java.awt.Color(255, 0, 0));
        RegresarMenu.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        RegresarMenu.setForeground(new java.awt.Color(0, 0, 0));
        RegresarMenu.setText("Regresar");
        RegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenuActionPerformed(evt);
            }
        });
        jPanel2.add(RegresarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 160, 44));

        SalirDelSistema.setBackground(new java.awt.Color(255, 0, 0));
        SalirDelSistema.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        SalirDelSistema.setForeground(new java.awt.Color(0, 0, 0));
        SalirDelSistema.setText("Salir");
        SalirDelSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirDelSistemaActionPerformed(evt);
            }
        });
        jPanel2.add(SalirDelSistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(1107, 600, 158, 44));

        Admin1.setForeground(new java.awt.Color(0, 0, 0));

        jDesktopPane9.setBackground(new java.awt.Color(153, 255, 255));

        mostrarDatosCargados.setColumns(20);
        mostrarDatosCargados.setRows(5);
        jScrollPane2.setViewportView(mostrarDatosCargados);

        InfoCargada1.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        InfoCargada1.setForeground(new java.awt.Color(0, 0, 0));
        InfoCargada1.setText("Informacion Cargada");

        CargaPasaporte.setBackground(new java.awt.Color(255, 255, 51));
        CargaPasaporte.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CargaPasaporte.setForeground(new java.awt.Color(0, 0, 0));
        CargaPasaporte.setText("Cargar Pasaporte");
        CargaPasaporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaPasaporteActionPerformed(evt);
            }
        });

        CargaTarjeta.setBackground(new java.awt.Color(255, 255, 51));
        CargaTarjeta.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CargaTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        CargaTarjeta.setText("Cargar Tarjeta");
        CargaTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaTarjetaActionPerformed(evt);
            }
        });

        CargaDistancia.setBackground(new java.awt.Color(255, 255, 51));
        CargaDistancia.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CargaDistancia.setForeground(new java.awt.Color(0, 0, 0));
        CargaDistancia.setText("Carga Distancia");
        CargaDistancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaDistanciaActionPerformed(evt);
            }
        });

        CargaVuelo.setBackground(new java.awt.Color(255, 255, 51));
        CargaVuelo.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CargaVuelo.setForeground(new java.awt.Color(0, 0, 0));
        CargaVuelo.setText("Carga vuelo");
        CargaVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaVueloActionPerformed(evt);
            }
        });

        CargaAeropuerto.setBackground(new java.awt.Color(255, 255, 51));
        CargaAeropuerto.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CargaAeropuerto.setForeground(new java.awt.Color(0, 0, 0));
        CargaAeropuerto.setText("Carga Aeropuerto");
        CargaAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaAeropuertoActionPerformed(evt);
            }
        });

        CargaAerolineas.setBackground(new java.awt.Color(255, 255, 51));
        CargaAerolineas.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CargaAerolineas.setForeground(new java.awt.Color(0, 0, 0));
        CargaAerolineas.setText("Carga Aerolineas");
        CargaAerolineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaAerolineasActionPerformed(evt);
            }
        });

        CargaAviones.setBackground(new java.awt.Color(255, 255, 51));
        CargaAviones.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CargaAviones.setForeground(new java.awt.Color(0, 0, 0));
        CargaAviones.setText("Carga Aviones");
        CargaAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaAvionesActionPerformed(evt);
            }
        });

        CargaBoton1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        CargaBoton1.setForeground(new java.awt.Color(0, 0, 0));
        CargaBoton1.setText("Opciones de Carga");

        CargaRenovacion.setBackground(new java.awt.Color(255, 255, 51));
        CargaRenovacion.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CargaRenovacion.setForeground(new java.awt.Color(0, 0, 0));
        CargaRenovacion.setText("carga renovacion");
        CargaRenovacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaRenovacionActionPerformed(evt);
            }
        });

        CargaReservacion.setBackground(new java.awt.Color(255, 255, 51));
        CargaReservacion.setFont(new java.awt.Font("Engravers MT", 1, 12)); // NOI18N
        CargaReservacion.setForeground(new java.awt.Color(0, 0, 0));
        CargaReservacion.setText("carga Reservacion ");
        CargaReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargaReservacionActionPerformed(evt);
            }
        });

        jDesktopPane9.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(InfoCargada1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaPasaporte, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaTarjeta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaDistancia, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaVuelo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaAeropuerto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaAerolineas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaAviones, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaBoton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaRenovacion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane9.setLayer(CargaReservacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane9Layout = new javax.swing.GroupLayout(jDesktopPane9);
        jDesktopPane9.setLayout(jDesktopPane9Layout);
        jDesktopPane9Layout.setHorizontalGroup(
            jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane9Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(InfoCargada1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                .addComponent(CargaBoton1)
                .addGap(29, 29, 29))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CargaPasaporte, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CargaTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CargaDistancia, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CargaVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CargaAeropuerto, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CargaAerolineas, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CargaAviones, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(CargaRenovacion, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CargaReservacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jDesktopPane9Layout.setVerticalGroup(
            jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InfoCargada1)
                    .addComponent(CargaBoton1))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane9Layout.createSequentialGroup()
                        .addComponent(CargaPasaporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CargaTarjeta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CargaAeropuerto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CargaAerolineas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CargaAviones)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CargaVuelo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CargaDistancia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CargaRenovacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CargaReservacion))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Admin1.addTab("Carga de archivos", jDesktopPane9);

        jDesktopPane2.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVerAerolineas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(tablaVerAerolineas);

        jDesktopPane2.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1200, 410));

        verAerolineas.setBackground(new java.awt.Color(0, 255, 255));
        verAerolineas.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        verAerolineas.setForeground(new java.awt.Color(0, 0, 0));
        verAerolineas.setText("VER AEROLINEAS");
        verAerolineas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAerolineasActionPerformed(evt);
            }
        });
        jDesktopPane2.add(verAerolineas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        Admin1.addTab("Ver Aerolineas", jDesktopPane2);

        jDesktopPane3.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVerAeropuertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(tablaVerAeropuertos);

        jDesktopPane3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1190, 410));

        verAeropuertos.setBackground(new java.awt.Color(0, 255, 255));
        verAeropuertos.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        verAeropuertos.setForeground(new java.awt.Color(0, 0, 0));
        verAeropuertos.setText("VER AEROPUERTOS");
        verAeropuertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAeropuertosActionPerformed(evt);
            }
        });
        jDesktopPane3.add(verAeropuertos, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, -1, -1));

        Admin1.addTab("Ver Aeropuertos", jDesktopPane3);

        jDesktopPane4.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVerAviones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablaVerAviones);

        jDesktopPane4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 690, 410));

        verAviones.setBackground(new java.awt.Color(0, 255, 255));
        verAviones.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        verAviones.setForeground(new java.awt.Color(0, 0, 0));
        verAviones.setText("VER AVIONES");
        verAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verAvionesActionPerformed(evt);
            }
        });
        jDesktopPane4.add(verAviones, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 430, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modificarAvion.setBackground(new java.awt.Color(255, 255, 0));
        modificarAvion.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        modificarAvion.setForeground(new java.awt.Color(0, 0, 0));
        modificarAvion.setText("Modificar Avion");
        modificarAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarAvionActionPerformed(evt);
            }
        });
        jPanel1.add(modificarAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        crearAvion.setBackground(new java.awt.Color(255, 255, 0));
        crearAvion.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        crearAvion.setForeground(new java.awt.Color(0, 0, 0));
        crearAvion.setText("Crear Avion");
        crearAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearAvionActionPerformed(evt);
            }
        });
        jPanel1.add(crearAvion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 177, -1));

        nombreAerolinea.setForeground(new java.awt.Color(0, 0, 0));
        nombreAerolinea.setText("Nombre Aerolinea");
        jPanel1.add(nombreAerolinea, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 29, -1, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, -1));

        nombreAerolineaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreAerolineaFieldActionPerformed(evt);
            }
        });
        nombreAerolineaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreAerolineaFieldKeyTyped(evt);
            }
        });
        jPanel1.add(nombreAerolineaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 170, -1));

        nombreAeropuertoField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreAeropuertoFieldKeyTyped(evt);
            }
        });
        jPanel1.add(nombreAeropuertoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 170, -1));

        nombreAerolinea1.setForeground(new java.awt.Color(0, 0, 0));
        nombreAerolinea1.setText("Nombre Aeropuerto Actual");
        jPanel1.add(nombreAerolinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        columasAsientosField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                columasAsientosFieldKeyTyped(evt);
            }
        });
        jPanel1.add(columasAsientosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 170, -1));

        nombreAerolinea2.setForeground(new java.awt.Color(0, 0, 0));
        nombreAerolinea2.setText("CodigoAvion");
        jPanel1.add(nombreAerolinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        pasillosField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pasillosFieldKeyTyped(evt);
            }
        });
        jPanel1.add(pasillosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 170, -1));

        pasillos.setForeground(new java.awt.Color(0, 0, 0));
        pasillos.setText("Pasillos");
        jPanel1.add(pasillos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        capacidadGasolinaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                capacidadGasolinaFieldKeyTyped(evt);
            }
        });
        jPanel1.add(capacidadGasolinaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 170, -1));

        consumoGasolina.setForeground(new java.awt.Color(0, 0, 0));
        consumoGasolina.setText("Capacidad gasolina");
        jPanel1.add(consumoGasolina, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        consumoMillaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                consumoMillaFieldKeyTyped(evt);
            }
        });
        jPanel1.add(consumoMillaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 170, -1));

        consumoMilla.setForeground(new java.awt.Color(0, 0, 0));
        consumoMilla.setText("Consumo por milla");
        jPanel1.add(consumoMilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        columnasAsientos.setForeground(new java.awt.Color(0, 0, 0));
        columnasAsientos.setText("Columnas Asientos");
        jPanel1.add(columnasAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        filaAsientos.setForeground(new java.awt.Color(0, 0, 0));
        filaAsientos.setText("Filas Asientos");
        jPanel1.add(filaAsientos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        CodigoAvionField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoAvionFieldActionPerformed(evt);
            }
        });
        CodigoAvionField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CodigoAvionFieldKeyTyped(evt);
            }
        });
        jPanel1.add(CodigoAvionField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 120, 170, -1));

        fileasAsientosField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fileasAsientosFieldKeyTyped(evt);
            }
        });
        jPanel1.add(fileasAsientosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 170, -1));

        pasillos2.setForeground(new java.awt.Color(0, 0, 0));
        pasillos2.setText("Cada cuentas columas hay pasillos");
        jPanel1.add(pasillos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        cadaCuantoPasillosField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cadaCuantoPasillosFieldKeyTyped(evt);
            }
        });
        jPanel1.add(cadaCuantoPasillosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 170, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMadera.jpg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 450));

        jDesktopPane4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 460, 450));

        Admin1.addTab("Añadir/Ver Aviones", jDesktopPane4);

        jDesktopPane5.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RegistrarBoton.setBackground(new java.awt.Color(0, 204, 204));
        RegistrarBoton.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        RegistrarBoton.setForeground(new java.awt.Color(0, 0, 0));
        RegistrarBoton.setText("Añadir pasaporte");
        RegistrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarBotonActionPerformed(evt);
            }
        });
        jDesktopPane5.add(RegistrarBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        Pasaporte.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Pasaporte.setForeground(new java.awt.Color(0, 0, 0));
        Pasaporte.setText("Pasaporte");
        jDesktopPane5.add(Pasaporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        PasaporteField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasaporteFieldActionPerformed(evt);
            }
        });
        PasaporteField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasaporteFieldKeyTyped(evt);
            }
        });
        jDesktopPane5.add(PasaporteField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 160, -1));

        FechaNacimiento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FechaNacimiento.setForeground(new java.awt.Color(0, 0, 0));
        FechaNacimiento.setText("Fecha nacimiento");
        jDesktopPane5.add(FechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        FechaNacimientoField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jDesktopPane5.add(FechaNacimientoField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 160, 20));

        Nacionalidad.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Nacionalidad.setForeground(new java.awt.Color(0, 0, 0));
        Nacionalidad.setText("Nacionalidad");
        jDesktopPane5.add(Nacionalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        NacionalidadCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "ordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        jDesktopPane5.add(NacionalidadCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 160, -1));

        EstadoCivil.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        EstadoCivil.setForeground(new java.awt.Color(0, 0, 0));
        EstadoCivil.setText("Estado civil");
        jDesktopPane5.add(EstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        EstadoCivilCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado" }));
        jDesktopPane5.add(EstadoCivilCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 160, -1));

        Nombres.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Nombres.setForeground(new java.awt.Color(0, 0, 0));
        Nombres.setText("Nombres");
        jDesktopPane5.add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        NombresField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombresFieldActionPerformed(evt);
            }
        });
        NombresField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombresFieldKeyTyped(evt);
            }
        });
        jDesktopPane5.add(NombresField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 160, -1));

        Apellidos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Apellidos.setForeground(new java.awt.Color(0, 0, 0));
        Apellidos.setText("Apellidos");
        jDesktopPane5.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        ApellidosField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApellidosFieldActionPerformed(evt);
            }
        });
        ApellidosField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ApellidosFieldKeyTyped(evt);
            }
        });
        jDesktopPane5.add(ApellidosField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, 160, -1));

        Sexo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Sexo.setForeground(new java.awt.Color(0, 0, 0));
        Sexo.setText("Sexo");
        jDesktopPane5.add(Sexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        SexoCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        jDesktopPane5.add(SexoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        FechaVenPas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FechaVenPas.setForeground(new java.awt.Color(0, 0, 0));
        FechaVenPas.setText("Fecha vencimiento pasaporte");
        jDesktopPane5.add(FechaVenPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        FechaVenPasField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jDesktopPane5.add(FechaVenPasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 160, 20));

        FechaEmPas.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        FechaEmPas.setForeground(new java.awt.Color(0, 0, 0));
        FechaEmPas.setText("Fecha emisión pasaporte");
        jDesktopPane5.add(FechaEmPas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        FechaEmPasField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        jDesktopPane5.add(FechaEmPasField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 160, 20));

        PaisActual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        PaisActual.setForeground(new java.awt.Color(0, 0, 0));
        PaisActual.setText("Pais Actual");
        jDesktopPane5.add(PaisActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        PaisActualCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Belice", "Benín", "Bielorrusia", "Birmania", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Ciudad del Vaticano", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guyana", "Guinea", "Guinea ecuatorial", "Guinea-Bisáu", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "ordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Macedonia del Norte", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "Samoa", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Suazilandia", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));
        jDesktopPane5.add(PaisActualCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 160, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMadera.jpg"))); // NOI18N
        jDesktopPane5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 430, 410));

        tablaVerPasaporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaVerPasaporte);

        jDesktopPane5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 690, 410));

        verPasaportes.setBackground(new java.awt.Color(0, 255, 255));
        verPasaportes.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        verPasaportes.setForeground(new java.awt.Color(0, 0, 0));
        verPasaportes.setText("Ver Pasaportes");
        verPasaportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPasaportesActionPerformed(evt);
            }
        });
        jDesktopPane5.add(verPasaportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 430, -1, -1));

        Admin1.addTab("Añadir/Ver Pasaportes", jDesktopPane5);

        jDesktopPane6.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVerTarjetas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablaVerTarjetas);

        jDesktopPane6.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 690, 410));

        verTarjetas.setBackground(new java.awt.Color(0, 255, 255));
        verTarjetas.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        verTarjetas.setForeground(new java.awt.Color(0, 0, 0));
        verTarjetas.setText("VER TARJETAS");
        verTarjetas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verTarjetasActionPerformed(evt);
            }
        });
        jDesktopPane6.add(verTarjetas, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, -1));

        TarjetaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TarjetaFieldActionPerformed(evt);
            }
        });
        TarjetaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TarjetaFieldKeyTyped(evt);
            }
        });
        jDesktopPane6.add(TarjetaField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 160, -1));

        Tarjetatext.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Tarjetatext.setForeground(new java.awt.Color(0, 0, 0));
        Tarjetatext.setText("Tarjeta");
        jDesktopPane6.add(Tarjetatext, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        Pasaporte2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Pasaporte2.setForeground(new java.awt.Color(0, 0, 0));
        Pasaporte2.setText("Pasaporte");
        jDesktopPane6.add(Pasaporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        PasaporteTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasaporteTarjetaActionPerformed(evt);
            }
        });
        PasaporteTarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasaporteTarjetaKeyTyped(evt);
            }
        });
        jDesktopPane6.add(PasaporteTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 160, -1));

        dineroActual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        dineroActual.setForeground(new java.awt.Color(0, 0, 0));
        dineroActual.setText("Dinero Actual");
        jDesktopPane6.add(dineroActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        dineroActualField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dineroActualFieldActionPerformed(evt);
            }
        });
        dineroActualField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dineroActualFieldKeyTyped(evt);
            }
        });
        jDesktopPane6.add(dineroActualField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 160, -1));

        codigoCvC.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        codigoCvC.setForeground(new java.awt.Color(0, 0, 0));
        codigoCvC.setText("Codigo CVC");
        jDesktopPane6.add(codigoCvC, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        codigoCVCField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoCVCFieldActionPerformed(evt);
            }
        });
        codigoCVCField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoCVCFieldKeyTyped(evt);
            }
        });
        jDesktopPane6.add(codigoCVCField, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 160, -1));

        AnadirTarjetaBoton.setBackground(new java.awt.Color(0, 204, 204));
        AnadirTarjetaBoton.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        AnadirTarjetaBoton.setForeground(new java.awt.Color(0, 0, 0));
        AnadirTarjetaBoton.setText("Añadir Tarjeta");
        AnadirTarjetaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnadirTarjetaBotonActionPerformed(evt);
            }
        });
        jDesktopPane6.add(AnadirTarjetaBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoMadera.jpg"))); // NOI18N
        jDesktopPane6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 430, 310));

        Admin1.addTab("Añadir/Ver Tarjetas", jDesktopPane6);

        jDesktopPane10.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVerDistancias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(tablaVerDistancias);

        jDesktopPane10.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1200, 410));

        verDistancias.setBackground(new java.awt.Color(0, 255, 255));
        verDistancias.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        verDistancias.setForeground(new java.awt.Color(0, 0, 0));
        verDistancias.setText("VER distancias");
        verDistancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDistanciasActionPerformed(evt);
            }
        });
        jDesktopPane10.add(verDistancias, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, -1, -1));

        Admin1.addTab("Ver Distancia", jDesktopPane10);

        jDesktopPane1.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaVerVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(tablaVerVuelo);

        jDesktopPane1.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1200, 410));

        verVuelos.setBackground(new java.awt.Color(0, 255, 255));
        verVuelos.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        verVuelos.setForeground(new java.awt.Color(0, 0, 0));
        verVuelos.setText("VER VUELOS");
        verVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verVuelosActionPerformed(evt);
            }
        });
        jDesktopPane1.add(verVuelos, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 430, -1, -1));

        Admin1.addTab("Ver Vuelo", jDesktopPane1);

        jDesktopPane7.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaRenovacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane10.setViewportView(tablaRenovacion);

        jDesktopPane7.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1200, 410));

        verRenovacion.setBackground(new java.awt.Color(0, 255, 255));
        verRenovacion.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        verRenovacion.setForeground(new java.awt.Color(0, 0, 0));
        verRenovacion.setText("Ver renovaciones");
        verRenovacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verRenovacionActionPerformed(evt);
            }
        });
        jDesktopPane7.add(verRenovacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        Admin1.addTab("Renovacion Pasaporte", jDesktopPane7);

        jDesktopPane8.setBackground(new java.awt.Color(153, 255, 255));
        jDesktopPane8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaReservacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane11.setViewportView(tablaReservacion);

        jDesktopPane8.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 1200, 410));

        verReservacion.setBackground(new java.awt.Color(0, 255, 255));
        verReservacion.setFont(new java.awt.Font("Engravers MT", 1, 24)); // NOI18N
        verReservacion.setForeground(new java.awt.Color(0, 0, 0));
        verReservacion.setText("ver reservacion");
        verReservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReservacionActionPerformed(evt);
            }
        });
        jDesktopPane8.add(verReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, -1));

        Admin1.addTab("Reservacion", jDesktopPane8);

        jDesktopPane11.setBackground(new java.awt.Color(153, 255, 255));

        reporteAerolinea.setBackground(new java.awt.Color(255, 255, 0));
        reporteAerolinea.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        reporteAerolinea.setForeground(new java.awt.Color(0, 0, 0));
        reporteAerolinea.setText("Reporte por Aerolinea");
        reporteAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteAerolineaActionPerformed(evt);
            }
        });

        reporteVuelos.setBackground(new java.awt.Color(255, 255, 0));
        reporteVuelos.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        reporteVuelos.setForeground(new java.awt.Color(0, 0, 0));
        reporteVuelos.setText("Reporte por Vuelos");
        reporteVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteVuelosActionPerformed(evt);
            }
        });

        reporteAvion.setBackground(new java.awt.Color(255, 255, 0));
        reporteAvion.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        reporteAvion.setForeground(new java.awt.Color(0, 0, 0));
        reporteAvion.setText("Reporte por Avion");
        reporteAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteAvionActionPerformed(evt);
            }
        });

        reporteAeropuerto.setBackground(new java.awt.Color(255, 255, 0));
        reporteAeropuerto.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        reporteAeropuerto.setForeground(new java.awt.Color(0, 0, 0));
        reporteAeropuerto.setText("Reporte por Aeropuerto");
        reporteAeropuerto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteAeropuertoActionPerformed(evt);
            }
        });

        reportePasajero.setBackground(new java.awt.Color(255, 255, 0));
        reportePasajero.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        reportePasajero.setForeground(new java.awt.Color(0, 0, 0));
        reportePasajero.setText("Reporte por pasajero");
        reportePasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportePasajeroActionPerformed(evt);
            }
        });

        cargaReportes.setColumns(20);
        cargaReportes.setRows(5);
        jScrollPane9.setViewportView(cargaReportes);

        limpiar.setBackground(new java.awt.Color(204, 255, 51));
        limpiar.setForeground(new java.awt.Color(0, 0, 0));
        limpiar.setText("Limpiar reportes");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        exportar.setBackground(new java.awt.Color(204, 255, 51));
        exportar.setForeground(new java.awt.Color(0, 0, 0));
        exportar.setText("Exportador archivo html");
        exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportarActionPerformed(evt);
            }
        });

        jDesktopPane11.setLayer(reporteAerolinea, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane11.setLayer(reporteVuelos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane11.setLayer(reporteAvion, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane11.setLayer(reporteAeropuerto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane11.setLayer(reportePasajero, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane11.setLayer(jScrollPane9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane11.setLayer(limpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane11.setLayer(exportar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane11Layout = new javax.swing.GroupLayout(jDesktopPane11);
        jDesktopPane11.setLayout(jDesktopPane11Layout);
        jDesktopPane11Layout.setHorizontalGroup(
            jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane11Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(reporteAeropuerto)
                .addGap(121, 121, 121)
                .addComponent(reporteAvion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jDesktopPane11Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane11Layout.createSequentialGroup()
                        .addComponent(reportePasajero)
                        .addGap(111, 111, 111)
                        .addComponent(reporteAerolinea)
                        .addGap(83, 83, 83)
                        .addComponent(reporteVuelos))
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 1022, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(limpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exportar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );
        jDesktopPane11Layout.setVerticalGroup(
            jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane11Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reportePasajero)
                    .addComponent(reporteAerolinea)
                    .addComponent(reporteVuelos))
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reporteAvion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(reporteAeropuerto, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(jDesktopPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane11Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(limpiar)
                        .addGap(101, 101, 101)
                        .addComponent(exportar)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        Admin1.addTab("Reportes", jDesktopPane11);

        jPanel2.add(Admin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 1240, 520));

        RegresarMenu1.setBackground(new java.awt.Color(255, 0, 0));
        RegresarMenu1.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        RegresarMenu1.setForeground(new java.awt.Color(0, 0, 0));
        RegresarMenu1.setText("Regresar");
        RegresarMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarMenu1ActionPerformed(evt);
            }
        });
        jPanel2.add(RegresarMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, 160, 44));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirDelSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirDelSistemaActionPerformed
        JOptionPane.showMessageDialog(null, "Vuelve pronto, que tengas buen dia");//Mensaje de despedida
        System.exit(0);//Cerramos el sistema
    }//GEN-LAST:event_SalirDelSistemaActionPerformed

    private void RegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenuActionPerformed
        LlamarInstancias.manejoAeropuerto();//Regresamos al manejo aeropuerto
        this.dispose();//Cerramos este frame
    }//GEN-LAST:event_RegresarMenuActionPerformed

    private void RegresarMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegresarMenu1ActionPerformed

    private void ApellidosFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ApellidosFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        int comprobarSiEsNumero = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir numeros
        if(Character.isDigit(comprobarSiEsNumero)){//Comprobamos si el usuario escribe numeros
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir digitos, unicamente letras");//Mensaje condicional no escribir numeros
        }
    }//GEN-LAST:event_ApellidosFieldKeyTyped

    private void ApellidosFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApellidosFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApellidosFieldActionPerformed

    private void NombresFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombresFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        int comprobarSiEsNumero = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir numeros
        if(Character.isDigit(comprobarSiEsNumero)){//Comprobamos si el usuario escribe numeros
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir digitos, unicamente letras");//Mensaje condicional no escribir numeros
        }
    }//GEN-LAST:event_NombresFieldKeyTyped

    private void NombresFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombresFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombresFieldActionPerformed

    private void PasaporteFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasaporteFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        if(PasaporteField.getText().length()>7){//restringimos que no puede escribir mas de 8 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "El pasaporte unicamente tiene 8 digitos");//Mensaje condicional digitos pasaporte
        }
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_PasaporteFieldKeyTyped

    private void PasaporteFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasaporteFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasaporteFieldActionPerformed

    private void CargaPasaporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaPasaporteActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                //llamamos el arraylist creado de pasaporte
                ArrayList<Pasaporte> pasaportes = this.cargarPasaporteEnTexto.cargarPasaporteEnTexto(archivo, this.mostrarDatosCargados);
                this.guardarPasaporteBinario.guardarPasaporte(pasaportes);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo de pasaporte");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargaPasaporteActionPerformed

    private void RegistrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarBotonActionPerformed
        /*
        -Establecemos variables para ser tomadas en cuenta al crear un nuevo pasajero
        -El (String) nos sirve para castear el item y pasarlo a tipo string
        -Anteriormente pasaporte y millas lo podemos convertir de string a int por eso lo definimos como string
         */
        String pasaporte=PasaporteField.getText();
        String contrasenia="Inexistente";
        String fechaNacimiento= FechaNacimientoField.getText();
        String nacionalidad = (String)NacionalidadCombo.getSelectedItem();
        String estadoCivil= (String) EstadoCivilCombo.getSelectedItem();
        String nombres= NombresField.getText();
        String apellidos= ApellidosField.getText();
        String sexo= (String) SexoCombo.getSelectedItem();
        String fechaVenPass= FechaVenPasField.getText();
        String fechaEmPass= FechaEmPasField.getText();
        String paisActual= (String) PaisActualCombo.getSelectedItem();
        String millasRecorridas= "0";
        //Verificamos si una casilla esta vacia
        if(pasaporte.isEmpty()||fechaNacimiento.isEmpty()||nacionalidad.isEmpty()||nombres.isEmpty()||apellidos.isEmpty()||fechaVenPass.isEmpty()||fechaEmPass.isEmpty()){
            JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
        }
        else{
            //definimos los espacios que ocupara en nuestro pasajero al ser creado
            String espacio[]={pasaporte,contrasenia,fechaNacimiento,nacionalidad,estadoCivil,nombres,apellidos,sexo,fechaVenPass,fechaEmPass,paisActual,millasRecorridas};
            Pasaporte pasaportes = CrearPasaporte.crearPasaporte(espacio);
            //establecemos un nuevo valor en los pasajeros establecidos del array list
            ArrayList<Pasaporte> pasaportesEstablecidos= new ArrayList<>();
            pasaportesEstablecidos.add(pasaportes);//agreagamos un nuevo pasaporte
            vaciarValoresPasaporte();
            JOptionPane.showMessageDialog(this, "Registraste exitosamente pasaporte, que grande");//mensaje amigable
            try {//guardar el vehiculo en un archivo binario
                this.guardarPasaporteBinario.guardarPasaporte(pasaportesEstablecidos);
            } catch (IOException ex) {
                System.out.println("error"+ex);
            }
            
        }
    }//GEN-LAST:event_RegistrarBotonActionPerformed

    private void verPasaportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPasaportesActionPerformed
        //try catch por si da error
        try {
            //array list pasaporte, llamamos la carga de archivos binarios
            ArrayList<Pasaporte> pasaportes = this.cargarPasaporteBinario.cargarPasaporteBinario();
            //llamamos a llenado de tabla
            TablaPasaporte.completarTabla(pasaportes, tablaVerPasaporte);
        } catch (IOException ex) {
            System.out.println("ex"+ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verPasaportesActionPerformed

    private void CargaAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaAeropuertoActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                //llamamos el arraylist creado de Aeropuerto
                ArrayList<Aeropuerto> aeropuertos = this.cargarAeropuertoEnTexto.cargarAeropuertoEnTexto(archivo, this.mostrarDatosCargados);
                this.guardarAeropuertoBinario.guardarAeropuerto(aeropuertos);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo de Aeropuerto");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargaAeropuertoActionPerformed

    private void CargaDistanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaDistanciaActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                //llamamos el arraylist creado de Distancia
                ArrayList<Distancia> distancias = this.cargarDistanciaEnTexto.cargarDistanciaEnTexto(archivo, this.mostrarDatosCargados);
                this.guardarDistanciaBinario.guardarDistancia(distancias);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo de Distancia");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargaDistanciaActionPerformed

    private void CargaVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaVueloActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                //llamamos el arraylist creado de Vuelo
                ArrayList<Vuelo> vuelos = this.cargarVueloEnTexto.cargarVueloEnTexto(archivo, this.mostrarDatosCargados);
                this.guardarVueloBinario.guardarVuelo(vuelos);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo de vuelos");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargaVueloActionPerformed

    private void CargaAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaAvionesActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                //llamamos el arraylist creado de Aviones
                ArrayList<Aviones> aviones = this.cargarAvionesEnTexto.cargarAvionesEnTexto(archivo, this.mostrarDatosCargados);
                this.guardarAvionesBinario.guardarAviones(aviones);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo de Aviones");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargaAvionesActionPerformed

    private void CargaAerolineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaAerolineasActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                //llamamos el arraylist creado de Aerolineas
                ArrayList<Aerolineas> aerolineas = this.cargarAerolineasEnTexto.cargarAerolineasEnTexto(archivo, this.mostrarDatosCargados);
                this.guardarAerolineasBinario.guardarAerolineas(aerolineas);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo de Aerolineas");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargaAerolineasActionPerformed

    private void CargaTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaTarjetaActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                //llamamos el arraylist creado de Tarjeta
                ArrayList<Tarjeta> tarjeta = this.cargarTarjetaEnTexto.cargarTarjetaEnTexto(archivo, this.mostrarDatosCargados);
                this.guardarTarjetaBinario.guardarTarjeta(tarjeta);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo de Tarjeta");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargaTarjetaActionPerformed

    private void verTarjetasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verTarjetasActionPerformed
        //try catch por si da error
        try {
            //array list tarjetas, llamamos la carga de archivos binarios
            ArrayList<Tarjeta> tarjetas = this.cargarTarjetaBinario.cargarTarjetaBinario();
            //llamamos a llenado de tabla
            TablaTarjeta.completarTabla(tarjetas, tablaVerTarjetas);
        } catch (IOException ex) {
            System.out.println("ex"+ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verTarjetasActionPerformed

    private void verAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAvionesActionPerformed
        //try catch por si da error
        try {
            //array list aviones, llamamos la carga de archivos binarios
            ArrayList<Aviones> aviones = this.cargarAvionesBinario.cargarAvionesBinario();
            //llamamos a llenado de tabla
            TablaAviones.completarTabla(aviones, tablaVerAviones);
        } catch (IOException ex) {
            System.out.println("ex"+ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verAvionesActionPerformed

    private void verAeropuertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAeropuertosActionPerformed
        //try catch por si da error
        try {
            //array list aeropuertos, llamamos la carga de archivos binarios
            ArrayList<Aeropuerto> aeropuertos = this.cargarAeropuertoBinario.cargarAeropuertoBinario();
            //llamamos a llenado de tabla
            TablaAeropuerto.completarTabla(aeropuertos, tablaVerAeropuertos);
        } catch (IOException ex) {
            System.out.println("ex"+ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verAeropuertosActionPerformed

    private void verAerolineasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verAerolineasActionPerformed
        //try catch por si da error
        try {
            //array list aerolineas, llamamos la carga de archivos binarios
            ArrayList<Aerolineas> aerolineas = this.cargarAerolineasBinario.cargarAerolineasBinario();
            //llamamos a llenado de tabla
            TablaAerolineas.completarTabla(aerolineas, tablaVerAerolineas);
        } catch (IOException ex) {
            System.out.println("ex"+ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verAerolineasActionPerformed

    private void verDistanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDistanciasActionPerformed
        //try catch por si da error
        try {
            //array list distancias, llamamos la carga de archivos binarios
            ArrayList<Distancia> distancias = this.cargarDistanciaBinario.cargarDistanciaBinario();
            //llamamos a llenado de tabla
            TablaDistancias.completarTabla(distancias, tablaVerDistancias);
        } catch (IOException ex) {
            System.out.println("ex"+ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verDistanciasActionPerformed

    private void verVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verVuelosActionPerformed
        //try catch por si da error
        try {
            //array list vuelos, llamamos la carga de archivos binarios
            ArrayList<Vuelo> vuelos = this.cargarVueloBinario.cargarVueloBinario();
            //llamamos a llenado de tabla
            TablaVuelo.completarTabla(vuelos, tablaVerVuelo);
        } catch (IOException ex) {
            System.out.println("ex"+ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verVuelosActionPerformed

    private void TarjetaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TarjetaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TarjetaFieldActionPerformed

    private void TarjetaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TarjetaFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        if(TarjetaField.getText().length()>11){//restringimos que no puede escribir mas de 12 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "La tarjeta unicamente tiene 12 digitos");//Mensaje condicional digitos pasaporte
        }
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_TarjetaFieldKeyTyped

    private void PasaporteTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasaporteTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasaporteTarjetaActionPerformed

    private void PasaporteTarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasaporteTarjetaKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        if(PasaporteTarjeta.getText().length()>7){//restringimos que no puede escribir mas de 8 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "El pasaporte unicamente tiene 8 digitos");//Mensaje condicional digitos pasaporte
        }
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_PasaporteTarjetaKeyTyped

    private void dineroActualFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dineroActualFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dineroActualFieldActionPerformed

    private void dineroActualFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dineroActualFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_dineroActualFieldKeyTyped

    private void codigoCVCFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoCVCFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoCVCFieldActionPerformed

    private void codigoCVCFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoCVCFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        if(codigoCVCField.getText().length()>2){//restringimos que no puede escribir mas de 12 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "El codigo CVC unicamente tiene 3 digitos");//Mensaje condicional digitos pasaporte
        }
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_codigoCVCFieldKeyTyped

    private void AnadirTarjetaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnadirTarjetaBotonActionPerformed
        String tarjeta =TarjetaField.getText();
        String pasaporte1 =PasaporteTarjeta.getText();
        String dineroActual=dineroActualField.getText();
        String codigoCvC=codigoCVCField.getText();
        //Verificamos si una casilla esta vacia
        if(tarjeta.isEmpty()||pasaporte1.isEmpty()||dineroActual.isEmpty()||codigoCvC.isEmpty()){
            JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
        }
        else{
            File fichero=new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/pasaportes/"+pasaporte1+".bin");
            if(fichero.exists()){
            //definimos los espacios que ocupara en nuestro pasajero al ser creado
            String espacio[]={pasaporte1,tarjeta,dineroActual,codigoCvC};
            Tarjeta tarjetas= CrearTarjeta.crearTarjeta(espacio);
            //establecemos un nuevo valor en los pasajeros establecidos del array list
            ArrayList<Tarjeta> tarjetasEstablecidos= new ArrayList<>();
            tarjetasEstablecidos.add(tarjetas);//agreagamos un nuevo pasaporte
            vaciarValoresPasaporte();
            JOptionPane.showMessageDialog(this, "Registraste exitosamente Tarjeta, que grande");//mensaje amigable
            try {//guardar el vehiculo en un archivo binario
                this.guardarTarjetaBinario.guardarTarjeta(tarjetasEstablecidos);
            } catch (IOException ex) {
                System.out.println("error"+ex);
            }
                
            }else{
                    JOptionPane.showMessageDialog(this, "No existe el pasaporte ingresado, verifica tus datos");//mensaje amigable
            }
        }
    }//GEN-LAST:event_AnadirTarjetaBotonActionPerformed

    private void modificarAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarAvionActionPerformed
        /*
        -Establecemos variables para ser tomadas en cuenta al crear un nuevo pasajero
        -El (String) nos sirve para castear el item y pasarlo a tipo string
        -Anteriormente pasaporte y millas lo podemos convertir de string a int por eso lo definimos como string
         */
        String nombreAerolinea=nombreAerolineaField.getText();
        String nombreAeropuerto= nombreAeropuertoField.getText();
        String s1 = fileasAsientosField.getText();
        String s2= columasAsientosField.getText();
        String s3= pasillosField.getText();
        String s4= cadaCuantoPasillosField.getText();
        String nacionalidad = nombreAeropuertoField.getText();
        String codigoAvion= CodigoAvionField.getText();
        c.setVerificarCodigoAvion(codigoAvion);
        String capacidadGasolina= capacidadGasolinaField.getText();
        String consumoMilla= consumoMillaField.getText();   
        //Verificamos si una casilla esta vacia
        if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||nombreAerolinea.isEmpty()||nombreAeropuerto.isEmpty()||nacionalidad.isEmpty()||codigoAvion.isEmpty()||capacidadGasolina.isEmpty()||consumoMilla.isEmpty()){
            JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
        }
        else{
            File fichero=new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/aviones/"+c.getVerificarCodigoAvion()+".bin");
            File fichero2=new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/aerolineas/"+nombreAerolinea+".bin");
            File fichero3=new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/aeropuertos/"+nombreAeropuerto+".bin");
            if(fichero.exists()&&fichero2.exists()&&fichero3.exists()){
                int filaAsientos=Integer.parseInt(s1);
                int columnasAsientos=Integer.parseInt(s2);
                int pasillos=Integer.parseInt(s3);
                int cadaCuantoPasillos=Integer.parseInt(s4);
                int capacidad = (filaAsientos*columnasAsientos);
                String capacidadPasajeros = (capacidad+"");
                //definimos los espacios que ocupara en nuestro pasajero al ser creado
                String espacio[]={nombreAerolinea,nombreAeropuerto,codigoAvion,capacidadPasajeros,capacidadGasolina,consumoMilla};
                Aviones aviones = CrearAviones.crearAviones(espacio);
                //establecemos un nuevo valor en los pasajeros establecidos del array list
                ArrayList<Aviones> avionesEstablecidos= new ArrayList<>();
                avionesEstablecidos.add(aviones);//agreagamos un nuevo pasaporte
                vaciarValoresPasaporte();
                JOptionPane.showMessageDialog(this, "Modificaste exitosamente un avion, que grande");//mensaje amigable
                try {//guardar el vehiculo en un archivo binario
                    this.guardarAvionesBinario.guardarAviones(avionesEstablecidos);
                } catch (IOException ex) {
                    System.out.println("error"+ex);
                }
            }else{
                JOptionPane.showMessageDialog(this, "No existe el avion ingresado, revisa el codigo de avion, y la procediencia a dejar, aeropuerto y aerolinea");//mensaje amigable
            } 
        }
    }//GEN-LAST:event_modificarAvionActionPerformed

    private void reporteVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteVuelosActionPerformed
        cargaReportes.setText(cargaReportes.getText()+"\nListado pasajeros vuelo:  \n");
    }//GEN-LAST:event_reporteVuelosActionPerformed

    private void reporteAeropuertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteAeropuertoActionPerformed
        cargaReportes.setText(cargaReportes.getText()+"\nGanancias Aeropuerto:  Q. "+c1.getDineroGanado()+"\n");
        
    }//GEN-LAST:event_reporteAeropuertoActionPerformed

    private void verRenovacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verRenovacionActionPerformed
        //try catch por si da error
        try {
            //array list vuelos, llamamos la carga de archivos binarios
            ArrayList<Renovacion> renovaciones = this.cargarRenovacionBinario.cargarRenovacionBinario();
            //llamamos a llenado de tabla
            TablaRenovacion.completarTabla(renovaciones, tablaRenovacion);
        } catch (IOException ex) {
            System.out.println("ex"+ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verRenovacionActionPerformed

    private void verReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReservacionActionPerformed
        //try catch por si da error
        try {
            //array list vuelos, llamamos la carga de archivos binarios
            ArrayList<Reservacion> reservaciones = this.cargarReservacionBinario.cargarReservacionBinario();
            //llamamos a llenado de tabla
            TablaReservacion.completarTabla(reservaciones, tablaReservacion);
        } catch (IOException ex) {
            System.out.println("ex"+ex);
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_verReservacionActionPerformed

    private void CargaRenovacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaRenovacionActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                //llamamos el arraylist creado de Renovacion
                ArrayList<Renovacion> renovaciones = this.cargarRenovacionEnTexto.cargarRenovacionEnTexto(archivo, this.mostrarDatosCargados);
                this.guardarRenovacionBinario.guardarRenovacion(renovaciones);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo de Renovacion");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargaRenovacionActionPerformed

    private void CargaReservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargaReservacionActionPerformed
        //filechooser para abrir o guardar archivos
        JFileChooser archivoEleccion = new JFileChooser();
        int eleccion = archivoEleccion.showOpenDialog(this);//variable para seleccionar
        //aprove option es si el usuario le da en aceptar
        if (eleccion == JFileChooser.APPROVE_OPTION) {
            File archivo = archivoEleccion.getSelectedFile();//seleccionamos file para fileReader, agarramos el seleccionado
            try {
                //llamamos el arraylist creado de Renovacion
                ArrayList<Reservacion> reservaciones = this.cargarReservacionEnTexto.cargarReservacionEnTexto(archivo, this.mostrarDatosCargados);
                this.guardarReservacionBinario.guardarReservacion(reservaciones);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error al leer el archivo de Reservacion");
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_CargaReservacionActionPerformed

    private void crearAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearAvionActionPerformed
        /*
        -Establecemos variables para ser tomadas en cuenta al crear un nuevo pasajero
        -El (String) nos sirve para castear el item y pasarlo a tipo string
        -Anteriormente pasaporte y millas lo podemos convertir de string a int por eso lo definimos como string
         */
        String nombreAerolinea=nombreAerolineaField.getText();
        String nombreAeropuerto= nombreAeropuertoField.getText();
        String s1 = fileasAsientosField.getText();
        String s2= columasAsientosField.getText();
        String s3= pasillosField.getText();
        String s4= cadaCuantoPasillosField.getText();
        String nacionalidad = nombreAeropuertoField.getText();
        String codigoAvion= CodigoAvionField.getText();

        String capacidadGasolina= capacidadGasolinaField.getText();
        String consumoMilla= consumoMillaField.getText();
        
        
        //Verificamos si una casilla esta vacia
        if(s1.isEmpty()||s2.isEmpty()||s3.isEmpty()||s4.isEmpty()||nombreAerolinea.isEmpty()||nombreAeropuerto.isEmpty()||nacionalidad.isEmpty()||codigoAvion.isEmpty()||capacidadGasolina.isEmpty()||consumoMilla.isEmpty()){
            JOptionPane.showMessageDialog(null, "No dejes casillas vacias");//Mensaje casilla vacia
        }
        else{
            File fichero=new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/aviones/"+codigoAvion+".bin");
            if(fichero.exists()){
                JOptionPane.showMessageDialog(null, "Este avion ya existe");//Mensaje casilla vacia
            }else{
                File fichero1=new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/aerolineas/"+nombreAerolinea+".bin");
                File fichero2=new File("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/datos/aeropuertos/"+nombreAeropuerto+".bin");
                if(fichero1.exists()&&fichero2.exists()){
                    int filaAsientos=Integer.parseInt(s1);
                int columnasAsientos=Integer.parseInt(s2);
                int pasillos=Integer.parseInt(s3);
                int cadaCuantoPasillos=Integer.parseInt(s4);
                int capacidad = (filaAsientos*columnasAsientos);
                c.setTomarColumnas(columnasAsientos);
                c.setTomarFilas(filaAsientos);
                c.setTomarPasillos(pasillos);
                c.setEspaciosEntrePasillos(cadaCuantoPasillos);
                String capacidadPasajeros = (capacidad+"");
                //definimos los espacios que ocupara en nuestro pasajero al ser creado
                String espacio[]={nombreAerolinea,nombreAeropuerto,codigoAvion,capacidadPasajeros,capacidadGasolina,consumoMilla};
                Aviones aviones = CrearAviones.crearAviones(espacio);
                //establecemos un nuevo valor en los pasajeros establecidos del array list
                ArrayList<Aviones> avionesEstablecidos= new ArrayList<>();
                avionesEstablecidos.add(aviones);//agreagamos un nuevo pasaporte
                vaciarValoresPasaporte();
                JOptionPane.showMessageDialog(this, "Registraste exitosamente un avion, que grande");//mensaje amigable
                frameVentaAsientos.dispose();//cerramos frame
                frameVisualizarDistribucionAsientos.dispose();
                FrameVisualizarDistribucionAsientos.iniciarDistribucion();
                FrameVentaAsientos.cargarVenta();
                try {//guardar el vehiculo en un archivo binario
                this.guardarAvionesBinario.guardarAviones(avionesEstablecidos);
                } catch (IOException ex) {
                System.out.println("error"+ex);
                }
                }else{
                    JOptionPane.showMessageDialog(this, "Verifica si existe el aeropuerto y aerolinea ingresados");//mensaje amigable
                }
                
            }
            
            
        }
    }//GEN-LAST:event_crearAvionActionPerformed

    private void nombreAerolineaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreAerolineaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreAerolineaFieldActionPerformed

    private void nombreAerolineaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreAerolineaFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        int comprobarSiEsNumero = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir numeros
        if(Character.isDigit(comprobarSiEsNumero)){//Comprobamos si el usuario escribe numeros
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir digitos, unicamente letras");//Mensaje condicional no escribir numeros
        }
    }//GEN-LAST:event_nombreAerolineaFieldKeyTyped

    private void nombreAeropuertoFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreAeropuertoFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        int comprobarSiEsNumero = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir numeros
        if(Character.isDigit(comprobarSiEsNumero)){//Comprobamos si el usuario escribe numeros
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir digitos, unicamente letras");//Mensaje condicional no escribir numeros
        }
    }//GEN-LAST:event_nombreAeropuertoFieldKeyTyped

    private void CodigoAvionFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CodigoAvionFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_CodigoAvionFieldKeyTyped

    private void fileasAsientosFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fileasAsientosFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        if(fileasAsientosField.getText().length()>0){//restringimos que no puede escribir mas de 8 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "no puede ser mas de 1 digito");//Mensaje condicional digitos pasaporte
        }
        //Combinacion de que la tecla se presione y se suelte
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_fileasAsientosFieldKeyTyped

    private void columasAsientosFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_columasAsientosFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        if(columasAsientosField.getText().length()>0){//restringimos que no puede escribir mas de 8 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "no puede ser mas de 1 digito");//Mensaje condicional digitos pasaporte
        }
        //Combinacion de que la tecla se presione y se suelte
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_columasAsientosFieldKeyTyped

    private void pasillosFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pasillosFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        if(pasillosField.getText().length()>0){//restringimos que no puede escribir mas de 8 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "no puede ser mas de 1 digito");//Mensaje condicional digitos pasaporte
        }
        //Combinacion de que la tecla se presione y se suelte
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_pasillosFieldKeyTyped

    private void cadaCuantoPasillosFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadaCuantoPasillosFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        if(cadaCuantoPasillosField.getText().length()>0){//restringimos que no puede escribir mas de 8 digitos
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "no puede ser mas de 1 digito");//Mensaje condicional digitos pasaporte
        }
        //Combinacion de que la tecla se presione y se suelte
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_cadaCuantoPasillosFieldKeyTyped

    private void capacidadGasolinaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_capacidadGasolinaFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_capacidadGasolinaFieldKeyTyped

    private void consumoMillaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_consumoMillaFieldKeyTyped
        //Combinacion de que la tecla se presione y se suelte
        char comprobarSiEsLetra = evt.getKeyChar();//Creamos variable tipo caracter para que no pueda escribir letras
        if(Character.isLetter(comprobarSiEsLetra)){//Comprobamos si el usuario escribe letras
            evt.consume();//el evento no permite seguir escribiendo
            Toolkit.getDefaultToolkit().beep();//sonido de error
            JOptionPane.showMessageDialog(null, "No puedes escribir letras, unicamente digitos");//Mensaje condicional no escribir letras
        }
    }//GEN-LAST:event_consumoMillaFieldKeyTyped

    private void CodigoAvionFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoAvionFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoAvionFieldActionPerformed

    private void reportePasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportePasajeroActionPerformed
        String estadoCivil="";
        String sexo="";
        if(c1.getCasadoViaja()>c1.getSolteroViaja()){
            estadoCivil="Casado";
        }
        if(c1.getCasadoViaja()<c1.getSolteroViaja()){
            estadoCivil="Soltero";
        }
        if(c1.getCasadoViaja()==c1.getSolteroViaja()){
            estadoCivil="Viajan igual ambos estados civiles";
        }
        if(c1.getHombreViaja()>c1.getMujerViaja()){
            sexo="Hombre";
        }
        if(c1.getHombreViaja()<c1.getMujerViaja()){
            sexo="Mujer";
        }
        if(c1.getHombreViaja()==c1.getMujerViaja()){
            sexo="Viajan igual ambos sexos";
        }
        cargaReportes.setText(cargaReportes.getText()+"\nEstado civil que viaja mas:  "+estadoCivil+"\n"
                + "Edad que mas viaja: -----Inconcluso-----\n"
                + "Nacionalidad que mas viaja: "+c1.getNacionalidadViaja()+"\n"
                + "Sexo que mas viaja: "+sexo+"\n");
    }//GEN-LAST:event_reportePasajeroActionPerformed

    private void reporteAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteAerolineaActionPerformed
        cargaReportes.setText(cargaReportes.getText()+"\nRutas mas concurridas:  \n"
                + "Aerolineas mas usadas: \n");
        
    }//GEN-LAST:event_reporteAerolineaActionPerformed

    private void reporteAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteAvionActionPerformed
        cargaReportes.setText(cargaReportes.getText()+"\nReporte consumo de gasolina:  "+c1.getConsumoGasolina()+"\n");
    }//GEN-LAST:event_reporteAvionActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        cargaReportes.setText("");
    }//GEN-LAST:event_limpiarActionPerformed

    private void exportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportarActionPerformed
        try {
            JFileChooser archivo = new JFileChooser(System.getProperty("C:/Users/Maria/OneDrive/Documentos/NetBeansProjects/ProyectoFinal/reportes"));
            archivo.showSaveDialog(this);
            if (archivo.getSelectedFile() != null) {
                try (FileWriter guardado = new FileWriter(archivo.getSelectedFile())) {
                guardado.write(cargaReportes.getText());
                JOptionPane.showMessageDialog(this, "El archivo fue guardado con éxito en la ruta establecida");
                }
        }
        } catch (IOException ex) {
        System.out.println("ex"+ex);
        }
    }//GEN-LAST:event_exportarActionPerformed
    class FondoInicio extends JPanel{//creamos una clase parametrica o generica extendiendo de JPanel
        private Image imagen;//establecemos que sea tipo imagen
        @Override//sobrescribimos la clase JPanel especificamente el metodo paint
        public void paint(Graphics g){ 
            imagen = new ImageIcon(getClass().getResource("/imagenes/FondoManejoGerencia.jpg")).getImage();//igualamos nuestra variable al fondo que queremos
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);//damos las dimensiones
            setOpaque(false);//Ponemos que el panel no sea visible
            super.paint(g);//llamos a la clase super para que cumpla con las funcionalidades del JPanel
        }
    }
    private void vaciarValoresPasaporte(){
        PasaporteField.setText("");
        FechaNacimientoField.setText("");
        NombresField.setText("");
        ApellidosField.setText("");
        FechaVenPasField.setText("");
        FechaEmPasField.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Admin1;
    private javax.swing.JButton AnadirTarjetaBoton;
    private javax.swing.JLabel Apellidos;
    private javax.swing.JTextField ApellidosField;
    private javax.swing.JButton CargaAerolineas;
    private javax.swing.JButton CargaAeropuerto;
    private javax.swing.JButton CargaAviones;
    private javax.swing.JLabel CargaBoton1;
    private javax.swing.JButton CargaDistancia;
    private javax.swing.JButton CargaPasaporte;
    private javax.swing.JButton CargaRenovacion;
    private javax.swing.JButton CargaReservacion;
    private javax.swing.JButton CargaTarjeta;
    private javax.swing.JButton CargaVuelo;
    private javax.swing.JTextField CodigoAvionField;
    private javax.swing.JLabel EstadoCivil;
    private javax.swing.JComboBox<String> EstadoCivilCombo;
    private javax.swing.JLabel FechaEmPas;
    private javax.swing.JFormattedTextField FechaEmPasField;
    private javax.swing.JLabel FechaNacimiento;
    private javax.swing.JFormattedTextField FechaNacimientoField;
    private javax.swing.JLabel FechaVenPas;
    private javax.swing.JFormattedTextField FechaVenPasField;
    private javax.swing.JLabel InfoCargada1;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Nacionalidad;
    private javax.swing.JComboBox<String> NacionalidadCombo;
    private javax.swing.JLabel Nombres;
    private javax.swing.JTextField NombresField;
    private javax.swing.JLabel PaisActual;
    private javax.swing.JComboBox<String> PaisActualCombo;
    private javax.swing.JLabel Pasaporte;
    private javax.swing.JLabel Pasaporte2;
    private javax.swing.JTextField PasaporteField;
    private javax.swing.JTextField PasaporteTarjeta;
    private javax.swing.JButton RegistrarBoton;
    private javax.swing.JButton RegresarMenu;
    private javax.swing.JButton RegresarMenu1;
    private javax.swing.JButton SalirDelSistema;
    private javax.swing.JLabel Sexo;
    private javax.swing.JComboBox<String> SexoCombo;
    private javax.swing.JTextField TarjetaField;
    private javax.swing.JLabel Tarjetatext;
    private javax.swing.JTextField cadaCuantoPasillosField;
    private javax.swing.JTextField capacidadGasolinaField;
    public static javax.swing.JTextArea cargaReportes;
    private javax.swing.JTextField codigoCVCField;
    private javax.swing.JLabel codigoCvC;
    private javax.swing.JTextField columasAsientosField;
    private javax.swing.JLabel columnasAsientos;
    private javax.swing.JLabel consumoGasolina;
    private javax.swing.JLabel consumoMilla;
    private javax.swing.JTextField consumoMillaField;
    private javax.swing.JButton crearAvion;
    private javax.swing.JLabel dineroActual;
    private javax.swing.JTextField dineroActualField;
    private javax.swing.JButton exportar;
    private javax.swing.JLabel filaAsientos;
    private javax.swing.JTextField fileasAsientosField;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane10;
    private javax.swing.JDesktopPane jDesktopPane11;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JDesktopPane jDesktopPane6;
    private javax.swing.JDesktopPane jDesktopPane7;
    private javax.swing.JDesktopPane jDesktopPane8;
    private javax.swing.JDesktopPane jDesktopPane9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JButton limpiar;
    private javax.swing.JButton modificarAvion;
    private javax.swing.JTextArea mostrarDatosCargados;
    private javax.swing.JLabel nombreAerolinea;
    private javax.swing.JLabel nombreAerolinea1;
    private javax.swing.JLabel nombreAerolinea2;
    private javax.swing.JTextField nombreAerolineaField;
    private javax.swing.JTextField nombreAeropuertoField;
    private javax.swing.JLabel pasillos;
    private javax.swing.JLabel pasillos2;
    private javax.swing.JTextField pasillosField;
    private javax.swing.JButton reporteAerolinea;
    private javax.swing.JButton reporteAeropuerto;
    private javax.swing.JButton reporteAvion;
    private javax.swing.JButton reportePasajero;
    private javax.swing.JButton reporteVuelos;
    private javax.swing.JTable tablaRenovacion;
    private javax.swing.JTable tablaReservacion;
    private javax.swing.JTable tablaVerAerolineas;
    private javax.swing.JTable tablaVerAeropuertos;
    private javax.swing.JTable tablaVerAviones;
    private javax.swing.JTable tablaVerDistancias;
    private javax.swing.JTable tablaVerPasaporte;
    private javax.swing.JTable tablaVerTarjetas;
    private javax.swing.JTable tablaVerVuelo;
    private javax.swing.JButton verAerolineas;
    private javax.swing.JButton verAeropuertos;
    private javax.swing.JButton verAviones;
    private javax.swing.JButton verDistancias;
    private javax.swing.JButton verPasaportes;
    private javax.swing.JButton verRenovacion;
    private javax.swing.JButton verReservacion;
    private javax.swing.JButton verTarjetas;
    private javax.swing.JButton verVuelos;
    // End of variables declaration//GEN-END:variables
}
