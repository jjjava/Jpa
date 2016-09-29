/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa3;

import java.io.Serializable;

/**
 *
 * @author hudson
 */
abstract class Base implements Serializable {
	private static final long serialVersionUID = 1L;
	protected abstract Long getId();
}
