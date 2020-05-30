-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 30-Maio-2020 às 02:03
-- Versão do servidor: 5.7.14
-- PHP Version: 7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `agenda`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `agendamento`
--

CREATE TABLE `agendamento` (
  `idAgendamento` int(11) NOT NULL,
  `idUsuario` int(11) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `dataAgendamento` varchar(10) NOT NULL,
  `horaAgendamento` varchar(5) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `agendamento`
--

INSERT INTO `agendamento` (`idAgendamento`, `idUsuario`, `descricao`, `dataAgendamento`, `horaAgendamento`) VALUES
(1, 10, 'Dentista', '2028/10/15', '10:25'),
(2, 10, 'Auto Escola', '2028/10/15', '12:10'),
(3, 10, 'Passar no Frigorífico', '2028/10/15', '12:30'),
(4, 10, 'wqaefqaef', '2020/05/27', '08:00'),
(5, 10, 'eafaefaqefq', '2030/02/09', '11:00'),
(7, 10, 'Aniversário da Ana', '2020/05/05', '09:35'),
(12, 10, 'Casamento do Tiago', '2020/05/27', '17:00'),
(9, 10, 'Pagar a conta de internet', '2020/05/03', '10:10'),
(11, 10, 'Levar o Junior no Judô', '2020/05/04', '08:20'),
(13, 10, 'Buscar o Totó no PET', '2020/05/27', '11:30'),
(14, 10, 'Viagem', '2020/05/27', '19:20'),
(15, 10, 'Levar a Maria na natação:  ', '2020/05/27', '15:00'),
(16, 10, 'Passar no supermercado', '2020/05/27', '09:20'),
(17, 3, 'Tomar o remédio', '2020/05/01', '17:00');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(30) NOT NULL,
  `email` varchar(20) NOT NULL,
  `senha` varchar(8) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `email`, `senha`) VALUES
(2, 'Mateus', 'matt@gmail.com', '12345'),
(3, 'Raphael', 'rafa@rafa.com', '12345'),
(1, 'Lazaro', 'lazaro@gmail.com', '222222'),
(4, 'Lucas', 'lucas@hotmail.com', 'lucas123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `agendamento`
--
ALTER TABLE `agendamento`
  ADD PRIMARY KEY (`idAgendamento`),
  ADD KEY `idUsuario` (`idUsuario`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `agendamento`
--
ALTER TABLE `agendamento`
  MODIFY `idAgendamento` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
