<?php
require_once('car.php');
class UberBlack extends Car {
    public $typeCardAccepted;
    public $seatsMaterial;

    public function __construct($license, $driver, $typeCardAccepted, $seatsMaterial) {
        parent::__construct($license, $driver);
        $this->typeCardAccepted->typeCardAccepted;
        $this->seatsMaterial->seatsMaterial;

    }

}
?>
    
