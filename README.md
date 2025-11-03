# Sistema de Gestión de Tienda de Tecnología

## Autores

- Kogy Isaza Jaramillo
- Samuel Vargas Pérez
- Samuel Estiven Gonzalez Muñoz
- Yeider Esneider Cadavid Rendon

## Descripción

Sistema de gestión para una tienda de tecnología especializada en televisores y proyectores. El sistema permite el registro y control de productos, clientes, compras y genera informes estadísticos con visualizaciones gráficas.

## Características Principales

### 1. Gestión de Productos

- Registro de televisores con especificaciones:
  - Tamaño de pantalla (10-32", 40-49", 50-59", 60-75", 76"+)
  - Tipo de pantalla (LED, NanoCell, OLED, QLED, MiniLED, QNED)
  - Sistema operativo (Android TV, Google TV, Tizen, Web OS, Roku TV)

- Registro de proyectores con características:
  - Tipo de uso (Hogar/Empresarial)
  - Tecnología de visualización (LCD, LED, DLP)

### 2. Gestión de Clientes

- Registro de información personal:
  - Documento de identidad
  - Nombre
  - Fecha de nacimiento
- Sistema de descuentos por cumpleaños (20%)

### 3. Gestión de Ventas

- Registro de compras
- Cálculo automático de descuentos
- Control de inventario
- Alertas de stock bajo (menos de 10 unidades)

### 4. Informes y Estadísticas

- Cantidad total de productos
- Porcentaje de televisores vs proyectores
- Precio promedio por marca
- Productos con mayor precio
- Visualizaciones gráficas:
  - Distribución por marca
  - Distribución por resolución
  - Comparativa TV vs Proyectores

## Estructura del Proyecto

### Paquete GUI

- **GuiPrincipal**: Ventana principal y menú de navegación
- **RegistrarTelevisor**: Interfaz para registro de televisores
- **RegistrarProyector**: Interfaz para registro de proyectores
- **RegistrarClientes**: Gestión de clientes
- **RegistrarCompras**: Proceso de ventas
- **DatosRecolectados**: Visualización de estadísticas
- **GraficosEstadisticos**: Visualización de gráficos

### Paquete Logica

- **Producto**: Clase abstracta base para productos
- **Televisor**: Especificaciones de televisores
- **Proyector**: Especificaciones de proyectores
- **Cliente**: Gestión de información de clientes
- **Compra**: Registro de transacciones
- **Tienda**: Clase principal de gestión

## Requisitos Técnicos

- Java JDK 8 o superior
- NetBeans IDE (recomendado)
- Librerías:
  - JFreeChart 1.0.1
  - JCommon 1.0.0

## Instalación y Ejecución

1. Clonar el repositorio
2. Abrir el proyecto en NetBeans
3. Verificar que las librerías JFreeChart y JCommon estén correctamente configuradas
4. Compilar y ejecutar la clase Main

## Características de Validación

- Control de entrada de datos
- Validación de fechas
- Verificación de stock
- Validación de marcas permitidas
- Control de resoluciones disponibles
- Validación de rangos de tamaños de pantalla
