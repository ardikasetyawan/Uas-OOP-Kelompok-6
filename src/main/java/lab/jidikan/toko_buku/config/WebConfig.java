/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.jidikan.toko_buku.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 *
 * @author Jidikan
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter{
     @Override
    public void addViewControllers(ViewControllerRegistry reg) {
        reg.addViewController("/")
            .setViewName("home");
        reg.addViewController("tambah-ui")
            .setViewName("tambah");
        reg.addViewController("edit-ui")
            .setViewName("edit");
    }
}
