package com.entregapaidegua.interfaces.conversor;

import com.googlecode.jmapper.JMapper;

public abstract class Conversor<E, VM> {

    // public Conversor(JMapper<VM, E> _entityToModelView, JMapper<E, VM> _modelViewToEntity){
    //     this._modelViewToEntity = _modelViewToEntity;
    //     this._entityToModelView = _entityToModelView; 
    //     inicializar();
    // }

    public Conversor(){
        inicializar();
    }

    public abstract void inicializar();

    public E viewModelToEntity(VM model){
        return  _modelViewToEntity.getDestination(model);
    }

    public VM entityToModelView(E tEntidade){
        return  _entityToModelView.getDestination(tEntidade);
    }

    public void usarEntityToModelView(JMapper<VM, E> _entityToModelView){
        this._entityToModelView = _entityToModelView; 
    }

    public void usarModelViewToEntity(JMapper<E, VM> _modelViewToEntity){
        this._modelViewToEntity = _modelViewToEntity;
    }

    private  JMapper<VM, E>  _entityToModelView;
    private  JMapper<E, VM> _modelViewToEntity;
}
