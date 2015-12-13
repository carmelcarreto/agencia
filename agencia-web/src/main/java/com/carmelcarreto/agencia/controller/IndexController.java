package com.carmelcarreto.agencia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Carmel
 */

//Le díra al contenedor que la Clase será un Componente o Bean de Spring,
//y se creará una instancia al momento de desplegar la aplicación
@Controller
public class IndexController {
    protected final Log logger = LogFactory.getLog(getClass());
    
    /* 
     ("/urlDelServicio").
     * Determina la URL para la llamada HTTP.
     * La peticion puede ser GET O POST.
     */
    @RequestMapping(value = "/")
    public ModelAndView index(HttpServletRequest request, HttpServletResponse response){
        logger.info("Retorna la vista");
        return new ModelAndView("index");
    }
    
}
