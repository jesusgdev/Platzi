<?php

require_once('payment.php');
class Cash extends Payment {
    public $id;

    public function __construct($id) {
        parent::__construct($id);

    }

}

?>