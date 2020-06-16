<?php
require_once("car.php");
require_once("UberX.php");
require_once("account.php");
require_once("UberPool.php");

$uberX = new UberX("CVB123", new Account("Andres Herrera", 'AND456'), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("CVB123", new Account("Andrea Ferran", 'ANAD765'), "Dodge", "Attitude");
$uberPool->printDataCar();
?>