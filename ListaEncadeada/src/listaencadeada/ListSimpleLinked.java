/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

/**
 *
 * @author 17120069
 */
public class ListSimpleLinked<E>implements ListTAD<E> {
    
    private Nodo prim,ult;
    private int totalElementos;
    
        private class Nodo {
        private E element;
        private Nodo next;
        public Nodo(E e) {
            element = e;
            next = null;
        }
        public void setElement(E e) {element = e; }
        public void setNext (Nodo n) { next = n; }
        public E getElement() { return element; }
        public Nodo getNext() { return next; }
}
        public ListSimpleLinked (){
            prim = null;
            ult = null;
            totalElementos = 0;
        }    
// métodos da classe ListSimpleLinked

    @Override
    public void add(E e) {               
        
        Nodo nodo = new Nodo(e);
        nodo.setElement(e);
        nodo.setNext(null);
        
        if(prim == null){
        
          prim = nodo;
          
          totalElementos++;
        
        }
        
        else{
        
            Nodo aux = new Nodo(e);
            
            while (aux.getNext() != null){
            
               aux = aux.getNext();
            
            }
            
            aux.setNext(nodo);
            totalElementos++;
        }
        
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override  
    public void clear() {

        prim = null;
        ult = null;
        totalElementos = 0;
   
     // Nodo nodo  = prim;
        
    //  while(nodo.getNext()!= null){
            
    //     nodo.setElement(null);
    //     nodo.getNext(); 
    //  }
                        
    }

    @Override
    public boolean contains(E e) {
        
        if(isEmpty()) return false;
        
        Nodo nodo = prim;
        while(nodo.getElement() != e){
            
         nodo.getNext();
        
        }
        
        return nodo.getElement() == e;
  
    }

    @Override
    public E get(int index) {
        
     throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        
        return this.prim == null;
    }

    @Override
    public boolean remove(E e){
        if(isEmpty()) return false;
        
            Nodo nodo  = prim;
            
            while(nodo.getElement() != e){
            
              nodo.getNext();
            }
            
            if(nodo.getElement() == e){
            
              Nodo aux = nodo;
              nodo = aux.getNext();     //aponta o nodo atual para o próximo
              aux.setNext(null);        // tira a referencia do atual
              totalElementos--;
              return true;
              
            }else{return false;}  
                     
    }

    @Override
    public E remove(int index) {
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates. 
        
    }

    @Override
    public int size() {
        
        return totalElementos;
     
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addFirst(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E getFirst() {
        
        Nodo nodo = prim;
        return nodo.getElement();
 
    }

    @Override
    public E getLast() {
        
        Nodo nodo = prim;
        
        while(nodo.getNext() != null){
          
           nodo = nodo.getNext();
        }
        
        return nodo.getElement();
    }

    @Override
    public boolean removeFirst() {
        
        if(prim != null){
        
            Nodo nodo = prim;
            Nodo aux = nodo;
            nodo = aux.getNext();     //aponta o nodo atual para o próximo
            aux.setNext(null);        //Tira a referencia do primeiro
            totalElementos--;
            return true;         
        }
        else {return false;}
        
    }

    @Override
    public boolean removeLast() {
        if(isEmpty()) return false;
        
        Nodo nodo = prim;
        
        while(nodo.getNext() != null){
        
        
            if(nodo.getNext().getNext() == null){
            
                ult = nodo;             //aponta o nodo atual para o ultimo
                ult.setNext(null);      //Tira a referencia 
                totalElementos--;
                return true;
            }
            
            nodo = nodo.getNext();
        }
        
       
        return false;
    }

    
 
    
}
