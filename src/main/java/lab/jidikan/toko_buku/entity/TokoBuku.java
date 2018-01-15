/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.jidikan.toko_buku.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Jidikan
 */
@Entity
public class TokoBuku {
    @Id @Getter @Setter
    private int id;
    @Getter @Setter
    private String judul_buku;
    @Getter @Setter
    private int harga;
}
