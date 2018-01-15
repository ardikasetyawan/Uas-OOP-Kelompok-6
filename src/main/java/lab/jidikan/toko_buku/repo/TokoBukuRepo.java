/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.jidikan.toko_buku.repo;

import lab.jidikan.toko_buku.entity.TokoBuku;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jidikan
 */
public interface TokoBukuRepo extends JpaRepository<TokoBuku, Integer> {
    
}
