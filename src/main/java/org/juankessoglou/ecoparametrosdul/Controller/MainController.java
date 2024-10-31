package org.juankessoglou.ecoparametrosdul.Controller;

import org.juankessoglou.ecoparametrosdul.Model.Colecciones;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
@RequestMapping(value = "/formulario")
public class MainController {

    private static int iteraciones;

    public MainController() {
        iteraciones = 0;
    }

    @ModelAttribute
    private void collectionsToModel(Model model) {
        //añade al modelo todas las colecciones para que sean accesibles globalmente
        model.addAttribute("genero_HashMap", Colecciones.getGeneroHashMap());
        model.addAttribute("aficiones_HashMap", Colecciones.getAficionesHashMap());
        model.addAttribute("musica_HashMap", Colecciones.getMusicaHashMap());
        model.addAttribute("paises_HashMap", Colecciones.getPaisesHashMap());
    }

    @RequestMapping(value="/devuelve-formulario", method = GET)
    public String devuelveFormulario(Model model){

        iteraciones++;
        //añadimos todos los valores del formulario al modelo
        model.addAttribute("usuario", "");
        model.addAttribute("clave", "");
        model.addAttribute("iteraciones", iteraciones);
        model.addAttribute("genero_seleccionado", "");
        model.addAttribute("aficiones_seleccionadas", "");
        model.addAttribute("pais_seleccionado", "");
        model.addAttribute("musicas_seleccionadas", "");
        model.addAttribute("comentarios", "");
        model.addAttribute("archivo", "");
        model.addAttribute("licencia", "");
        model.addAttribute("iteraciones", iteraciones);

        model.addAttribute("titulo", "Original");
        model.addAttribute("valor_x_campo_imagen", 0);
        model.addAttribute("valor_y_campo_imagen", 0);

        model.addAttribute("num_parametros", 0);

        return "formulario";
    }

    @RequestMapping(value="/recibe-parametros", method = POST)
    public String recibeParametrosYRepinta(
            //creamos un modelo que se comunica con la vista
            Model model,

            //añadimos todos los valores que se envían desde el formulario
            @RequestParam(required = false) String usuario,
            @RequestParam(required = false) String clave,
            @RequestParam(name = "genero_seleccionado", required = false) String generoSeleccionado,
            @RequestParam(name = "aficiones_seleccionadas", required = false) ArrayList<String> aficionesSeleccionadas,
            @RequestParam(name = "pais_seleccionado", required = false) String paisSeleccionado,
            @RequestParam(name = "musicas_seleccionadas", required = false) ArrayList<String> musicasSeleccionadas,
            @RequestParam(required = false) String comentarios,
            @RequestParam(required = false) String archivo,
            @RequestParam(required = false) String licencia,
            @RequestParam(name = "imagen_enviar.x", required = false) String valorXCampoImagen,
            @RequestParam(name = "imagen_enviar.y", required = false) String valorYCampoImagen,
            //al declarar un requestparam Map<String, String>, se hace un mapa con los valores recibidos
            @RequestParam Map<String, String> mapaParametros
    ){
        /*creamos una variable con el tamaño del mapa de parámetros
        usuario, clave, pais, comentario, archivo, e iteraciones, se envían siempre
        usuario, clave, comentario y archivo se envían aunque se vacíos
        pais siempre tiene un valor por defecto, por lo que se envía siempre
        iteraciones se envía siempre, ya que contabiliza las vueltas de la app*/
        int numParametros = mapaParametros.size();


        //sumamos una unidad a la iteración
        iteraciones++;

        //si no se reciben parametros en las listas, se inicializan igualmente
        if (aficionesSeleccionadas == null) aficionesSeleccionadas = new ArrayList<>();
        if (musicasSeleccionadas == null) musicasSeleccionadas = new ArrayList<>();
        valorXCampoImagen = (valorXCampoImagen == null) ? "0" : valorXCampoImagen;
        valorYCampoImagen = (valorYCampoImagen == null) ? "0" : valorYCampoImagen;

        //añadimos todos los valores recibidos al modelo
        model.addAttribute("usuario", usuario);
        model.addAttribute("clave", clave);
        model.addAttribute("iteraciones", iteraciones);
        model.addAttribute("genero_seleccionado", generoSeleccionado);
        model.addAttribute("aficiones_seleccionadas", aficionesSeleccionadas);
        model.addAttribute("pais_seleccionado", paisSeleccionado);
        model.addAttribute("musicas_seleccionadas", musicasSeleccionadas);
        model.addAttribute("comentarios", comentarios);
        model.addAttribute("archivo", archivo);
        model.addAttribute("licencia", licencia);
        model.addAttribute("iteraciones", iteraciones);

        model.addAttribute("titulo", "Repintado");
        model.addAttribute("valor_x_campo_imagen", valorXCampoImagen);
        model.addAttribute("valor_y_campo_imagen", valorYCampoImagen);

        model.addAttribute("num_parametros", numParametros);


        return "formulario";
    }
}
/**1) campos del form DONE
 * 2) mandar formulario y repintar n veces DONE
 * 3) colecciones en Colecciones.java DONE
 * 4) dos métodos en controlador DONE
 * 5) toda la clase controladora se mapea en /formulario DONE
 * 6) metodo repinta POST, required false, variables iguales salvo dos palabras, solo String y ArrayList<String> DONE
 * 7) colecciones al controlador desde metodo DONE
 * 8) unico form, titulo original/repintado DONE
 * 9) TODO contador de parametros recibidos al enviar
 * 10) campo iteraciones mostrado al inicio DONE
 * 11) tolerante a cambios desde inspeccionar DONE
 * 12) evitar que el navegador cargue favicon.ico DONE
 * 13) mostrar imagen.x: <valor_x_campo_imagen> e imagen.y <valor_x_campo_imagen> DONE
 * 14) static debe contener directorios css, img, js DONE**/