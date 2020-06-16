<?php

require_once('payment.php');
class Card extends Payment {
    public $id;
    public $number;
    public $cvu;
    public $date;
    
    public function __construct($id, $number, $cvu, $date) {
        parent::__construct($id);
        $this->number->$number;
        $this->cvu->$cvu;
        $this->date->$date;
    }
}

?>