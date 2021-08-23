package com.entregapaidegua.interfaces.conversor;

import com.googlecode.jmapper.JMapper;

public abstract class ConversorMVC<E, Req, Resp> {

    protected  ConversorMVC() {
        inicializar();
    }

    public abstract void inicializar();

    public E requestModelToEntity(Req req){
        return _requestModelToEntity.getDestination(req);
    }

    public Req entityToRequestModel(E entity){
        return _entityToRequestModel.getDestination(entity);
    }

    public E responseModelToEntity(Resp resp){
        return _responseModelToEntity.getDestination(resp);
    }

    public Resp entityToResponseModel(E entity){
        return _entityToResponseModel.getDestination(entity);
    }

    public void usarConversorRequestAndEntity(JMapper<Req, E>  _entityToRequestModel, JMapper<E, Req> _requestModelToEntity){
        this._entityToRequestModel = _entityToRequestModel; 
        this._requestModelToEntity = _requestModelToEntity; 
    }

    public void usarReponseToEntity(JMapper<Resp, E>  _entityToResponseModel, JMapper<E, Resp>  _responseModelToEntity){
        this._entityToResponseModel = _entityToResponseModel; 
        this._responseModelToEntity = _responseModelToEntity; 
    }

    private  JMapper<Resp, E>  _entityToResponseModel;
    private  JMapper<E, Resp>  _responseModelToEntity;
    private  JMapper<Req, E>  _entityToRequestModel;
    private  JMapper<E, Req> _requestModelToEntity;
    
}
