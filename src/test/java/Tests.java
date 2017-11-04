/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import Modelo.*;

/**
 *
 * @author pixel_splash
 */
public class Tests {
    public Tests() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testInstanciarUsuarioNombrePass()
    {
        Usuario user= new Usuario(1,"user","Briam","correo",1234,"psw",false);
        assertEquals("Briam",user.getNombre());
    }
    
    @Test
    public void testInstanciarUsuarioNombreUsuarioPass()
    {
        Usuario user= new Usuario(1,"user","Briam","correo",1234,"psw",false);
        assertEquals("user",user.getNombreUsuario());
    }
    
    @Test
    public void testInstanciarUsuarioCorreoPass()
    {
        Usuario user= new Usuario(1,"user","Briam","correo",1234,"psw",false);
        assertEquals("correo",user.getCorreo());
    }
    
    @Test
    public void testInstanciarUsuarioTelefonoPass()
    {
        Usuario user= new Usuario(1,"user","Briam","correo",1234,"psw",false);
        assertEquals(1234,user.getTelefono());
    }
    
    @Test
    public void testInstanciarUsuarioContraseñaPass()
    {
        Usuario user= new Usuario(1,"user","Briam","correo",1234,"psw",false);
        assertEquals("psw",user.getContrasena());
    }
    
    @Test
    public void testInstanciarUsuarioIsAdminPass()
    {
        Usuario user= new Usuario(1,"user","Briam","correo",1234,"psw",false);
        assertEquals(false,user.isIsAdmin());
    }
    
    /*
    private int idObjeto;
    private String nombreObjeto;
    private String formaAdquisicion;
    private String fechaIngreso;
    private String numRegistro;
    private String valorEconomico;
    private String nombreFuente;
    private String fechaInventario;
    private String numInventario;
    private String otrosNumeros;
    private String direccionFuente;
    private String fechaCatalogo;
    private String numCatalogo;
    private String espesor;
    private String alto;
    private String ancho;
    private String largo;
    private String diametro;
    private String peso;
    private String procedencia;
    private String materiaYTecnica;
    private String numeroNegativo;
    private String autor;
    private String epoca;
    private String descripcion;
    private String documentacion;
    private String observaciones;
    private String recibio;
    private String inventario;
    private String catalogo;
    private String aprobo;
    
    */
    
    @Test
    public void testInstanciarObjetoIdentificadorPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals(1,obj.getIdObjeto());
    }
    
    @Test
    public void testInstanciarObjetoNombreObjetoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("monalisa",obj.getNombreObjeto());
    }

    @Test
    public void testInstanciarObjetoFormaAdquisicionPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("compra",obj.getFormaAdquisicion());
    }
    
    @Test
    public void testInstanciarObjetoFechaIngresoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("2010/10/10",obj.getFechaIngreso());
    }
    
    @Test
    public void testInstanciarObjetoNumRegistroPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("011",obj.getNumRegistro());
    }
    
    @Test
    public void testInstanciarObjetoValorEconomicoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("100",obj.getValorEconomico());
    }
    
    @Test
    public void testInstanciarObjetoNombreFuentePass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("San Jose",obj.getNombreFuente());
    }
    
    @Test
    public void testInstanciarObjetoFechaInventarioPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("2012/01/01",obj.getFechaInventario());
    }
    
    @Test
    public void testInstanciarObjetoNumInventarioPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("1",obj.getNumInventario());
    }
    
    @Test
    public void testInstanciarObjetoOtrosNumerosPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("2",obj.getOtrosNumeros());
    }
    
    @Test
    public void testInstanciarObjetoDireccionFuentePass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("norte",obj.getDireccionFuente());
    }
    
    @Test
    public void testInstanciarObjetoFechaCatalogoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("2020/01/01",obj.getFechaCatalogo());
    }
    
    @Test
    public void testInstanciarObjetoNumCatalogoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("3",obj.getNumCatalogo());
    }
    
    @Test
    public void testInstanciarObjetoEspesorPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("4",obj.getEspesor());
    }
    
    @Test
    public void testInstanciarObjetoAltoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("5",obj.getAlto());
    }
    @Test
    public void testInstanciarObjetoAnchoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("6",obj.getAncho());
    }
    @Test
    public void testInstanciarObjetoLargoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("7",obj.getLargo());
    }
    @Test
    public void testInstanciarObjetoDiametroPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("8",obj.getDiametro());
    }
    @Test
    public void testInstanciarObjetoPesoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("9",obj.getPeso());
    }
    @Test
    public void testInstanciarObjetoProcedenciaPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("Alajuela",obj.getProcedencia());
    }
    @Test
    public void testInstanciarObjetoMateriaYTecnicaPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("pintura",obj.getMateriaYTecnica());
    }
    @Test
    public void testInstanciarObjetoNumeroNegativoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("-5",obj.getNumeroNegativo());
    }
    @Test
    public void testInstanciarObjetoAutorPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("Stiven",obj.getAutor());
    }
    @Test
    public void testInstanciarObjetoEpocaPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("Ayer",obj.getEpoca());
    }
    @Test
    public void testInstanciarObjetoDescripcionPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("Copia de pintura",obj.getDescripcion());
    }
    @Test
    public void testInstanciarObjetoDocumentacionPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("documentacion",obj.getDocumentacion());
    }
    @Test
    public void testInstanciarObjetoObservacionesPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("no",obj.getObservaciones());
    }
    @Test
    public void testInstanciarObjetoRecibioPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("si",obj.getRecibio());
    }
    @Test
    public void testInstanciarObjetoInventarioPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("200",obj.getInventario());
    }
    @Test
    public void testInstanciarObjetoCatalogoPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("11",obj.getCatalogo());
    }
    @Test
    public void testInstanciarObjetoAproboPass()
    {
        Objeto obj= new Objeto(1,"monalisa","compra","2010/10/10","011","100","San Jose","2012/01/01","1","2","norte","2020/01/01","3","4","5","6","7","8","9","Alajuela","pintura","-5","Stiven","Ayer","Copia de pintura","documentacion","no","si","200","11","si");
        assertEquals("si",obj.getAprobo());
    }
}
