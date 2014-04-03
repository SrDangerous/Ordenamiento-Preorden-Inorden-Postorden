
public class Arbol {
	    private NodoArbol raiz;
	   
	    
	    public Arbol()
	    {
	        raiz = null;
	    }
	     
	    //insertar un nuevo ndo en el arbol 
	    public void insertarNodo(int valorInsertar)
	    {
	        if(raiz == null)
	            raiz = new NodoArbol(valorInsertar); 
	        else
	            raiz.insertar(valorInsertar);        
	    }
	     
	    //metodo preorden
	    private void Preorden(NodoArbol nodo)
	    {
	        if(nodo == null)
	            return;
	        System.out.print(nodo.datos + " "); //mostrar datos del nodo
	        Preorden(nodo.nodoizquierdo);   //recorre subarbol izquierdo
	        Preorden(nodo.nododerecho);     //recorre subarbol derecho
	    }
	     
	 // empieza recorrido preorden
	    public void recorridoPreorden()
	    {
	        Preorden(raiz);
	    }
	     
	     
	    //metodo inorden
	    private void Inorden( NodoArbol nodo)
	    {
	        if(nodo == null)
	            return;
	         
	        Inorden(nodo.nodoizquierdo);
	        System.out.print(nodo.datos + " ");
	        Inorden(nodo.nododerecho);
	    }
	    
	    //empieza recorrido inorde
	    public  void recorridoInorden()
	    {
	        Inorden(raiz);
	    }
	     
	    
	     
	    //meotodo posorden
	    private void Posorden(NodoArbol nodo)
	    {
	        if( nodo == null )
	            return;
	         
	       Posorden(nodo.nodoizquierdo);
	       Posorden(nodo.nododerecho);
	        System.out.print(nodo.datos + " ");
	    }
	  //empieza recorrido posorden
	    public void recorridoPosorden()
	    {
	        Posorden(raiz);        
	    }
}
