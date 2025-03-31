# Sistema Bancario

Este proyecto implementa un sistema bancario básico que permite gestionar cuentas bancarias y realizar operaciones financieras.

## Descripción

El sistema bancario permite realizar diversas operaciones bancarias, incluyendo:
- Creación de cuentas bancarias
- Depósitos y retiros
- Consulta de saldo
- Transferencias entre cuentas
- Historial de transacciones
- Gestión de información del titular

## Clases Utilizadas

### Cuenta
**Atributos principales:**
- `numeroCuenta`: String - Identificador único de la cuenta
- `titular`: String - Nombre del titular de la cuenta
- `saldo`: double - Saldo actual de la cuenta
- `transacciones`: List<Transaccion> - Historial de movimientos

**Métodos principales:**
- `depositar(double monto)`: Realiza un depósito en la cuenta
- `retirar(double monto)`: Realiza un retiro de la cuenta
- `consultarSaldo()`: Retorna el saldo actual
- `transferir(Cuenta destino, double monto)`: Realiza una transferencia a otra cuenta
- `obtenerHistorial()`: Muestra el historial de transacciones

### Transaccion
**Atributos principales:**
- `fecha`: LocalDateTime - Fecha y hora de la transacción
- `tipo`: TipoTransaccion - Tipo de operación realizada
- `monto`: double - Cantidad de dinero involucrada
- `descripcion`: String - Detalle de la transacción

### Banco
**Atributos principales:**
- `cuentas`: List<Cuenta> - Lista de cuentas registradas
- `nombre`: String - Nombre del banco

**Métodos principales:**
- `crearCuenta()`: Crea una nueva cuenta bancaria
- `buscarCuenta(String numeroCuenta)`: Encuentra una cuenta específica
- `listarCuentas()`: Muestra todas las cuentas registradas

## Main Principal

El programa principal (`Main.java`) proporciona una interfaz de usuario por consola que permite:
1. Crear nuevas cuentas bancarias
2. Realizar operaciones bancarias básicas
3. Consultar información de cuentas
4. Ver historial de transacciones
5. Gestionar transferencias entre cuentas
6. Salir del sistema

## Cómo Ejecutar

1. Asegúrate de tener Java instalado en tu sistema
2. Navega hasta el directorio del proyecto
3. Compila los archivos:
```bash
javac projectBank/*.java
```
4. Ejecuta el programa:
```bash
java projectBank.Main
```

## Requisitos
- Java JDK 8 o superior
- Conocimientos básicos de operaciones bancarias

## Funcionalidades Adicionales
- Validación de saldo suficiente para retiros
- Generación automática de números de cuenta
- Registro detallado de todas las transacciones
- Formato de moneda para mostrar cantidades 