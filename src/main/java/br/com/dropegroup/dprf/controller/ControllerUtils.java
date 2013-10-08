/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.dropegroup.dprf.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dailton
 */
@Service
public class ControllerUtils {
    public ResponseEntity toResponseEntity(Object body) {
        return new ResponseEntity(body, HttpStatus.OK);
    }
    public ResponseEntity toResponseEntity(Exception e) {
        return new ResponseEntity(e, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
