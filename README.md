## Sistema de Facturación con Angular y Spring Boot
Este proyecto es un sistema de facturación desarrollado con Angular y Spring Boot. A continuación, se presentan los aspectos clave del sistema:

## Descripción Detallada

### 1. Login y Bloqueo de Usuario
- El sistema permite a los usuarios iniciar sesión con sus credenciales.
- Si un usuario ingresa una contraseña incorrecta tres veces, se bloquea automáticamente.
- Las contraseñas por defecto son “admin” para facilitar la prueba.

### 2. Gestión de Clientes
- Creación de nuevos clientes con información como nombre, dirección y correo electrónico.
- Edición de datos de clientes existentes.
- Búsqueda de clientes por nombre o identificación.
- Validación para evitar la creación de clientes duplicados.

### 3. Gestión de Productos
- Creación y edición de productos con detalles como nombre, precio y stock.
- Validación para evitar duplicados de códigos de producto.
- Control de stock y actualización automática al crear facturas.

### 4. Facturación
- Creación de facturas asociadas a un cliente y productos específicos.
- Cálculo automático de precios totales, impuestos y subtotales.
- Posibilidad de agregar o eliminar productos en la factura.
- Registro de detalles de facturación, como fecha y número de factura.

## 5. Estructura del Proyecto
- Backend (Spring Boot):
- Capas: Entity, Service, Repositorio, Controller.
- Implementación de funciones específicas y lógica de negocio.
- Exposición de API mediante rutas.
- Frontend (Angular):
- Páginas para cada módulo (Clientes, Facturas, Productos, etc.).
- Reutilización de componentes para crear, editar y listar registros.
- Validación de datos y manejo de errores.

## Instalación
- Clona el repositorio en tu máquina local.
- Configura la base de datos y las conexiones en el backend.
- Ejecuta ng serve para iniciar el frontend.
