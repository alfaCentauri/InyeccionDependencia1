/*
 * Copyright (C) 2019 Ingeniero en Computación: Ricardo Presilla.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package modelo;
import qualifiers.Premium;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
/**
 * Clase hija de Cliente.
 * @author Ingeniero en Computación: Ricardo Presilla.
 * @version 1.0.
 */
@Named
@RequestScoped
@Premium
public class ClientePremium extends Cliente {
    /**Almacena el descuento.*/
    private int codigoDescuento;

    public int getCodigoDescuento() {
        return codigoDescuento;
    }

    public void setCodigoDescuento(int codigoDescuento) {
        this.codigoDescuento = codigoDescuento;
    }
    
}
