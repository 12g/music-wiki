/*
 * Copyright (C) 2017 benjamin
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
package common;

import dto.*;
import model.*;

/**
 *
 * @author benjamin
 */
public class Transformer {
    public static Usuario UsuarioDTOToModel(UsuarioDTO origen) {
        return new Usuario(origen.getUsername(), origen.getPassword());
    }
    public static UsuarioDTO UsuarioModelToDTO(Usuario origen) {
        return new UsuarioDTO(origen.getUsername(), origen.getPassword());
    }
    
    public static Album AlbumDTOToModel(AlbumDTO origen) {
        return new Album(origen.getNombre(), origen.getAñoLanzamiento());
    }
    public static AlbumDTO AlbumModelToDTO(Album origen) {
        return new AlbumDTO(origen.getNombre(), origen.getAñoLanzamiento());
    }
    
    public static Artista ArtistaDTOToModel(ArtistaDTO origen) {
        return new Artista(origen.getNombre(), origen.getFechaNacimiento());
    }
    public static ArtistaDTO ArtistaModelToDTO(Artista origen) {
        return new ArtistaDTO(origen.getNombre(), origen.getFechaNacimiento());
    }
}
