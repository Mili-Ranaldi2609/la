-- Volcado SQL de phpMyAdmin
-- versión 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-09-2023 a las 16:59:05
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

ESTABLECER SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
INICIAR TRANSACCIÓN;
ESTABLECER zona_horaria = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 ESTABLECER NOMBRES utf8mb4 */;

--
-- Base de datos: `facturas`
--
CREAR base de datos empresa;
USE empresa;
-------------------------------------------------- --------

--
-- Estructura de tabla para la tabla `clientes`
--

CREAR TABLA `empleados` (
    `legajo` int(4) NO NULO,
    `apellido` varchar(45) NOT NULL,
    `nombre` varchar(45) NOT NULL,
    `domicilio` varchar(60) NO NULO,
    `cp` int(4) NO NULO,
    `salario` int(8) NULL,
    `estadocivil` CHAR(1) NULL,
    `sección` int(2) DEFAULT NULL
) MOTOR=InnoDB CONJUNTO DE CARACTERES PREDETERMINADO=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`legajo`, `apellido`, `nombre`, `domicilio`, `cp`, `salario`, `estadocivil`,`seccion`) VALORES
(133, 'Soloa', 'Maximiliano', 'Puente de Inca 1980',5515, 100000,'S' ,1),
(197, 'Jardel', 'Esteban', 'Ramírez 345',5500, 120000, 'S' ,1),
(198, 'Jardel', 'Esteban', 'Ramírez 345',5500, 90000, 'C' ,1),
(200, 'Pérez', 'Juan', 'Rafel Obligado 605',5501, 100000, 'C' ,2),
(205, 'Azcurra', 'Eliana', 'Velez Sarfield S/N',5519, 85000,'C' , 2),
(210, 'Dilon', 'Patricia', '60 Granaderos 98',5521, 120000,'C' , 3),
(321, 'Caballero', 'Gabriela', 'Soler 123',5500, 95000,'C' , 3),
(499, 'Soloa', 'Sebastián', 'Puente de Inca 1980',5515, 120000, 'C' ,2),
(501, 'González', 'Esteban', 'Larrea 34',5501, 95000, 'C' ,NULL),
(470, 'Sosa', 'andreina', 'Soldado Baigorria 45',5515, 110000, 'C' ,2),
(502, 'Canosa', 'Viviana', 'Sarmiento 258',5517, 135000, 'C' ,NULL),
(475, 'Cáceres', 'Eliñana', 'Los Pinos 675',5517, 128000, 'S' ,3),
(503, 'Peralta', 'Ignacio', 'El zonda 58',5515, 120000, 'S' ,NULL),
(504, 'Gutiérrez', 'Lautaro', 'Av.Sarmiento 258',5500, 130000, 'C' ,NULL);



--
-- Índices para tablas volcadas
--

--
-- Índices de la tabla `clientes`
--
ALTER TABLE `empleados`
    AÑADIR CLAVE PRIMARIA (`legajo`),
    AÑADIR CLAVE `cp` (`cp`);
COMPROMETERSE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;