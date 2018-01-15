/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.jidikan.toko_buku.controller;

import java.util.List;
import lab.jidikan.toko_buku.entity.TokoBuku;
import lab.jidikan.toko_buku.repo.TokoBukuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jidikan
 */
@RestController
public class ApiController {
    @Autowired
    private TokoBukuRepo tokoBukuRepo;

    @RequestMapping("/get-home")
    public List<TokoBuku> getListTokoBuku() {
        
    //List<Perpus> data = perpusRepo.findAll();
      //  for(int i=0; i<data.size(); i++) {
        //    System.out.println(((Perpus) data.get(i)).getId_buku());
        //}
return tokoBukuRepo.findAll();
        
    }

    @RequestMapping(value = "/api/tambah", method = RequestMethod.POST)
    public void tambah(@RequestBody TokoBuku tokoBuku) {
        //System.out.println("id : " + pegawai.getId());
        //System.out.println("nama : " + pegawai.getNama());
        //System.out.println("jabatan : " + pegawai.getJabatan());
        tokoBukuRepo.save(tokoBuku);
    }

    @RequestMapping(value = "/api/delete/{id}", method = RequestMethod.DELETE)
    public void hapus(@PathVariable("id") int id) {
        tokoBukuRepo.delete(id);
    }
    
}
